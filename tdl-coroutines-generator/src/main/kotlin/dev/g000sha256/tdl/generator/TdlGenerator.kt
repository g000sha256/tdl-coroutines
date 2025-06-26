/*
 * Copyright 2025 Georgii Ippolitov (g000sha256)
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
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.SHORT_ARRAY
import com.squareup.kotlinpoet.STRING
import com.squareup.kotlinpoet.TypeName
import com.squareup.kotlinpoet.TypeSpec
import java.io.File
import java.nio.file.Paths
import kotlin.io.path.pathString
import kotlin.io.path.readLines
import kotlin.io.path.writeLines

private const val LICENCE = """/*
 * Copyright 2025 Georgii Ippolitov (g000sha256)
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

private const val PACKAGE = "dev.g000sha256.tdl"
private const val PACKAGE_DTO = "$PACKAGE.dto"
private const val PACKAGE_FUNCTION = "$PACKAGE.function"

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
    addLicence: Boolean = true,
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
            if (addLicence) {
                return@let listOf(LICENCE) + it
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

private fun dtoTypeName(simpleName: String): TypeName {
    return TypeName(packageName = PACKAGE_DTO, simpleName = simpleName)
}

private fun functionTypeName(simpleName: String): TypeName {
    return TypeName(packageName = PACKAGE_FUNCTION, simpleName = simpleName)
}

private fun TypeName(packageName: String, simpleName: String, parameterizedBy: TypeName? = null): TypeName {
    val className = ClassName(packageName, simpleName)
    if (parameterizedBy == null) {
        return className
    }

    return className.parameterizedBy(parameterizedBy)
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
        .also { check(value = it.size == 172) }

    val dtoCommonElements = parseCommonElements(text = typesText)
        .also { check(value = it.size == 1775) }

    check(value = classElements.size + dtoCommonElements.size == 1947)

    val functionCommonElements = parseCommonElements(text = functionsText)
        .also { check(value = it.size == 867) }
        .also { println("Functions: ${it.size}") }
        .sortedBy { it.name } // TODO Remove sorting in the future

    val updateDtoCommonElements = dtoCommonElements
        .filter { it.returns == "Update" }
        .also { check(value = it.size == 159) }
        .also { println("Updates: ${it.size}") }

    File(currentPath, "tdl-coroutines/src/commonMainGenerated")
        .deleteRecursively()

    writeClassElements(classElements)

    writeDtoCommonElements(dtoCommonElements)

    writeFunctionCommonElements(functionCommonElements)

    writeSerializer(functionCommonElements, dtoCommonElements)

    writeClientInterface(functionCommonElements, updateDtoCommonElements)

    writeTdlClientImplementation(functionCommonElements, updateDtoCommonElements)
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
                                }
                            )
                            .build()
                    )
                    .addSuperinterface(
                        superinterface = TypeName(packageName = PACKAGE_FUNCTION, simpleName = "Function")
                    )
                    .addProperties(
                        propertySpecs = properties.map { property ->
                            return@map PropertySpec
                                .builder(name = property.name, type = property.type)
                                .addModifier(modifier = KModifier.INTERNAL)
                                .initializer(format = property.name)
                                .build()
                        }
                    )
                    .build()
            )
            .setIndent()
            .build()
            .writeAndFixContent(folderName = "commonMainGenerated")
    }
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
                        .build()
                )
                .addFunction(
                    funSpec = FunSpec
                        .builder(name = "serialize")
                        .addModifier(modifier = KModifier.INTERNAL)
                        .addParameter(
                            parameterSpec = ParameterSpec
                                .builder(
                                    name = "function",
                                    type = functionTypeName(simpleName = "Function")
                                )
                                .build()
                        )
                        .addParameter(
                            parameterSpec = ParameterSpec
                                .builder(name = "requestId", type = LONG)
                                .build()
                        )
                        .returns(
                            returnType = STRING
                        )
                        .addStatement(format = "val jsonElement = serializeJsonElement(function = function, requestId = requestId)")
                        .addStatement(format = "return jsonElement.toString()")
                        .build()
                )
                .addFunction(
                    funSpec = FunSpec
                        .builder(name = "serializeJsonElement")
                        .addModifier(modifier = KModifier.PRIVATE)
                        .addParameter(
                            parameterSpec = ParameterSpec
                                .builder(
                                    name = "function",
                                    type = functionTypeName(simpleName = "Function")
                                )
                                .build()
                        )
                        .addParameter(
                            parameterSpec = ParameterSpec
                                .builder(name = "requestId", type = LONG)
                                .build()
                        )
                        .returns(
                            returnType = TypeName(packageName = "kotlinx.serialization.json", simpleName = "JsonElement")
                        )
                        .beginControlFlow(controlFlow = "when(function)")
                        .apply {
                            functionCommonElements.map { commonElement ->
                                val functionName = commonElement.name.capitalized

                                addStatement(
                                    format = "is %T -> return serialize(requestId = requestId, function = function)",
                                    functionTypeName(simpleName = functionName)
                                )
                            }
                            addStatement(format = "else -> error(message = \"Unknown function type: \${function::class}\")")
                        }
                        .endControlFlow()
                        .build()
                )
                .addFunctions(
                    funSpecs = functionCommonElements.map { commonElement ->
                        val functionName = commonElement.name.capitalized

                        val properties = createProperties(
                            properties = commonElement.properties,
                            fields = commonElement.description.fields
                        )

                        return@map FunSpec
                            .builder(name = "serialize")
                            .addModifier(modifier = KModifier.PRIVATE)
                            .addParameter(
                                parameterSpec = ParameterSpec
                                    .builder(name = "requestId", type = LONG)
                                    .build()
                            )
                            .addParameter(
                                parameterSpec = ParameterSpec
                                    .builder(
                                        name = "function",
                                        type = functionTypeName(simpleName = functionName)
                                    )
                                    .build()
                            )
                            .returns(
                                returnType = TypeName(packageName = "kotlinx.serialization.json", simpleName = "JsonElement")
                            )
                            .addStatement(format = "REMOVE_LINE")
                            .beginControlFlow(
                                controlFlow = "return %T",
                                TypeName(packageName = "kotlinx.serialization.json", simpleName = "buildJsonObject"),
                            )
                            .addStatement(
                                format = "%T(key = \"@type\", string = \"%L\")",
                                TypeName(packageName = PACKAGE, simpleName = "put"),
                                commonElement.name
                            )
                            .addStatement(
                                format = "%T(key = \"@extra\", long = requestId)",
                                TypeName(packageName = PACKAGE, simpleName = "put"),
                            )
                            .apply {
                                properties.forEach { property ->
                                    val typeName = property.type
                                    when (typeName) {
                                        BOOLEAN -> {
                                            addStatement(
                                                format = "%T(key = \"%L\", boolean = function.%L)",
                                                TypeName(packageName = PACKAGE, simpleName = "put"),
                                                property.nameSnakeCase,
                                                property.name,
                                            )
                                        }
                                        BYTE_ARRAY -> {
                                            addStatement(
                                                format = "%T(key = \"%L\", bytes = function.%L)",
                                                TypeName(packageName = PACKAGE, simpleName = "put"),
                                                property.nameSnakeCase,
                                                property.name,
                                            )
                                        }
                                        DOUBLE -> {
                                            addStatement(
                                                format = "%T(key = \"%L\", double = function.%L)",
                                                TypeName(packageName = PACKAGE, simpleName = "put"),
                                                property.nameSnakeCase,
                                                property.name,
                                            )
                                        }
                                        INT -> {
                                            addStatement(
                                                format = "%T(key = \"%L\", int = function.%L)",
                                                TypeName(packageName = PACKAGE, simpleName = "put"),
                                                property.nameSnakeCase,
                                                property.name,
                                            )
                                        }
                                        INT_ARRAY -> {
                                            addStatement(
                                                format = "%T(key = \"%L\", ints = function.%L)",
                                                TypeName(packageName = PACKAGE, simpleName = "put"),
                                                property.nameSnakeCase,
                                                property.name,
                                            )
                                        }
                                        LONG -> {
                                            addStatement(
                                                format = "%T(key = \"%L\", long = function.%L)",
                                                TypeName(packageName = PACKAGE, simpleName = "put"),
                                                property.nameSnakeCase,
                                                property.name,
                                            )
                                        }
                                        LONG_ARRAY -> {
                                            addStatement(
                                                format = "%T(key = \"%L\", longs = function.%L)",
                                                TypeName(packageName = PACKAGE, simpleName = "put"),
                                                property.nameSnakeCase,
                                                property.name,
                                            )
                                        }
                                        STRING -> {
                                            addStatement(
                                                format = "%T(key = \"%L\", string = function.%L)",
                                                TypeName(packageName = PACKAGE, simpleName = "put"),
                                                property.nameSnakeCase,
                                                property.name,
                                            )
                                        }
                                        else -> {
                                            if (typeName is ParameterizedTypeName) {
                                                val genericTypeNames = typeName.typeArguments
                                                check(value = genericTypeNames.size == 1) {
                                                    return@check "Expected one type argument for $typeName, but found ${genericTypeNames.size}"
                                                }
                                                val genericTypeName = genericTypeNames.first()
                                                when (genericTypeName) {
                                                    STRING -> {
                                                        addStatement(
                                                            format = "%T(key = \"%L\", strings = function.%L)",
                                                            TypeName(packageName = PACKAGE, simpleName = "put"),
                                                            property.nameSnakeCase,
                                                            property.name,
                                                        )
                                                    }
                                                    else -> {
                                                        addStatement(
                                                            format = "%T(key = \"%L\", array = function.%L) { data -> serialize(dto = data) }",
                                                            TypeName(packageName = PACKAGE, simpleName = "put"),
                                                            property.nameSnakeCase,
                                                            property.name,
                                                        )
                                                    }
                                                }
                                            } else {
                                                addStatement(
                                                    format = "%T(key = \"%L\", value = function.%L) { data -> serialize(dto = data) }",
                                                    TypeName(packageName = PACKAGE, simpleName = "put"),
                                                    property.nameSnakeCase,
                                                    property.name,
                                                )
                                            }
                                        }
                                    }
                                }
                            }
                            .endControlFlow()
                            .build()
                    }
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
                                            type = dtoTypeName(simpleName = entry.key.capitalized)
                                        )
                                        .build()
                                )
                                .returns(
                                    returnType = TypeName(
                                        packageName = "kotlinx.serialization.json",
                                        simpleName = "JsonElement"
                                    )
                                )
                                .beginControlFlow(controlFlow = "when(dto)")
                                .apply {
                                    entry.value.map { name ->
                                        addStatement(
                                            format = "is %T -> return serialize(dto = dto)",
                                            dtoTypeName(simpleName = name.capitalized)
                                        )
                                    }
                                    addStatement(format = "else -> error(message = \"Unknown dto type: \${dto::class}\")")
                                }
                                .endControlFlow()
                                .build()
                        }
                )
                .addFunctions(
                    funSpecs = dtoCommonElements.map { commonElement ->
                        val className = commonElement.name.capitalized

                        val properties = createProperties(
                            properties = commonElement.properties,
                            fields = commonElement.description.fields
                        )

                        return@map FunSpec
                            .builder(name = "serialize")
                            .addModifier(modifier = KModifier.PRIVATE)
                            .addParameter(
                                parameterSpec = ParameterSpec
                                    .builder(
                                        name = "dto",
                                        type = dtoTypeName(simpleName = className)
                                    )
                                    .build()
                            )
                            .returns(
                                returnType = TypeName(packageName = "kotlinx.serialization.json", simpleName = "JsonElement")
                            )
                            .addStatement(format = "REMOVE_LINE")
                            .beginControlFlow(
                                controlFlow = "return %T",
                                TypeName(packageName = "kotlinx.serialization.json", simpleName = "buildJsonObject"),
                            )
                            .addStatement(
                                format = "%T(key = \"@type\", string = \"%L\")",
                                TypeName(packageName = PACKAGE, simpleName = "put"),
                                commonElement.name
                            )
                            .apply {
                                properties.forEach { property ->
                                    val typeName = property.type
                                    when (typeName) {
                                        BOOLEAN -> {
                                            addStatement(
                                                format = "%T(key = \"%L\", boolean = dto.%L)",
                                                TypeName(packageName = PACKAGE, simpleName = "put"),
                                                property.nameSnakeCase,
                                                property.name,
                                            )
                                        }
                                        BYTE_ARRAY -> {
                                            addStatement(
                                                format = "%T(key = \"%L\", bytes = dto.%L)",
                                                TypeName(packageName = PACKAGE, simpleName = "put"),
                                                property.nameSnakeCase,
                                                property.name,
                                            )
                                        }
                                        DOUBLE -> {
                                            addStatement(
                                                format = "%T(key = \"%L\", double = dto.%L)",
                                                TypeName(packageName = PACKAGE, simpleName = "put"),
                                                property.nameSnakeCase,
                                                property.name,
                                            )
                                        }
                                        INT -> {
                                            addStatement(
                                                format = "%T(key = \"%L\", int = dto.%L)",
                                                TypeName(packageName = PACKAGE, simpleName = "put"),
                                                property.nameSnakeCase,
                                                property.name,
                                            )
                                        }
                                        INT_ARRAY -> {
                                            addStatement(
                                                format = "%T(key = \"%L\", ints = dto.%L)",
                                                TypeName(packageName = PACKAGE, simpleName = "put"),
                                                property.nameSnakeCase,
                                                property.name,
                                            )
                                        }
                                        LONG -> {
                                            addStatement(
                                                format = "%T(key = \"%L\", long = dto.%L)",
                                                TypeName(packageName = PACKAGE, simpleName = "put"),
                                                property.nameSnakeCase,
                                                property.name,
                                            )
                                        }
                                        LONG_ARRAY -> {
                                            addStatement(
                                                format = "%T(key = \"%L\", longs = dto.%L)",
                                                TypeName(packageName = PACKAGE, simpleName = "put"),
                                                property.nameSnakeCase,
                                                property.name,
                                            )
                                        }
                                        STRING -> {
                                            addStatement(
                                                format = "%T(key = \"%L\", string = dto.%L)",
                                                TypeName(packageName = PACKAGE, simpleName = "put"),
                                                property.nameSnakeCase,
                                                property.name,
                                            )
                                        }
                                        else -> {
                                            if (typeName is ParameterizedTypeName) {
                                                val genericTypeNames = typeName.typeArguments
                                                check(value = genericTypeNames.size == 1) {
                                                    return@check "Expected one type argument for $typeName, but found ${genericTypeNames.size}"
                                                }
                                                val genericTypeName = genericTypeNames.first()
                                                when (genericTypeName) {
                                                    BYTE_ARRAY -> {
                                                        addStatement(
                                                            format = "%T(key = \"%L\", bytes = dto.%L)",
                                                            TypeName(packageName = PACKAGE, simpleName = "put"),
                                                            property.nameSnakeCase,
                                                            property.name,
                                                        )
                                                    }
                                                    STRING -> {
                                                        addStatement(
                                                            format = "%T(key = \"%L\", strings = dto.%L)",
                                                            TypeName(packageName = PACKAGE, simpleName = "put"),
                                                            property.nameSnakeCase,
                                                            property.name,
                                                        )
                                                    }
                                                    else -> {
                                                        if (genericTypeName is ParameterizedTypeName) {
                                                            addStatement(
                                                                format = "%T(key = \"%L\", arrayOfArrays = dto.%L) { data -> serialize(dto = data) }",
                                                                TypeName(
                                                                    packageName = PACKAGE,
                                                                    simpleName = "put"
                                                                ),
                                                                property.nameSnakeCase,
                                                                property.name,
                                                            )
                                                        } else {
                                                            genericTypeName as ClassName
                                                            check(value = genericTypeName.packageName == PACKAGE_DTO) { "Unexpected type: $genericTypeName" }

                                                            addStatement(
                                                                format = "%T(key = \"%L\", array = dto.%L) { data -> serialize(dto = data) }",
                                                                TypeName(packageName = PACKAGE, simpleName = "put"),
                                                                property.nameSnakeCase,
                                                                property.name,
                                                            )
                                                        }
                                                    }
                                                }
                                            } else {
                                                typeName as ClassName
                                                check(value = typeName.packageName == PACKAGE_DTO) { "Unexpected type: $typeName" }

                                                addStatement(
                                                    format = "%T(key = \"%L\", value = dto.%L) { data -> serialize(dto = data) }",
                                                    TypeName(packageName = PACKAGE, simpleName = "put"),
                                                    property.nameSnakeCase,
                                                    property.name,
                                                )
                                            }
                                        }
                                    }
                                }
                            }
                            .endControlFlow()
                            .build()
                    }
                )
                .build()
        )
        .setIndent()
        .build()
        .writeAndFixContent(folderName = "commonMainGenerated")
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
                                parameterizedBy = dtoTypeName(simpleName = "Update")
                            )
                        )
                        .addKdoc(format = "All updates.")
                        .addModifier(modifier = KModifier.PUBLIC)
                        .addModifier(modifier = KModifier.ABSTRACT)
                        .build()
                )
                .addProperties(
                    propertySpecs = updateDtoCommonElements.map { commonElement ->
                        val className = commonElement.name.capitalized

                        return@map PropertySpec
                            .builder(
                                name = className
                                    .removePrefix(prefix = "Update")
                                    .let { it.decapitalized + "Updates" },
                                type = TypeName(
                                    packageName = "kotlinx.coroutines.flow",
                                    simpleName = "Flow",
                                    parameterizedBy = dtoTypeName(simpleName = className)
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
                                    parameterizedBy = dtoTypeName(simpleName = commonElement.returns)
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
                                    format = Runtime
                                        .getRuntime()
                                        .exec(
                                            """git log -1 --pretty=format:"%H"""",
                                            null,
                                            getFile(path = "td")
                                        )
                                        .inputStream
                                        .reader(charset = Charsets.UTF_8)
                                        .readText()
                                )
                                .build()
                        )
                        .addProperty(
                            propertySpec = PropertySpec
                                .builder(name = "TDL_VERSION", type = STRING)
                                .addKdoc(format = "The version of the TDLib.")
                                .addModifier(modifier = KModifier.CONST)
                                .initializer(
                                    format = getFile(path = "td/CMakeLists.txt")
                                        .readText(charset = Charsets.UTF_8)
                                        .let {
                                            return@let """project\(TDLib VERSION ([0-9]+\.[0-9]+\.[0-9]+) LANGUAGES CXX C\)"""
                                                .toRegex()
                                                .find(input = it)!!
                                                .destructured
                                                .component1()
                                        }
                                        .let { "\"$it\"" }
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
                                .addStatement(format = "return serviceLocator.createClient()")
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
                                parameterizedBy = dtoTypeName(simpleName = "Update")
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
                        val className = commonElement.name.capitalized

                        return@map PropertySpec
                            .builder(
                                name = className
                                    .removePrefix(prefix = "Update")
                                    .let { it.decapitalized + "Updates" },
                                type = TypeName(
                                    packageName = "kotlinx.coroutines.flow",
                                    simpleName = "Flow",
                                    parameterizedBy = dtoTypeName(simpleName = className)
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
                                    parameterizedBy = dtoTypeName(simpleName = commonElement.returns)
                                )
                            )
                            .apply {
                                val typeName = functionTypeName(simpleName = functionName.capitalized)

                                addStatement(format = "REMOVE_LINE")
                                addStatement(format = "return repository.send(")

                                if (properties.size > 0) {
                                    addStatement(format = "    function = %T(", typeName)

                                    properties.forEach { property ->
                                        val name = property.name
                                        addStatement(format = "        %L = %L,", name, name)
                                    }

                                    addStatement(format = "    ),")
                                } else {
                                    addStatement(format = "    function = %T(),", typeName)
                                }
                                addStatement(format = ")")
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
        return@map Property(
            name = property.name.withReplacedSnakeCases1,
            nameSnakeCase = property.name,
            type = property
                .type
                .let(::createTypeName)
                .copy(
                    nullable = fields
                        .firstOrNull { it.name == property.name }
                        .let { it?.isNullable == true }
                ),
        )
    }
}

private fun createTypeName(type: String): TypeName {
    when {
        type == "Bool" -> return BOOLEAN
        type == "bytes" -> return BYTE_ARRAY
        type == "double" -> return DOUBLE
        type == "int32" -> return INT
        type == "int53" -> return LONG
        type == "int64" -> return LONG
        type == "string" -> return STRING
        type.contains(other = "vector<") -> {
            val arrayTypeName = """vector<(.+)>"""
                .toRegex()
                .find(input = type)!!
                .destructured
                .component1()
                .let(::createTypeName)
            when (arrayTypeName) {
                INT -> return INT_ARRAY
                LONG -> return LONG_ARRAY
                else -> return ARRAY.parameterizedBy(arrayTypeName)
            }
        }
        else -> return dtoTypeName(simpleName = type.capitalized)
    }
}

private class Property(
    val name: String,
    val nameSnakeCase: String,
    val type: TypeName,
)
