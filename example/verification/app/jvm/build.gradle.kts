plugins {
    alias(notation = catalog.plugins.gradle.application)
    alias(notation = catalog.plugins.jetBrains.kotlin.jvm)
}

private val packageName = "dev.g000sha256.tdl.example.verification.app.jvm"

kotlin {
    explicitApi()
    jvmToolchain(jdkVersion = 11)

    compilerOptions {
        allWarningsAsErrors = true
        moduleName = packageName
    }
}

application {
    mainClass = "$packageName.MainKt"
}

dependencies {
    implementation(dependencyNotation = catalog.libraries.jetBrains.coroutines.core)

    implementation(
        dependencyNotation = project(path = ":example:verification:shared"),
    )
}
