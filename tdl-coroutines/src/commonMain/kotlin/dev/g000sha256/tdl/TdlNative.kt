package dev.g000sha256.tdl

import org.drinkless.tdlib.JsonClient

internal class TdlNative {

    private val jsonClient = JsonClient()

    fun createClientId(): Int {
        return jsonClient.createClientId()
    }

    fun send(clientId: Int, request: String) {
        jsonClient.send(clientId = clientId, request = request)
    }

    fun receive(timeoutInSeconds: Double): String {
        return jsonClient.receive(timeoutInSeconds = timeoutInSeconds)
    }

}
