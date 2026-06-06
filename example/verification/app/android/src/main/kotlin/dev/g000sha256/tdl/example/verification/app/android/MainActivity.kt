package dev.g000sha256.tdl.example.verification.app.android

import android.app.Activity
import android.os.Bundle
import dev.g000sha256.tdl.example.verification.shared.TestTdlClient
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.cancel
import kotlinx.coroutines.launch

internal class MainActivity : Activity() {

    private val coroutineScope = CoroutineScope(context = Dispatchers.Default)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        coroutineScope.launch {
            val testTdlClient = TestTdlClient()
            val result = testTdlClient.run()
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
