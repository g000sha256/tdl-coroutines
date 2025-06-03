package dev.g000sha256.tdl

import org.drinkless.tdlib.Client
import org.drinkless.tdlib.TdApi

internal actual fun TdlNative(): TdlNative {
    return TdlNativeImpl()
}

private class TdlNativeImpl : TdlNative {

    private val client = Client()

    override fun createClientId(): Int {
        return client.createNativeClient()
    }

    override fun send(clientId: Int, requestId: Long, request: TdApi.Function<*>) {
        client.nativeClientSend(clientId, requestId, request)
    }

    override fun receive(
        clientIds: IntArray,
        requestIds: LongArray,
        responses: Array<TdApi.Object?>,
        timeoutInSeconds: Double
    ): Int {
        return client.nativeClientReceive(clientIds, requestIds, responses, timeoutInSeconds)
    }

}
