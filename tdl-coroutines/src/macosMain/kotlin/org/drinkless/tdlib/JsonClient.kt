package org.drinkless.tdlib

import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.toKString

@OptIn(ExperimentalForeignApi::class)
@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
internal actual class JsonClient {

    actual fun createClientId(): Int {
        return td_create_client_id()
    }

    actual fun send(clientId: Int, request: String) {
        td_send(clientId, request)
    }

    actual fun receive(timeoutInSeconds: Double): String? {
        val result = td_receive(timeoutInSeconds)
        return result?.toKString()
    }

    actual fun execute(request: String): String? {
        val result = td_execute(request)
        return result?.toKString()
    }

}
