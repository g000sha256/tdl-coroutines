import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(notation = catalog.plugins.gmazzo.buildConfig)
    alias(notation = catalog.plugins.gradle.application)
    alias(notation = catalog.plugins.jetBrains.kotlin.jvm)
    alias(notation = catalog.plugins.johnRengelman.shadow)
}

application {
    mainClass = "dev.g000sha256.tdl.example.MainKt"
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

kotlin {
    explicitApi()

    compilerOptions {
        jvmTarget = JvmTarget.JVM_11
        moduleName = "dev.g000sha256.tdl.example"
    }
}

dependencies {
    implementation(dependencyNotation = catalog.libraries.jetBrains.annotations)
    implementation(dependencyNotation = catalog.libraries.jetBrains.kotlin)

    implementation(dependencyNotation = catalog.libraries.jetBrains.coroutines.core)

    val libProject = project(":tdl-coroutines")
    implementation(dependencyNotation = libProject)
}

buildConfig {
    val apiId = findInt(key = "Telergam.ApiId") ?: 0
    buildConfigField(name = "API_ID", value = apiId)

    val apiHash = findString(key = "Telergam.ApiHash") ?: ""
    buildConfigField(name = "API_HASH", value = apiHash)
}

fun findInt(key: String): Int? {
    val property = findString(key)
    return property?.toInt()
}

fun findString(key: String): String? {
    val property = findProperty(key)
    return property?.toString()
}
