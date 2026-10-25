package dev.g000sha256.tdl.example.verification.app.linux

import dev.g000sha256.tdl.example.verification.shared.TestTdlClient
import kotlin.system.exitProcess
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.cstr
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.toKString
import kotlinx.coroutines.runBlocking
import platform.posix.getenv
import platform.posix.mkdtemp
import platform.posix.system

public fun main() {
    val result = try {
        val directory = createTemporaryDirectory()

        try {
            val testTdlClient = TestTdlClient(
                databaseDirectory = "$directory/database",
                filesDirectory = "$directory/files",
            )

            runBlocking { testTdlClient.run() }
        } finally {
            deleteDirectory(path = directory)
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
private fun createTemporaryDirectory(): String {
    return memScoped {
        val temporaryDirectory = getenv("TMPDIR")?.toKString() ?: "/tmp"
        val template = "$temporaryDirectory/tdlib-verification-XXXXXX".cstr.getPointer(this)
        val directory = mkdtemp(template)
        if (directory == null) {
            error(message = "Failed to create temporary directory")
        }

        directory.toKString()
    }
}

private fun deleteDirectory(path: String) {
    val escapedPath = path.replace(oldValue = "'", newValue = "'\\''")
    val exitCode = system("rm -rf -- '$escapedPath'")
    if (exitCode != 0) {
        error(message = "Failed to delete directory: $path")
    }
}
