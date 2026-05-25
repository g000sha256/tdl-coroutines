package dev.g000sha256.tdl.example.verification.app.jvm

import dev.g000sha256.tdl.example.verification.shared.TestTdlClient
import kotlin.system.exitProcess
import kotlinx.coroutines.runBlocking

public fun main() {
    val testTdlClient = TestTdlClient()
    val result = runBlocking { testTdlClient.run() }
    if (result) {
        println(message = "[TDL] Success")
    } else {
        println(message = "[TDL] Failure")
        exitProcess(status = 1)
    }
}
