package dev.g000sha256.tdl.example.verification.app.macos

import dev.g000sha256.tdl.example.verification.shared.TestTdlClient
import kotlin.system.exitProcess
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.coroutines.runBlocking
import platform.Foundation.NSFileManager
import platform.Foundation.NSTemporaryDirectory

public fun main() {
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
        println(message = "[TDL]")
        println(message = "[TDL] Error: $throwable")

        false
    }

    println(message = "[TDL]")
    if (result) {
        println(message = "[TDL] Success")
        exitProcess(status = 0)
    } else {
        println(message = "[TDL] Failure")
        exitProcess(status = 1)
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
