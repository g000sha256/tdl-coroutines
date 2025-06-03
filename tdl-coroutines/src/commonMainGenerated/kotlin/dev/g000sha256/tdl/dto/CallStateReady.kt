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
public class CallStateReady public constructor(
    public val protocol: CallProtocol,
    public val servers: Array<CallServer>,
    public val config: String,
    public val encryptionKey: ByteArray,
    public val emojis: Array<String>,
    public val allowP2p: Boolean,
    public val isGroupCallSupported: Boolean,
    public val customParameters: String,
) : CallState() {
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
        other as CallStateReady
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
            append("CallStateReady")
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
