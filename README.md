# TDL Coroutines

[![Maven Central](https://img.shields.io/maven-central/v/dev.g000sha256/tdl-coroutines?label=Maven%20Central&labelColor=171C35&color=E38E33)](https://central.sonatype.com/artifact/dev.g000sha256/tdl-coroutines)
[![TDLib](https://img.shields.io/badge/TDLib-v1.8.70-blue?labelColor=000000&color=24A1DE)](https://github.com/tdlib/td/tree/23383aef218a3123f02b744bfa91bde21056a814)
[![KLibs](https://img.shields.io/static/v1?label=KLibs&labelColor=000000&message=tdl-coroutines&color=E627F8)](https://klibs.io/project/g000sha256/tdl-coroutines)

TDL Coroutines is a Kotlin Multiplatform library that provides a coroutine-based client for the
Telegram Database Library ([TDLib](https://github.com/tdlib/td)). It simplifies sending requests and handling updates, making
TDLib integration more straightforward and idiomatic for Kotlin Multiplatform projects.

## Supported platforms

Built with Kotlin 2.3.21.

| Platform | Architectures                                                 | Requirements                                                                                                                                                                                                      |
|----------|---------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Android  | `armeabi-v7a`, `arm64-v8a`<br>`x86`, `x86_64`                 | `minSdk` 23, `compileSdk` 34+                                                                                                                                                                                     |
| JVM      | ARM64 / x64 Linux<br>ARM64 / x64 macOS<br>ARM64 / x64 Windows | Java 11+, glibc 2.34+, `libstdc++` with `GLIBCXX_3.4.29`, `libgcc_s.so.1`, OpenSSL 3, `libz.so.1`<br>macOS 11, Java 11+<br>Windows 10 (JDK and VC++ baseline), Java 11+, Microsoft Visual C++ v14 Redistributable |
| iOS      | ARM64 devices<br>ARM64 / x64 simulators                       | iOS 15                                                                                                                                                                                                            |
| tvOS     | ARM64 devices<br>ARM64 / x64 simulators                       | tvOS 15<br>tvOS 15                                                                                                                                                                                                |
| watchOS  | ARM64 devices<br>ARM64_32 devices<br>ARM64 / x64 simulators   | watchOS 26<br>watchOS 8<br>watchOS 8                                                                                                                                                                              |
| Linux    | ARM64 / x64                                                   | glibc, `libstdc++`, `libgcc_s`                                                                                                                                                                                    |
| macOS    | ARM64 / x64                                                   | macOS 11                                                                                                                                                                                                          |
| Windows  | x64                                                           | Windows 10                                                                                                                                                                                                        |

## Gradle setup

Add `mavenCentral()` to your dependency repositories.

```kotlin
repositories {
    mavenCentral()
}
```

Add this dependency to `commonMain.dependencies` in a Kotlin Multiplatform module or to the module's `dependencies`
block in a JVM or Android-only module. Replace `X.X.X` with the version from the Maven Central badge.

```kotlin
implementation("dev.g000sha256:tdl-coroutines:X.X.X")
```

## Usage

> [!CAUTION]
> TDLib patch releases can change the generated API. Use named arguments with generated constructors and request methods
> to keep calls clear when parameter lists change.

### Create a client

```kotlin
val client = TdlClient.create()
```

> [!IMPORTANT]
> Subscribe to the update flows you need before sending the first request. Update flows have no replay.

### Subscribe to updates

`TdlClient` provides 201 update flows and the `allUpdates` flow, which emits updates of every type for that client.

```kotlin
coroutineScope.launch(start = CoroutineStart.UNDISPATCHED) {
    client.authorizationStateUpdates.collect { update ->
        val authorizationState = update.authorizationState
        // TODO
    }
}
```

```kotlin
coroutineScope.launch(start = CoroutineStart.UNDISPATCHED) {
    client.allUpdates.collect { update ->
        when (update) {
            is UpdateAuthorizationState -> {
                val authorizationState = update.authorizationState
                // TODO
            }
            is UpdateOption -> {
                val name = update.name
                val value = update.value
                // TODO
            }
            // ...
            else -> {
                // TODO
            }
        }
    }
}
```

### Send a request

`TdlClient` provides 1099 request methods.

> [!TIP]
> Request methods suspend while waiting for a response without blocking the calling thread.

```kotlin
coroutineScope.launch {
    val result = client.getAuthorizationState()
    when (result) {
        is TdlResult.Failure -> {
            val code = result.code
            val message = result.message
            // TODO
        }
        is TdlResult.Success -> {
            val authorizationState = result.result
            // TODO
        }
    }
}
```

> [!TIP]
> You can use the `.toResult()` extension to convert `TdlResult<T>` to the standard Kotlin `Result<T>` type.
