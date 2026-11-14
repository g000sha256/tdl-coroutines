plugins {
    alias(notation = catalog.plugins.jetBrains.kotlin.multiplatform)
}

kotlin {
    explicitApi()

    compilerOptions {
        allWarningsAsErrors = true
    }

    watchosSimulatorArm64()

    sourceSets {
        commonTest {
            dependencies {
                implementation(dependencyNotation = catalog.libraries.jetBrains.coroutines.core)

                implementation(
                    dependencyNotation = project(path = ":example:verification:shared"),
                )

                implementation(
                    dependencyNotation = kotlin(simpleModuleName = "test"),
                )
            }
        }
    }
}

tasks {
    named<AbstractTestTask>(name = "watchosSimulatorArm64Test") {
        testLogging {
            showStandardStreams = true
        }
    }
}
