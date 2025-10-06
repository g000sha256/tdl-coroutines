package dev.g000sha256.tdl.example.shared

import dev.g000sha256.tdl.TdlClient
import dev.g000sha256.tdl.TdlResult
import dev.g000sha256.tdl.dto.AuthorizationState
import dev.g000sha256.tdl.dto.AuthorizationStateClosed
import dev.g000sha256.tdl.dto.AuthorizationStateClosing
import dev.g000sha256.tdl.dto.AuthorizationStateLoggingOut
import dev.g000sha256.tdl.dto.AuthorizationStateReady
import dev.g000sha256.tdl.dto.AuthorizationStateWaitCode
import dev.g000sha256.tdl.dto.AuthorizationStateWaitPassword
import dev.g000sha256.tdl.dto.AuthorizationStateWaitPhoneNumber
import dev.g000sha256.tdl.dto.AuthorizationStateWaitTdlibParameters
import dev.g000sha256.tdl.dto.OptionValueString
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.filterNotNull
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import tdl_coroutines.example.shared.BuildConfig

public class ViewModel public constructor() {

    private val coroutineScope = CoroutineScope(context = Dispatchers.Main.immediate)
    private val textsMutableStateFlow = MutableStateFlow<String?>(value = null)
    private val viewStatesMutableViewStateFlow = MutableStateFlow<ViewState>(value = ViewState.Loading)
    private val tdlClient = TdlClient.create()

    public val viewStates: StateFlow<ViewState> = viewStatesMutableViewStateFlow

    private val String.secured: String
        get() = """."""
            .toRegex()
            .replace(input = this) { "*" }

    init {
        coroutineScope.launch {
            tdlClient
                .allUpdates
                .collect { logDebug("[allUpdates] $it") }
        }

        coroutineScope.launch {
            tdlClient
                .authorizationStateUpdates
                .collect { onUpdateAuthorizationState(authorizationState = it.authorizationState) }
        }

        coroutineScope.launch {
            getVersionOption()
            getGitCommitHashOption()
        }
    }

    public fun sendText(text: String) {
        textsMutableStateFlow.value = text
    }

    private suspend fun onUpdateAuthorizationState(authorizationState: AuthorizationState) {
        logDebug(message = "[onUpdateAuthorizationState] authorizationState=$authorizationState")
        when (authorizationState) {
            is AuthorizationStateWaitTdlibParameters -> {
                textsMutableStateFlow.value = null
                viewStatesMutableViewStateFlow.update { ViewState.Loading }

                setTdlibParameters()
            }
            is AuthorizationStateWaitPhoneNumber -> {
                textsMutableStateFlow.value = null
                viewStatesMutableViewStateFlow.update {
                    return@update ViewState.Content(
                        status = "WaitPhoneNumber",
                        showInput = true,
                        showButton = true,
                        error = null,
                    )
                }

                while (true) {
                    val text = textsMutableStateFlow
                        .filterNotNull()
                        .first()
                    textsMutableStateFlow.value = null
                    val success = setAuthenticationPhoneNumber(phoneNumber = text)
                    if (success) {
                        break
                    }
                }
            }
            is AuthorizationStateWaitCode -> {
                textsMutableStateFlow.value = null
                viewStatesMutableViewStateFlow.update {
                    return@update ViewState.Content(
                        status = "WaitCode",
                        showInput = true,
                        showButton = true,
                        error = null,
                    )
                }

                while (true) {
                    val text = textsMutableStateFlow
                        .filterNotNull()
                        .first()
                    textsMutableStateFlow.value = null
                    val success = checkAuthenticationCode(code = text)
                    if (success) {
                        break
                    }
                }
            }
            is AuthorizationStateWaitPassword -> {
                textsMutableStateFlow.value = null
                viewStatesMutableViewStateFlow.update {
                    return@update ViewState.Content(
                        status = "WaitPassword",
                        showInput = true,
                        showButton = true,
                        error = null,
                    )
                }

                while (true) {
                    val text = textsMutableStateFlow
                        .filterNotNull()
                        .first()
                    textsMutableStateFlow.value = null
                    val success = checkAuthenticationPassword(password = text)
                    if (success) {
                        break
                    }
                }
            }
            is AuthorizationStateReady -> {
                textsMutableStateFlow.value = null
                viewStatesMutableViewStateFlow.update {
                    return@update ViewState.Content(
                        status = "Ready",
                        showInput = false,
                        showButton = false,
                        error = null,
                    )
                }
            }
            is AuthorizationStateLoggingOut -> {
                textsMutableStateFlow.value = null
                viewStatesMutableViewStateFlow.update {
                    return@update ViewState.Content(
                        status = "LoggingOut",
                        showInput = false,
                        showButton = false,
                        error = null,
                    )
                }
            }
            is AuthorizationStateClosing -> {
                textsMutableStateFlow.value = null
                viewStatesMutableViewStateFlow.update {
                    return@update ViewState.Content(
                        status = "Closing",
                        showInput = false,
                        showButton = false,
                        error = null,
                    )
                }
            }
            is AuthorizationStateClosed -> {
                textsMutableStateFlow.value = null
                viewStatesMutableViewStateFlow.update {
                    return@update ViewState.Content(
                        status = "Closed",
                        showInput = false,
                        showButton = false,
                        error = null,
                    )
                }
            }
            else -> Unit // TODO
        }
    }

    private suspend fun setTdlibParameters() {
        val methodName = "[setTdlibParameters]"
        logDebug(message = methodName)
        val result = tdlClient.setTdlibParameters(
            useTestDc = false,
            databaseDirectory = "tdl-data/tdl/database",
            filesDirectory = "tdl-data/tdl/files",
            databaseEncryptionKey = byteArrayOf(),
            useFileDatabase = false,
            useChatInfoDatabase = false,
            useMessageDatabase = false,
            useSecretChats = false,
            apiId = BuildConfig.API_ID,
            apiHash = BuildConfig.API_HASH,
            systemLanguageCode = "en",
            deviceModel = "deviceModel",
            systemVersion = "systemVersion",
            applicationVersion = "applicationVersion",
        )
        when (result) {
            is TdlResult.Failure -> {
                val code = result.code
                val message = result.message
                logError(message = "$methodName Failure ($code, $message)")
            }
            is TdlResult.Success -> logDebug(message = "$methodName Success")
        }
    }

    private suspend fun setAuthenticationPhoneNumber(phoneNumber: String): Boolean {
        val methodName = "[setAuthenticationPhoneNumber]"
        logDebug(message = "$methodName phoneNumber=$phoneNumber")
        val result = tdlClient.setAuthenticationPhoneNumber(phoneNumber = phoneNumber)
        when (result) {
            is TdlResult.Failure -> {
                val code = result.code
                val message = result.message
                logError(message = "$methodName Failure ($code, $message)")
                return false
            }
            is TdlResult.Success -> {
                logDebug(message = "$methodName Success")
                return true
            }
        }
    }

    private suspend fun checkAuthenticationCode(code: String): Boolean {
        val methodName = "[checkAuthenticationCode]"
        logDebug(message = "$methodName code=${code.secured}")
        val result = tdlClient.checkAuthenticationCode(code = code)
        when (result) {
            is TdlResult.Failure -> {
                val code = result.code
                val message = result.message
                logError(message = "$methodName Failure ($code, $message)")
                return false
            }
            is TdlResult.Success -> {
                logDebug(message = "$methodName Success")
                return true
            }
        }
    }

    private suspend fun checkAuthenticationPassword(password: String): Boolean {
        val methodName = "[checkAuthenticationPassword]"
        logDebug(message = "$methodName password=${password.secured}")
        val result = tdlClient.checkAuthenticationPassword(password = password)
        when (result) {
            is TdlResult.Failure -> {
                val code = result.code
                val message = result.message
                logError(message = "$methodName Failure ($code, $message)")
                return false
            }
            is TdlResult.Success -> {
                logDebug(message = "$methodName Success")
                return true
            }
        }
    }

    private suspend fun getVersionOption() {
        val methodName = "[getVersionOption]"
        logDebug(message = methodName)
        val result = tdlClient.getOption(name = "version")
        when (result) {
            is TdlResult.Failure -> {
                val code = result.code
                val message = result.message
                logError(message = "$methodName Failure ($code, $message)")
            }
            is TdlResult.Success -> {
                val optionValue = result.result
                when (optionValue) {
                    is OptionValueString -> {
                        val value = optionValue.value
                        logDebug(message = "$methodName value=$value")
                        if (value != TdlClient.TDL_VERSION) {
                            error(message = "Wrong version")
                        }
                    }
                    else -> logError(message = "$methodName Wrong option value type")
                }
            }
        }
    }

    private suspend fun getGitCommitHashOption() {
        val methodName = "[getGitCommitHashOption]"
        logDebug(message = methodName)
        val result = tdlClient.getOption(name = "commit_hash")
        when (result) {
            is TdlResult.Failure -> {
                val code = result.code
                val message = result.message
                logError(message = "$methodName Failure ($code, $message)")
            }
            is TdlResult.Success -> {
                val optionValue = result.result
                when (optionValue) {
                    is OptionValueString -> {
                        val value = optionValue.value
                        logDebug(message = "$methodName value=$value")
                        if (value != TdlClient.TDL_GIT_COMMIT_HASH) {
                            error(message = "Wrong git commit hash")
                        }
                    }
                    else -> logError(message = "$methodName Wrong option value type")
                }
            }
        }
    }

    private fun logDebug(message: String) {
        // TODO
        println("[DEBUG] $message")
    }

    private fun logError(message: String) {
        // TODO
        println("[ERROR] $message")
    }

}
