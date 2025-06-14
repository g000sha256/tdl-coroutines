package org.drinkless.tdlib

internal class Client {

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

    companion object {

        init {
            System.loadLibrary("tdjni")
        }

    }

}
