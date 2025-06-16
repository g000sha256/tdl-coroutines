package dev.g000sha256.tdl.example

import dev.g000sha256.tdl.TdlClient
import dev.g000sha256.tdl.TdlResult
import dev.g000sha256.tdl.dto.AuthorizationStateClosed
import dev.g000sha256.tdl.dto.AuthorizationStateClosing
import dev.g000sha256.tdl.dto.AuthorizationStateLoggingOut
import dev.g000sha256.tdl.dto.AuthorizationStateReady
import dev.g000sha256.tdl.dto.AuthorizationStateWaitCode
import dev.g000sha256.tdl.dto.AuthorizationStateWaitPassword
import dev.g000sha256.tdl.dto.AuthorizationStateWaitPhoneNumber
import dev.g000sha256.tdl.dto.AuthorizationStateWaitTdlibParameters
import dev.g000sha256.tdl.dto.OptionValueString
import dev.g000sha256.tdl.dto.UpdateAuthorizationState
import java.io.File
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import tdl_coroutines.tdl_coroutines_example_jvm.BuildConfig

private const val API_ID = BuildConfig.API_ID
private const val API_HASH = BuildConfig.API_HASH

private val FILES_DIRECTORY = File("tdl-data")

private val tdlClient = TdlClient.create()

private val String.secured: String
    get() = """."""
        .toRegex()
        .replace(input = this) { "*" }

internal fun main() {
    FILES_DIRECTORY.mkdirs()

    runBlocking {
        tdlClient
            .allUpdates
            .onEach { update -> logDebug(message = "[Update][allUpdates] $update") }
            .launchIn(scope = this)

        tdlClient
            .authorizationStateUpdates
            .onEach { update -> onUpdateAuthorizationState(update = update) }
            .launchIn(scope = this)

        launch {
            getVersionOption()
            getGitCommitHashOption()
        }
    }
}

private suspend fun getVersionOption() {
    logDebug(message = "[getVersionOption]")
    val result = tdlClient.getOption(name = "version")
    when (result) {
        is TdlResult.Failure -> {
            logError(message = "[getVersionOption] Failed to get version (${result.code}, ${result.message})")
        }
        is TdlResult.Success -> {
            when (val optionValue = result.result) {
                is OptionValueString -> {
                    logDebug(message = "[getVersionOption] version=${optionValue.value}")
                    if (optionValue.value != TdlClient.TDL_VERSION) {
                        error(message = "Wrong version")
                    }
                }
                else -> logError(message = "[getVersionOption] Wrong option type")
            }
        }
    }
}

private suspend fun getGitCommitHashOption() {
    logDebug(message = "[getGitCommitHashOption]")
    val result = tdlClient.getOption(name = "commit_hash")
    when (result) {
        is TdlResult.Failure -> {
            logError(message = "[getGitCommitHashOption] Failed to get git commit hash (${result.code}, ${result.message})")
        }
        is TdlResult.Success -> {
            when (val optionValue = result.result) {
                is OptionValueString -> {
                    logDebug(message = "[getGitCommitHashOption] git_commit_hash=${optionValue.value}")
                    if (optionValue.value != TdlClient.TDL_GIT_COMMIT_HASH) {
                        error(message = "Wrong git commit hash")
                    }
                }
                else -> logError(message = "[getGitCommitHashOption] Wrong option type")
            }
        }
    }
}

private suspend fun onUpdateAuthorizationState(update: UpdateAuthorizationState) {
    logDebug(message = "[Update][authorizationStateUpdates] $update")
    when (update.authorizationState) {
        is AuthorizationStateWaitTdlibParameters -> {
            showText(text = "WaitTdlibParameters")

            setTdlibParameters()
        }
        is AuthorizationStateWaitPhoneNumber -> {
            showText(text = "WaitPhoneNumber")

            while (true) {
                val text = awaitInput()
                val success = setAuthenticationPhoneNumber(phoneNumber = text)
                if (success) {
                    break
                }
            }
        }
        is AuthorizationStateWaitCode -> {
            showText(text = "WaitCode")

            while (true) {
                val text = awaitInput()
                val success = checkAuthenticationCode(code = text)
                if (success) {
                    break
                }
            }
        }
        is AuthorizationStateWaitPassword -> {
            showText(text = "WaitPassword")

            while (true) {
                val text = awaitInput()
                val success = checkAuthenticationPassword(password = text)
                if (success) {
                    break
                }
            }
        }
        is AuthorizationStateReady -> {
            showText(text = "Ready")
        }
        is AuthorizationStateLoggingOut -> {
            showText(text = "LoggingOut")
        }
        is AuthorizationStateClosing -> {
            showText(text = "Closing")
        }
        is AuthorizationStateClosed -> {
            showText(text = "Closed")
        }
        else -> Unit
    }
}

private suspend fun setTdlibParameters() {
    logDebug(message = "[setTdlibParameters]")
    val result = tdlClient.setTdlibParameters(
        useTestDc = false,
        databaseDirectory = "$FILES_DIRECTORY/database",
        filesDirectory = "$FILES_DIRECTORY/files",
        databaseEncryptionKey = byteArrayOf(),
        useFileDatabase = false,
        useChatInfoDatabase = false,
        useMessageDatabase = false,
        useSecretChats = false,
        apiId = API_ID,
        apiHash = API_HASH,
        systemLanguageCode = "en",
        deviceModel = "Unknown",
        systemVersion = "JVM",
        applicationVersion = "Unknown",
    )
    when (result) {
        is TdlResult.Failure -> {
            logError(message = "[setTdlibParameters] Failure (${result.code}, ${result.message})")
        }
        is TdlResult.Success -> {
            logDebug(message = "[setTdlibParameters] Success")
        }
    }
}

private suspend fun setAuthenticationPhoneNumber(phoneNumber: String): Boolean {
    logDebug(message = "[setAuthenticationPhoneNumber] phoneNumber=${phoneNumber.secured}")
    val result = tdlClient.setAuthenticationPhoneNumber(phoneNumber = phoneNumber, settings = null)
    when (result) {
        is TdlResult.Failure -> {
            logError(message = "[setAuthenticationPhoneNumber] Failure (${result.code}, ${result.message})")
            return false
        }
        is TdlResult.Success -> {
            logDebug(message = "[setAuthenticationPhoneNumber] Success")
            return true
        }
    }
}

private suspend fun checkAuthenticationCode(code: String): Boolean {
    logDebug(message = "[checkAuthenticationCode] code=${code.secured}")
    val result = tdlClient.checkAuthenticationCode(code)
    when (result) {
        is TdlResult.Failure -> {
            logError(message = "[checkAuthenticationCode] Failure (${result.code}, ${result.message})")
            return false
        }
        is TdlResult.Success -> {
            logDebug(message = "[checkAuthenticationCode] Success")
            return true
        }
    }
}

private suspend fun checkAuthenticationPassword(password: String): Boolean {
    logDebug(message = "[checkAuthenticationPassword] password=${password.secured}")
    val result = tdlClient.checkAuthenticationPassword(password)
    when (result) {
        is TdlResult.Failure -> {
            logError(message = "[checkAuthenticationPassword] Failure (${result.code}, ${result.message})")
            return false
        }
        is TdlResult.Success -> {
            logDebug(message = "[checkAuthenticationPassword] Success")
            return true
        }
    }
}

private fun showText(text: String) {
    println(text)
}

private fun awaitInput(): String {
    return readlnOrNull() ?: awaitInput()
}

private fun logDebug(message: String) {
    val thread = Thread.currentThread()
    val tag = "[TDL][${thread.name}]"
    println("$tag $message")
}

private fun logError(message: String) {
    val thread = Thread.currentThread()
    val tag = "[TDL][${thread.name}]"
    println("$tag $message")
}
