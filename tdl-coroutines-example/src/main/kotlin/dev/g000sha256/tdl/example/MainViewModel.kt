package dev.g000sha256.tdl.example

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dev.g000sha256.tdl.TdlClient
import dev.g000sha256.tdl.TdlResult
import dev.g000sha256.tdl.dto.AuthorizationStateDto
import dev.g000sha256.tdl.dto.OptionValueDto
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.filterNotNull
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch

internal class MainViewModel : ViewModel() {

    private val filesDirectory = MainApplication.filesDirectory
    private val textsMutableStateFlow = MutableStateFlow<String?>(value = null)
    private val titlesMutableStateFlow = MutableStateFlow(value = "")
    private val tdlClient = TdlClient.create()

    val titles: StateFlow<String> = titlesMutableStateFlow.asStateFlow()

    init {
        subscribeToAuthorizationStateUpdates(coroutineScope = viewModelScope)

        viewModelScope.launch {
            getVersionOption()
            getGitCommitHashOption()
        }
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
                    is OptionValueDto.String -> {
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
                    is OptionValueDto.String -> {
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
                    is AuthorizationStateDto.WaitTdlibParameters -> {
                        textsMutableStateFlow.value = null
                        titlesMutableStateFlow.value = "WaitTdlibParameters"

                        setTdlibParameters()
                    }
                    is AuthorizationStateDto.WaitPhoneNumber -> {
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
                    is AuthorizationStateDto.WaitCode -> {
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
                    is AuthorizationStateDto.WaitPassword -> {
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
                    is AuthorizationStateDto.Ready -> {
                        textsMutableStateFlow.value = null
                        titlesMutableStateFlow.value = "Ready"
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
            databaseDirectory = "$filesDirectory/tdl/database",
            filesDirectory = "$filesDirectory/tdl/files",
            databaseEncryptionKey = byteArrayOf(),
            useFileDatabase = false,
            useChatInfoDatabase = false,
            useMessageDatabase = false,
            useSecretChats = false,
            apiId = 33939,
            apiHash = "2b518d75ed3e43865abcacedee563631",
            systemLanguageCode = "en",
            deviceModel = "Emulator (Google Pixel 9)",
            systemVersion = "Android 15 (API 35)",
            applicationVersion = "1.0",
        )
        when (result) {
            is TdlResult.Failure -> logError(message = "[setTdlibParameters] Failure")
            is TdlResult.Success -> logDebug(message = "[setTdlibParameters] Success")
        }
    }

    private suspend fun setAuthenticationPhoneNumber(phoneNumber: String): Boolean {
        logDebug(message = "[setAuthenticationPhoneNumber] phoneNumber=$phoneNumber")
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
        logDebug(message = "[checkAuthenticationCode] code=$code")
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
        logDebug(message = "[checkAuthenticationPassword] password=$password")
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
