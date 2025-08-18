import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(notation = catalog.plugins.android.application)
    alias(notation = catalog.plugins.jetBrains.kotlin.android)
}

android {
    buildToolsVersion = "36.0.0"
    compileSdk = 36
    namespace = "dev.g000sha256.tdl.example"

    buildFeatures {
        buildConfig = true
    }

    signingConfigs {
        register("keystore") {
            keyAlias = "Example"
            keyPassword = "jvi6sBUS"
            storeFile = file(path = "keystore.jks")
            storePassword = "fUpvT1lI"
        }
    }

    buildTypes {
        debug {
            signingConfig = signingConfigs.getByName("keystore")
        }

        release {
            isMinifyEnabled = true
            signingConfig = signingConfigs.getByName("keystore")

            proguardFile(proguardFile = "proguard.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    defaultConfig {
        minSdk = 21
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        val apiId = findProperty("Telergam.ApiId") ?: 0
        buildConfigField(type = "int", name = "API_ID", value = "$apiId")

        val apiHash = findProperty("Telergam.ApiHash") ?: ""
        buildConfigField(type = "String", name = "API_HASH", value = "\"$apiHash\"")
    }

    lint {
        checkReleaseBuilds = false
    }
}

kotlin {
    explicitApi()

    compilerOptions {
        jvmTarget = JvmTarget.JVM_11
        moduleName = android.namespace
    }
}

dependencies {
    implementation(dependencyNotation = catalog.libraries.jetBrains.annotations)
    implementation(dependencyNotation = catalog.libraries.jetBrains.kotlin)

    implementation(dependencyNotation = catalog.libraries.androidX.activity)
    implementation(dependencyNotation = catalog.libraries.androidX.lifecycle.common)
    implementation(dependencyNotation = catalog.libraries.androidX.lifecycle.viewModel)
    implementation(dependencyNotation = catalog.libraries.jetBrains.coroutines.android)
    implementation(dependencyNotation = catalog.libraries.jetBrains.coroutines.core)

    val libProject = project(":tdl-coroutines")
    implementation(dependencyNotation = libProject)
}
