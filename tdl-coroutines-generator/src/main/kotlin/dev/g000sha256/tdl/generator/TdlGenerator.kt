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
import com.squareup.kotlinpoet.CodeBlock
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
import kotlin.io.path.readLines
import kotlin.io.path.writeLines
import kotlin.jvm.optionals.getOrNull

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
    val source = File(currentPath, "td/example/android/tdlib/java/org/drinkless/tdlib/TdApi.java")
        .readSource()

    val allClasses = source
        .findAll(ClassOrInterfaceDeclaration::class.java)
        .filter { it.nameAsString != "TdApi" }
        .also { println("All classes: ${it.size}") }
        .also { check(value = it.size == 2772) { "${it.size} != 2772" } }

    println()

    val objects = allClasses
        .filter { it.extends(className = "Object") }
        .also { println("Objects: ${it.size}") }
        .also { check(it.size == 2771) } // +1

    val models = objects
        .filter { it.nameAsString != "Function" && !it.extends(className = "Function") }
        .filter { it.nameAsString != "Update" && !it.extends(className = "Update") }
        .also { println("Models: ${it.size}") }
        .also { check(it.size == 1761) }

    val functions = objects
        .filter { it.extends(className = "Function") }
        .also { println("Functions: ${it.size}") }
        .also { check(it.size == 851) } // +1

    val updates = objects
        .filter { it.extends(className = "Update") }
        .also { println("Updates: ${it.size}") }
        .also { check(it.size == 157) } // +1

    println()

    //////
    //////
    //////

    val parentAndChildren = mutableMapOf<String, MutableList<String>>()
    models.forEach {
        val currentClassName = it.nameAsString
        val parentClassName = it
            .extendedTypeFirst()
            .nameAsString

        val currentValue = parentAndChildren.get(parentClassName) ?: mutableListOf()
        currentValue.add(currentClassName)

        parentAndChildren.put(parentClassName, currentValue)
    }

    val names = mutableMapOf<String, Pair<String?, String>>()

    val sealedModelsNames = parentAndChildren
        .filterKeys { it != "Object" }
        .also { println("Sealed models: ${it.size}") }
        .also { check(it.size == 168) }
        .onEach {
            val parentName = it.key
            names[parentName] = null to parentName + "Dto"
            it.value.onEach { childName ->
                names[childName] = parentName + "Dto" to createInnerClassName(childName, parentName)
            }
        }

    sealedModelsNames
        .map { it.value }
        .flatten()
        .also { println("Sealed model instances: ${it.size}") }
        .also { check(it.size == 1155) }

    val cleanModelsNames = parentAndChildren
        .getValue(key = "Object")
        .filter { !sealedModelsNames.containsKey(it) }
        .also { println("Clean models: ${it.size}") }
        .also { check(it.size == 438) }
        .onEach { names[it] = null to it + "Dto" }

    val cleanModels = cleanModelsNames.map { name -> models.first { it.nameAsString == name } }

    val sealedModels = mutableMapOf<ClassOrInterfaceDeclaration, List<ClassOrInterfaceDeclaration>>()
    sealedModelsNames.forEach { entry ->
        val newKey = models.first { it.nameAsString == entry.key }
        val newValues = entry.value.map { name -> models.first { it.nameAsString == name } }
        sealedModels.put(newKey, newValues)
    }

    println()

    //////
    //////
    //////

    File(currentPath, "tdl-coroutines/src/generated")
        .deleteRecursively()

    convertToKotlin(source)

    writeCleanDtoModels(cleanModels)
    writeUpdateDtoModels(updates)

    writeModels(sealedModels)

    writeMapper(cleanModels, updates, sealedModels)

    writeInterface(updates, functions)
    writeImplementation(updates, functions)

    copyFiles(
        fromDirectory = File(currentPath, "td/example/android/tdlib/libs"),
        toDirectory = File(currentPath, "tdl-coroutines/src/generated/jniLibs")
    )
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

private const val licenseComment = """/*
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

private val currentPath = System.getProperty("user.dir") as String

@Suppress("CheckedExceptionsKotlin")
private fun File.readSource(): CompilationUnit {
    val parserConfiguration = ParserConfiguration()
    return ReflectionTypeSolver()
        .let { JavaSymbolSolver(it) }
        .let { parserConfiguration.setSymbolResolver(it) }
        .let { JavaParser(it) }
        .parse(this)
        .result
        .get()
}

private fun ClassOrInterfaceDeclaration.extends(className: String): Boolean {
    return resolve()
        .allAncestors
        .any { it.qualifiedName == "org.drinkless.tdlib.TdApi.$className" }
}

private fun convertToKotlin(compilationUnit: CompilationUnit) {
    println("convertToKotlin")

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
                        .apply {
                            val gitCommitHash = topClassDeclaration.findGitCommitHashValue()
                            if (gitCommitHash != null) {
                                addType(
                                    typeSpec = TypeSpec
                                        .companionObjectBuilder()
                                        .addProperty(
                                            propertySpec = PropertySpec
                                                .builder(name = "GIT_COMMIT_HASH", type = STRING)
                                                .addModifier(modifier = KModifier.CONST)
                                                .initializer(format = "\"%L\"", gitCommitHash)
                                                .build()
                                        )
                                        .addProperty(
                                            propertySpec = PropertySpec
                                                .builder(name = "VERSION", type = STRING)
                                                .addModifier(modifier = KModifier.CONST)
                                                .initializer(format = "\"1.8.48\"") // TODO
                                                .build()
                                        )
                                        .build()
                                )
                            }
                        }
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
                                                            ClassName("org.drinkless.tdlib", "TdApi", "Object")
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
        .writeAndFixContent(addLicence = false, removeAllPublic = true)
}

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

private fun ClassOrInterfaceDeclaration.findGitCommitHashValue(): String? {
    fields.forEach {
        it.variables.forEach {
            if (it.nameAsString == "GIT_COMMIT_HASH") {
                val expr = it.initializer.get()
                return expr.asStringLiteralExpr().value
            }
        }
    }
    return null
}

private fun writeCleanDtoModels(classDeclarations: List<ClassOrInterfaceDeclaration>) {
    println("writeCleanDtoModels")

    classDeclarations.forEach { classDeclaration ->
        val className = classDeclaration.nameAsString + "Dto"

        val classJavaDocBuilder = StringBuilder()
            .append(classDeclaration.javaDoc)
            .append("\n")

        val properties = classDeclaration.createProperties()

        FileSpec
            .builder(packageName = "dev.g000sha256.tdl.dto", fileName = className)
            .addType(
                typeSpec = TypeSpec
                    .classBuilder(name = className)
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
                            classJavaDocBuilder.append("\n")
                            classJavaDocBuilder.append("@property ")
                            classJavaDocBuilder.append(property.name)
                            classJavaDocBuilder.append(" ")
                            classJavaDocBuilder.append(property.javaDoc)

                            return@map PropertySpec
                                .builder(name = property.name, type = property.type)
                                .addModifier(modifier = KModifier.PUBLIC)
                                .initializer(format = property.name)
                                .build()
                        }
                    )
                    .addKdoc(
                        format = classJavaDocBuilder
                            .toString()
                            .replace(oldValue = "%", newValue = "%%")
                    )
                    .addFunction(
                        funSpec = buildEqualsFunSpec(className, properties)
                    )
                    .addFunction(
                        funSpec = buildHashCodeFunSpec(properties)
                    )
                    .addFunction(
                        funSpec = buildToStringFunSpec(className, properties)
                    )
                    .build()
            )
            .indent(indent = "    ")
            .build()
            .writeAndFixContent()
    }
}

private fun writeUpdateDtoModels(classDeclarations: List<ClassOrInterfaceDeclaration>) {
    println("writeUpdateDtoModels")

    FileSpec
        .builder(packageName = "dev.g000sha256.tdl.dto.update", fileName = "UpdateDto")
        .addType(
            typeSpec = TypeSpec
                .classBuilder(name = "UpdateDto")
                .addKdoc(
                    format = buildString {
                        append("This class is an abstract base class.")
                        append("\n")
                        append("Contains notifications about data changes.")
                    }
                )
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
        .indent(indent = "    ")
        .build()
        .writeAndFixContent()

    classDeclarations.forEach { classDeclaration ->
        val className = classDeclaration.nameAsString.removePrefix(prefix = "Update") + "UpdateDto"

        val classJavaDocBuilder = StringBuilder()
            .append(classDeclaration.javaDoc)
            .append("\n")

        val properties = classDeclaration.createProperties()

        FileSpec
            .builder(packageName = "dev.g000sha256.tdl.dto.update", fileName = className)
            .addType(
                typeSpec = TypeSpec
                    .classBuilder(name = className)
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
                            classJavaDocBuilder.append("\n")
                            classJavaDocBuilder.append("@property ")
                            classJavaDocBuilder.append(property.name)
                            classJavaDocBuilder.append(" ")
                            classJavaDocBuilder.append(property.javaDoc)

                            return@map PropertySpec
                                .builder(name = property.name, type = property.type)
                                .addModifier(modifier = KModifier.PUBLIC)
                                .initializer(format = property.name)
                                .build()
                        }
                    )
                    .addKdoc(
                        format = classJavaDocBuilder
                            .toString()
                            .replace(oldValue = "%", newValue = "%%")
                    )
                    .superclass(
                        superclass = ClassName(packageName = "dev.g000sha256.tdl.dto.update", "UpdateDto")
                    )
                    .addFunction(
                        funSpec = buildEqualsFunSpec(className, properties)
                    )
                    .addFunction(
                        funSpec = buildHashCodeFunSpec(properties)
                    )
                    .addFunction(
                        funSpec = buildToStringFunSpec(className, properties)
                    )
                    .build()
            )
            .indent(indent = "    ")
            .build()
            .writeAndFixContent()
    }
}

private fun writeModels(data: Map<ClassOrInterfaceDeclaration, List<ClassOrInterfaceDeclaration>>) {
    println("writeModels")

    data.forEach { entry ->
        val key = entry.key
        val values = entry.value

        val className = key.nameAsString + "Dto"

        FileSpec
            .builder(packageName = "dev.g000sha256.tdl.dto", fileName = className)
            .addType(
                typeSpec = TypeSpec
                    .classBuilder(name = className)
                    .addKdoc(format = key.javaDoc)
                    .addModifier(modifier = KModifier.PUBLIC)
                    .addModifier(modifier = KModifier.SEALED)
                    .primaryConstructor(
                        primaryConstructor = FunSpec
                            .constructorBuilder()
                            .addModifier(modifier = KModifier.PRIVATE)
                            .build()
                    )
                    .addTypes(
                        typeSpecs = values.map map1@{ value ->
                            val innerClassName = createInnerClassName(child = value.nameAsString, parent = className)

                            val properties = value.createProperties()

                            val innerClassJavaDocBuilder = StringBuilder(value.javaDoc)
                            if (properties.size > 0) {
                                innerClassJavaDocBuilder.append("\n")
                            }

                            return@map1 TypeSpec
                                .classBuilder(name = innerClassName)
                                .addModifier(modifier = KModifier.PUBLIC)
                                .primaryConstructor(
                                    primaryConstructor = FunSpec
                                        .constructorBuilder()
                                        .addModifier(modifier = KModifier.PUBLIC)
                                        .addParameters(
                                            parameterSpecs = properties.map map2@{ property ->
                                                return@map2 ParameterSpec
                                                    .builder(name = property.name, type = property.type)
                                                    .build()
                                            }
                                        )
                                        .build()
                                )
                                .superclass(
                                    superclass = ClassName(packageName = "dev.g000sha256.tdl.dto", className)
                                )
                                .addProperties(
                                    propertySpecs = properties.map { property ->
                                        innerClassJavaDocBuilder.append("\n")
                                        innerClassJavaDocBuilder.append("@property ")
                                        innerClassJavaDocBuilder.append(property.name)
                                        innerClassJavaDocBuilder.append(" ")
                                        innerClassJavaDocBuilder.append(property.javaDoc)

                                        return@map PropertySpec
                                            .builder(name = property.name, type = property.type)
                                            .addModifier(modifier = KModifier.PUBLIC)
                                            .initializer(format = property.name)
                                            .build()
                                    }
                                )
                                .addKdoc(
                                    format = innerClassJavaDocBuilder.toString()
                                )
                                .addFunction(
                                    funSpec = buildEqualsFunSpec(innerClassName, properties)
                                )
                                .addFunction(
                                    funSpec = buildHashCodeFunSpec(properties)
                                )
                                .addFunction(
                                    funSpec = buildToStringFunSpec(className, innerClassName, properties)
                                )
                                .build()
                        }
                    )
                    .build()
            )
            .indent(indent = "    ")
            .build()
            .writeAndFixContent()
    }
}

private fun writeMapper(
    cleanModels: List<ClassOrInterfaceDeclaration>,
    updates: List<ClassOrInterfaceDeclaration>,
    sealedModels: Map<ClassOrInterfaceDeclaration, List<ClassOrInterfaceDeclaration>>
) {
    println("writeMapper")

    val cleanModelsFunSpecs = cleanModels
        .map { classDeclaration ->
            val mutableList = mutableListOf<FunSpec>()

            val className = classDeclaration.nameAsString
            val dtoClassName = className + "Dto"

            val properties = classDeclaration.createProperties()

            FunSpec
                .builder(name = "map")
                .addParameter(
                    parameterSpec = ParameterSpec
                        .builder(
                            name = "dto",
                            type = ClassName(packageName = "org.drinkless.tdlib", "TdApi", className)
                        )
                        .build()
                )
                .returns(
                    returnType = ClassName(packageName = "dev.g000sha256.tdl.dto", dtoClassName)
                )
                .apply {
                    addStatement(format = "REMOVE_LINE")
                    addStatement(format = "return %L(", dtoClassName)
                    properties.forEach {
                        val name = it.name
                        val typeName = it.type
                        if (typeName is ParameterizedTypeName) {
                            val type = typeName.typeArguments.first() as ClassName
                            if (type.packageName.startsWith(prefix = "dev.g000sha256.tdl.dto")) {
                                if (typeName.isNullable) {
                                    addStatement(format = "    %L = dto.%L?.mapArray { map(it) },", name, name)
                                } else {
                                    addStatement(format = "    %L = dto.%L.mapArray { map(it) },", name, name)
                                }
                            } else {
                                addStatement(format = "    %L = dto.%L,", name, name)
                            }
                        } else {
                            typeName as ClassName
                            if (typeName.packageName.startsWith(prefix = "dev.g000sha256.tdl.dto")) {
                                if (typeName.isNullable) {
                                    addStatement(format = "    %L = dto.%L?.let { map(it) },", name, name)
                                } else {
                                    addStatement(format = "    %L = map(dto.%L),", name, name)
                                }
                            } else {
                                addStatement(format = "    %L = dto.%L,", name, name)
                            }
                        }
                    }
                    addStatement(format = ")")
                }
                .build()
                .also { mutableList.add(it) }

            FunSpec
                .builder(name = "map")
                .addParameter(
                    parameterSpec = ParameterSpec
                        .builder(
                            name = "dto",
                            type = ClassName(packageName = "dev.g000sha256.tdl.dto", dtoClassName)
                        )
                        .build()
                )
                .returns(
                    returnType = ClassName(packageName = "org.drinkless.tdlib", "TdApi", className)
                )
                .apply {
                    addStatement(format = "REMOVE_LINE")
                    addStatement(format = "return TdApi.%L(", className)
                    properties.forEach {
                        val name = it.name
                        val typeName = it.type
                        if (typeName is ParameterizedTypeName) {
                            val type = typeName.typeArguments.first() as ClassName
                            if (type.packageName.startsWith(prefix = "dev.g000sha256.tdl.dto")) {
                                if (typeName.isNullable) {
                                    addStatement(format = "    %L = dto.%L?.mapArray { map(it) },", name, name)
                                } else {
                                    addStatement(format = "    %L = dto.%L.mapArray { map(it) },", name, name)
                                }
                            } else {
                                addStatement(format = "    %L = dto.%L,", name, name)
                            }
                        } else {
                            typeName as ClassName
                            if (typeName.packageName.startsWith(prefix = "dev.g000sha256.tdl.dto")) {
                                if (typeName.isNullable) {
                                    addStatement(format = "    %L = dto.%L?.let { map(it) },", name, name)
                                } else {
                                    addStatement(format = "    %L = map(dto.%L),", name, name)
                                }
                            } else {
                                addStatement(format = "    %L = dto.%L,", name, name)
                            }
                        }
                    }
                    addStatement(format = ")")
                }
                .build()
                .also {
                    if (className != "Updates") {
                        mutableList.add(it)
                    }
                }

            return@map mutableList
        }
        .flatten()

    val sealedModelsFunSpecs = sealedModels
        .map { entry ->
            val mutableList = mutableListOf<FunSpec>()

            val classDeclaration = entry.key
            val className = classDeclaration.nameAsString
            val dtoClassName = className + "Dto"

            FunSpec
                .builder(name = "map")
                .addParameter(
                    parameterSpec = ParameterSpec
                        .builder(
                            name = "dto",
                            type = ClassName(packageName = "org.drinkless.tdlib", "TdApi", className)
                        )
                        .build()
                )
                .returns(
                    returnType = ClassName(packageName = "dev.g000sha256.tdl.dto", dtoClassName)
                )
                .apply {
                    addStatement(format = "REMOVE_LINE")
                    beginControlFlow(controlFlow = "when(dto)")
                    entry.value.forEach { classDeclaration ->
                        val innerClassName = classDeclaration.nameAsString

                        beginControlFlow(controlFlow = "is TdApi.%L ->", innerClassName)

                        addStatement(
                            format = "return %L.%L(",
                            dtoClassName,
                            createInnerClassName(child = innerClassName, parent = dtoClassName)
                        )
                        classDeclaration
                            .createProperties()
                            .forEach {
                                val name = it.name
                                val typeName = it.type
                                if (typeName is ParameterizedTypeName) {
                                    val type = typeName.typeArguments.first()
                                    if (type is ParameterizedTypeName) {
                                        type.typeArguments.first() as ClassName
                                        if (typeName.isNullable) {
                                            addStatement(format = "    %L = dto.%L?.mapArrayOfArrays { map(it) },", name, name)
                                        } else {
                                            addStatement(format = "    %L = dto.%L.mapArrayOfArrays { map(it) },", name, name)
                                        }
                                    } else if (type is ClassName && type.packageName.startsWith(prefix = "dev.g000sha256.tdl.dto")) {
                                        if (typeName.isNullable) {
                                            addStatement(format = "    %L = dto.%L?.mapArray { map(it) },", name, name)
                                        } else {
                                            addStatement(format = "    %L = dto.%L.mapArray { map(it) },", name, name)
                                        }
                                    } else {
                                        addStatement(format = "    %L = dto.%L,", name, name)
                                    }
                                } else {
                                    typeName as ClassName
                                    if (typeName.packageName.startsWith(prefix = "dev.g000sha256.tdl.dto")) {
                                        if (typeName.isNullable) {
                                            addStatement(format = "    %L = dto.%L?.let { map(it) },", name, name)
                                        } else {
                                            addStatement(format = "    %L = map(dto.%L),", name, name)
                                        }
                                    } else {
                                        addStatement(format = "    %L = dto.%L,", name, name)
                                    }
                                }
                            }
                        addStatement(format = ")")

                        endControlFlow()
                    }
                    addStatement(format = "else -> error(\"Unknown dto class\")")
                    endControlFlow()
                }
                .build()
                .also { mutableList.add(it) }

            FunSpec
                .builder(name = "map")
                .addParameter(
                    parameterSpec = ParameterSpec
                        .builder(
                            name = "dto",
                            type = ClassName(packageName = "dev.g000sha256.tdl.dto", dtoClassName)
                        )
                        .build()
                )
                .returns(
                    returnType = ClassName(packageName = "org.drinkless.tdlib", "TdApi", className)
                )
                .apply {
                    addStatement(format = "REMOVE_LINE")
                    beginControlFlow(controlFlow = "when(dto)")
                    entry.value.forEach { classDeclaration ->
                        val innerClassName = classDeclaration.nameAsString

                        beginControlFlow(
                            controlFlow = "is %L.%L ->",
                            dtoClassName,
                            createInnerClassName(child = innerClassName, parent = dtoClassName)
                        )

                        addStatement(format = "REMOVE_LINE")
                        addStatement(format = "return TdApi.%L(", innerClassName)
                        classDeclaration
                            .createProperties()
                            .forEach {
                                val name = it.name
                                val typeName = it.type
                                if (typeName is ParameterizedTypeName) {
                                    val type = typeName.typeArguments.first()
                                    if (type is ParameterizedTypeName) {
                                        type.typeArguments.first() as ClassName
                                        if (typeName.isNullable) {
                                            addStatement(format = "    %L = dto.%L?.mapArrayOfArrays { map(it) },", name, name)
                                        } else {
                                            addStatement(format = "    %L = dto.%L.mapArrayOfArrays { map(it) },", name, name)
                                        }
                                    } else if (type is ClassName && type.packageName.startsWith(prefix = "dev.g000sha256.tdl.dto")) {
                                        if (typeName.isNullable) {
                                            addStatement(format = "    %L = dto.%L?.mapArray { map(it) },", name, name)
                                        } else {
                                            addStatement(format = "    %L = dto.%L.mapArray { map(it) },", name, name)
                                        }
                                    } else {
                                        addStatement(format = "    %L = dto.%L,", name, name)
                                    }
                                } else {
                                    typeName as ClassName
                                    if (typeName.packageName.startsWith(prefix = "dev.g000sha256.tdl.dto")) {
                                        if (typeName.isNullable) {
                                            addStatement(format = "    %L = dto.%L?.let { map(it) },", name, name)
                                        } else {
                                            addStatement(format = "    %L = map(dto.%L),", name, name)
                                        }
                                    } else {
                                        addStatement(format = "    %L = dto.%L,", name, name)
                                    }
                                }
                            }
                        addStatement(format = ")")

                        endControlFlow()
                    }
                    endControlFlow()
                }
                .build()
                .also { mutableList.add(it) }

            return@map mutableList
        }
        .flatten()

    val updateModelsFunSpecs = updates
        .map { classDeclaration ->
            val mutableList = mutableListOf<FunSpec>()

            val className = classDeclaration.nameAsString
            val dtoClassName = className.removePrefix(prefix = "Update") + "UpdateDto"

            val properties = classDeclaration.createProperties()

            FunSpec
                .builder(name = "map")
                .addParameter(
                    parameterSpec = ParameterSpec
                        .builder(
                            name = "dto",
                            type = ClassName(packageName = "org.drinkless.tdlib", "TdApi", className)
                        )
                        .build()
                )
                .returns(
                    returnType = ClassName(packageName = "dev.g000sha256.tdl.dto.update", dtoClassName)
                )
                .apply {
                    addStatement(format = "REMOVE_LINE")
                    addStatement(format = "return %L(", dtoClassName)
                    properties.forEach {
                        val name = it.name
                        val typeName = it.type
                        if (typeName is ParameterizedTypeName) {
                            val type = typeName.typeArguments.first() as ClassName
                            if (type.packageName.startsWith(prefix = "dev.g000sha256.tdl.dto")) {
                                if (typeName.isNullable) {
                                    addStatement(format = "    %L = dto.%L?.mapArray { map(it) },", name, name)
                                } else {
                                    addStatement(format = "    %L = dto.%L.mapArray { map(it) },", name, name)
                                }
                            } else {
                                addStatement(format = "    %L = dto.%L,", name, name)
                            }
                        } else {
                            typeName as ClassName
                            if (typeName.packageName.startsWith(prefix = "dev.g000sha256.tdl.dto")) {
                                if (typeName.isNullable) {
                                    addStatement(format = "    %L = dto.%L?.let { map(it) },", name, name)
                                } else {
                                    addStatement(format = "    %L = map(dto.%L),", name, name)
                                }
                            } else {
                                addStatement(format = "    %L = dto.%L,", name, name)
                            }
                        }
                    }
                    addStatement(format = ")")
                }
                .build()
                .also { mutableList.add(it) }

            FunSpec
                .builder(name = "map")
                .addParameter(
                    parameterSpec = ParameterSpec
                        .builder(
                            name = "dto",
                            type = ClassName(packageName = "dev.g000sha256.tdl.dto.update", dtoClassName)
                        )
                        .build()
                )
                .returns(
                    returnType = ClassName(packageName = "org.drinkless.tdlib", "TdApi", className)
                )
                .apply {
                    addStatement(format = "REMOVE_LINE")
                    addStatement(format = "return TdApi.%L(", className)
                    properties.forEach {
                        val name = it.name
                        val typeName = it.type
                        if (typeName is ParameterizedTypeName) {
                            val type = typeName.typeArguments.first() as ClassName
                            if (type.packageName.startsWith(prefix = "dev.g000sha256.tdl.dto")) {
                                if (typeName.isNullable) {
                                    addStatement(format = "    %L = dto.%L?.mapArray { map(it) },", name, name)
                                } else {
                                    addStatement(format = "    %L = dto.%L.mapArray { map(it) },", name, name)
                                }
                            } else {
                                addStatement(format = "    %L = dto.%L,", name, name)
                            }
                        } else {
                            typeName as ClassName
                            if (typeName.packageName.startsWith(prefix = "dev.g000sha256.tdl.dto")) {
                                if (typeName.isNullable) {
                                    addStatement(format = "    %L = dto.%L?.let { map(it) },", name, name)
                                } else {
                                    addStatement(format = "    %L = map(dto.%L),", name, name)
                                }
                            } else {
                                addStatement(format = "    %L = dto.%L,", name, name)
                            }
                        }
                    }
                    addStatement(format = ")")
                }
                .build()
                .also { mutableList.add(it) }

            return@map mutableList
        }
        .flatten()

    FileSpec
        .builder(packageName = "dev.g000sha256.tdl", fileName = "TdlMapper")
        .addType(
            typeSpec = TypeSpec
                .classBuilder(name = "TdlMapper")
                .addModifier(modifier = KModifier.INTERNAL)
                .addFunctions(cleanModelsFunSpecs)
                .addFunctions(sealedModelsFunSpecs)
                .addFunctions(updateModelsFunSpecs)
                .addFunction(
                    funSpec = FunSpec
                        .builder(name = "map")
                        .addParameter(
                            parameterSpec = ParameterSpec
                                .builder(
                                    name = "dto",
                                    type = ClassName(packageName = "org.drinkless.tdlib", "TdApi", "Update")
                                )
                                .build()
                        )
                        .returns(
                            returnType = ClassName(packageName = "dev.g000sha256.tdl.dto.update", "UpdateDto")
                        )
                        .apply {
                            addStatement(format = "REMOVE_LINE")
                            beginControlFlow(controlFlow = "when(dto)")
                            updates.forEach { classDeclaration ->
                                val className = classDeclaration.nameAsString
                                addStatement(format = "is TdApi.%L -> return map(dto)", className)
                            }
                            addStatement(format = "else -> error(\"Unknown dto class\")")
                            endControlFlow()
                        }
                        .build()
                )
                .build()
        )
        .indent(indent = "    ")
        .build()
        .writeAndFixContent(removeAllPublic = true)
}

private fun createInnerClassName(child: String, parent: String): String {
    // Разбиваем по границе перед заглавной буквой
    val regex = "(?=[A-Z])".toRegex()
    val aw = child.split(regex)
    val bw = parent.split(regex)

    // Считаем, сколько слов совпадает в начале
    val commonCount = aw.zip(bw)
        .takeWhile { (w1, w2) -> w1 == w2 }
        .count()

    // Склеиваем оставшиеся слова из первого
    return aw.drop(commonCount).joinToString("")
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
            if (replace) {
                val simpleName = qualifiedName.substringAfterLast(delimiter = '.') + "Dto"
                if (simpleName == "UpdateDto") {
                    return ClassName(packageName = "dev.g000sha256.tdl.dto.update", simpleName)
                }
                return ClassName(packageName = "dev.g000sha256.tdl.dto", simpleName)
            } else {
                val simpleName = qualifiedName.substringAfterLast(delimiter = '.')
                return ClassName(packageName = "org.drinkless.tdlib", "TdApi", simpleName)
            }
        }
        else -> error("Unknown type $qualifiedName")
    }
}

private fun writeInterface(
    updateClassDeclarations: List<ClassOrInterfaceDeclaration>,
    functionClassDeclarations: List<ClassOrInterfaceDeclaration>
) {
    println("writeInterface")

    val propertySpecs = updateClassDeclarations.map { classDeclaration ->
        val className = classDeclaration.nameAsString
        val baseName = className.removePrefix(prefix = "Update")
        val newClassName = baseName + "UpdateDto"
        val propertyName = baseName.decapitalized + "Updates"

        val returnParameterClassName = ClassName("dev.g000sha256.tdl.dto.update", newClassName)
        val returnTypeName = ClassName("kotlinx.coroutines.flow", "Flow")
            .parameterizedBy(returnParameterClassName) as TypeName

        return@map PropertySpec
            .builder(propertyName, returnTypeName)
            .addKdoc(format = classDeclaration.javaDoc)
            .addModifier(modifier = KModifier.PUBLIC)
            .addModifier(modifier = KModifier.ABSTRACT)
            .build()
    }

    val funSpecs = functionClassDeclarations.map map1@{ classDeclaration ->
        val className = classDeclaration.nameAsString
        val functionName = className.decapitalized

        val functionDoc = classDeclaration
            .javaDoc
            .substringBefore(delimiter = "<p> Returns")
            .trim()

        val functionDocCodeBlockBuilder = CodeBlock
            .builder()
            .add(functionDoc)
            .add("\n")
            .add("\n")

        classDeclaration
            .fields
            .forEach { fieldDeclaration ->
                fieldDeclaration
                    .variables
                    .filter { it.nameAsString != "CONSTRUCTOR" }
                    .forEach { variableDeclarator ->
                        functionDocCodeBlockBuilder
                            .add("@param ")
                            .add(variableDeclarator.nameAsString)
                            .add(" ")
                            .add(fieldDeclaration.javaDoc)
                            .add("\n")
                    }
            }

        val functionDocCodeBlock = functionDocCodeBlockBuilder.build()

        val properties = classDeclaration.createProperties()

        val parentGenericSimpleName = classDeclaration
            .extendedTypeFirst()
            .typeArgumentFirst()
            .let { it as ClassOrInterfaceType }
            .let { it.nameAsString + "Dto" }

        val returnsTypeName: TypeName
        if (parentGenericSimpleName == "UpdateDto") {
            returnsTypeName = ClassName("dev.g000sha256.tdl.dto.update", parentGenericSimpleName)
        } else {
            returnsTypeName = ClassName("dev.g000sha256.tdl.dto", parentGenericSimpleName)
        }

        return@map1 FunSpec
            .builder(functionName)
            .addKdoc(functionDocCodeBlock)
            .addModifier(modifier = KModifier.PUBLIC)
            .addModifier(modifier = KModifier.ABSTRACT)
            .addModifier(modifier = KModifier.SUSPEND)
            .addParameters(
                parameterSpecs = properties.map map2@{ property ->
                    return@map2 ParameterSpec
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
                returnType = ClassName("dev.g000sha256.tdl", "TdlResult")
                    .parameterizedBy(returnsTypeName)
            )
            .build()
    }

    val typeSpec = TypeSpec
        .classBuilder(name = "TdlClient")
        .addKdoc(
            format = buildString {
                append("A Kotlin Coroutines client for the TDLib.")
                append("\n")
                append("\n")
                append("You should subscribe to the primary update flows before calling requests to avoid missing initial updates.")
            }
        )
        .addModifier(modifier = KModifier.PUBLIC)
        .addModifier(modifier = KModifier.ABSTRACT)
        .primaryConstructor(
            primaryConstructor = FunSpec
                .constructorBuilder()
                .addModifier(modifier = KModifier.INTERNAL)
                .build()
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
                            returnType = ClassName("dev.g000sha256.tdl", "TdlClient")
                        )
                        .addStatement(format = "REMOVE_LINE")
                        .addStatement(format = "return serviceLocator.createClient()")
                        .build()
                )
                .build()
        )
        .addProperties(propertySpecs)
        .addFunctions(funSpecs)
        .build()

    FileSpec
        .builder(packageName = "dev.g000sha256.tdl", fileName = "TdlClient")
        .addType(typeSpec)
        .indent(indent = "    ")
        .build()
        .writeAndFixContent()
}

private fun writeImplementation(
    updateClassDeclarations: List<ClassOrInterfaceDeclaration>,
    functionClassDeclarations: List<ClassOrInterfaceDeclaration>
) {
    println("writeImplementation")

    val propertySpecs = updateClassDeclarations.map { classDeclaration ->
        val className = classDeclaration.nameAsString
        val baseName = className.removePrefix(prefix = "Update")
        val newClassName = baseName + "UpdateDto"
        val propertyName = baseName.decapitalized + "Updates"

        val returnParameterClassName = ClassName(packageName = "dev.g000sha256.tdl.dto.update", newClassName)
        val returnTypeName = ClassName(packageName = "kotlinx.coroutines.flow", "Flow")
            .parameterizedBy(returnParameterClassName) as TypeName

        val getterFunSpec = FunSpec
            .getterBuilder()
            .addStatement(
                format = "return repository.getUpdates(%T::class) { mapper.map(it) }",
                ClassName(packageName = "org.drinkless.tdlib", "TdApi", className)
            )
            .build()

        return@map PropertySpec
            .builder(propertyName, returnTypeName)
            .addModifier(modifier = KModifier.OVERRIDE)
            .getter(getterFunSpec)
            .build()
    }

    val funSpecs = functionClassDeclarations.map map1@{ classDeclaration ->
        val className = classDeclaration.nameAsString
        val functionName = className.decapitalized

        val properties = classDeclaration.createProperties()

        val returnSimpleName = classDeclaration
            .extendedTypeFirst()
            .typeArgumentFirst()
            .let { it as ClassOrInterfaceType }
            .let { it.nameAsString + "Dto" }

        val returnsTypeName: TypeName
        if (returnSimpleName == "UpdateDto") {
            returnsTypeName = ClassName("dev.g000sha256.tdl.dto.update", returnSimpleName)
        } else {
            returnsTypeName = ClassName("dev.g000sha256.tdl.dto", returnSimpleName)
        }

        return@map1 FunSpec
            .builder(functionName)
            .addModifier(modifier = KModifier.OVERRIDE)
            .addModifier(modifier = KModifier.SUSPEND)
            .addParameters(
                parameterSpecs = properties.map map2@{ property ->
                    return@map2 ParameterSpec
                        .builder(name = property.name, type = property.type)
                        .build()
                }
            )
            .returns(
                returnType = ClassName("dev.g000sha256.tdl", "TdlResult")
                    .parameterizedBy(returnsTypeName)
            )
            .apply {
                addStatement(format = "val function = TdApi.%L(", className)
                properties.forEach { property ->
                    val name = property.name
                    val typeName = property.type

                    if (typeName is ParameterizedTypeName) {
                        check(typeName.typeArguments.size == 1)
                        val type = typeName.typeArguments.first() as ClassName
                        if (type.packageName == "dev.g000sha256.tdl.dto") {
                            addStatement(format = "    %L = %L.mapArray { mapper.map(it) },", name, name)
                        } else {
                            addStatement(format = "    %L = %L,", name, name)
                        }
                    } else {
                        typeName as ClassName
                        if (typeName.packageName == "dev.g000sha256.tdl.dto") {
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
                addStatement(format = "return repository.send(function) { mapper.map(it) }")
            }
            .build()
    }

    val typeSpec = TypeSpec
        .classBuilder(name = "TdlClientImpl")
        .addModifier(modifier = KModifier.INTERNAL)
        .primaryConstructor(
            primaryConstructor = FunSpec
                .constructorBuilder()
                .addParameter(
                    parameterSpec = ParameterSpec
                        .builder(
                            name = "mapper",
                            type = ClassName(packageName = "dev.g000sha256.tdl", "TdlMapper")
                        )
                        .build()
                )
                .addParameter(
                    parameterSpec = ParameterSpec
                        .builder(
                            name = "repository",
                            type = ClassName(packageName = "dev.g000sha256.tdl", "TdlRepository")
                        )
                        .build()
                )
                .build()
        )
        .superclass(
            superclass = ClassName("dev.g000sha256.tdl", "TdlClient")
        )
        .addProperty(
            propertySpec = PropertySpec
                .builder(
                    name = "mapper",
                    type = ClassName(packageName = "dev.g000sha256.tdl", "TdlMapper")
                )
                .addModifier(modifier = KModifier.PRIVATE)
                .initializer(format = "mapper")
                .build()
        )
        .addProperty(
            propertySpec = PropertySpec
                .builder(
                    name = "repository",
                    type = ClassName(packageName = "dev.g000sha256.tdl", "TdlRepository")
                )
                .addModifier(modifier = KModifier.PRIVATE)
                .initializer(format = "repository")
                .build()
        )
        .addProperties(propertySpecs)
        .addFunctions(funSpecs)
        .build()

    FileSpec
        .builder(packageName = "dev.g000sha256.tdl", fileName = "TdlClientImpl")
        .addType(typeSpec)
        .indent(indent = "    ")
        .build()
        .writeAndFixContent()
}

private fun copyFiles(fromDirectory: File, toDirectory: File) {
    println("copyFiles")

    check(fromDirectory.isDirectory) { "$fromDirectory is not directory" }

    val files = fromDirectory.listFiles()
    if (files == null) {
        return
    }

    files.forEach {
        it.copyRecursively(
            target = File(toDirectory, it.name),
            overwrite = true
        )
    }
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

private fun ClassOrInterfaceDeclaration.extendedTypeFirst(): ClassOrInterfaceType {
    return getExtendedTypes(0)
}

private fun ClassOrInterfaceType.typeArgumentFirst(): Type {
    return typeArguments
        .flatMap { it.first }
        .get()
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

private fun ClassOrInterfaceDeclaration.createProperties(): List<Property> {
    return fields
        .map { fieldDeclaration ->
            val isNullable = fieldDeclaration.isNullable
            val javaDoc = fieldDeclaration.javaDoc
            return@map fieldDeclaration.variables.mapNotNull { variableDeclarator ->
                val name = variableDeclarator.nameAsString
                if (name == "CONSTRUCTOR") {
                    return@mapNotNull null
                }

                val type = variableDeclarator.type
                return@mapNotNull Property(
                    name = name,
                    type = type
                        .toTypeName(replace = true)
                        .copy(nullable = isNullable),
                    javaDoc = javaDoc,
                    originalType = type
                        .toTypeName(replace = false)
                        .copy(nullable = isNullable),
                )
            }
        }
        .flatten()
}

private fun FileSpec.writeAndFixContent(addLicence: Boolean = true, removeAllPublic: Boolean = false) {
    val path = Paths
        .get("$currentPath/tdl-coroutines/src/generated/kotlin")
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
                return@let listOf(licenseComment) + it
            } else {
                return@let it
            }
        }
        .also { path.writeLines(it) }
}

private fun FileSpec.Builder.addImport(packageName: String, name: String): FileSpec.Builder {
    return addImport(packageName, name)
}

private fun FunSpec.Builder.addModifier(modifier: KModifier): FunSpec.Builder {
    return addModifiers(modifier)
}

private fun ParameterSpec.Builder.addModifier(modifier: KModifier): ParameterSpec.Builder {
    return addModifiers(modifier)
}

private fun PropertySpec.Builder.addModifier(modifier: KModifier): PropertySpec.Builder {
    return addModifiers(modifier)
}

private fun TypeSpec.Builder.addModifier(modifier: KModifier): TypeSpec.Builder {
    return addModifiers(modifier)
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

private fun buildToStringFunSpec(parentClassName: String, innerClassName: String, properties: List<Property>): FunSpec {
    return buildToStringFunSpec(
        className = buildString {
            append(parentClassName)
            append(".")
            append(innerClassName)
        },
        properties = properties
    )
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

private class Property(
    val name: String,
    val type: TypeName,
    val javaDoc: String,
    val originalType: TypeName
)
