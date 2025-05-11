# [WORK IN PROGRESS] TDL-Coroutines

[![Maven Central](https://img.shields.io/maven-central/v/dev.g000sha256/tdl-coroutines?label=Maven%20Central&labelColor=171B35&color=E38E33)](https://central.sonatype.com/artifact/dev.g000sha256/tdl-coroutines)

This library provides a Kotlin Coroutines client for the Telegram Database Library (TDLib).
Data Transfer Objects (DTOs), the client, and the mapper are generated based on the `TdApi.java` file.

## Installation

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

> [!WARNING]
> The library hasn't published yet

## Usage

### How to create a client

```kotlin
val client = TdlClient.create()
```

### How to subscribe for updates

```kotlin
coroutineScope.launch {
    client.authorizationStateUpdates.collect { authorizationState ->
        // TODO
    }
}
```

### How to send a request

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

## To Do List

- GitHub release workflow.
- Generator source code.
- Example application.
- Define optional parameters and properties.
- Research replacing arrays with `List` or `ImmutableList`.
- Usage of `Client.nativeClientExecute`.
- Usage of `Client.nativeClientSetLogMessageHandler`.
- README description and more examples.
- Multiplatform support (JVM, iOS, et al.).