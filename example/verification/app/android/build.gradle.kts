import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(notation = catalog.plugins.android.application)
}

android {
    buildToolsVersion = "37.0.0"
    compileSdk = 37
    namespace = "dev.g000sha256.tdl.example.verification.app.android"

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    defaultConfig {
        minSdk = 23
        targetSdk = 37
        versionCode = 1
        versionName = "1.0"
    }

    lint {
        checkReleaseBuilds = false
    }
}

kotlin {
    explicitApi()

    compilerOptions {
        allWarningsAsErrors = true
        jvmTarget = JvmTarget.JVM_11
        moduleName = android.namespace
    }
}

dependencies {
    implementation(dependencyNotation = catalog.libraries.jetBrains.coroutines.core)

    implementation(
        dependencyNotation = project(path = ":example:verification:shared"),
    )
}
