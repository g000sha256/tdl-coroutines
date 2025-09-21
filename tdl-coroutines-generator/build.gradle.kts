import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(notation = catalog.plugins.gradle.application)
    alias(notation = catalog.plugins.jetBrains.kotlin.jvm)
}

application {
    mainClass = "dev.g000sha256.tdl.generator.TdlGeneratorKt"
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

kotlin {
    explicitApi()

    compilerOptions {
        jvmTarget = JvmTarget.JVM_17
    }
}

dependencies {
    implementation(dependencyNotation = catalog.libraries.jetBrains.annotations)
    implementation(dependencyNotation = catalog.libraries.jetBrains.kotlin)

    implementation(dependencyNotation = catalog.libraries.squareUp.kotlinPoet)
}
