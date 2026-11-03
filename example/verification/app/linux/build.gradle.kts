import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget

plugins {
    alias(notation = catalog.plugins.jetBrains.kotlin.multiplatform)
}

kotlin {
    explicitApi()

    compilerOptions {
        allWarningsAsErrors = true
    }

    linuxArm64 {
        configureBinaries()
    }

    linuxX64 {
        configureBinaries()
    }

    sourceSets {
        commonMain {
            dependencies {
                implementation(dependencyNotation = catalog.libraries.jetBrains.coroutines.core)

                implementation(
                    dependencyNotation = project(path = ":example:verification:shared"),
                )
            }
        }
    }
}

private fun KotlinNativeTarget.configureBinaries() {
    binaries {
        executable {
            entryPoint = "dev.g000sha256.tdl.example.verification.app.linux.main"
        }
    }
}
