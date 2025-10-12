# TDL Coroutines

[![Maven Central](https://img.shields.io/maven-central/v/dev.g000sha256/tdl-coroutines?label=Maven%20Central&labelColor=171C35&color=E38E33)](https://central.sonatype.com/artifact/dev.g000sha256/tdl-coroutines)
[![TDLib Version](https://img.shields.io/badge/TDLib-v1.8.55-blue?labelColor=19212A&color=53A5E3)](https://github.com/tdlib/td/tree/7d257dcda5dd2c616c1146540ef51147c5bb2c69)

![Platform](https://img.shields.io/static/v1?label=Platform&labelColor=333333&message=Android&color=3DDC84)
![Platform](https://img.shields.io/static/v1?label=Platform&labelColor=333333&message=JVM&color=ED8B00)
![Platform](https://img.shields.io/static/v1?label=Platform&labelColor=333333&message=iOS&color=A2AAAD)
![Platform](https://img.shields.io/static/v1?label=Platform&labelColor=333333&message=macOS&color=A2AAAD)

`TDL Coroutines` is a `Kotlin Multiplatform` library that provides a coroutine-based client for the
`Telegram Database Library` ([TDLib](https://github.com/tdlib/td)). It simplifies sending requests and handling updates, making
integration with `TDLib` more straightforward and idiomatic for `Kotlin` and `Kotlin Multiplatform` projects.

## Gradle setup

```kotlin
repositories {
    mavenCentral()
}
```

```kotlin
dependencies {
    implementation("dev.g000sha256:tdl-coroutines:4.0.0")
}
```

## Usage

> [!CAUTION]
> The `TDLib` frequently includes breaking changes in its minor versions.
> To reduce breaking changes when updating the `TDL Coroutines` library,
> use named arguments for constructors and methods, as new parameters may be added in future releases.

### How to create a client

```kotlin
val client = TdlClient.create()
```

> [!IMPORTANT]
> To start using `TdlClient`, you should first subscribe to important updates, and then call any request method.

### How to subscribe to updates

The `TdlClient` provides 163 update flows, as well as one that includes all updates.

```kotlin
coroutineScope.launch {
    client.authorizationStateUpdates.collect { updateAuthorizationState ->
        val authorizationState = updateAuthorizationState.authorizationState
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

### How to send a request

The `TdlClient` provides 913 request methods.

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
> You can use the `.toResult()` extension to convert the `TdlResult<T>` into the standard `Kotlin` `Result<T>`.
