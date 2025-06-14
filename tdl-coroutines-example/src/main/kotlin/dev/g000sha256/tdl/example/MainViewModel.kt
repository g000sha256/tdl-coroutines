package dev.g000sha256.tdl.example

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
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
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.NonCancellable
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.filterNotNull
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch

private const val API_ID = BuildConfig.API_ID
private const val API_HASH = BuildConfig.API_HASH
private const val VERSION_NAME = BuildConfig.VERSION_NAME

private val FILES_DIRECTORY = MainApplication.filesDirectory

internal class MainViewModel : ViewModel() {

    private val textsMutableStateFlow = MutableStateFlow<String?>(value = null)
    private val titlesMutableStateFlow = MutableStateFlow(value = "")
    private val tdlClient = TdlClient.create()

    val titles: StateFlow<String> = titlesMutableStateFlow.asStateFlow()

    private val String.secured: String
        get() = """."""
            .toRegex()
            .replace(input = this) { "*" }

    init {
        subscribeToAuthorizationStateUpdates(coroutineScope = viewModelScope)

        viewModelScope.launch {
            getVersionOption()
            getGitCommitHashOption()
        }
    }

    public override fun onCleared() {
        viewModelScope.launch(context = NonCancellable) { tdlClient.close() }
        super.onCleared()
    }

    fun sendText(text: String) {
        textsMutableStateFlow.value = text
    }

    private suspend fun getVersionOption() {
        logDebug(message = "[getVersionOption]")
        val result = tdlClient.getOption(name = "version")
        when (result) {
            is TdlResult.Failure -> logError(message = "[getVersionOption] Failed to get version")
            is TdlResult.Success -> {
                val optionValue = result.result
                when (optionValue) {
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
            is TdlResult.Failure -> logError(message = "[getGitCommitHashOption] Failed to get git commit hash")
            is TdlResult.Success -> {
                val optionValue = result.result
                when (optionValue) {
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

    private fun subscribeToAuthorizationStateUpdates(coroutineScope: CoroutineScope) {
        logDebug(message = "[subscribeToAuthorizationStateUpdates]")
        tdlClient
            .authorizationStateUpdates
            .onEach { dto ->
                logDebug(message = "[subscribeToAuthorizationStateUpdates] $dto")
                when (dto.authorizationState) {
                    is AuthorizationStateWaitTdlibParameters -> {
                        textsMutableStateFlow.value = null
                        titlesMutableStateFlow.value = "WaitTdlibParameters"

                        setTdlibParameters()
                    }
                    is AuthorizationStateWaitPhoneNumber -> {
                        textsMutableStateFlow.value = null
                        titlesMutableStateFlow.value = "WaitPhoneNumber"

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
                        titlesMutableStateFlow.value = "WaitCode"

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
                        titlesMutableStateFlow.value = "WaitPassword"

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
                        titlesMutableStateFlow.value = "Ready"
                    }
                    is AuthorizationStateLoggingOut -> {
                        textsMutableStateFlow.value = null
                        titlesMutableStateFlow.value = "LoggingOut"
                    }
                    is AuthorizationStateClosing -> {
                        textsMutableStateFlow.value = null
                        titlesMutableStateFlow.value = "Closing"
                    }
                    is AuthorizationStateClosed -> {
                        textsMutableStateFlow.value = null
                        titlesMutableStateFlow.value = "Closed"
                    }
                    else -> Unit
                }
            }
            .launchIn(coroutineScope)
    }

    private suspend fun setTdlibParameters() {
        logDebug(message = "[setTdlibParameters]")
        val result = tdlClient.setTdlibParameters(
            useTestDc = false,
            databaseDirectory = "$FILES_DIRECTORY/tdl/database",
            filesDirectory = "$FILES_DIRECTORY/tdl/files",
            databaseEncryptionKey = byteArrayOf(),
            useFileDatabase = false,
            useChatInfoDatabase = false,
            useMessageDatabase = false,
            useSecretChats = false,
            apiId = API_ID,
            apiHash = API_HASH,
            systemLanguageCode = "en",
            deviceModel = "Emulator",
            systemVersion = "Android",
            applicationVersion = VERSION_NAME,
        )
        when (result) {
            is TdlResult.Failure -> logError(message = "[setTdlibParameters] Failure")
            is TdlResult.Success -> logDebug(message = "[setTdlibParameters] Success")
        }
    }

    private suspend fun setAuthenticationPhoneNumber(phoneNumber: String): Boolean {
        logDebug(message = "[setAuthenticationPhoneNumber] phoneNumber=${phoneNumber.secured}")
        val result = tdlClient.setAuthenticationPhoneNumber(phoneNumber = phoneNumber, settings = null)
        when (result) {
            is TdlResult.Failure -> {
                logError(message = "[setAuthenticationPhoneNumber] Failure")
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
                logError(message = "[checkAuthenticationCode] Failure")
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
                logError(message = "[checkAuthenticationPassword] Failure")
                return false
            }
            is TdlResult.Success -> {
                logDebug(message = "[checkAuthenticationPassword] Success")
                return true
            }
        }
    }

    private fun logDebug(message: String) {
        val thread = Thread.currentThread()
        val tag = "[TDL][${thread.name}]"
        Log.d(tag, message)
    }

    private fun logError(message: String) {
        val thread = Thread.currentThread()
        val tag = "[TDL][${thread.name}]"
        Log.e(tag, message)
    }

}
