import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(catalog.plugins.gmazzo.buildConfig)
    alias(catalog.plugins.jetBrains.kotlin.jvm)
    alias(catalog.plugins.johnRengelman.shadow)
    id("application")
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
    implementation(catalog.libs.jetBrains.annotations)
    implementation(catalog.libs.jetBrains.kotlin)

    implementation(catalog.libs.jetBrains.coroutinesCore)

    val libProject = project(":tdl-coroutines")
    implementation(libProject)
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
