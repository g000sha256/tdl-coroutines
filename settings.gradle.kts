include(":example:verification:app:jvm")
include(":example:verification:app:linux")
include(":example:verification:app:macos")
include(":example:verification:app:windows")
include(":example:verification:shared")
include(":tdl-coroutines")
include(":tdl-coroutines-example")
include(":tdl-coroutines-example-jvm")
include(":tdl-coroutines-generator")

pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
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
