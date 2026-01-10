/*
 * Copyright 2025-2026 Georgii Ippolitov (g000sha256)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dev.g000sha256.tdl.generator

import com.squareup.kotlinpoet.ANY
import com.squareup.kotlinpoet.ARRAY
import com.squareup.kotlinpoet.AnnotationSpec
import com.squareup.kotlinpoet.BOOLEAN
import com.squareup.kotlinpoet.BOOLEAN_ARRAY
import com.squareup.kotlinpoet.BYTE_ARRAY
import com.squareup.kotlinpoet.CHAR_ARRAY
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.DOUBLE
import com.squareup.kotlinpoet.DOUBLE_ARRAY
import com.squareup.kotlinpoet.FLOAT_ARRAY
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.INT
import com.squareup.kotlinpoet.INT_ARRAY
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.LONG
import com.squareup.kotlinpoet.LONG_ARRAY
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.ParameterizedTypeName
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.plusParameter
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.SHORT_ARRAY
import com.squareup.kotlinpoet.STRING
import com.squareup.kotlinpoet.TypeName
import com.squareup.kotlinpoet.TypeSpec
import java.io.File
import java.nio.file.Paths
import java.time.Year
import kotlin.io.path.pathString
import kotlin.io.path.readLines
import kotlin.io.path.writeLines

private val LICENSE = getLicense(year = "2025")

private fun getLicense(year: String): String {
    return """/*
 * Copyright $year Georgii Ippolitov (g000sha256)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
"""
}

private const val PACKAGE = "dev.g000sha256.tdl"
private const val PACKAGE_DTO = "$PACKAGE.dto"
private const val PACKAGE_FUNCTION = "$PACKAGE.function"
private const val PACKAGE_UTIL = "$PACKAGE.util"

private val currentPath = System
    .getProperty("user.dir")
    .let { Paths.get(it) }
    .parent
    .pathString

private fun buildEqualsFunSpec(className: String, properties: List<Property>): FunSpec {
    return FunSpec
        .builder(name = "equals")
        .addModifier(modifier = KModifier.OVERRIDE)
        .addParameter(
            parameterSpec = ParameterSpec
                .builder(
                    name = "other",
                    type = ANY.copy(nullable = true)
                )
                .build()
        )
        .returns(returnType = BOOLEAN)
        .apply {
            beginControlFlow(controlFlow = "if (other === this)")
            addStatement(format = "return true")
            endControlFlow()
            beginControlFlow(controlFlow = "if (other == null)")
            addStatement(format = "return false")
            endControlFlow()
            if (properties.size > 0) {
                beginControlFlow(controlFlow = "if (other::class != this::class)")
                addStatement(format = "return false")
                endControlFlow()
                addStatement(format = "other as %L", className)
                if (properties.size > 0) {
                    properties.forEachIndexed { index, property ->
                        val name = property.name
                        val type = property.type
                        if (index < properties.size - 1) {
                            when {
                                type.isObjectArray -> {
                                    addStatement(format = "val %LEquals = other.%L.contentDeepEquals(%L)", name, name, name)
                                    beginControlFlow(controlFlow = "if (!%LEquals)", name)
                                }
                                type.isPrimitiveArray -> {
                                    addStatement(format = "val %LEquals = other.%L.contentEquals(%L)", name, name, name)
                                    beginControlFlow(controlFlow = "if (!%LEquals)", name)
                                }
                                else -> {
                                    beginControlFlow(controlFlow = "if (other.%L != %L)", name, name)
                                }
                            }
                            addStatement(format = "return false")
                            endControlFlow()
                        } else {
                            when {
                                type.isObjectArray -> {
                                    addStatement(format = "return other.%L.contentDeepEquals(%L)", name, name)
                                }
                                type.isPrimitiveArray -> {
                                    addStatement(format = "return other.%L.contentEquals(%L)", name, name)
                                }
                                else -> {
                                    addStatement(format = "return other.%L == %L", name, name)
                                }
                            }
                        }
                    }
                } else {
                    addStatement(format = "return true")
                }
            } else {
                addStatement(format = "return this::class == other::class")
            }
        }
        .build()
}

private fun buildHashCodeFunSpec(properties: List<Property>): FunSpec {
    return FunSpec
        .builder(name = "hashCode")
        .addModifier(modifier = KModifier.OVERRIDE)
        .returns(returnType = INT)
        .apply {
            if (properties.size > 0) {
                addStatement(format = "var hashCode = this::class.hashCode()")
                properties.forEach { property ->
                    val type = property.type
                    when {
                        type.isObjectArray -> {
                            addStatement(format = "hashCode = 31 * hashCode + %L.contentDeepHashCode()", property.name)
                        }
                        type.isPrimitiveArray -> {
                            addStatement(format = "hashCode = 31 * hashCode + %L.contentHashCode()", property.name)
                        }
                        else -> {
                            addStatement(format = "hashCode = 31 * hashCode + %L.hashCode()", property.name)
                        }
                    }
                }
                addStatement(format = "return hashCode")
            } else {
                addStatement(format = "REMOVE_LINE")
                addStatement(format = "return this::class.hashCode()")
            }
        }
        .build()
}

private fun buildToStringFunSpec(className: String, properties: List<Property>): FunSpec {
    return FunSpec
        .builder(name = "toString")
        .addModifier(modifier = KModifier.OVERRIDE)
        .returns(returnType = STRING)
        .apply {
            addStatement(format = "REMOVE_LINE")
            if (properties.size > 0) {
                beginControlFlow(controlFlow = "return buildString")
                addStatement(format = "append(\"%L\")", className)
                addStatement(format = "append(\"(\")")
                properties.forEachIndexed { index, property ->
                    if (index > 0) {
                        addStatement(format = "append(\", \")")
                    }
                    addStatement(format = "append(\"%L=\")", property.name)
                    val type = property.type
                    when {
                        type.isObjectArray -> {
                            addStatement(format = "%L", property.name)
                            addStatement(format = "    .contentDeepToString()")
                            addStatement(format = "    .also { append(it) }")
                        }
                        type.isPrimitiveArray -> {
                            addStatement(format = "%L", property.name)
                            addStatement(format = "    .contentToString()")
                            addStatement(format = "    .also { append(it) }")
                        }
                        else -> {
                            addStatement(format = "append(%L)", property.name)
                        }
                    }
                }
                addStatement(format = "append(\")\")")
                endControlFlow()
            } else {
                addStatement(format = "return \"%L()\"", className)
            }
        }
        .build()
}

//////  //////  //////
//////  //////  //////
//////  //////  //////

private val String.decapitalized: String
    get() = replaceFirstChar { it.lowercase() }

private val TypeName.isObjectArray: Boolean
    get() = this is ParameterizedTypeName && rawType == ARRAY

private val TypeName.isPrimitiveArray: Boolean
    get() {
        if (this is ClassName) {
            when (this) {
                BOOLEAN_ARRAY -> return true
                BYTE_ARRAY -> return true
                CHAR_ARRAY -> return true
                DOUBLE_ARRAY -> return true
                FLOAT_ARRAY -> return true
                INT_ARRAY -> return true
                LONG_ARRAY -> return true
                SHORT_ARRAY -> return true
                else -> return false
            }
        }
        return false
    }

private fun FileSpec.writeAndFixContent(
    folderName: String,
    addLicense: Boolean = true,
    removeAllPublic: Boolean = false
) {
    val path = Paths
        .get("$currentPath/tdl-coroutines/src/$folderName/kotlin")
        .let { writeTo(it) }

    path
        .readLines()
        .filter { !it.endsWith(suffix = "REMOVE_LINE") }
        .map { it.replace(oldValue = "`data`:", newValue = "data:") }
        .map { it.replace(oldValue = "`file`:", newValue = "file:") }
        .map { it.replace(oldValue = "`header`:", newValue = "header:") }
        .map { it.replace(oldValue = "`value`:", newValue = "value:") }
        .map {
            if (removeAllPublic) {
                return@map it.replace(oldValue = " public ", newValue = " ")
            }
            return@map it
        }
        .let {
            if (addLicense) {
                return@let listOf(element = LICENSE) + it
            } else {
                return@let it
            }
        }
        .also { path.writeLines(it) }
}

private fun FunSpec.Builder.addModifier(modifier: KModifier): FunSpec.Builder {
    return addModifiers(modifier)
}

private fun PropertySpec.Builder.addModifier(modifier: KModifier): PropertySpec.Builder {
    return addModifiers(modifier)
}

private fun TypeSpec.Builder.addModifier(modifier: KModifier): TypeSpec.Builder {
    return addModifiers(modifier)
}

//////  //////  //////
//////  //////  //////
//////  //////  //////

//////  //////  //////
//////  //////  //////
//////  //////  //////

//////  //////  //////
//////  //////  //////
//////  //////  //////

public fun main() {
    val text = readAndFixText()

    val typesText = text.substringBefore(delimiter = "\n---functions---")
    val functionsText = text.substringAfter(delimiter = "---functions---\n\n")

    val classElements = parseClassElements(text = typesText)

    val dtoCommonElements = parseCommonElements(text = typesText)

    val functionCommonElements = parseCommonElements(text = functionsText)
        .sortedBy { it.name } // TODO Remove sorting in the future

    val updateDtoCommonElements = dtoCommonElements.filter { it.returns == "Update" }

    File(currentPath, "tdl-coroutines/src/commonMainGenerated")
        .deleteRecursively()

    writeClassElements(classElements)
    writeDtoCommonElements(dtoCommonElements)
    writeFunctionCommonElements(functionCommonElements)

    writeClientInterface(functionCommonElements, updateDtoCommonElements)
    writeTdlClientImplementation(functionCommonElements, updateDtoCommonElements)

    writeDeserializer(dtoCommonElements)
    writeSerializer(functionCommonElements, dtoCommonElements)

    updateReadMe(
        tdLibVersion = getTdLibVersion(),
        tdLibCommitHash = getTdLibCommitHash(),
        updatesCount = updateDtoCommonElements.size,
        requestsCount = functionCommonElements.size,
    )

    updateLicenseForChangedFiles()
}

//////  //////  //////
//////  //////  //////
//////  //////  //////

private fun readAndFixText(): String {
    return getFile(path = "td/td/generate/scheme/td_api.tl")
        .readText(charset = Charsets.UTF_8)
        .substringAfter(delimiter = "//@")
        .replace(oldValue = "\n//-", newValue = " ")
        .replace(oldValue = " @", newValue = "\n//@")
        .replace(oldValue = "\n\n\n", newValue = "\n\n")
        .replace(oldValue = ";\n//@", newValue = ";\n\n//@")
        .let { text -> "//@$text" }
}

private fun getFile(path: String): File {
    val file = File(currentPath, path)

    val exists = file.exists()
    require(exists) { "File $file doesn't exist" }

    return file
}

private fun parseClassElements(text: String): List<ClassElement> {
    return """//@class\s(\w+)\n//@description\s(.+)\n"""
        .toRegex()
        .findAll(input = text)
        .map(::toClassElement)
        .toList()
}

private fun toClassElement(matchResult: MatchResult): ClassElement {
    val (name, description) = matchResult.destructured
    return ClassElement(description = description, name = name)
}

private fun parseCommonElements(text: String): List<CommonElement> {
    return """//@description\s(.+)\n((?://@.+\n)*)(\w+)\s((?:\w+:[<>\w]+\s)*)=\s(\w+);"""
        .toRegex()
        .findAll(input = text)
        .map(::toCommonElement)
        .toList()
}

private fun toCommonElement(matchResult: MatchResult): CommonElement {
    val (description, fields, name, properties, returns) = matchResult.destructured
    return CommonElement(
        description = CommonElement.Description(
            text = description,
            fields = parseFields(text = fields)
        ),
        name = name,
        properties = parseProperties(text = properties),
        returns = returns
    )
}

private fun parseFields(text: String): List<CommonElement.Description.Field> {
    if (text.length == 0) {
        return emptyList()
    }

    return """//@(\w+)\s(.+)"""
        .toRegex()
        .findAll(input = text)
        .map(::toField)
        .toList()
}

private fun toField(matchResult: MatchResult): CommonElement.Description.Field {
    val (name, description) = matchResult.destructured
    if (name == "param_description") {
        return CommonElement.Description.Field(name = "description", description = description)
    }

    return CommonElement.Description.Field(name = name, description = description)
}

private fun parseProperties(text: String): List<CommonElement.Property> {
    if (text.length == 0) {
        return emptyList()
    }

    return """(\w+):([<>\w]+)\s"""
        .toRegex()
        .findAll(input = text)
        .map(::toProperty)
        .toList()
}

private fun toProperty(matchResult: MatchResult): CommonElement.Property {
    val (name, type) = matchResult.destructured
    return CommonElement.Property(name = name, type = type)
}

private class ClassElement(val description: String, val name: String)

private class CommonElement(
    val description: Description,
    val name: String,
    val properties: List<Property>,
    val returns: String
) {

    class Description(val text: String, val fields: List<Field>) {

        class Field(val name: String, val description: String)

    }

    class Property(val name: String, val type: String)

}

//////  //////  //////
//////  //////  //////
//////  //////  //////

private fun getTdLibCommitHash(): String {
    val command = """git log -1 --pretty=format:%H"""
    val file = getFile(path = "td")
    return Runtime
        .getRuntime()
        .exec(command, null, file)
        .inputStream
        .reader(charset = Charsets.UTF_8)
        .readText()
}

private fun getTdLibVersion(): String {
    val file = getFile(path = "td/CMakeLists.txt")
    val text = file.readText(charset = Charsets.UTF_8)
    return """project\(TDLib VERSION ([0-9]+\.[0-9]+\.[0-9]+) LANGUAGES CXX C\)"""
        .toRegex()
        .find(input = text)!!
        .groupValues.get(index = 1)
}

//////  //////  //////
//////  //////  //////
//////  //////  //////

private fun writeClassElements(classElements: List<ClassElement>) {
    classElements.forEach { classElement ->
        val className = classElement.name.capitalized

        FileSpec
            .builder(packageName = PACKAGE_DTO, fileName = className)
            .addType(
                typeSpec = TypeSpec
                    .classBuilder(name = className)
                    .addKdoc(format = "This class is an abstract base class.\n")
                    .addKdoc(format = classElement.description.withDotIfNeeded)
                    .addModifier(modifier = KModifier.PUBLIC)
                    .addModifier(modifier = KModifier.SEALED)
                    .primaryConstructor(
                        primaryConstructor = FunSpec
                            .constructorBuilder()
                            .addModifier(modifier = KModifier.PROTECTED)
                            .build()
                    )
                    .build()
            )
            .setIndent()
            .build()
            .writeAndFixContent(folderName = "commonMainGenerated")
    }
}

private fun writeDtoCommonElements(dtoCommonElements: List<CommonElement>) {
    dtoCommonElements.forEach { commonElement ->
        val className = commonElement.name.capitalized

        val properties = createProperties(properties = commonElement.properties, fields = commonElement.description.fields)

        FileSpec
            .builder(packageName = PACKAGE_DTO, fileName = className)
            .addType(
                typeSpec = TypeSpec
                    .classBuilder(name = className)
                    .addKdoc(format = commonElement.description.text.withDotIfNeeded.withReplacedSnakeCases2.withReplacedSymbols)
                    .apply {
                        val fields = commonElement.description.fields
                        if (fields.size > 0) {
                            addKdoc(format = "\n")

                            fields.forEach { field ->
                                addKdoc(format = "\n")
                                addKdoc(format = "@property ")
                                addKdoc(format = field.name.withReplacedSnakeCases1)
                                addKdoc(format = " ")
                                addKdoc(format = field.description.withDotIfNeeded.withReplacedSnakeCases2.withReplacedSymbols)
                            }
                        }
                    }
                    .addModifier(modifier = KModifier.PUBLIC)
                    .primaryConstructor(
                        primaryConstructor = FunSpec
                            .constructorBuilder()
                            .addModifier(modifier = KModifier.PUBLIC)
                            .addParameters(
                                parameterSpecs = properties.map { property ->
                                    return@map ParameterSpec
                                        .builder(name = property.name, type = property.type)
                                        .build()
                                }
                            )
                            .build()
                    )
                    .apply {
                        if (commonElement.returns != className) {
                            superclass(
                                superclass = dtoTypeName(simpleName = commonElement.returns)
                            )
                        }
                    }
                    .addProperties(
                        propertySpecs = properties.map { property ->
                            return@map PropertySpec
                                .builder(name = property.name, type = property.type)
                                .addModifier(modifier = KModifier.PUBLIC)
                                .initializer(format = property.name)
                                .build()
                        }
                    )
                    .addFunction(
                        funSpec = buildEqualsFunSpec(className = className, properties = properties)
                    )
                    .addFunction(
                        funSpec = buildHashCodeFunSpec(properties = properties)
                    )
                    .addFunction(
                        funSpec = buildToStringFunSpec(className = className, properties = properties)
                    )
                    .build()
            )
            .setIndent()
            .build()
            .writeAndFixContent(folderName = "commonMainGenerated")
    }
}

private fun writeClientInterface(functionCommonElements: List<CommonElement>, updateDtoCommonElements: List<CommonElement>) {
    FileSpec
        .builder(packageName = PACKAGE, fileName = "TdlClient")
        .addType(
            typeSpec = TypeSpec
                .classBuilder(name = "TdlClient")
                .addKdoc(format = "A Kotlin Coroutines client for the TDLib.")
                .addKdoc(format = "\n")
                .addKdoc(format = "\n")
                .addKdoc(format = "You should subscribe to the primary update flows before calling requests to avoid missing initial updates.")
                .addModifier(modifier = KModifier.PUBLIC)
                .addModifier(modifier = KModifier.ABSTRACT)
                .primaryConstructor(
                    primaryConstructor = FunSpec
                        .constructorBuilder()
                        .addModifier(modifier = KModifier.INTERNAL)
                        .build()
                )
                .addProperty(
                    propertySpec = PropertySpec
                        .builder(
                            name = "allUpdates",
                            type = TypeName(
                                packageName = "kotlinx.coroutines.flow",
                                simpleName = "Flow",
                                generic = dtoTypeName(simpleName = "Update")
                            )
                        )
                        .addKdoc(format = "All updates.")
                        .addModifier(modifier = KModifier.PUBLIC)
                        .addModifier(modifier = KModifier.ABSTRACT)
                        .build()
                )
                .addProperties(
                    propertySpecs = updateDtoCommonElements.map { commonElement ->
                        val name = commonElement.name
                        val capitalizedName = name.capitalized

                        return@map PropertySpec
                            .builder(
                                name = name
                                    .removePrefix(prefix = "update")
                                    .let { it.decapitalized + "Updates" },
                                type = TypeName(
                                    packageName = "kotlinx.coroutines.flow",
                                    simpleName = "Flow",
                                    generic = dtoTypeName(simpleName = capitalizedName)
                                )
                            )
                            .addKdoc(format = commonElement.description.text.withDotIfNeeded.withReplacedSnakeCases2.withReplacedSymbols)
                            .addModifier(modifier = KModifier.PUBLIC)
                            .addModifier(modifier = KModifier.ABSTRACT)
                            .build()
                    }
                )
                .addFunctions(
                    funSpecs = functionCommonElements.map { commonElement ->
                        val functionName = commonElement.name

                        val properties = createProperties(
                            properties = commonElement.properties,
                            fields = commonElement.description.fields
                        )

                        return@map FunSpec
                            .builder(name = functionName)
                            .addKdoc(format = commonElement.description.text.withDotIfNeeded.withReplacedSnakeCases2.withReplacedSymbols)
                            .apply {
                                val fields = commonElement.description.fields
                                if (fields.size > 0) {
                                    addKdoc(format = "\n")

                                    fields.forEach { field ->
                                        addKdoc(format = "\n")
                                        addKdoc(format = "@param ")
                                        addKdoc(format = field.name.withReplacedSnakeCases1)
                                        addKdoc(format = " ")
                                        addKdoc(format = field.description.withDotIfNeeded.withReplacedSnakeCases2.withReplacedSymbols)
                                    }
                                }
                            }
                            .addModifier(modifier = KModifier.PUBLIC)
                            .addModifier(modifier = KModifier.ABSTRACT)
                            .addModifier(modifier = KModifier.SUSPEND)
                            .addParameters(
                                parameterSpecs = properties.map mapProperty@{ property ->
                                    return@mapProperty ParameterSpec
                                        .builder(name = property.name, type = property.type)
                                        .apply {
                                            if (property.type.isNullable) {
                                                defaultValue(format = "null")
                                            }
                                        }
                                        .build()
                                }
                            )
                            .returns(
                                returnType = TypeName(
                                    packageName = PACKAGE,
                                    simpleName = "TdlResult",
                                    generic = dtoTypeName(simpleName = commonElement.returns)
                                )
                            )
                            .build()
                    }
                )
                .addType(
                    typeSpec = TypeSpec
                        .companionObjectBuilder()
                        .addModifier(modifier = KModifier.PUBLIC)
                        .addProperty(
                            propertySpec = PropertySpec
                                .builder(name = "TDL_GIT_COMMIT_HASH", type = STRING)
                                .addKdoc(format = "The Git commit hash of the TDLib.")
                                .addModifier(modifier = KModifier.CONST)
                                .initializer(
                                    format = "\"%L\"",
                                    getTdLibCommitHash()
                                )
                                .build()
                        )
                        .addProperty(
                            propertySpec = PropertySpec
                                .builder(name = "TDL_VERSION", type = STRING)
                                .addKdoc(format = "The version of the TDLib.")
                                .addModifier(modifier = KModifier.CONST)
                                .initializer(
                                    format = "\"%L\"",
                                    getTdLibVersion()
                                )
                                .build()
                        )
                        .addFunction(
                            funSpec = FunSpec
                                .builder(name = "create")
                                .addKdoc(format = "Creates a new instance of the [TdlClient].")
                                .addModifier(modifier = KModifier.PUBLIC)
                                .returns(
                                    returnType = TypeName(packageName = PACKAGE, simpleName = "TdlClient")
                                )
                                .addStatement(format = "REMOVE_LINE")
                                .addStatement(
                                    format = "return %T()",
                                    TypeName(packageName = PACKAGE, simpleName = "createClient"),
                                )
                                .build()
                        )
                        .build()
                )
                .build()
        )
        .setIndent()
        .build()
        .writeAndFixContent(folderName = "commonMainGenerated")
}

private fun writeTdlClientImplementation(
    functionCommonElements: List<CommonElement>,
    updateDtoCommonElements: List<CommonElement>,
) {
    FileSpec
        .builder(packageName = PACKAGE, fileName = "TdlClientImpl")
        .addType(
            typeSpec = TypeSpec
                .classBuilder(name = "TdlClientImpl")
                .addModifier(modifier = KModifier.INTERNAL)
                .primaryConstructor(
                    primaryConstructor = FunSpec
                        .constructorBuilder()
                        .addModifier(modifier = KModifier.INTERNAL)
                        .addParameter(
                            parameterSpec = ParameterSpec
                                .builder(
                                    name = "repository",
                                    type = TypeName(packageName = PACKAGE, simpleName = "TdlRepository")
                                )
                                .build()
                        )
                        .build()
                )
                .superclass(
                    superclass = TypeName(packageName = PACKAGE, simpleName = "TdlClient")
                )
                .addProperty(
                    propertySpec = PropertySpec
                        .builder(
                            name = "repository",
                            type = TypeName(packageName = PACKAGE, simpleName = "TdlRepository")
                        )
                        .addModifier(modifier = KModifier.PRIVATE)
                        .initializer(format = "repository")
                        .build()
                )
                .addProperty(
                    propertySpec = PropertySpec
                        .builder(
                            name = "allUpdates",
                            type = TypeName(
                                packageName = "kotlinx.coroutines.flow",
                                simpleName = "Flow",
                                generic = dtoTypeName(simpleName = "Update")
                            )
                        )
                        .addModifier(modifier = KModifier.OVERRIDE)
                        .getter(
                            getter = FunSpec
                                .getterBuilder()
                                .addStatement(format = "return repository.updates")
                                .build()
                        )
                        .build()
                )
                .addProperties(
                    propertySpecs = updateDtoCommonElements.map { commonElement ->
                        val name = commonElement.name
                        val capitalizedName = name.capitalized

                        return@map PropertySpec
                            .builder(
                                name = name
                                    .removePrefix(prefix = "update")
                                    .let { it.decapitalized + "Updates" },
                                type = TypeName(
                                    packageName = "kotlinx.coroutines.flow",
                                    simpleName = "Flow",
                                    generic = dtoTypeName(simpleName = capitalizedName)
                                )
                            )
                            .addModifier(modifier = KModifier.OVERRIDE)
                            .getter(
                                getter = FunSpec
                                    .getterBuilder()
                                    .addStatement(
                                        format = "return repository.updates.%T()",
                                        TypeName(packageName = "kotlinx.coroutines.flow", simpleName = "filterIsInstance")
                                    )
                                    .build()
                            )
                            .build()
                    }
                )
                .addFunctions(
                    funSpecs = functionCommonElements.map { commonElement ->
                        val functionName = commonElement.name

                        val properties = createProperties(
                            properties = commonElement.properties,
                            fields = commonElement.description.fields
                        )

                        return@map FunSpec
                            .builder(name = functionName)
                            .addModifier(modifier = KModifier.OVERRIDE)
                            .addModifier(modifier = KModifier.SUSPEND)
                            .addParameters(
                                parameterSpecs = properties.map mapParameter@{ property ->
                                    return@mapParameter ParameterSpec
                                        .builder(name = property.name, type = property.type)
                                        .build()
                                }
                            )
                            .returns(
                                returnType = TypeName(
                                    packageName = PACKAGE,
                                    simpleName = "TdlResult",
                                    generic = dtoTypeName(simpleName = commonElement.returns)
                                )
                            )
                            .apply {
                                val typeName = functionTypeName(simpleName = functionName.capitalized)

                                if (properties.size > 0) {
                                    addStatement(format = "val function = %T(", typeName)

                                    properties.forEach { property ->
                                        val name = property.name
                                        addStatement(format = "    %L = %L,", name, name)
                                    }

                                    addStatement(format = ")")
                                } else {
                                    addStatement(format = "val function = %T()", typeName)
                                }

                                addStatement(format = "return repository.send(function = function)")
                            }
                            .build()
                    }
                )
                .build()
        )
        .setIndent()
        .build()
        .writeAndFixContent(folderName = "commonMainGenerated")
}

private fun updateReadMe(tdLibVersion: String, tdLibCommitHash: String, updatesCount: Int, requestsCount: Int) {
    val file = getFile(path = "README.md")

    val text = file
        .readText(charset = Charsets.UTF_8)
        .replace(
            regex = """TDLib-v([0-9]+\.[0-9]+\.[0-9]+)-blue""".toRegex(),
            replacement = """TDLib-v$tdLibVersion-blue""",
        )
        .replace(
            regex = """\(https://github.com/tdlib/td/tree/(.+)\)""".toRegex(),
            replacement = """(https://github.com/tdlib/td/tree/$tdLibCommitHash)""",
        )
        .replace(
            regex = """provides (\d+) update flows""".toRegex(),
            replacement = """provides $updatesCount update flows""",
        )
        .replace(
            regex = """provides (\d+) request methods""".toRegex(),
            replacement = """provides $requestsCount request methods""",
        )

    file.writeText(text = text, charset = Charsets.UTF_8)
}

//////  //////  //////
//////  //////  //////
//////  //////  //////

private val CommonElement.Description.Field.isNullable: Boolean
    get() {
        val hasBeNull = description.contains(other = "be null", ignoreCase = true)
        val hasPassNull = description.contains(other = "pass null", ignoreCase = true)
        return hasBeNull || hasPassNull
    }

private val String.capitalized: String
    get() = replaceFirstChar { it.uppercaseChar() }

private val String.withDotIfNeeded: String
    get() {
        val endsWithDot = endsWith(suffix = ".")
        if (endsWithDot) {
            return this
        }

        val matchResult = """.+\.\s\(.+\)$"""
            .toRegex()
            .find(input = this)
        if (matchResult == null) {
            return "$this."
        }

        return dropLast(n = 1) + ".)"
    }

private val String.withReplacedSymbols: String
    get() {
        return replace(oldValue = "%", newValue = "%%")
            .replace(oldValue = "&", newValue = "&amp;")
            .replace(oldValue = "<", newValue = "&lt;")
            .replace(oldValue = ">", newValue = "&gt;")
            .replace(oldValue = "\"", newValue = "&quot;")
    }

private val String.withReplacedSnakeCases1: String
    get() {
        val delimiter = '_'
        return split(delimiter)
            .mapIndexed { index, text ->
                if (index == 0) {
                    return@mapIndexed text
                } else {
                    return@mapIndexed text.capitalized
                }
            }
            .joinToString(separator = "")
    }

private val String.withReplacedSnakeCases2: String
    get() {
        return """(?<=\s|\(|:|\.|\{|;|<)([0-9a-z]+(?:_[0-9a-z]+)+)(?=\s|\)|,|\.|;|=|}|]|&|>|")"""
            .toRegex()
            .replace(input = this) { matchResult -> matchResult.value.withReplacedSnakeCases1 }
    }

private fun FileSpec.Builder.setIndent(): FileSpec.Builder {
    return indent(indent = "    ")
}

private fun createProperties(
    properties: List<CommonElement.Property>,
    fields: List<CommonElement.Description.Field>
): List<Property> {
    return properties.map { property ->
        val field = fields.firstOrNull { field -> field.name == property.name }
        return@map Property(
            name = property.name.withReplacedSnakeCases1,
            nameSnakeCase = property.name,
            type = createTypeName(type = property.type, isNullable = field?.isNullable == true),
            typeName = property.type,
        )
    }
}

private fun createTypeName(type: String, isNullable: Boolean): TypeName {
    when {
        type == "Bool" -> {
            require(value = !isNullable)
            return BOOLEAN
        }
        type == "bytes" -> {
            require(value = !isNullable)
            return BYTE_ARRAY
        }
        type == "double" -> {
            require(value = !isNullable)
            return DOUBLE
        }
        type == "int32" -> {
            require(value = !isNullable)
            return INT
        }
        type == "int53" -> {
            require(value = !isNullable)
            return LONG
        }
        type == "int64" -> {
            require(value = !isNullable)
            return LONG
        }
        type == "string" -> {
            require(value = !isNullable)
            return STRING
        }
        type.contains(other = "vector<") -> {
            val arrayTypeName = """vector<(.+)>"""
                .toRegex()
                .find(input = type)!!
                .destructured
                .component1()
                .let { arrayType -> createTypeName(type = arrayType, isNullable = isNullable) }
            when (arrayTypeName) {
                INT -> {
                    require(value = !isNullable)
                    return INT_ARRAY
                }
                LONG -> {
                    require(value = !isNullable)
                    return LONG_ARRAY
                }
                else -> {
                    if (isNullable) {
                        return arrayTypeName
                            .copy(nullable = true)
                            .let { ARRAY.plusParameter(typeArgument = it) }
                    }
                    return ARRAY.plusParameter(typeArgument = arrayTypeName)
                }
            }
        }
        else -> {
            val typeName = dtoTypeName(simpleName = type.capitalized)
            if (isNullable) {
                return typeName.copy(nullable = true)
            }
            return typeName
        }
    }
}

private class Property(
    val name: String,
    val nameSnakeCase: String,
    val type: TypeName,
    val typeName: String,
)

//////  //////  //////
//////  //////  //////
//////  //////  //////

//////  //////  //////
//////  //////  //////
//////  //////  //////

//////  //////  //////
//////  //////  //////
//////  //////  //////

private fun writeFunctionCommonElements(functionCommonElements: List<CommonElement>) {
    functionCommonElements.forEach { commonElement ->
        val className = commonElement.name.capitalized

        val properties = createProperties(properties = commonElement.properties, fields = commonElement.description.fields)

        FileSpec
            .builder(packageName = PACKAGE_FUNCTION, fileName = className)
            .addType(
                typeSpec = TypeSpec
                    .classBuilder(name = className)
                    .addModifier(modifier = KModifier.INTERNAL)
                    .primaryConstructor(
                        primaryConstructor = FunSpec
                            .constructorBuilder()
                            .addModifier(modifier = KModifier.INTERNAL)
                            .addParameters(
                                parameterSpecs = properties.map { property ->
                                    return@map ParameterSpec
                                        .builder(name = property.name, type = property.type)
                                        .build()
                                },
                            )
                            .build()
                    )
                    .addProperties(
                        propertySpecs = properties.map { property ->
                            return@map PropertySpec
                                .builder(name = property.name, type = property.type)
                                .addModifier(modifier = KModifier.INTERNAL)
                                .initializer(format = property.name)
                                .build()
                        },
                    )
                    .build()
            )
            .setIndent()
            .build()
            .writeAndFixContent(folderName = "commonMainGenerated")
    }
}

private fun writeDeserializer(dtoCommonElements: List<CommonElement>) {
    val commonElements = dtoCommonElements.sortedBy { it.name }

    FileSpec
        .builder(packageName = PACKAGE, fileName = "TdlDeserializer")
        .addType(
            typeSpec = TypeSpec
                .classBuilder(name = "TdlDeserializer")
                .addAnnotation(
                    annotationSpec = AnnotationSpec
                        .builder(type = Suppress::class)
                        .addMember(format = "\"UNUSED_PARAMETER\"")
                        .build(),
                )
                .addModifier(modifier = KModifier.INTERNAL)
                .primaryConstructor(
                    primaryConstructor = FunSpec
                        .constructorBuilder()
                        .addModifier(modifier = KModifier.INTERNAL)
                        .build()
                )
                .addFunction(
                    funSpec = FunSpec
                        .builder(name = "deserialize")
                        .addModifier(modifier = KModifier.INTERNAL)
                        .addParameter(
                            parameterSpec = ParameterSpec
                                .builder(name = "json", type = STRING)
                                .build()
                        )
                        .returns(
                            returnType = TypeName(
                                packageName = "kotlin",
                                simpleName = "Triple",
                                generics = buildList {
                                    add(element = INT)
                                    add(element = LONG)
                                    add(element = ANY)
                                },
                            ),
                        )
                        .addStatement(
                            format = "val jsonObject = %T(json = json)",
                            utilTypeName(simpleName = "parseJsonObject"),
                        )
                        .addStatement(
                            format = "val type = jsonObject.%T(key = \"@type\")",
                            utilTypeName(simpleName = "getString"),
                        )
                        .addStatement(
                            format = "val clientId = jsonObject.%T(key = \"@client_id\")",
                            utilTypeName(simpleName = "getInt"),
                        )
                        .addStatement(
                            format = "val requestId = jsonObject.%T(key = \"@extra\")",
                            utilTypeName(simpleName = "getLong"),
                        )
                        .addStatement(format = "val dto = deserialize(type = type, jsonObject = jsonObject)")
                        .addStatement(
                            format = "return %T(first = clientId, second = requestId, third = dto)",
                            TypeName(packageName = "kotlin", simpleName = "Triple"),
                        )
                        .build()
                )
                .addFunction(
                    funSpec = FunSpec
                        .builder(name = "deserialize")
                        .addModifier(modifier = KModifier.PRIVATE)
                        .addParameter(
                            parameterSpec = ParameterSpec
                                .builder(name = "type", type = STRING)
                                .build()
                        )
                        .addParameter(
                            parameterSpec = ParameterSpec
                                .builder(
                                    name = "jsonObject",
                                    type = TypeName(packageName = "kotlinx.serialization.json", simpleName = "JsonObject"),
                                )
                                .build()
                        )
                        .returns(returnType = ANY)
                        .beginControlFlow(controlFlow = "when(type)")
                        .apply {
                            commonElements.map { commonElement ->
                                val name = commonElement.name
                                addStatement(
                                    format = """"%L" -> return deserialize%L(jsonObject = jsonObject)""",
                                    name,
                                    name.capitalized,
                                )
                            }
                            addStatement(format = "else -> error(message = \"Unknown dto type: \$type\")")
                        }
                        .endControlFlow()
                        .build()
                )
                .addFunctions(
                    funSpecs = commonElements
                        .filter { commonElement ->
                            return@filter !commonElement.returns.equals(other = commonElement.name, ignoreCase = true)
                        }
                        .groupBy(
                            keySelector = { commonElement -> commonElement.returns },
                            valueTransform = { commonElement -> commonElement.name },
                        )
                        .map { entry ->
                            return@map FunSpec
                                .builder(name = "deserialize${entry.key}")
                                .addModifier(modifier = KModifier.PRIVATE)
                                .addParameter(
                                    parameterSpec = ParameterSpec
                                        .builder(
                                            name = "jsonObject",
                                            type = TypeName(
                                                packageName = "kotlinx.serialization.json",
                                                simpleName = "JsonObject",
                                            ),
                                        )
                                        .build()
                                )
                                .returns(
                                    returnType = dtoTypeName(simpleName = entry.key),
                                )
                                .addStatement(
                                    format = "val type = jsonObject.%T(key = \"@type\")",
                                    utilTypeName(simpleName = "getString"),
                                )
                                .beginControlFlow(controlFlow = "when(type)")
                                .apply {
                                    entry.value.map { name ->
                                        addStatement(
                                            format = """"%L" -> return deserialize%L(jsonObject = jsonObject)""",
                                            name,
                                            name.capitalized,
                                        )
                                    }
                                    addStatement(format = "else -> error(message = \"Unknown dto type: \$type\")")
                                }
                                .endControlFlow()
                                .build()
                        },
                )
                .addFunctions(
                    funSpecs = commonElements.map { commonElement ->
                        val name = commonElement.name
                        val capitalizedName = name.capitalized

                        val properties = createProperties(
                            properties = commonElement.properties,
                            fields = commonElement.description.fields,
                        )

                        return@map FunSpec
                            .builder(name = "deserialize$capitalizedName")
                            .addModifier(modifier = KModifier.PRIVATE)
                            .addParameter(
                                parameterSpec = ParameterSpec
                                    .builder(
                                        name = "jsonObject",
                                        type = TypeName(packageName = "kotlinx.serialization.json", simpleName = "JsonObject"),
                                    )
                                    .build()
                            )
                            .returns(
                                returnType = dtoTypeName(simpleName = capitalizedName),
                            )
                            .addStatement(format = "REMOVE_LINE")
                            .apply {
                                if (properties.size > 0) {
                                    addStatement(
                                        format = "return %T(",
                                        dtoTypeName(simpleName = capitalizedName),
                                    )
                                    properties.forEach { property ->
                                        val name = property.name
                                        val nameSnakeCase = property.nameSnakeCase
                                        val typeName = property.type
                                        when (typeName) {
                                            BOOLEAN -> {
                                                addStatement(
                                                    format = """    %L = jsonObject.%T(key = "%L"),""",
                                                    name,
                                                    utilTypeName(simpleName = "getBoolean"),
                                                    nameSnakeCase,
                                                )
                                            }
                                            BYTE_ARRAY -> {
                                                addStatement(
                                                    format = """    %L = jsonObject.%T(key = "%L"),""",
                                                    name,
                                                    utilTypeName(simpleName = "getBytes"),
                                                    nameSnakeCase,
                                                )
                                            }
                                            DOUBLE -> {
                                                addStatement(
                                                    format = """    %L = jsonObject.%T(key = "%L"),""",
                                                    name,
                                                    utilTypeName(simpleName = "getDouble"),
                                                    nameSnakeCase,
                                                )
                                            }
                                            INT -> {
                                                addStatement(
                                                    format = """    %L = jsonObject.%T(key = "%L"),""",
                                                    name,
                                                    utilTypeName(simpleName = "getInt"),
                                                    nameSnakeCase,
                                                )
                                            }
                                            INT_ARRAY -> {
                                                addStatement(
                                                    format = """    %L = jsonObject.%T(key = "%L"),""",
                                                    name,
                                                    utilTypeName(simpleName = "getInts"),
                                                    nameSnakeCase,
                                                )
                                            }
                                            LONG -> {
                                                addStatement(
                                                    format = """    %L = jsonObject.%T(key = "%L"),""",
                                                    name,
                                                    utilTypeName(simpleName = "getLong"),
                                                    nameSnakeCase,
                                                )
                                            }
                                            LONG_ARRAY -> {
                                                addStatement(
                                                    format = """    %L = jsonObject.%T(key = "%L"),""",
                                                    name,
                                                    utilTypeName(simpleName = "getLongs"),
                                                    nameSnakeCase,
                                                )
                                            }
                                            STRING -> {
                                                addStatement(
                                                    format = """    %L = jsonObject.%T(key = "%L"),""",
                                                    name,
                                                    utilTypeName(simpleName = "getString"),
                                                    nameSnakeCase,
                                                )
                                            }
                                            else -> {
                                                if (typeName is ParameterizedTypeName) {
                                                    val genericTypeName = typeName.typeArguments.first()
                                                    when (genericTypeName) {
                                                        BYTE_ARRAY -> {
                                                            addStatement(
                                                                format = """    %L = jsonObject.%T(key = "%L"),""",
                                                                name,
                                                                utilTypeName(simpleName = "getBytesArray"),
                                                                nameSnakeCase,
                                                            )
                                                        }
                                                        STRING -> {
                                                            addStatement(
                                                                format = """    %L = jsonObject.%T(key = "%L"),""",
                                                                name,
                                                                utilTypeName(simpleName = "getStrings"),
                                                                nameSnakeCase,
                                                            )
                                                        }
                                                        else -> {
                                                            if (genericTypeName is ParameterizedTypeName) {
                                                                addStatement(
                                                                    format = """    %L = jsonObject.%T(key = "%L") { data -> deserialize%L(jsonObject = data) },""",
                                                                    name,
                                                                    utilTypeName(simpleName = "getObjectsArray"),
                                                                    nameSnakeCase,
                                                                    property
                                                                        .typeName
                                                                        .substringAfter(delimiter = "vector<vector<")
                                                                        .substringBefore(delimiter = ">>")
                                                                        .capitalized,
                                                                )
                                                            } else {
                                                                if (genericTypeName.isNullable) {
                                                                    addStatement(
                                                                        format = """    %L = jsonObject.%T(key = "%L") { data -> deserialize%L(jsonObject = data) },""",
                                                                        name,
                                                                        utilTypeName(simpleName = "getObjectsNullable"),
                                                                        nameSnakeCase,
                                                                        property
                                                                            .typeName
                                                                            .substringAfter(delimiter = "vector<")
                                                                            .substringBefore(delimiter = ">")
                                                                            .capitalized,
                                                                    )
                                                                } else {
                                                                    addStatement(
                                                                        format = """    %L = jsonObject.%T(key = "%L") { data -> deserialize%L(jsonObject = data) },""",
                                                                        name,
                                                                        utilTypeName(simpleName = "getObjects"),
                                                                        nameSnakeCase,
                                                                        property
                                                                            .typeName
                                                                            .substringAfter(delimiter = "vector<")
                                                                            .substringBefore(delimiter = ">")
                                                                            .capitalized,
                                                                    )
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    if (typeName.isNullable) {
                                                        addStatement(
                                                            format = """    %L = jsonObject.%T(key = "%L") { data -> deserialize%L(jsonObject = data) },""",
                                                            name,
                                                            utilTypeName(simpleName = "getObjectNullable"),
                                                            nameSnakeCase,
                                                            property.typeName.capitalized,
                                                        )
                                                    } else {
                                                        addStatement(
                                                            format = """    %L = jsonObject.%T(key = "%L") { data -> deserialize%L(jsonObject = data) },""",
                                                            name,
                                                            utilTypeName(simpleName = "getObject"),
                                                            nameSnakeCase,
                                                            property.typeName.capitalized,
                                                        )
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    addStatement(format = ")")
                                } else {
                                    addStatement(
                                        format = "return %T()",
                                        dtoTypeName(simpleName = capitalizedName),
                                    )
                                }
                            }
                            .build()
                    },
                )
                .build()
        )
        .setIndent()
        .build()
        .writeAndFixContent(folderName = "commonMainGenerated")
}

private fun writeSerializer(functionCommonElements: List<CommonElement>, dtoCommonElements: List<CommonElement>) {
    FileSpec
        .builder(packageName = PACKAGE, fileName = "TdlSerializer")
        .addType(
            typeSpec = TypeSpec
                .classBuilder(name = "TdlSerializer")
                .addModifier(modifier = KModifier.INTERNAL)
                .primaryConstructor(
                    primaryConstructor = FunSpec
                        .constructorBuilder()
                        .addModifier(modifier = KModifier.INTERNAL)
                        .build(),
                )
                .addFunction(
                    funSpec = FunSpec
                        .builder(name = "serialize")
                        .addModifier(modifier = KModifier.INTERNAL)
                        .addParameter(
                            parameterSpec = ParameterSpec
                                .builder(name = "function", type = ANY)
                                .build(),
                        )
                        .addParameter(
                            parameterSpec = ParameterSpec
                                .builder(name = "requestId", type = LONG)
                                .build(),
                        )
                        .returns(returnType = STRING)
                        .beginControlFlow(controlFlow = "when(function)")
                        .apply {
                            functionCommonElements.map { commonElement ->
                                addStatement(
                                    format = "is %T -> return serialize(requestId = requestId, function = function)",
                                    functionTypeName(simpleName = commonElement.name.capitalized),
                                )
                            }
                            addStatement(format = "else -> error(message = \"Unknown function type: \${function::class}\")")
                        }
                        .endControlFlow()
                        .build(),
                )
                .addFunctions(
                    funSpecs = functionCommonElements.map { commonElement ->
                        val className = commonElement.name.capitalized

                        val properties = createProperties(
                            properties = commonElement.properties,
                            fields = commonElement.description.fields,
                        )

                        return@map FunSpec
                            .builder(name = "serialize")
                            .addModifier(modifier = KModifier.PRIVATE)
                            .addParameter(
                                parameterSpec = ParameterSpec
                                    .builder(name = "requestId", type = LONG)
                                    .build(),
                            )
                            .addParameter(
                                parameterSpec = ParameterSpec
                                    .builder(
                                        name = "function",
                                        type = functionTypeName(simpleName = className),
                                    )
                                    .build(),
                            )
                            .returns(returnType = STRING)
                            .addStatement(format = "REMOVE_LINE")
                            .beginControlFlow(
                                controlFlow = "return %T",
                                utilTypeName(simpleName = "buildJsonObjectString"),
                            )
                            .addStatement(
                                format = "%T(key = \"@type\", string = \"%L\")",
                                utilTypeName(simpleName = "put"),
                                commonElement.name,
                            )
                            .addStatement(
                                format = "%T(key = \"@extra\", long = requestId)",
                                utilTypeName(simpleName = "put"),
                            )
                            .addSerializerProperties(properties = properties, objectName = "function")
                            .endControlFlow()
                            .build()
                    },
                )
                .addFunctions(
                    funSpecs = dtoCommonElements
                        .filter { commonElement ->
                            return@filter !commonElement.returns.equals(other = commonElement.name, ignoreCase = true)
                        }
                        .groupBy(
                            keySelector = { commonElement -> commonElement.returns },
                            valueTransform = { commonElement -> commonElement.name },
                        )
                        .map { entry ->
                            return@map FunSpec
                                .builder(name = "serialize")
                                .addModifier(modifier = KModifier.PRIVATE)
                                .addParameter(
                                    parameterSpec = ParameterSpec
                                        .builder(
                                            name = "dto",
                                            type = dtoTypeName(simpleName = entry.key),
                                        )
                                        .build(),
                                )
                                .returns(
                                    returnType = TypeName(
                                        packageName = "kotlinx.serialization.json",
                                        simpleName = "JsonElement",
                                    ),
                                )
                                .beginControlFlow(controlFlow = "when(dto)")
                                .apply {
                                    entry.value.map { name ->
                                        addStatement(
                                            format = "is %T -> return serialize(dto = dto)",
                                            dtoTypeName(simpleName = name.capitalized),
                                        )
                                    }
                                    if (entry.key == "Update") {
                                        addStatement(format = "else -> error(message = \"Unknown dto type: \${dto::class}\")")
                                    }
                                }
                                .endControlFlow()
                                .build()
                        },
                )
                .addFunctions(
                    funSpecs = dtoCommonElements.map { commonElement ->
                        val className = commonElement.name.capitalized

                        val properties = createProperties(
                            properties = commonElement.properties,
                            fields = commonElement.description.fields,
                        )

                        return@map FunSpec
                            .builder(name = "serialize")
                            .addModifier(modifier = KModifier.PRIVATE)
                            .addParameter(
                                parameterSpec = ParameterSpec
                                    .builder(
                                        name = "dto",
                                        type = dtoTypeName(simpleName = className),
                                    )
                                    .build(),
                            )
                            .returns(
                                returnType = TypeName(packageName = "kotlinx.serialization.json", simpleName = "JsonElement"),
                            )
                            .addStatement(format = "REMOVE_LINE")
                            .beginControlFlow(
                                controlFlow = "return %T",
                                TypeName(packageName = "kotlinx.serialization.json", simpleName = "buildJsonObject"),
                            )
                            .addStatement(
                                format = "%T(key = \"@type\", string = \"%L\")",
                                utilTypeName(simpleName = "put"),
                                commonElement.name,
                            )
                            .addSerializerProperties(properties = properties, objectName = "dto")
                            .endControlFlow()
                            .build()
                    },
                )
                .build(),
        )
        .setIndent()
        .build()
        .writeAndFixContent(folderName = "commonMainGenerated")
}

//////  //////  //////
//////  //////  //////
//////  //////  //////

//////  //////  //////
//////  //////  //////
//////  //////  //////

//////  //////  //////
//////  //////  //////
//////  //////  //////

private fun FunSpec.Builder.addSerializerProperties(properties: List<Property>, objectName: String): FunSpec.Builder {
    properties.forEach { property ->
        val typeName = property.type
        val nameSnakeCase = property.nameSnakeCase
        val name = property.name
        when (typeName) {
            BOOLEAN -> {
                addStatement(
                    format = "%T(key = \"%L\", boolean = %L.%L)",
                    utilTypeName(simpleName = "put"),
                    nameSnakeCase,
                    objectName,
                    name,
                )
            }
            BYTE_ARRAY -> {
                addStatement(
                    format = "%T(key = \"%L\", bytes = %L.%L)",
                    utilTypeName(simpleName = "put"),
                    nameSnakeCase,
                    objectName,
                    name,
                )
            }
            DOUBLE -> {
                addStatement(
                    format = "%T(key = \"%L\", double = %L.%L)",
                    utilTypeName(simpleName = "put"),
                    nameSnakeCase,
                    objectName,
                    name,
                )
            }
            INT -> {
                addStatement(
                    format = "%T(key = \"%L\", int = %L.%L)",
                    utilTypeName(simpleName = "put"),
                    nameSnakeCase,
                    objectName,
                    name,
                )
            }
            INT_ARRAY -> {
                addStatement(
                    format = "%T(key = \"%L\", ints = %L.%L)",
                    utilTypeName(simpleName = "put"),
                    nameSnakeCase,
                    objectName,
                    name,
                )
            }
            LONG -> {
                addStatement(
                    format = "%T(key = \"%L\", long = %L.%L)",
                    utilTypeName(simpleName = "put"),
                    nameSnakeCase,
                    objectName,
                    name,
                )
            }
            LONG_ARRAY -> {
                addStatement(
                    format = "%T(key = \"%L\", longs = %L.%L)",
                    utilTypeName(simpleName = "put"),
                    nameSnakeCase,
                    objectName,
                    name,
                )
            }
            STRING -> {
                addStatement(
                    format = "%T(key = \"%L\", string = %L.%L)",
                    utilTypeName(simpleName = "put"),
                    nameSnakeCase,
                    objectName,
                    name,
                )
            }
            else -> {
                if (typeName is ParameterizedTypeName) {
                    val genericTypeName = typeName.typeArguments.first()
                    when (genericTypeName) {
                        BYTE_ARRAY -> {
                            addStatement(
                                format = "%T(key = \"%L\", bytes = %L.%L)",
                                utilTypeName(simpleName = "put"),
                                nameSnakeCase,
                                objectName,
                                name,
                            )
                        }
                        STRING -> {
                            addStatement(
                                format = "%T(key = \"%L\", strings = %L.%L)",
                                utilTypeName(simpleName = "put"),
                                nameSnakeCase,
                                objectName,
                                name,
                            )
                        }
                        else -> {
                            if (genericTypeName is ParameterizedTypeName) {
                                addStatement(
                                    format = "%T(key = \"%L\", objectArrays = %L.%L) { data -> serialize(dto = data) }",
                                    utilTypeName(simpleName = "put"),
                                    nameSnakeCase,
                                    objectName,
                                    name,
                                )
                            } else {
                                if (genericTypeName.isNullable) {
                                    addStatement(
                                        format = "%T(key = \"%L\", objects = %L.%L) { data -> serialize(dto = data) }",
                                        utilTypeName(simpleName = "putNullable"),
                                        nameSnakeCase,
                                        objectName,
                                        name,
                                    )
                                } else {
                                    addStatement(
                                        format = "%T(key = \"%L\", objects = %L.%L) { data -> serialize(dto = data) }",
                                        utilTypeName(simpleName = "put"),
                                        nameSnakeCase,
                                        objectName,
                                        name,
                                    )
                                }
                            }
                        }
                    }
                } else {
                    addStatement(
                        format = "%T(key = \"%L\", value = %L.%L) { data -> serialize(dto = data) }",
                        utilTypeName(simpleName = "put"),
                        nameSnakeCase,
                        objectName,
                        name,
                    )
                }
            }
        }
    }

    return this
}

//////  //////  //////
//////  //////  //////
//////  //////  //////

//////  //////  //////
//////  //////  //////
//////  //////  //////

//////  //////  //////
//////  //////  //////
//////  //////  //////

private fun dtoTypeName(simpleName: String): TypeName {
    return ClassName(packageName = PACKAGE_DTO, simpleName = simpleName)
}

private fun functionTypeName(simpleName: String): TypeName {
    return ClassName(packageName = PACKAGE_FUNCTION, simpleName = simpleName)
}

private fun utilTypeName(simpleName: String): TypeName {
    return ClassName(packageName = PACKAGE_UTIL, simpleName = simpleName)
}

private fun TypeName(packageName: String, simpleName: String): TypeName {
    return ClassName(packageName = packageName, simpleName = simpleName)
}

private fun TypeName(packageName: String, simpleName: String, generic: TypeName): TypeName {
    val className = ClassName(packageName = packageName, simpleName = simpleName)
    return className.plusParameter(typeArgument = generic)
}

private fun TypeName(packageName: String, simpleName: String, generics: List<TypeName>): TypeName {
    val className = ClassName(packageName = packageName, simpleName = simpleName)
    return className.parameterizedBy(typeArguments = generics)
}

private fun ClassName(packageName: String, simpleName: String): ClassName {
    return ClassName(
        packageName = packageName,
        simpleNames = listOf(element = simpleName),
    )
}

private fun updateLicenseForChangedFiles() {
    val directory = File(currentPath)
    val commit = "HEAD"

    val copyrightPattern = "Copyright ([0-9]{4})(-[0-9]{4})? Georgii Ippolitov"
    val copyrightRegex = copyrightPattern.toRegex()

    val changedFiles = getChangedFiles(directory = directory, commit = commit)
    val contentChangedFiles = getContentChangedFiles(directory = directory, regex = copyrightPattern, commit = commit)

    restoreFilesFromCommit(files = changedFiles - contentChangedFiles, directory = directory, commit = commit)

    val currentYear = Year
        .now()
        .value
        .toString()

    for (path in contentChangedFiles) {
        val file = File(directory, path)
        val exists = file.exists()
        if (!exists) {
            continue
        }

        val previousContent = getFileContentFromCommit(directory = directory, commit = commit, path = path)
        if (previousContent == null) {
            updateFileLicense(file = file, regex = copyrightRegex, year = currentYear)
        } else {
            val startYear = getStartYear(content = previousContent, regex = copyrightRegex)
            if (startYear == null || startYear == currentYear) {
                updateFileLicense(file = file, regex = copyrightRegex, year = currentYear)
            } else {
                updateFileLicense(file = file, regex = copyrightRegex, year = "$startYear-$currentYear")
            }
        }
    }
}

private fun getChangedFiles(directory: File, commit: String): Set<String> {
    val text = runCommand(directory = directory) {
        add(element = "git")
        add(element = "diff")
        add(element = "--name-only")
        add(element = commit)
        add(element = "--")
        add(element = "*.kt")
    }
    if (text == null) {
        return emptySet()
    }

    return text
        .lines()
        .filter { line -> line.isNotEmpty() }
        .toSet()
}

private fun getContentChangedFiles(directory: File, regex: String, commit: String): Set<String> {
    val text = runCommand(directory = directory) {
        add(element = "git")
        add(element = "diff")
        add(element = "-I")
        add(element = regex)
        add(element = commit)
        add(element = "--")
        add(element = "*.kt")
    }
    if (text == null) {
        return emptySet()
    }

    return "^diff --git a/.*\\.kt b/(.*\\.kt)"
        .toRegex(option = RegexOption.MULTILINE)
        .findAll(input = text)
        .map { matchResult -> matchResult.groupValues.get(index = 1) }
        .toSet()
}

private fun restoreFilesFromCommit(files: Set<String>, directory: File, commit: String) {
    files
        .chunked(size = 100)
        .forEach { batch ->
            runCommand(directory = directory) {
                add(element = "git")
                add(element = "checkout")
                add(element = commit)
                add(element = "--")
                addAll(elements = batch)
            }
        }
}

private fun getFileContentFromCommit(directory: File, commit: String, path: String): String? {
    return runCommand(directory = directory) {
        add(element = "git")
        add(element = "show")
        add(element = "$commit:$path")
    }
}

private fun runCommand(directory: File, block: MutableList<String>.() -> Unit): String? {
    val process = buildList(builderAction = block)
        .let { args -> ProcessBuilder(args) }
        .directory(directory)
        .start()

    val text = process
        .inputStream
        .bufferedReader()
        .readText()

    val exitCode = process.waitFor()

    if (exitCode == 0) {
        return text
    }

    return null
}

private fun getStartYear(content: String, regex: Regex): String? {
    val matchResult = regex.find(input = content)
    if (matchResult == null) {
        return null
    }

    return matchResult.groupValues.get(index = 1)
}

private fun updateFileLicense(file: File, regex: Regex, year: String) {
    val currentText = file.readText()

    val updatedText = currentText.replaceFirst(regex = regex, replacement = "Copyright $year Georgii Ippolitov")
    if (updatedText == currentText) {
        return
    }

    file.writeText(text = updatedText)
}
