package org.drinkless.tdlib

import dev.g000sha256.tdl.loadSystemLibrary

internal class Client {

    init {
        loadSystemLibrary()
    }

    external fun createNativeClient(): Int

    external fun nativeClientSend(clientId: Int, requestId: Long, request: TdApi.Function<*>)

    external fun nativeClientReceive(
        clientIds: IntArray,
        requestIds: LongArray,
        responses: Array<TdApi.Object?>,
        timeoutInSeconds: Double,
    ): Int

    external fun nativeClientExecute(request: TdApi.Function<*>): TdApi.Object

    external fun nativeClientSetLogMessageHandler(maxVerbosityLevel: Int, logMessageHandler: LogMessageHandler?)

    fun interface LogMessageHandler {

        fun onLogMessage(verbosityLevel: Int, message: String)

    }

}
