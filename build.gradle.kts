plugins {
    alias(catalog.plugins.android.application) apply false
    alias(catalog.plugins.android.library) apply false
    alias(catalog.plugins.g000sha256.sonatypeMavenCentral) apply false
    alias(catalog.plugins.gmazzo.buildConfig) apply false
    alias(catalog.plugins.jetBrains.binaryCompatibilityValidator) apply false
    alias(catalog.plugins.jetBrains.dokka) apply false
    alias(catalog.plugins.jetBrains.kotlin.android) apply false
    alias(catalog.plugins.jetBrains.kotlin.jvm) apply false
    alias(catalog.plugins.jetBrains.kotlin.multiplatform) apply false
}
