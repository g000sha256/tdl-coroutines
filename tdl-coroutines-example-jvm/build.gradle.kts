plugins {
    alias(notation = catalog.plugins.gmazzo.buildConfig)
    alias(notation = catalog.plugins.gradle.application)
    alias(notation = catalog.plugins.gradleup.shadow)
    alias(notation = catalog.plugins.jetBrains.kotlin.jvm)
}

application {
    mainClass = "dev.g000sha256.tdl.example.MainKt"
}

kotlin {
    explicitApi()
    jvmToolchain(jdkVersion = 11)

    compilerOptions {
        allWarningsAsErrors = true
        moduleName = "dev.g000sha256.tdl.example"
    }
}

dependencies {
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
