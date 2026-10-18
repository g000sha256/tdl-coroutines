package dev.g000sha256.tdl.example.verification.app.ios

import dev.g000sha256.tdl.example.verification.shared.TestTdlClient
import kotlin.test.Test
import kotlin.test.assertTrue
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.coroutines.runBlocking
import platform.Foundation.NSFileManager
import platform.Foundation.NSTemporaryDirectory

class TestTdlClientTest {

    @Test
    fun run() {
        val fileManager = NSFileManager.defaultManager
        val directory = NSTemporaryDirectory() + "tdlib-verification"

        val result = try {
            deleteDirectory(fileManager = fileManager, path = directory)

            val testTdlClient = TestTdlClient(
                databaseDirectory = "$directory/database",
                filesDirectory = "$directory/files",
            )

            try {
                runBlocking { testTdlClient.run() }
            } finally {
                deleteDirectory(fileManager = fileManager, path = directory)
            }
        } catch (throwable: Throwable) {
            println()
            println(message = "[TDL] $throwable")
            false
        }

        if (result) {
            println(message = "[TDL] Success")
        } else {
            println(message = "[TDL] Failure")
        }

        assertTrue(actual = result)
    }
}

@OptIn(ExperimentalForeignApi::class)
private fun deleteDirectory(fileManager: NSFileManager, path: String) {
    val exists = fileManager.fileExistsAtPath(path = path)
    if (!exists) {
        return
    }

    val isDeleted = fileManager.removeItemAtPath(path = path, error = null)
    if (!isDeleted) {
        error(message = "Failed to delete directory: $path")
    }
}
