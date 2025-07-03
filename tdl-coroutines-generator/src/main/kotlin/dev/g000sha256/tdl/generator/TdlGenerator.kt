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

import com.github.javaparser.JavaParser
import com.github.javaparser.ParserConfiguration
import com.github.javaparser.ast.CompilationUnit
import com.github.javaparser.ast.Modifier
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration
import com.github.javaparser.ast.body.FieldDeclaration
import com.github.javaparser.ast.expr.UnaryExpr
import com.github.javaparser.ast.nodeTypes.NodeWithJavadoc
import com.github.javaparser.ast.type.ArrayType
import com.github.javaparser.ast.type.ClassOrInterfaceType
import com.github.javaparser.ast.type.PrimitiveType
import com.github.javaparser.ast.type.Type
import com.github.javaparser.symbolsolver.JavaSymbolSolver
import com.github.javaparser.symbolsolver.resolution.typesolvers.ReflectionTypeSolver
import com.squareup.kotlinpoet.ANY
import com.squareup.kotlinpoet.ARRAY
import com.squareup.kotlinpoet.BOOLEAN
import com.squareup.kotlinpoet.BOOLEAN_ARRAY
import com.squareup.kotlinpoet.BYTE
import com.squareup.kotlinpoet.BYTE_ARRAY
import com.squareup.kotlinpoet.CHAR
import com.squareup.kotlinpoet.CHAR_ARRAY
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.DOUBLE
import com.squareup.kotlinpoet.DOUBLE_ARRAY
import com.squareup.kotlinpoet.FLOAT
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
import com.squareup.kotlinpoet.SHORT
import com.squareup.kotlinpoet.SHORT_ARRAY
import com.squareup.kotlinpoet.STRING
import com.squareup.kotlinpoet.TypeName
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.TypeVariableName
import java.io.File
import java.nio.file.Paths
import kotlin.io.path.pathString
import kotlin.io.path.readLines
import kotlin.io.path.writeLines
import kotlin.jvm.optionals.getOrNull

private fun mainLegacy() {
    val file = File(currentPath, "td/example/android/tdlib/java/org/drinkless/tdlib/TdApi.java")
    val exists = file.exists()
    require(exists) { "File $file doesn't exist" }

    val compilationUnit = readCompilationUnit(file)

    val objectClassDeclarations = compilationUnit
        .findAll(ClassOrInterfaceDeclaration::class.java)
        .filter { it.nameAsString != "TdApi" }
        .filter { it.extends(className = "Object") }

    val allDtoClassDeclarations = objectClassDeclarations
        .filter { it.nameAsString != "Function" && !it.extends(className = "Function") }

    val functionClassDeclarations = objectClassDeclarations
        .filter { it.extends(className = "Function") }

    check(value = allDtoClassDeclarations.size + functionClassDeclarations.size + 1 == objectClassDeclarations.size)

    writeTdApi(compilationUnit)

    writeTdlMapper(allDtoClassDeclarations)
}

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

private val currentPath = System
    .getProperty("user.dir")
    .let { Paths.get(it) }
    .parent
    .pathString

@Suppress("CheckedExceptionsKotlin")
private fun readCompilationUnit(file: File): CompilationUnit {
    val parserConfiguration = ParserConfiguration()
    return ReflectionTypeSolver()
        .let { JavaSymbolSolver(it) }
        .let { parserConfiguration.setSymbolResolver(it) }
        .let { JavaParser(it) }
        .parse(file)
        .result
        .get()
}

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

private fun writeTdApi(compilationUnit: CompilationUnit) {
    FileSpec
        .builder(
            packageName = compilationUnit
                .packageDeclaration
                .get()
                .nameAsString,
            fileName = compilationUnit.primaryTypeName.get()
        )
        .addTypes(
            typeSpecs = compilationUnit
                .findAll(ClassOrInterfaceDeclaration::class.java)
                .filter(ClassOrInterfaceDeclaration::isTopLevelType)
                .map { topClassDeclaration ->
                    TypeSpec
                        .classBuilder(name = topClassDeclaration.nameAsString)
                        .addModifier(modifier = KModifier.INTERNAL)
                        .primaryConstructor(
                            primaryConstructor = FunSpec
                                .constructorBuilder()
                                .addModifier(modifier = KModifier.PRIVATE)
                                .build()
                        )
                        .addType(
                            typeSpec = TypeSpec
                                .companionObjectBuilder()
                                .addProperty(
                                    propertySpec = PropertySpec
                                        .builder(name = "GIT_COMMIT_HASH", type = STRING)
                                        .addModifier(modifier = KModifier.CONST)
                                        .initializer(
                                            format = "\"%L\"",
                                            getTdLibCommitHash(),
                                        )
                                        .build()
                                )
                                .addProperty(
                                    propertySpec = PropertySpec
                                        .builder(name = "VERSION", type = STRING)
                                        .addModifier(modifier = KModifier.CONST)
                                        .initializer(
                                            format = "\"%L\"",
                                            getTdLibVersion(),
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .addTypes(
                            typeSpecs = topClassDeclaration
                                .findAll(ClassOrInterfaceDeclaration::class.java)
                                .filter(ClassOrInterfaceDeclaration::isNestedType)
                                .map { nestedClassDeclaration ->
                                    val properties = nestedClassDeclaration.createProperties()
                                    TypeSpec
                                        .classBuilder(name = nestedClassDeclaration.nameAsString)
                                        .addModifiers(
                                            modifiers = nestedClassDeclaration.modifiers.mapNotNull {
                                                when (it) {
                                                    Modifier.abstractModifier() -> return@mapNotNull KModifier.ABSTRACT
                                                    else -> return@mapNotNull null
                                                }
                                            }
                                        )
                                        .apply {
                                            if (properties.size > 0) {
                                                primaryConstructor(
                                                    primaryConstructor = FunSpec
                                                        .constructorBuilder()
                                                        .addParameters(
                                                            parameterSpecs = properties.map { property ->
                                                                return@map ParameterSpec
                                                                    .builder(name = property.name, type = property.originalType)
                                                                    .build()
                                                            }
                                                        )
                                                        .build()
                                                )
                                            }
                                        }
                                        .apply {
                                            if (nestedClassDeclaration.nameAsString == "Function") {
                                                addTypeVariable(
                                                    typeVariable = TypeVariableName(
                                                        name = "T",
                                                        bounds = listOf(
                                                            tdApiTypeName(simpleName = "Object")
                                                        )
                                                    )
                                                )
                                            }
                                        }
                                        .addProperties(
                                            propertySpecs = properties.map { property ->
                                                return@map PropertySpec
                                                    .builder(name = property.name, type = property.originalType)
                                                    .addAnnotation(JvmField::class)
                                                    .initializer(format = property.name)
                                                    .build()
                                            }
                                        )
                                        .apply {
                                            val parent = nestedClassDeclaration
                                                .extendedTypes
                                                .firstOrNull()
                                            if (parent != null) {
                                                val types =
                                                    parent.typeArguments.getOrNull()?.map { it.toTypeName(replace = false) }
                                                superclass(
                                                    superclass = parent
                                                        .toTypeName(replace = false)
                                                        .let {
                                                            if (it is ClassName) {
                                                                if (types != null && types.isNotEmpty()) {
                                                                    return@let it.parameterizedBy(types)
                                                                }
                                                            }
                                                            return@let it
                                                        }
                                                )
                                            }
                                        }
                                        .addFunctions(
                                            funSpecs = nestedClassDeclaration.methods.mapNotNull {
                                                when (it.nameAsString) {
                                                    "getConstructor" -> {
                                                        if (nestedClassDeclaration.nameAsString == "Object") {
                                                            return@mapNotNull FunSpec
                                                                .builder(name = it.nameAsString)
                                                                .addModifier(modifier = KModifier.PUBLIC)
                                                                .addModifier(modifier = KModifier.ABSTRACT)
                                                                .returns(returnType = INT)
                                                                .build()
                                                        } else {
                                                            val constructor = nestedClassDeclaration.findConstructorValue()
                                                            if (constructor == null) {
                                                                return@mapNotNull null
                                                            } else {
                                                                return@mapNotNull FunSpec
                                                                    .builder(name = it.nameAsString)
                                                                    .addModifier(modifier = KModifier.OVERRIDE)
                                                                    .returns(returnType = INT)
                                                                    .addStatement(format = "return %L", constructor)
                                                                    .build()
                                                            }
                                                        }
                                                    }
                                                    "toString" -> {
                                                        return@mapNotNull FunSpec
                                                            .builder(name = it.nameAsString)
                                                            .addModifier(modifier = KModifier.EXTERNAL)
                                                            .addModifier(modifier = KModifier.OVERRIDE)
                                                            .returns(returnType = STRING)
                                                            .build()
                                                    }
                                                    else -> error(message = "Unknown method")
                                                }
                                            }
                                        )
                                        .build()
                                }
                        )
                        .build()
                }
        )
        .indent(indent = "    ")
        .build()
        .writeAndFixContent(folderName = "commonMainGenerated", addLicence = false, removeAllPublic = true)
}

private fun writeTdlMapper(classDeclarations: List<ClassOrInterfaceDeclaration>) {
    FileSpec
        .builder(packageName = PACKAGE, fileName = "TdlMapper")
        .addType(
            typeSpec = TypeSpec
                .classBuilder(name = "TdlMapper")
                .addModifier(modifier = KModifier.INTERNAL)
                .addFunctions(
                    funSpecs = buildList {
                        val classDeclarationsGroups = classDeclarations.groupBy {
                            return@groupBy it
                                .extendedTypeFirst()
                                .nameAsString
                        }

                        classDeclarationsGroups
                            .getValue(key = "Object")
                            .forEach { classDeclaration ->
                                val className = classDeclaration.nameAsString

                                if (classDeclaration.isAbstract) {
                                    val innerClassDeclarations = classDeclarationsGroups.getValue(key = className)

                                    FunSpec
                                        .builder(name = "map")
                                        .addParameter(
                                            parameterSpec = ParameterSpec
                                                .builder(
                                                    name = "dto",
                                                    type = tdApiTypeName(simpleName = className)
                                                )
                                                .build()
                                        )
                                        .returns(
                                            returnType = dtoTypeName(simpleName = className)
                                        )
                                        .apply {
                                            beginControlFlow(controlFlow = "when (dto)")
                                            innerClassDeclarations.forEach {
                                                addStatement(format = "is TdApi.%L -> return map(dto)", it.nameAsString)
                                            }
                                            addStatement(format = "else -> error(\"Unknown DTO class type (\${dto.javaClass})\")")
                                            endControlFlow()
                                        }
                                        .build()
                                        .also { add(it) }

                                    innerClassDeclarations.forEach { innerClassDeclaration ->
                                        val innerClassName = innerClassDeclaration.nameAsString

                                        val innerProperties = innerClassDeclaration.createProperties()

                                        FunSpec
                                            .builder(name = "map")
                                            .addParameter(
                                                parameterSpec = ParameterSpec
                                                    .builder(
                                                        name = "dto",
                                                        type = tdApiTypeName(simpleName = innerClassName)
                                                    )
                                                    .build()
                                            )
                                            .returns(
                                                returnType = dtoTypeName(simpleName = innerClassName)
                                            )
                                            .apply {
                                                addStatement(format = "REMOVE_LINE")
                                                if (innerProperties.size > 0) {
                                                    addStatement(format = "return %L(", innerClassName)
                                                    innerProperties.forEach {
                                                        val name = it.name
                                                        val typeName = it.type
                                                        if (typeName is ParameterizedTypeName) {
                                                            val type = typeName.typeArguments.first()
                                                            if (type is ParameterizedTypeName) {
                                                                type.typeArguments.first() as ClassName
                                                                if (typeName.isNullable) {
                                                                    addStatement(
                                                                        format = "    %L = dto.%L?.mapArrayOfArrays { map(it) },",
                                                                        name,
                                                                        name
                                                                    )
                                                                } else {
                                                                    addStatement(
                                                                        format = "    %L = dto.%L.mapArrayOfArrays { map(it) },",
                                                                        name,
                                                                        name
                                                                    )
                                                                }
                                                            } else if (type is ClassName && type.packageName.startsWith(prefix = PACKAGE_DTO)) {
                                                                if (typeName.isNullable) {
                                                                    addStatement(
                                                                        format = "    %L = dto.%L?.mapArray { map(it) },",
                                                                        name,
                                                                        name
                                                                    )
                                                                } else {
                                                                    addStatement(
                                                                        format = "    %L = dto.%L.mapArray { map(it) },",
                                                                        name,
                                                                        name
                                                                    )
                                                                }
                                                            } else {
                                                                addStatement(format = "    %L = dto.%L,", name, name)
                                                            }
                                                        } else {
                                                            typeName as ClassName
                                                            if (typeName.packageName.startsWith(prefix = PACKAGE_DTO)) {
                                                                if (typeName.isNullable) {
                                                                    addStatement(
                                                                        format = "    %L = dto.%L?.let { map(it) },",
                                                                        name,
                                                                        name
                                                                    )
                                                                } else {
                                                                    addStatement(format = "    %L = map(dto.%L),", name, name)
                                                                }
                                                            } else {
                                                                addStatement(format = "    %L = dto.%L,", name, name)
                                                            }
                                                        }
                                                    }
                                                    addStatement(format = ")")
                                                } else {
                                                    addStatement(format = "return %L()", innerClassName)
                                                }
                                            }
                                            .build()
                                            .also { add(it) }
                                    }

                                    FunSpec
                                        .builder(name = "map")
                                        .addParameter(
                                            parameterSpec = ParameterSpec
                                                .builder(
                                                    name = "dto",
                                                    type = dtoTypeName(simpleName = className)
                                                )
                                                .build()
                                        )
                                        .returns(
                                            returnType = tdApiTypeName(simpleName = className)
                                        )
                                        .apply {
                                            beginControlFlow(controlFlow = "when (dto)")
                                            innerClassDeclarations.forEach {
                                                addStatement(format = "is %L -> return map(dto)", it.nameAsString)
                                            }
                                            endControlFlow()
                                        }
                                        .build()
                                        .also { add(it) }

                                    innerClassDeclarations.forEach { innerClassDeclaration ->
                                        val innerClassName = innerClassDeclaration.nameAsString

                                        val innerProperties = innerClassDeclaration.createProperties()

                                        FunSpec
                                            .builder(name = "map")
                                            .addParameter(
                                                parameterSpec = ParameterSpec
                                                    .builder(
                                                        name = "dto",
                                                        type = dtoTypeName(simpleName = innerClassName)
                                                    )
                                                    .build()
                                            )
                                            .returns(
                                                returnType = tdApiTypeName(simpleName = innerClassName)
                                            )
                                            .apply {
                                                addStatement(format = "REMOVE_LINE")
                                                if (innerProperties.size > 0) {
                                                    addStatement(format = "return TdApi.%L(", innerClassName)
                                                    innerProperties.forEach {
                                                        val name = it.name
                                                        val typeName = it.type
                                                        if (typeName is ParameterizedTypeName) {
                                                            val type = typeName.typeArguments.first()
                                                            if (type is ParameterizedTypeName) {
                                                                type.typeArguments.first() as ClassName
                                                                if (typeName.isNullable) {
                                                                    addStatement(
                                                                        format = "    %L = dto.%L?.mapArrayOfArrays { map(it) },",
                                                                        name,
                                                                        name
                                                                    )
                                                                } else {
                                                                    addStatement(
                                                                        format = "    %L = dto.%L.mapArrayOfArrays { map(it) },",
                                                                        name,
                                                                        name
                                                                    )
                                                                }
                                                            } else if (type is ClassName && type.packageName.startsWith(
                                                                    prefix = PACKAGE_DTO
                                                                )
                                                            ) {
                                                                if (typeName.isNullable) {
                                                                    addStatement(
                                                                        format = "    %L = dto.%L?.mapArray { map(it) },",
                                                                        name,
                                                                        name
                                                                    )
                                                                } else {
                                                                    addStatement(
                                                                        format = "    %L = dto.%L.mapArray { map(it) },",
                                                                        name,
                                                                        name
                                                                    )
                                                                }
                                                            } else {
                                                                addStatement(format = "    %L = dto.%L,", name, name)
                                                            }
                                                        } else {
                                                            typeName as ClassName
                                                            if (typeName.packageName.startsWith(prefix = PACKAGE_DTO)) {
                                                                if (typeName.isNullable) {
                                                                    addStatement(
                                                                        format = "    %L = dto.%L?.let { map(it) },",
                                                                        name,
                                                                        name
                                                                    )
                                                                } else {
                                                                    addStatement(
                                                                        format = "    %L = map(dto.%L),",
                                                                        name,
                                                                        name
                                                                    )
                                                                }
                                                            } else {
                                                                addStatement(format = "    %L = dto.%L,", name, name)
                                                            }
                                                        }
                                                    }
                                                    addStatement(format = ")")
                                                } else {
                                                    addStatement(format = "return TdApi.%L()", innerClassName)
                                                }
                                            }
                                            .build()
                                            .also { add(it) }
                                    }
                                } else {
                                    val properties = classDeclaration.createProperties()

                                    FunSpec
                                        .builder(name = "map")
                                        .addParameter(
                                            parameterSpec = ParameterSpec
                                                .builder(
                                                    name = "dto",
                                                    type = tdApiTypeName(simpleName = className)
                                                )
                                                .build()
                                        )
                                        .returns(
                                            returnType = dtoTypeName(simpleName = className)
                                        )
                                        .apply {
                                            addStatement(format = "REMOVE_LINE")
                                            if (properties.size > 0) {
                                                addStatement(format = "return %L(", className)
                                                properties.forEach {
                                                    val name = it.name
                                                    val typeName = it.type
                                                    if (typeName is ParameterizedTypeName) {
                                                        val type = typeName.typeArguments.first()
                                                        if (type is ParameterizedTypeName) {
                                                            type.typeArguments.first() as ClassName
                                                            if (typeName.isNullable) {
                                                                addStatement(
                                                                    format = "    %L = dto.%L?.mapArrayOfArrays { map(it) },",
                                                                    name,
                                                                    name
                                                                )
                                                            } else {
                                                                addStatement(
                                                                    format = "    %L = dto.%L.mapArrayOfArrays { map(it) },",
                                                                    name,
                                                                    name
                                                                )
                                                            }
                                                        } else if (type is ClassName && type.packageName.startsWith(
                                                                prefix = PACKAGE_DTO
                                                            )
                                                        ) {
                                                            if (typeName.isNullable) {
                                                                addStatement(
                                                                    format = "    %L = dto.%L?.mapArray { map(it) },",
                                                                    name,
                                                                    name
                                                                )
                                                            } else {
                                                                addStatement(
                                                                    format = "    %L = dto.%L.mapArray { map(it) },",
                                                                    name,
                                                                    name
                                                                )
                                                            }
                                                        } else {
                                                            addStatement(format = "    %L = dto.%L,", name, name)
                                                        }
                                                    } else {
                                                        typeName as ClassName
                                                        if (typeName.packageName.startsWith(prefix = PACKAGE_DTO)) {
                                                            if (typeName.isNullable) {
                                                                addStatement(
                                                                    format = "    %L = dto.%L?.let { map(it) },",
                                                                    name,
                                                                    name
                                                                )
                                                            } else {
                                                                addStatement(
                                                                    format = "    %L = map(dto.%L),",
                                                                    name,
                                                                    name
                                                                )
                                                            }
                                                        } else {
                                                            addStatement(format = "    %L = dto.%L,", name, name)
                                                        }
                                                    }
                                                }
                                                addStatement(format = ")")
                                            } else {
                                                addStatement(format = "return %L()", className)
                                            }
                                        }
                                        .build()
                                        .also { add(it) }

                                    FunSpec
                                        .builder(name = "map")
                                        .addParameter(
                                            parameterSpec = ParameterSpec
                                                .builder(
                                                    name = "dto",
                                                    type = dtoTypeName(simpleName = className)
                                                )
                                                .build()
                                        )
                                        .returns(
                                            returnType = tdApiTypeName(simpleName = className)
                                        )
                                        .apply {
                                            addStatement(format = "REMOVE_LINE")
                                            if (properties.size > 0) {
                                                addStatement(format = "return TdApi.%L(", className)
                                                properties.forEach {
                                                    val name = it.name
                                                    val typeName = it.type
                                                    if (typeName is ParameterizedTypeName) {
                                                        val type = typeName.typeArguments.first()
                                                        if (type is ParameterizedTypeName) {
                                                            type.typeArguments.first() as ClassName
                                                            if (typeName.isNullable) {
                                                                addStatement(
                                                                    format = "    %L = dto.%L?.mapArrayOfArrays { map(it) },",
                                                                    name,
                                                                    name
                                                                )
                                                            } else {
                                                                addStatement(
                                                                    format = "    %L = dto.%L.mapArrayOfArrays { map(it) },",
                                                                    name,
                                                                    name
                                                                )
                                                            }
                                                        } else if (type is ClassName && type.packageName.startsWith(
                                                                prefix = PACKAGE_DTO
                                                            )
                                                        ) {
                                                            if (typeName.isNullable) {
                                                                addStatement(
                                                                    format = "    %L = dto.%L?.mapArray { map(it) },",
                                                                    name,
                                                                    name
                                                                )
                                                            } else {
                                                                addStatement(
                                                                    format = "    %L = dto.%L.mapArray { map(it) },",
                                                                    name,
                                                                    name
                                                                )
                                                            }
                                                        } else {
                                                            addStatement(format = "    %L = dto.%L,", name, name)
                                                        }
                                                    } else {
                                                        typeName as ClassName
                                                        if (typeName.packageName.startsWith(prefix = PACKAGE_DTO)) {
                                                            if (typeName.isNullable) {
                                                                addStatement(
                                                                    format = "    %L = dto.%L?.let { map(it) },",
                                                                    name,
                                                                    name
                                                                )
                                                            } else {
                                                                addStatement(
                                                                    format = "    %L = map(dto.%L),",
                                                                    name,
                                                                    name
                                                                )
                                                            }
                                                        } else {
                                                            addStatement(format = "    %L = dto.%L,", name, name)
                                                        }
                                                    }
                                                }
                                                addStatement(format = ")")
                                            } else {
                                                addStatement(format = "return TdApi.%L()", className)
                                            }
                                        }
                                        .build()
                                        .also { add(it) }
                                }
                            }
                    }
                )
                .build()
        )
        .indent(indent = "    ")
        .build()
        .writeAndFixContent(folderName = "commonMainGenerated", removeAllPublic = true)
}

//////  //////  //////
//////  //////  //////
//////  //////  //////

private fun ClassOrInterfaceDeclaration.findConstructorValue(): Int? {
    fields.forEach {
        it.variables.forEach {
            if (it.nameAsString == "CONSTRUCTOR") {
                val expr = it.initializer.get()
                if (expr.isIntegerLiteralExpr) {
                    return expr.asIntegerLiteralExpr().value.toInt()
                }
                val unary = expr.asUnaryExpr()
                if (unary.operator === UnaryExpr.Operator.MINUS && unary.expression.isIntegerLiteralExpr) {
                    return unary
                        .expression
                        .asIntegerLiteralExpr()
                        .value
                        .toInt()
                        .let { -it }
                }
            }
        }
    }
    return null
}

private fun Type.toTypeName(replace: Boolean = false): TypeName {
    when (this) {
        is ArrayType -> {
            val type = componentType
            when (type) {
                is ArrayType -> {
                    return type
                        .toTypeName(replace)
                        .let { ARRAY.parameterizedBy(it) }
                }
                is ClassOrInterfaceType -> {
                    return type
                        .toTypeName(replace)
                        .let { ARRAY.parameterizedBy(it) }
                }
                is PrimitiveType -> {
                    when (type.type) {
                        PrimitiveType.Primitive.BOOLEAN -> return BOOLEAN_ARRAY
                        PrimitiveType.Primitive.BYTE -> return BYTE_ARRAY
                        PrimitiveType.Primitive.CHAR -> return CHAR_ARRAY
                        PrimitiveType.Primitive.DOUBLE -> return DOUBLE_ARRAY
                        PrimitiveType.Primitive.FLOAT -> return FLOAT_ARRAY
                        PrimitiveType.Primitive.INT -> return INT_ARRAY
                        PrimitiveType.Primitive.LONG -> return LONG_ARRAY
                        PrimitiveType.Primitive.SHORT -> return SHORT_ARRAY
                        else -> error("Type is null")
                    }
                }
                else -> error("Unknown type ${type.javaClass}")
            }
        }
        is ClassOrInterfaceType -> return toTypeName(replace)
        is PrimitiveType -> {
            when (type) {
                PrimitiveType.Primitive.BOOLEAN -> return BOOLEAN
                PrimitiveType.Primitive.BYTE -> return BYTE
                PrimitiveType.Primitive.CHAR -> return CHAR
                PrimitiveType.Primitive.DOUBLE -> return DOUBLE
                PrimitiveType.Primitive.FLOAT -> return FLOAT
                PrimitiveType.Primitive.INT -> return INT
                PrimitiveType.Primitive.LONG -> return LONG
                PrimitiveType.Primitive.SHORT -> return SHORT
                else -> error("Type is null")
            }
        }
        else -> error("Unknown type $javaClass")
    }
}

private fun ClassOrInterfaceType.toTypeName(replace: Boolean): TypeName {
    val qualifiedName = resolve()
        .asReferenceType()
        .qualifiedName

    when {
        qualifiedName == "java.lang.String" -> return STRING
        qualifiedName.startsWith("org.drinkless.tdlib.TdApi.") -> {
            val simpleName = qualifiedName.substringAfterLast(delimiter = '.')
            if (replace) {
                return dtoTypeName(simpleName)
            } else {
                return tdApiTypeName(simpleName)
            }
        }
        else -> error("Unknown type $qualifiedName")
    }
}

private fun ClassOrInterfaceDeclaration.extends(className: String): Boolean {
    return resolve()
        .allAncestors
        .any { it.qualifiedName == "org.drinkless.tdlib.TdApi.$className" }
}

private val ParameterizedTypeName.argumentTypeName: TypeName
    get() {
        return typeArguments
            .also { check(value = it.size == 1) }
            .first()
    }

private fun ClassOrInterfaceDeclaration.extendedTypeFirst(): ClassOrInterfaceType {
    return extendedTypes
        .also { check(value = it.size == 1) }
        .first()
}

private val FieldDeclaration.isNullable: Boolean
    get() {
        val javaDoc = javaDoc
        val hasBeNull = javaDoc.contains(other = "be null", ignoreCase = true)
        val hasPassNull = javaDoc.contains(other = "pass null", ignoreCase = true)
        return hasBeNull || hasPassNull
    }

private val NodeWithJavadoc<*>.javaDoc: String
    get() {
        return javadocComment
            .map { it.parse() }
            .map { it.description.toText() }
            .get()
    }

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

private fun ClassOrInterfaceDeclaration.createProperties(): List<LegacyProperty> {
    return fields
        .map { fieldDeclaration ->
            val isNullable = fieldDeclaration.isNullable
            return@map fieldDeclaration.variables.mapNotNull { variableDeclarator ->
                val name = variableDeclarator.nameAsString
                if (name == "CONSTRUCTOR") {
                    return@mapNotNull null
                }

                val type = variableDeclarator.type
                return@mapNotNull LegacyProperty(
                    name = name,
                    type = type
                        .toTypeName(replace = true)
                        .copy(nullable = isNullable),
                    originalType = type
                        .toTypeName(replace = false)
                        .copy(nullable = isNullable)
                )
            }
        }
        .flatten()
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

private class LegacyProperty(
    val name: String,
    val type: TypeName,
    val originalType: TypeName
)

private fun dtoTypeName(simpleName: String): TypeName {
    return TypeName(packageName = PACKAGE_DTO, simpleName = simpleName)
}

private fun tdApiTypeName(simpleName: String): TypeName {
    return TypeName(packageName = "org.drinkless.tdlib", rootSimpleName = "TdApi", innerSimpleName = simpleName)
}

private fun TypeName(packageName: String, simpleName: String, parameterizedBy: TypeName? = null): TypeName {
    val className = ClassName(packageName, simpleName)
    if (parameterizedBy == null) {
        return className
    }

    return className.parameterizedBy(parameterizedBy)
}

private fun TypeName(packageName: String, rootSimpleName: String, innerSimpleName: String): TypeName {
    return ClassName(packageName, rootSimpleName, innerSimpleName)
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

    writeClientInterface(functionCommonElements, updateDtoCommonElements)

    writeTdlClientImplementation(functionCommonElements, updateDtoCommonElements)

    mainLegacy()

    updateReadMe(
        tdLibVersion = getTdLibVersion(),
        tdLibCommitHash = getTdLibCommitHash(),
        updatesCount = updateDtoCommonElements.size,
        requestsCount = functionCommonElements.size,
    )
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
                    .addProperties(
                        propertySpecs = properties.map { property ->
                            return@map PropertySpec
                                .builder(name = property.name, type = property.type)
                                .addModifier(modifier = KModifier.PUBLIC)
                                .initializer(format = property.name)
                                .build()
                        }
                    )
                    .apply {
                        val equals = commonElement.returns.equals(other = commonElement.name, ignoreCase = true)
                        if (!equals) {
                            superclass(
                                superclass = dtoTypeName(simpleName = commonElement.returns)
                            )
                        }
                    }
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
                                .initializer(format = "TdlEngine.GIT_COMMIT_HASH")
                                .build()
                        )
                        .addProperty(
                            propertySpec = PropertySpec
                                .builder(name = "TDL_VERSION", type = STRING)
                                .addKdoc(format = "The version of the TDLib.")
                                .addModifier(modifier = KModifier.CONST)
                                .initializer(format = "TdlEngine.VERSION")
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
                                    name = "mapper",
                                    type = TypeName(packageName = PACKAGE, simpleName = "TdlMapper")
                                )
                                .build()
                        )
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
                            name = "mapper",
                            type = TypeName(packageName = PACKAGE, simpleName = "TdlMapper")
                        )
                        .addModifier(modifier = KModifier.PRIVATE)
                        .initializer(format = "mapper")
                        .build()
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
                                .addStatement(
                                    format = "return repository.getUpdates(%T::class) { mapper.map(it) }",
                                    tdApiTypeName(simpleName = "Update")
                                )
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
                                        format = "return repository.getUpdates(%T::class) { mapper.map(it) }",
                                        tdApiTypeName(simpleName = className)
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
                                val className = functionName.capitalized
                                if (properties.size > 0) {
                                    addStatement(format = "val function = TdApi.%L(", className)
                                    properties.forEach { property ->
                                        val name = property.name
                                        val typeName = property.type
                                        if (typeName is ParameterizedTypeName) {
                                            val type = typeName.argumentTypeName as ClassName
                                            if (type.packageName == PACKAGE_DTO) {
                                                addStatement(format = "    %L = %L.mapArray { mapper.map(it) },", name, name)
                                            } else {
                                                addStatement(format = "    %L = %L,", name, name)
                                            }
                                        } else {
                                            typeName as ClassName
                                            if (typeName.packageName == PACKAGE_DTO) {
                                                if (typeName.isNullable) {
                                                    addStatement(format = "    %L = %L?.let { mapper.map(it) },", name, name)
                                                } else {
                                                    addStatement(format = "    %L = mapper.map(%L),", name, name)
                                                }
                                            } else {
                                                addStatement(format = "    %L = %L,", name, name)
                                            }
                                        }
                                    }
                                    addStatement(format = ")")
                                } else {
                                    addStatement(format = "val function = TdApi.%L()", className)
                                }
                                addStatement(format = "return repository.send(function) { mapper.map(it) }")
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
        return@map Property(
            name = property.name.withReplacedSnakeCases1,
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

private class Property(val name: String, val type: TypeName)
