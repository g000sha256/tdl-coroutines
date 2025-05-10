import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(catalog.plugins.android.library)
    alias(catalog.plugins.jetBrains.binaryCompatibilityValidator)
    alias(catalog.plugins.jetBrains.kotlin.android)
}

android {
    buildToolsVersion = "36.0.0"
    compileSdk = 36
    namespace = "dev.g000sha256.tdl"

    buildTypes {
        release {
            isMinifyEnabled = true

            consumerProguardFile(proguardFile = "proguard-consumer.pro")

            proguardFile(proguardFile = "proguard-consumer.pro")
            proguardFile(proguardFile = "proguard.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    defaultConfig { minSdk = 24 }

    sourceSets {
        getByName("main") {
            java.srcDir(srcDir = "src/generated/kotlin")
            jniLibs.srcDir(srcDir = "src/generated/jniLibs")
        }
    }
}

kotlin {
    explicitApi()

    compilerOptions {
        jvmTarget = JvmTarget.JVM_1_8
        moduleName = android.namespace
    }
}

dependencies {
    implementation(catalog.libs.jetBrains.annotations)
    implementation(catalog.libs.jetBrains.kotlin)

    implementation(catalog.libs.jetBrains.atomic)
    implementation(catalog.libs.jetBrains.coroutinesCore)
}