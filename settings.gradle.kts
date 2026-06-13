pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

plugins {
    id(id = "dev.g000sha256.gradle-module-tree") version "2.0.2"
}

dependencyResolutionManagement {
    @Suppress("UnstableApiUsage")
    repositories {
        google()
        mavenCentral()
    }

    versionCatalogs {
        register("catalog") {
            val file = files("catalog.toml")
            from(file)
        }
    }
}

include {
    directory(name = "example") {
        directory(name = "demo") {
            module(name = "android")
            module(name = "jvm")
        }

        directory(name = "verification") {
            directory(name = "app") {
                module(name = "android")
                module(name = "jvm")
                module(name = "linux")
                module(name = "macos")
                module(name = "windows")
            }

            module(name = "shared")
        }
    }

    module(name = "tdl-coroutines")
    module(name = "tdl-coroutines-generator")
}
