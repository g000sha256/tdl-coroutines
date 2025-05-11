import org.jetbrains.kotlin.gradle.dsl.JvmTarget

group = "dev.g000sha256"
version = "0.0.1"

plugins {
    alias(catalog.plugins.android.library)
    alias(catalog.plugins.g000sha256.sonatypeMavenCentral)
    alias(catalog.plugins.jetBrains.binaryCompatibilityValidator)
    alias(catalog.plugins.jetBrains.kotlin.android)
    id("org.gradle.maven-publish")
    id("org.gradle.signing")
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

    publishing {
        singleVariant("release") {
            withJavadocJar()
            withSourcesJar()
        }
    }

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

publishing {
    publications {
        register<MavenPublication>("release") {
            afterEvaluate {
                val component = components.getByName("release")
                from(component)
            }

            pom {
                name = "TDLib Kotlin Coroutines client"
                description = "This library provides a Kotlin Coroutines client for the Telegram Database Library (TDLib)"
                url = "https://github.com/g000sha256/tdl-coroutines"
                inceptionYear = "2025"

                licenses {
                    license {
                        name = "Apache License 2.0"
                        url = "http://www.apache.org/licenses/LICENSE-2.0.txt"
                    }
                }

                developers {
                    developer {
                        id = "g000sha256"
                        name = "Georgii Ippolitov"
                        email = "detmmpmznb@g000sha256.dev"
                        url = "https://github.com/g000sha256"
                    }
                }

                scm {
                    connection = "scm:git:git://github.com/g000sha256/tdl-coroutines.git"
                    developerConnection = "scm:git:ssh://github.com:g000sha256/tdl-coroutines.git"
                    url = "https://github.com/g000sha256/tdl-coroutines/tree/master"
                }

                issueManagement {
                    system = "GitHub Issues"
                    url = "https://github.com/g000sha256/tdl-coroutines/issues"
                }
            }
        }
    }
}

signing {
    val key = getProperty("Signing.Key") ?: getEnvironment("SIGNING_KEY")
    val password = getProperty("Signing.Password") ?: getEnvironment("SIGNING_PASSWORD")
    useInMemoryPgpKeys(key, password)

    sign(publishing.publications)
}

sonatypeMavenCentralRepository {
    credentials {
        username = getProperty("SonatypeMavenCentral.Username") ?: getEnvironment("SONATYPE_USERNAME")
        password = getProperty("SonatypeMavenCentral.Password") ?: getEnvironment("SONATYPE_PASSWORD")
    }
}

private fun getProperty(key: String): String? {
    return properties[key] as String?
}

private fun getEnvironment(key: String): String? {
    return System.getenv(key)
}
