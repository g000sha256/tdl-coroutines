package dev.g000sha256.tdl.example.verification.app.android

import android.app.Activity
import android.os.Bundle
import dev.g000sha256.tdl.example.verification.shared.TestTdlClient
import java.io.File
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.cancel
import kotlinx.coroutines.launch

internal class MainActivity : Activity() {

    private val coroutineScope = CoroutineScope(context = Dispatchers.Default)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        coroutineScope.launch {
            val directory = File(cacheDir, "tdlib-verification")

            val result = try {
                deleteDirectory(directory = directory)

                val databaseDirectory = File(directory, "database")
                val filesDirectory = File(directory, "files")
                val testTdlClient = TestTdlClient(
                    databaseDirectory = databaseDirectory.absolutePath,
                    filesDirectory = filesDirectory.absolutePath,
                )

                try {
                    testTdlClient.run()
                } finally {
                    deleteDirectory(directory = directory)
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
        }
    }

    override fun onDestroy() {
        coroutineScope.cancel()

        super.onDestroy()
    }
}

private fun deleteDirectory(directory: File) {
    val isDeleted = directory.deleteRecursively()
    if (!isDeleted) {
        error(message = "Failed to delete directory: $directory")
    }
}
