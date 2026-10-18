package dev.g000sha256.tdl.example.verification.app.jvm

import dev.g000sha256.tdl.example.verification.shared.TestTdlClient
import java.io.File
import kotlin.system.exitProcess
import kotlinx.coroutines.runBlocking

public fun main() {
    val temporaryDirectory = System.getProperty("java.io.tmpdir")
    val directory = File(temporaryDirectory, "tdlib-verification")

    val result = try {
        deleteDirectory(directory = directory)

        val databaseDirectory = File(directory, "database")
        val filesDirectory = File(directory, "files")
        val testTdlClient = TestTdlClient(
            databaseDirectory = databaseDirectory.absolutePath,
            filesDirectory = filesDirectory.absolutePath,
        )

        try {
            runBlocking { testTdlClient.run() }
        } finally {
            deleteDirectory(directory = directory)
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

private fun deleteDirectory(directory: File) {
    val isDeleted = directory.deleteRecursively()
    if (!isDeleted) {
        error(message = "Failed to delete directory: $directory")
    }
}
