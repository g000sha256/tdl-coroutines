package dev.g000sha256.tdl.example.verification.app.windows

import dev.g000sha256.tdl.example.verification.shared.TestTdlClient
import kotlin.system.exitProcess
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.toKString
import kotlinx.coroutines.runBlocking
import platform.posix.getenv
import platform.posix.system

public fun main() {
    val temporaryDirectory = getTemporaryDirectory()
    val directory = "$temporaryDirectory\\tdlib-verification"

    val result = try {
        deleteDirectory(path = directory)

        val testTdlClient = TestTdlClient(
            databaseDirectory = "$directory\\database",
            filesDirectory = "$directory\\files",
        )

        try {
            runBlocking { testTdlClient.run() }
        } finally {
            deleteDirectory(path = directory)
        }
    } catch (throwable: Throwable) {
        println()
        println(message = "[TDL] $throwable")
        false
    }

    if (result) {
        println(message = "[TDL] Success")
        exitProcess(status = 0)
    } else {
        println(message = "[TDL] Failure")
        exitProcess(status = 1)
    }
}

@OptIn(ExperimentalForeignApi::class)
private fun getTemporaryDirectory(): String {
    val temporaryDirectory = getenv(_VarName = "TEMP")
    if (temporaryDirectory == null) {
        error(message = "TEMP environment variable is missing")
    }

    return temporaryDirectory.toKString()
}

private fun deleteDirectory(path: String) {
    val exitCode = system(_Command = "if exist \"$path\" rmdir /s /q \"$path\"")
    if (exitCode != 0) {
        error(message = "Failed to delete directory: $path")
    }
}
