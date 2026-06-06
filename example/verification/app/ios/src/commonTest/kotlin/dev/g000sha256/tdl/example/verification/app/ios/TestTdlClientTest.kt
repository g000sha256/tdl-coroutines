package dev.g000sha256.tdl.example.verification.app.ios

import dev.g000sha256.tdl.example.verification.shared.TestTdlClient
import kotlin.test.Test
import kotlin.test.assertTrue
import kotlin.time.Duration.Companion.seconds
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

class TestTdlClientTest {

    @Test
    fun run() {
        val testTdlClient = TestTdlClient()
        val result = runBlocking {
            val result = testTdlClient.run()
            delay(duration = 1.seconds) // TODO Wait for closing instead of sleeping
            return@runBlocking result
        }
        assertTrue(actual = result)
    }
}
