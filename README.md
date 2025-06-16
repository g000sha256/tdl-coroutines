# TDL Coroutines

[![Maven Central](https://img.shields.io/maven-central/v/dev.g000sha256/tdl-coroutines?label=Maven%20Central&labelColor=171C35&color=E38E33)](https://central.sonatype.com/artifact/dev.g000sha256/tdl-coroutines)
[![TDLib Version](https://img.shields.io/badge/TDLib-v1.8.50-blue?labelColor=19212A&color=53A5E3)](https://github.com/tdlib/td/tree/fb04b8d40e5e3d24c30001af2e9784c91d4606c0)
[![GitHub Actions](https://img.shields.io/github/actions/workflow/status/g000sha256/tdl-coroutines/build-and-publish.yml?label=GitHub%20Actions&labelColor=161B22)](https://github.com/g000sha256/tdl-coroutines/actions/workflows/build-and-publish.yml)

![Platform](https://img.shields.io/static/v1?label=Platform&labelColor=black&message=Android&color=green)
![Platform](https://img.shields.io/static/v1?label=Platform&labelColor=black&message=JVM%20(Linux/macOS)&color=orange)

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
    implementation("dev.g000sha256:tdl-coroutines:1.1.0")
}
```

## Usage

> [!CAUTION]
> To reduce breaking changes when updating the library, use named arguments for constructors and methods, as new parameters may
> be added in future releases.

### How to create a client

```kotlin
val client = TdlClient.create()
```

### How to subscribe to updates

The `TdlClient` provides 159 update flows.

```kotlin
coroutineScope.launch {
    client.authorizationStateUpdates.collect { authorizationState ->
        // TODO
    }
}
```

### How to send a request

The `TdlClient` provides 867 request methods.

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

- Research replacing arrays with `List` or `ImmutableList`.
- Add usage for `Client.nativeClientExecute`.
- Add usage for `Client.nativeClientSetLogMessageHandler`.
- Add builders to preserve binary compatibility.
- Add default initializers.
- Rebuild `TDLib` as a `JSON` client.
- Parse `td_api.tl` instead of `TdApi.java`.
- Add multiplatform support for `JVM (Windows)`.
- Add multiplatform support for `iOS`.
- Add multiplatform support for `macOS`.
