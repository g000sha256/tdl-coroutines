package dev.g000sha256.tdl.example.verification.shared

import dev.g000sha256.tdl.TdlClient
import dev.g000sha256.tdl.TdlResult
import dev.g000sha256.tdl.dto.AuthorizationStateClosed
import dev.g000sha256.tdl.dto.AuthorizationStateWaitPhoneNumber
import dev.g000sha256.tdl.dto.OptionValueString
import kotlin.time.Duration.Companion.seconds
import kotlinx.coroutines.CompletableDeferred
import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.NonCancellable
import kotlinx.coroutines.async
import kotlinx.coroutines.cancelAndJoin
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.timeout
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

// Public credentials used by the bundled TDLib tests with Telegram's test DC.
private const val TEST_API_ID = 94575
private const val TEST_API_HASH = "a3406de8d171bb422bb6ddf3bbd800e2"

public class TestTdlClient public constructor(
    private val databaseDirectory: String,
    private val filesDirectory: String,
) {

    @OptIn(FlowPreview::class)
    public suspend fun run(): Boolean {
        println(message = "[TDL]")

        val tdlClient = TdlClient.create()

        var closeIsOk = false

        val checksAreOk = try {
            coroutineScope {
                val startLogging = CompletableDeferred<Unit>()

                val allUpdatesJob = launch(start = CoroutineStart.UNDISPATCHED) {
                    tdlClient
                        .allUpdates
                        .timeout(timeout = 5.seconds)
                        .collect { update ->
                            startLogging.await()

                            println(message = "[TDL][update] $update")
                        }
                }

                val parametersIsOk = tdlClient.setParameters()
                if (!parametersIsOk) {
                    allUpdatesJob.cancelAndJoin()

                    return@coroutineScope false
                }

                println(message = "[TDL]")
                startLogging.complete(value = Unit)
                allUpdatesJob.join()
                println(message = "[TDL]")

                val networkIsOk = tdlClient.checkNetwork()
                if (!networkIsOk) {
                    return@coroutineScope false
                }

                val hashIsOk = tdlClient.checkCommitHash()
                if (!hashIsOk) {
                    return@coroutineScope false
                }

                val versionIsOk = tdlClient.checkVersion()
                if (!versionIsOk) {
                    return@coroutineScope false
                }

                val authorizationStateIsOk = tdlClient.checkAuthorizationState()
                if (!authorizationStateIsOk) {
                    return@coroutineScope false
                }

                return@coroutineScope true
            }
        } finally {
            withContext(context = NonCancellable) {
                closeIsOk = tdlClient.closeAndWait()
            }
        }

        return checksAreOk && closeIsOk
    }

    private suspend fun TdlClient.setParameters(): Boolean {
        val result = setTdlibParameters(
            useTestDc = true,
            databaseDirectory = databaseDirectory,
            filesDirectory = filesDirectory,
            databaseEncryptionKey = byteArrayOf(),
            useFileDatabase = false,
            useChatInfoDatabase = false,
            useMessageDatabase = false,
            useSecretChats = false,
            apiId = TEST_API_ID,
            apiHash = TEST_API_HASH,
            systemLanguageCode = "en",
            deviceModel = "Unknown",
            systemVersion = "Unknown",
            applicationVersion = "Unknown",
        )
        when (result) {
            is TdlResult.Failure -> {
                println(message = "[TDL][setTdlibParameters] Failure: ${result.code}, ${result.message}")
                return false
            }

            is TdlResult.Success -> {
                println(message = "[TDL][setTdlibParameters] Success")
                return true
            }
        }
    }

    private suspend fun TdlClient.checkNetwork(): Boolean {
        val result = testNetwork()
        when (result) {
            is TdlResult.Failure -> {
                println(message = "[TDL][testNetwork] Failure: ${result.code}, ${result.message}")
                return false
            }

            is TdlResult.Success -> {
                println(message = "[TDL][testNetwork] Success")
                return true
            }
        }
    }

    private suspend fun TdlClient.checkAuthorizationState(): Boolean {
        val result = getAuthorizationState()
        when (result) {
            is TdlResult.Failure -> {
                println(message = "[TDL][getAuthorizationState] Failure: ${result.code}, ${result.message}")
                return false
            }

            is TdlResult.Success -> {
                val authorizationState = result.result
                println(message = "[TDL][getAuthorizationState] Success: $authorizationState")
                return authorizationState is AuthorizationStateWaitPhoneNumber
            }
        }
    }

    private suspend fun TdlClient.checkCommitHash(): Boolean {
        val result = getOption(name = "commit_hash")
        when (result) {
            is TdlResult.Failure -> {
                println(message = "[TDL][getCommitHashOption] Failure: ${result.code}, ${result.message}")
                return false
            }

            is TdlResult.Success -> {
                val optionValue = result.result
                when (optionValue) {
                    is OptionValueString -> {
                        val actual = optionValue.value
                        val expected = TdlClient.TDL_GIT_COMMIT_HASH
                        println(message = "[TDL][getCommitHashOption] Success: actual=$actual, expected=$expected")
                        return actual == expected
                    }

                    else -> {
                        println(message = "[TDL][getCommitHashOption] Unexpected type: $optionValue")
                        return false
                    }
                }
            }
        }
    }

    private suspend fun TdlClient.checkVersion(): Boolean {
        val result = getOption(name = "version")
        when (result) {
            is TdlResult.Failure -> {
                println(message = "[TDL][getVersionOption] Failure: ${result.code}, ${result.message}")
                return false
            }

            is TdlResult.Success -> {
                val optionValue = result.result
                when (optionValue) {
                    is OptionValueString -> {
                        val actual = optionValue.value
                        val expected = TdlClient.TDL_VERSION
                        println(message = "[TDL][getVersionOption] Success: actual=$actual, expected=$expected")
                        return actual == expected
                    }

                    else -> {
                        println(message = "[TDL][getVersionOption] Unexpected type: $optionValue")
                        return false
                    }
                }
            }
        }
    }

    private suspend fun TdlClient.closeAndWait(): Boolean {
        return coroutineScope {
            val deferred = async(start = CoroutineStart.UNDISPATCHED) {
                return@async authorizationStateUpdates.first { update -> update.authorizationState is AuthorizationStateClosed }
            }

            val result = close()
            when (result) {
                is TdlResult.Failure -> {
                    deferred.cancel()
                    println(message = "[TDL][close] Failure: ${result.code}, ${result.message}")
                    return@coroutineScope false
                }

                is TdlResult.Success -> {
                    val updateAuthorizationState = deferred.await()
                    println(message = "[TDL][close] Success: ${updateAuthorizationState.authorizationState}")
                    return@coroutineScope true
                }
            }
        }
    }
}
