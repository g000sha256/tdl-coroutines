import org.jetbrains.kotlin.gradle.dsl.AbstractKotlinNativeBinaryContainer
import org.jetbrains.kotlin.gradle.dsl.abi.ExperimentalAbiValidation
import org.jetbrains.kotlin.gradle.plugin.KotlinSourceSet
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeCompilation
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinOnlyTarget
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinTargetWithBinaries

group = "dev.g000sha256"
version = "12.0.1"

plugins {
    alias(notation = catalog.plugins.android.kotlin.multiplatform.library)
    alias(notation = catalog.plugins.g000sha256.sonatypeMavenCentral)
    alias(notation = catalog.plugins.jetBrains.dokka)
    alias(notation = catalog.plugins.jetBrains.kotlin.multiplatform)
}

private val packageName = "dev.g000sha256.tdl"

kotlin {
    explicitApi()
    jvmToolchain(jdkVersion = 11)
    withSourcesJar(publish = true)

    @OptIn(ExperimentalAbiValidation::class)
    abiValidation {
        enabled = true
    }

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

        @Suppress("UnstableApiUsage")
        optimization {
            minify = true

            keepRules.apply {
                file(file = "proguard-consumer.pro")
                file(file = "proguard.pro")
            }

            consumerKeepRules.apply {
                publish = true
                file(file = "proguard-consumer.pro")
            }
        }
    }

    jvm {
        compilerOptions {
            moduleName = packageName
        }
    }

    iosArm64 {
        configureBinaries()
        configureCompilations(platform = "ios/arm64")
    }

    iosSimulatorArm64(name = "iosArm64Simulator") {
        configureBinaries()
        configureCompilations(platform = "ios/arm64Simulator")
    }

    iosX64(name = "iosX64Simulator") {
        configureBinaries()
        configureCompilations(platform = "ios/x64Simulator")
    }

    macosArm64 {
        configureBinaries()
        configureCompilations(platform = "macos/arm64")
    }

    macosX64 {
        configureBinaries()
        configureCompilations(platform = "macos/x64")
    }

    mingwX64 {
        configureCompilations(platform = "windows/x64")
    }

    sourceSets {
        commonMain {
            kotlin.srcDirs("src/commonMainGenerated/kotlin")

            dependencies {
                implementation(dependencyNotation = catalog.libraries.jetBrains.atomic)
                implementation(dependencyNotation = catalog.libraries.jetBrains.coroutines.core)
                implementation(dependencyNotation = catalog.libraries.jetBrains.kotlinSerialization.core)
                implementation(dependencyNotation = catalog.libraries.jetBrains.kotlinSerialization.json)
            }
        }

        jvmMain {
            resources.srcDirs("generated/jvm")
        }

        iosArm64Main {
            configureNativeKotlin()
        }

        @Suppress("unused")
        val iosArm64SimulatorMain by getting {
            configureNativeKotlin()
        }

        @Suppress("unused")
        val iosX64SimulatorMain by getting {
            configureNativeKotlin()
        }

        macosArm64Main {
            configureNativeKotlin()
        }

        macosX64Main {
            configureNativeKotlin()
        }

        mingwX64Main {
            configureNativeKotlin()
        }
    }
}

androidComponents {
    onVariants { variant ->
        variant.sources.jniLibs?.addStaticSourceDirectory(srcDir = "generated/android")
    }
}

val dokkaGeneratePublicationHtmlTaskProvider = tasks.named<Task>(name = "dokkaGeneratePublicationHtml")

val dokkaJavaDocJarTaskProvider = tasks.register<Jar>(name = "dokkaJavaDocJar") {
    group = "documentation"
    archiveClassifier = "javadoc"
    from(dokkaGeneratePublicationHtmlTaskProvider)
}

dokka {
    dokkaSourceSets.configureEach {
        if (name != "commonMain") {
            suppress.set(true)
        }
    }
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
                        url = "https://www.apache.org/licenses/LICENSE-2.0.txt"
                    }
                }

                developers {
                    developer {
                        id = "g000sha256"
                        name = "Georgii Ippolitov"
                        email = "github@g000sha256.dev"
                        url = "https://github.com/g000sha256"
                    }
                }

                scm {
                    connection = "scm:git:https://github.com/g000sha256/tdl-coroutines.git"
                    developerConnection = "scm:git:ssh://git@github.com/g000sha256/tdl-coroutines.git"
                    url = "https://github.com/g000sha256/tdl-coroutines"
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
    sign(publishing.publications)
}

tasks.withType<Sign> {
    val path = "signatures/$name"
    signatureType = CustomSignatureType(path = path, signatureType = signatureType)
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

private fun KotlinOnlyTarget<KotlinNativeCompilation>.configureCompilations(platform: String) {
    compilations.getByName("main") {
        cinterops {
            register("main") {
                val configName = platform.extractConfigName()
                definitionFile = file("cinterop/$configName")

                includeDirs("generated/$platform/include")

                val libsFile = file("generated/$platform/libs")
                extraOpts("-libraryPath", libsFile.absolutePath)
            }
        }
    }
}

private fun String.extractConfigName(): String {
    return when {
        startsWith(prefix = "ios") || startsWith(prefix = "mac") -> "config-apple.def"
        startsWith(prefix = "windows") -> "config-windows.def"
        else -> error(message = "Unknown platform")
    }
}

private fun KotlinTargetWithBinaries<*, AbstractKotlinNativeBinaryContainer>.configureBinaries() {
    binaries {
        framework {
            baseName = "TDLCoroutines"
            isStatic = true
            binaryOption(name = "bundleId", value = packageName)
        }
    }
}

private fun KotlinSourceSet.configureNativeKotlin() {
    kotlin.srcDirs("src/native/kotlin")
}
