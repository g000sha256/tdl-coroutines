plugins {
    alias(notation = catalog.plugins.android.application) apply false
    alias(notation = catalog.plugins.android.library) apply false
    alias(notation = catalog.plugins.g000sha256.sonatypeMavenCentral) apply false
    alias(notation = catalog.plugins.gmazzo.buildConfig) apply false
    alias(notation = catalog.plugins.jetBrains.binaryCompatibilityValidator) apply false
    alias(notation = catalog.plugins.jetBrains.dokka) apply false
    alias(notation = catalog.plugins.jetBrains.kotlin.android) apply false
    alias(notation = catalog.plugins.jetBrains.kotlin.jvm) apply false
    alias(notation = catalog.plugins.jetBrains.kotlin.multiplatform) apply false
    alias(notation = catalog.plugins.johnRengelman.shadow) apply false
}
