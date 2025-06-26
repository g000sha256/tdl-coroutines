package dev.g000sha256.tdl

import org.drinkless.tdlib.JsonClient

internal class TdlNative {

    private val client = JsonClient()

    fun createClientId(): Int {
        return client.createClientId()
    }

    fun send(clientId: Int, request: String) {
        client.send(clientId = clientId, request = request)
    }

    fun receive(timeoutInSeconds: Double): String {
        return client.receive(timeoutInSeconds = timeoutInSeconds)
    }

}
