# [WORK IN PROGRESS] TDL Coroutines

[![TDLib Version](https://img.shields.io/badge/TDLib-1.8.48-blue?labelColor=19212A&color=53A5E3)](https://github.com/tdlib/td/tree/b8b08b02dbbc0c05e7129e2f306c636c5b8ec04f)

[![Maven Central](https://img.shields.io/maven-central/v/dev.g000sha256/tdl-coroutines?label=Maven%20Central&labelColor=171C35&color=E38E33)](https://central.sonatype.com/artifact/dev.g000sha256/tdl-coroutines)

This library provides a Kotlin Coroutines client for the Telegram Database Library ([TDLib](https://github.com/tdlib/td)).
Data Transfer Objects (DTOs), the client, and the mapper are generated based on the `TdApi.java` file.

## Gradle setup

> [!WARNING]
> The library hasn't been published yet

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

The `TdlClient` has 157 update flows.

```kotlin
coroutineScope.launch {
    client.authorizationStateUpdates.collect { authorizationState ->
        // TODO
    }
}
```

### How to send a request

The `TdlClient` has 851 request methods.

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

- Add GitHub release workflow.
- Add example application.
- Define optional parameters and properties. Add initializers.
- Link JNI directly. Remove `TdApi`.
- Research replacing arrays with `List` or `ImmutableList`.
- Add usage of `Client.nativeClientExecute`.
- Add usage of `Client.nativeClientSetLogMessageHandler`.
- Expand README description and add more examples.
- Add multiplatform support (JVM, iOS, etc.).
