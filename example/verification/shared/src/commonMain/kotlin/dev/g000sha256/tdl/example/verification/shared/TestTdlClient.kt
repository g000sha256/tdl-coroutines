package dev.g000sha256.tdl.example.verification.shared

import dev.g000sha256.tdl.TdlClient
import dev.g000sha256.tdl.TdlResult
import dev.g000sha256.tdl.dto.AuthorizationStateWaitTdlibParameters
import dev.g000sha256.tdl.dto.OptionValueString

public class TestTdlClient {

    public suspend fun run(): Boolean {
        val tdlClient = TdlClient.create()

        val hashIsOk = tdlClient.checkCommitHash()
        val versionIsOk = tdlClient.checkVersion()
        val authorizationStateIsOk = tdlClient.checkAuthorizationState()

        tdlClient.close()

        return hashIsOk && versionIsOk && authorizationStateIsOk
    }

    private suspend fun TdlClient.checkAuthorizationState(): Boolean {
        val result = getAuthorizationState()
        when (result) {
            is TdlResult.Failure -> {
                println(message = "[TDL][checkAuthorizationState] failure: ${result.code}, ${result.message}")
                return false
            }

            is TdlResult.Success -> {
                val authorizationState = result.result
                println(message = "[TDL][checkAuthorizationState] success: $authorizationState")
                return authorizationState is AuthorizationStateWaitTdlibParameters
            }
        }
    }

    private suspend fun TdlClient.checkCommitHash(): Boolean {
        val result = getOption(name = "commit_hash")
        when (result) {
            is TdlResult.Failure -> {
                println(message = "[TDL][checkCommitHash] failure: ${result.code}, ${result.message}")
                return false
            }

            is TdlResult.Success -> {
                val optionValue = result.result
                when (optionValue) {
                    is OptionValueString -> {
                        val actual = optionValue.value
                        val expected = TdlClient.TDL_GIT_COMMIT_HASH
                        println(message = "[TDL][checkCommitHash] success: actual=$actual, expected=$expected")
                        return actual == expected
                    }

                    else -> {
                        println(message = "[TDL][checkCommitHash] unexpected type: $optionValue")
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
                println(message = "[TDL][checkVersion] failure: ${result.code}, ${result.message}")
                return false
            }

            is TdlResult.Success -> {
                val optionValue = result.result
                when (optionValue) {
                    is OptionValueString -> {
                        val actual = optionValue.value
                        val expected = TdlClient.TDL_VERSION
                        println(message = "[TDL][checkVersion] success: actual=$actual, expected=$expected")
                        return actual == expected
                    }

                    else -> {
                        println(message = "[TDL][checkVersion] unexpected type: $optionValue")
                        return false
                    }
                }
            }
        }
    }
}
