/*
 * Copyright 2025 Georgii Ippolitov (g000sha256)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dev.g000sha256.tdl.dto

import kotlin.Any
import kotlin.Array
import kotlin.Boolean
import kotlin.ByteArray
import kotlin.Int
import kotlin.String

/**
 * This class is an abstract base class.
 * Describes the current call state.
 */
public sealed class CallStateDto private constructor() {
    /**
     * The call is pending, waiting to be accepted by a user.
     *
     * @property isCreated True, if the call has already been created by the server.
     * @property isReceived True, if the call has already been received by the other party.
     */
    public class Pending public constructor(
        public val isCreated: Boolean,
        public val isReceived: Boolean,
    ) : CallStateDto() {
        override fun equals(other: Any?): Boolean {
            if (other === this) {
                return true
            }
            if (other == null) {
                return false
            }
            if (other::class != this::class) {
                return false
            }
            other as Pending
            if (other.isCreated != isCreated) {
                return false
            }
            return other.isReceived == isReceived
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + isCreated.hashCode()
            hashCode = 31 * hashCode + isReceived.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("CallStateDto.Pending")
                append("(")
                append("isCreated=")
                append(isCreated)
                append(", ")
                append("isReceived=")
                append(isReceived)
                append(")")
            }
        }
    }

    /**
     * The call has been answered and encryption keys are being exchanged.
     */
    public class ExchangingKeys public constructor() : CallStateDto() {
        override fun equals(other: Any?): Boolean {
            if (other === this) {
                return true
            }
            if (other == null) {
                return false
            }
            return this::class == other::class
        }

        override fun hashCode(): Int {
            return this::class.hashCode()
        }

        override fun toString(): String {
            return "CallStateDto.ExchangingKeys()"
        }
    }

    /**
     * The call is ready to use.
     *
     * @property protocol Call protocols supported by the other call participant.
     * @property servers List of available call servers.
     * @property config A JSON-encoded call config.
     * @property encryptionKey Call encryption key.
     * @property emojis Encryption key fingerprint represented as 4 emoji.
     * @property allowP2p True, if peer-to-peer connection is allowed by users privacy settings.
     * @property isGroupCallSupported True, if the other party supports upgrading of the call to a group call.
     * @property customParameters Custom JSON-encoded call parameters to be passed to tgcalls.
     */
    public class Ready public constructor(
        public val protocol: CallProtocolDto,
        public val servers: Array<CallServerDto>,
        public val config: String,
        public val encryptionKey: ByteArray,
        public val emojis: Array<String>,
        public val allowP2p: Boolean,
        public val isGroupCallSupported: Boolean,
        public val customParameters: String,
    ) : CallStateDto() {
        override fun equals(other: Any?): Boolean {
            if (other === this) {
                return true
            }
            if (other == null) {
                return false
            }
            if (other::class != this::class) {
                return false
            }
            other as Ready
            if (other.protocol != protocol) {
                return false
            }
            val serversEquals = other.servers.contentDeepEquals(servers)
            if (!serversEquals) {
                return false
            }
            if (other.config != config) {
                return false
            }
            val encryptionKeyEquals = other.encryptionKey.contentEquals(encryptionKey)
            if (!encryptionKeyEquals) {
                return false
            }
            val emojisEquals = other.emojis.contentDeepEquals(emojis)
            if (!emojisEquals) {
                return false
            }
            if (other.allowP2p != allowP2p) {
                return false
            }
            if (other.isGroupCallSupported != isGroupCallSupported) {
                return false
            }
            return other.customParameters == customParameters
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + protocol.hashCode()
            hashCode = 31 * hashCode + servers.contentDeepHashCode()
            hashCode = 31 * hashCode + config.hashCode()
            hashCode = 31 * hashCode + encryptionKey.contentHashCode()
            hashCode = 31 * hashCode + emojis.contentDeepHashCode()
            hashCode = 31 * hashCode + allowP2p.hashCode()
            hashCode = 31 * hashCode + isGroupCallSupported.hashCode()
            hashCode = 31 * hashCode + customParameters.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("CallStateDto.Ready")
                append("(")
                append("protocol=")
                append(protocol)
                append(", ")
                append("servers=")
                servers
                    .contentDeepToString()
                    .also { append(it) }
                append(", ")
                append("config=")
                append(config)
                append(", ")
                append("encryptionKey=")
                encryptionKey
                    .contentToString()
                    .also { append(it) }
                append(", ")
                append("emojis=")
                emojis
                    .contentDeepToString()
                    .also { append(it) }
                append(", ")
                append("allowP2p=")
                append(allowP2p)
                append(", ")
                append("isGroupCallSupported=")
                append(isGroupCallSupported)
                append(", ")
                append("customParameters=")
                append(customParameters)
                append(")")
            }
        }
    }

    /**
     * The call is hanging up after discardCall has been called.
     */
    public class HangingUp public constructor() : CallStateDto() {
        override fun equals(other: Any?): Boolean {
            if (other === this) {
                return true
            }
            if (other == null) {
                return false
            }
            return this::class == other::class
        }

        override fun hashCode(): Int {
            return this::class.hashCode()
        }

        override fun toString(): String {
            return "CallStateDto.HangingUp()"
        }
    }

    /**
     * The call has ended successfully.
     *
     * @property reason The reason why the call has ended.
     * @property needRating True, if the call rating must be sent to the server.
     * @property needDebugInformation True, if the call debug information must be sent to the server.
     * @property needLog True, if the call log must be sent to the server.
     */
    public class Discarded public constructor(
        public val reason: CallDiscardReasonDto,
        public val needRating: Boolean,
        public val needDebugInformation: Boolean,
        public val needLog: Boolean,
    ) : CallStateDto() {
        override fun equals(other: Any?): Boolean {
            if (other === this) {
                return true
            }
            if (other == null) {
                return false
            }
            if (other::class != this::class) {
                return false
            }
            other as Discarded
            if (other.reason != reason) {
                return false
            }
            if (other.needRating != needRating) {
                return false
            }
            if (other.needDebugInformation != needDebugInformation) {
                return false
            }
            return other.needLog == needLog
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + reason.hashCode()
            hashCode = 31 * hashCode + needRating.hashCode()
            hashCode = 31 * hashCode + needDebugInformation.hashCode()
            hashCode = 31 * hashCode + needLog.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("CallStateDto.Discarded")
                append("(")
                append("reason=")
                append(reason)
                append(", ")
                append("needRating=")
                append(needRating)
                append(", ")
                append("needDebugInformation=")
                append(needDebugInformation)
                append(", ")
                append("needLog=")
                append(needLog)
                append(")")
            }
        }
    }

    /**
     * The call has ended with an error.
     *
     * @property error Error. An error with the code 4005000 will be returned if an outgoing call is missed because of an expired timeout.
     */
    public class Error public constructor(
        public val error: ErrorDto,
    ) : CallStateDto() {
        override fun equals(other: Any?): Boolean {
            if (other === this) {
                return true
            }
            if (other == null) {
                return false
            }
            if (other::class != this::class) {
                return false
            }
            other as Error
            return other.error == error
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + error.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("CallStateDto.Error")
                append("(")
                append("error=")
                append(error)
                append(")")
            }
        }
    }
}
