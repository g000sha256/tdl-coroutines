import org.jetbrains.kotlin.gradle.dsl.AbstractKotlinNativeBinaryContainer
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinTargetWithBinaries

plugins {
    alias(notation = catalog.plugins.gmazzo.buildConfig)
    alias(notation = catalog.plugins.jetBrains.kotlin.multiplatform)
}

buildConfig {
    val apiId = findInt(key = "Telergam.ApiId") ?: 0
    buildConfigField(name = "API_ID", value = apiId)

    val apiHash = findString(key = "Telergam.ApiHash") ?: ""
    buildConfigField(name = "API_HASH", value = apiHash)
}

kotlin {
    explicitApi()

    macosArm64 {
        configureBinaries()
    }

    macosX64 {
        configureBinaries()
    }

    sourceSets {
        commonMain {
            dependencies {
                implementation(dependencyNotation = catalog.libraries.jetBrains.annotations)
                implementation(dependencyNotation = catalog.libraries.jetBrains.kotlin)

                implementation(dependencyNotation = catalog.libraries.jetBrains.coroutines.core)

                val project = project(path = ":tdl-coroutines")
                implementation(dependencyNotation = project)
            }
        }
    }
}

private fun findInt(key: String): Int? {
    val property = findString(key = key)
    return property?.toInt()
}

private fun findString(key: String): String? {
    val property = findProperty(key)
    return property?.toString()
}

private fun KotlinTargetWithBinaries<*, AbstractKotlinNativeBinaryContainer>.configureBinaries() {
    binaries {
        framework {
            baseName = "TDL-Example-Shared"
            isStatic = true
            binaryOption(name = "bundleId", value = "dev.g000sha256.tdl.example.shared")
        }
    }
}
