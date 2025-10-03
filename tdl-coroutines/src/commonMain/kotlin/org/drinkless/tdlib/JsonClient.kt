package org.drinkless.tdlib

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
internal expect class JsonClient() {

    fun createClientId(): Int

    fun send(clientId: Int, request: String)

    fun receive(timeoutInSeconds: Double): String?

    fun execute(request: String): String?

}
