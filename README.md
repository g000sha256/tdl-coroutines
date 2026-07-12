# TDL Coroutines

[![Maven Central](https://img.shields.io/maven-central/v/dev.g000sha256/tdl-coroutines?label=Maven%20Central&labelColor=171C35&color=E38E33)](https://central.sonatype.com/artifact/dev.g000sha256/tdl-coroutines)
[![TDLib](https://img.shields.io/badge/TDLib-v1.8.65-blue?labelColor=000000&color=24A1DE)](https://github.com/tdlib/td/tree/a8f21f5230172634becc1739050ef23ecd6ea291)
[![KLibs](https://img.shields.io/static/v1?label=KLibs&labelColor=000000&message=tdl-coroutines&color=E627F8)](https://klibs.io/project/g000sha256/tdl-coroutines)

TDL Coroutines is a Kotlin Multiplatform library that provides a coroutine-based client for the
Telegram Database Library ([TDLib](https://github.com/tdlib/td)). It simplifies sending requests and handling updates, making
TDLib integration more straightforward and idiomatic for Kotlin Multiplatform projects.

<table>
    <tr>
        <td>Mobile</td>
        <td>
            <a href="https://klibs.io/package/dev.g000sha256/tdl-coroutines"><img alt="Platform Android" src="https://img.shields.io/static/v1?label=Platform&labelColor=000000&message=Android&color=3DDC84"></a>
            <a href="https://klibs.io/package/dev.g000sha256/tdl-coroutines"><img alt="Platform iOS" src="https://img.shields.io/static/v1?label=Platform&labelColor=000000&message=iOS&color=FFFFFF"></a>
            <a href="https://klibs.io/package/dev.g000sha256/tdl-coroutines"><img alt="Platform iOS Simulator" src="https://img.shields.io/static/v1?label=Platform&labelColor=000000&message=iOS%20Simulator&color=FFFFFF"></a>
        </td>
    </tr>
    <tr>
        <td>Desktop</td>
        <td>
            <a href="https://klibs.io/package/dev.g000sha256/tdl-coroutines"><img alt="Platform JVM" src="https://img.shields.io/static/v1?label=Platform&labelColor=007396&message=JVM%20(Linux,%20macOS,%20Windows)&color=ED8B00"></a>
            <a href="https://klibs.io/package/dev.g000sha256/tdl-coroutines"><img alt="Platform macOS" src="https://img.shields.io/static/v1?label=Platform&labelColor=000000&message=macOS&color=FFFFFF"></a>
            <a href="https://klibs.io/package/dev.g000sha256/tdl-coroutines"><img alt="Platform Windows" src="https://img.shields.io/static/v1?label=Platform&labelColor=000000&message=Windows%20(x64)&color=0078D4"></a>
        </td>
    </tr>
</table>

## Gradle setup

```kotlin
repositories {
    mavenCentral()
}
```

Replace `X.X.X` with the version from the Maven Central badge.

```kotlin
dependencies {
    implementation("dev.g000sha256:tdl-coroutines:X.X.X")
}
```

## Usage

> [!CAUTION]
> Upstream TDLib may include breaking API changes even in patch releases.
> Since TDL Coroutines wraps TDLib, these changes propagate to this library as well.
> To minimize the impact, use named arguments when calling generated constructors and request methods,
> because parameters may be added, renamed, or removed in future releases.

### Create a client

```kotlin
val client = TdlClient.create()
```

> [!IMPORTANT]
> Start collecting the update flows you need before sending the first request.

### Subscribe to updates

`TdlClient` provides 182 update flows and the `allUpdates` flow, which combines all update events.

```kotlin
coroutineScope.launch {
    client.authorizationStateUpdates.collect { update ->
        val authorizationState = update.authorizationState
        // TODO
    }
}
```

```kotlin
coroutineScope.launch {
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
            // TODO
        }
    }
}
```

### Send a request

`TdlClient` provides 1001 request methods.

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
