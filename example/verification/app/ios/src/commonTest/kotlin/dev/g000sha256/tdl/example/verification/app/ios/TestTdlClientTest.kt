package dev.g000sha256.tdl.example.verification.app.ios

import dev.g000sha256.tdl.example.verification.shared.TestTdlClient
import kotlin.test.Test
import kotlin.test.assertTrue
import kotlinx.coroutines.runBlocking

class TestTdlClientTest {

    @Test
    fun run() {
        val testTdlClient = TestTdlClient()
        val result = runBlocking { testTdlClient.run() }
        assertTrue(actual = result)
    }
}
