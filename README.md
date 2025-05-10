# [WORK IN PROGRESS] TDL-Coroutines

This library provides a Kotlin Coroutines client for the Telegram Database Library (TDLib).
Data Transfer Objects (DTOs), the client, and the mapper are generated based on the `TdApi.java` file.

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

- Maven publication plugin.
- GitHub release workflow.
- Generator source code.
- Example application.
- Define optional parameters and properties.
- Research replacing arrays with `List` or `ImmutableList`.
- Usage of `Client.nativeClientExecute`.
- Usage of `Client.nativeClientSetLogMessageHandler`.
- README description and more examples.
- Multiplatform support (JVM, iOS, et al.).