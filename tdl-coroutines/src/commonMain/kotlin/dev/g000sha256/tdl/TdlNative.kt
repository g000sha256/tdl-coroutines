package dev.g000sha256.tdl

import org.drinkless.tdlib.TdApi

@Suppress("EXPECT_AND_ACTUAL_IN_THE_SAME_MODULE")
internal expect fun TdlNative(): TdlNative

internal interface TdlNative {

    fun createClientId(): Int

    fun send(clientId: Int, requestId: Long, request: TdApi.Function<*>)

    fun receive(
        clientIds: IntArray,
        requestIds: LongArray,
        responses: Array<TdApi.Object?>,
        timeoutInSeconds: Double
    ): Int

}
