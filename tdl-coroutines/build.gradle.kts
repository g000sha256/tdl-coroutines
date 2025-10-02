import org.jetbrains.kotlin.gradle.dsl.JvmTarget

group = "dev.g000sha256"
version = "4.0.0"

plugins {
    alias(notation = catalog.plugins.android.library)
    alias(notation = catalog.plugins.g000sha256.sonatypeMavenCentral)
    alias(notation = catalog.plugins.gradle.mavenPublish)
    alias(notation = catalog.plugins.gradle.signing)
    alias(notation = catalog.plugins.jetBrains.binaryCompatibilityValidator)
    alias(notation = catalog.plugins.jetBrains.dokka)
    alias(notation = catalog.plugins.jetBrains.kotlin.multiplatform)
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

    defaultConfig {
        minSdk = 21
    }

    sourceSets {
        getByName("main") {
            jniLibs.srcDir(srcDir = "src/androidMainGenerated/jniLibs")
        }
    }
}

val kotlinModuleName = android.namespace

kotlin {
    explicitApi()
    withSourcesJar(publish = true)

    androidTarget {
        publishLibraryVariants("release")

        compilerOptions {
            jvmTarget = JvmTarget.JVM_1_8
            moduleName = kotlinModuleName
        }
    }

    jvm {
        compilerOptions {
            jvmTarget = JvmTarget.JVM_1_8
            moduleName = kotlinModuleName
        }
    }

    sourceSets {
        commonMain {
            kotlin.srcDirs("src/commonMainGenerated/kotlin")

            dependencies {
                implementation(dependencyNotation = catalog.libraries.jetBrains.annotations)
                implementation(dependencyNotation = catalog.libraries.jetBrains.kotlin)

                implementation(dependencyNotation = catalog.libraries.jetBrains.atomic)
                implementation(dependencyNotation = catalog.libraries.jetBrains.coroutines.core)
                implementation(dependencyNotation = catalog.libraries.jetBrains.kotlinSerialization.core)
                implementation(dependencyNotation = catalog.libraries.jetBrains.kotlinSerialization.json)
            }
        }

        jvmMain {
            resources.srcDirs("src/jvmMainGenerated/resources")
        }
    }
}

val dokkaJavaDocJarTaskProvider = tasks.register<Jar>(name = "dokkaJavaDocJar") {
    group = "documentation"
    archiveClassifier = "javadoc"
    from(tasks.dokkaHtml)
}

publishing {
    publications {
        withType<MavenPublication> {
            artifact(dokkaJavaDocJarTaskProvider)

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

tasks.withType<Sign> {
    val path = "signatures/$name"
    signatureType = CustomSignatureType(path = path, signatureType = signatureType)
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

@Suppress("DELEGATED_MEMBER_HIDES_SUPERTYPE_OVERRIDE")
class CustomSignatureType(
    private val path: String,
    signatureType: SignatureType,
) : AbstractSignatureType(), SignatureType by signatureType {

    override fun fileFor(toSign: File): File {
        val original = super.fileFor(toSign)
        return layout
            .buildDirectory
            .dir(path)
            .get()
            .file(original.name)
            .asFile
    }

    override fun sign(signatory: Signatory, toSign: File): File {
        return super.sign(signatory, toSign)
    }

}
