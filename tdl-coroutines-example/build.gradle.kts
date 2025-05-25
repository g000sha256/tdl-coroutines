import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(catalog.plugins.android.application)
    alias(catalog.plugins.jetBrains.kotlin.android)
}

android {
    buildToolsVersion = "36.0.0"
    compileSdk = 36
    namespace = "dev.g000sha256.tdl.example"

    buildFeatures {
        buildConfig = true
    }

    buildTypes {
        release {
            isMinifyEnabled = true

            proguardFile(proguardFile = "proguard.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    defaultConfig {
        minSdk = 30
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
    implementation(catalog.libs.jetBrains.annotations)
    implementation(catalog.libs.jetBrains.kotlin)

    implementation(catalog.libs.androidX.activity)
    implementation(catalog.libs.androidX.viewModel)
    implementation(catalog.libs.jetBrains.coroutinesAndroid)
    implementation(catalog.libs.jetBrains.coroutinesCore)

    val libProject = project(":tdl-coroutines")
    implementation(libProject)
}
