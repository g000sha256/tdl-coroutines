# TDL Coroutines

[![Maven Central](https://img.shields.io/maven-central/v/dev.g000sha256/tdl-coroutines?label=Maven%20Central&labelColor=171C35&color=E38E33)](https://central.sonatype.com/artifact/dev.g000sha256/tdl-coroutines)
[![TDLib Version](https://img.shields.io/badge/TDLib-v1.8.49-blue?labelColor=19212A&color=53A5E3)](https://github.com/tdlib/td/tree/4a967f7a633d3c98184806650607b1746020a6a8)

This library provides a Kotlin Coroutines client for the Telegram Database Library ([TDLib](https://github.com/tdlib/td)).
Data Transfer Objects (DTOs), the client, and the mapper are generated from the `TdApi.java` file.

## Gradle setup

```kotlin
repositories {
    mavenCentral()
}
```

```kotlin
dependencies {
    implementation("dev.g000sha256:tdl-coroutines:0.0.1")
}
```

## Usage

### How to create a client

```kotlin
val client = TdlClient.create()
```

### How to subscribe to updates

The `TdlClient` provides 157 update flows

```kotlin
coroutineScope.launch {
    client.authorizationStateUpdates.collect { authorizationState ->
        // TODO
    }
}
```

### How to send a request

The `TdlClient` provides 855 request methods

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
            // TODO
        }
    }
}
```

## To-Do list

- Define optional parameters and properties. Add initializers.
- Link JNI directly. Remove `TdApi`.
- Research replacing arrays with `List` or `ImmutableList`.
- Add usage of `Client.nativeClientExecute`.
- Add usage of `Client.nativeClientSetLogMessageHandler`.
- Add multiplatform support (JVM, iOS, etc.).
