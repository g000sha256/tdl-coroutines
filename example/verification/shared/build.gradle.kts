plugins {
    alias(notation = catalog.plugins.android.kotlin.multiplatform.library)
    alias(notation = catalog.plugins.jetBrains.kotlin.multiplatform)
}

private val packageName = "dev.g000sha256.tdl.example.verification.shared"

kotlin {
    explicitApi()
    jvmToolchain(jdkVersion = 11)

    compilerOptions {
        allWarningsAsErrors = true
    }

    android {
        buildToolsVersion = "36.0.0"
        compileSdk = 36
        minSdk = 21
        namespace = packageName

        compilerOptions {
            moduleName = packageName
        }
    }

    jvm {
        compilerOptions {
            moduleName = packageName
        }
    }

    iosArm64()
    iosSimulatorArm64()
    iosX64()

    macosArm64()
    macosX64()

    mingwX64()

    sourceSets {
        commonMain {
            dependencies {
                implementation(dependencyNotation = catalog.libraries.jetBrains.coroutines.core)

                implementation(
                    dependencyNotation = project(path = ":tdl-coroutines"),
                )
            }
        }
    }
}
