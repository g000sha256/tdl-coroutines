import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(catalog.plugins.jetBrains.kotlin.jvm)
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
    implementation(catalog.libs.jetBrains.annotations)
    implementation(catalog.libs.jetBrains.kotlin)

    implementation(catalog.libs.javaParser.core)
    implementation(catalog.libs.javaParser.symbolSolverCore)
    implementation(catalog.libs.squareUp.kotlinPoet)
}
