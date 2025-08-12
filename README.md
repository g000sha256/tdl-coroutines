# TDL Coroutines

[![Maven Central](https://img.shields.io/maven-central/v/dev.g000sha256/tdl-coroutines?label=Maven%20Central&labelColor=171C35&color=E38E33)](https://central.sonatype.com/artifact/dev.g000sha256/tdl-coroutines)
[![TDLib Version](https://img.shields.io/badge/TDLib-v1.8.52-blue?labelColor=19212A&color=53A5E3)](https://github.com/tdlib/td/tree/bc32c4b20a92df817c45d8af675a7a9572b739bc)

![Platform](https://img.shields.io/static/v1?label=Platform&labelColor=black&message=Android&color=green)
![Platform](https://img.shields.io/static/v1?label=Platform&labelColor=black&message=JVM&color=orange)

This library provides a `Kotlin Coroutines` client for the `Telegram Database Library` ([TDLib](https://github.com/tdlib/td)).

## Gradle setup

```kotlin
repositories {
    mavenCentral()
}
```

```kotlin
dependencies {
    implementation("dev.g000sha256:tdl-coroutines:1.4.0")
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

### How to subscribe to updates

The `TdlClient` provides 161 update flows, as well as one that includes all updates.

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

The `TdlClient` provides 881 request methods.

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
