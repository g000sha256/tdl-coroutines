package org.drinkless.tdlib

import dev.g000sha256.tdl.loadSystemLibrary

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
internal actual class JsonClient {

    init {
        loadSystemLibrary()
    }

    actual external fun createClientId(): Int

    actual external fun send(clientId: Int, request: String)

    actual external fun receive(timeoutInSeconds: Double): String?

    actual external fun execute(request: String): String?

    external fun setLogMessageHandler(maxVerbosityLevel: Int, logMessageHandler: LogMessageHandler?)

    fun interface LogMessageHandler {

        fun onLogMessage(verbosityLevel: Int, message: String)

    }

}
