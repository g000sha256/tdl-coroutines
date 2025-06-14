package dev.g000sha256.tdl

import org.drinkless.tdlib.Client
import org.drinkless.tdlib.TdApi

internal class TdlNative {

    private val client = Client()

    init {
        client.nativeClientExecute(
            request = TdApi.SetLogVerbosityLevel(newVerbosityLevel = 0),
        )
        client.nativeClientExecute(
            request = TdApi.SetLogStream(
                logStream = TdApi.LogStreamEmpty(),
            ),
        )
    }

    fun createClientId(): Int {
        return client.createNativeClient()
    }

    fun send(clientId: Int, requestId: Long, request: TdApi.Function<*>) {
        client.nativeClientSend(clientId, requestId, request)
    }

    fun receive(
        clientIds: IntArray,
        requestIds: LongArray,
        responses: Array<TdApi.Object?>,
        timeoutInSeconds: Double,
    ): Int {
        return client.nativeClientReceive(clientIds, requestIds, responses, timeoutInSeconds)
    }

}
