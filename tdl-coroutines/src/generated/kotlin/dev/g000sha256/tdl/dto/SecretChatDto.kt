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
import kotlin.Boolean
import kotlin.ByteArray
import kotlin.Int
import kotlin.Long
import kotlin.String

/**
 * Represents a secret chat.
 *
 * @property id Secret chat identifier.
 * @property userId Identifier of the chat partner.
 * @property state State of the secret chat.
 * @property isOutbound True, if the chat was created by the current user; false otherwise.
 * @property keyHash Hash of the currently used key for comparison with the hash of the chat partner's key. This is a string of 36 little-endian bytes, which must be split into groups of 2 bits, each denoting a pixel of one of 4 colors FFFFFF, D5E6F3, 2D5775, and 2F99C9. The pixels must be used to make a 12x12 square image filled from left to right, top to bottom. Alternatively, the first 32 bytes of the hash can be converted to the hexadecimal format and printed as 32 2-digit hex numbers.
 * @property layer Secret chat layer; determines features supported by the chat partner's application. Nested text entities and underline and strikethrough entities are supported if the layer &gt;= 101, files bigger than 2000MB are supported if the layer &gt;= 143, spoiler and custom emoji text entities are supported if the layer &gt;= 144.
 */
public class SecretChatDto public constructor(
    public val id: Int,
    public val userId: Long,
    public val state: SecretChatStateDto,
    public val isOutbound: Boolean,
    public val keyHash: ByteArray,
    public val layer: Int,
) {
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
        other as SecretChatDto
        if (other.id != id) {
            return false
        }
        if (other.userId != userId) {
            return false
        }
        if (other.state != state) {
            return false
        }
        if (other.isOutbound != isOutbound) {
            return false
        }
        val keyHashEquals = other.keyHash.contentEquals(keyHash)
        if (!keyHashEquals) {
            return false
        }
        return other.layer == layer
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + id.hashCode()
        hashCode = 31 * hashCode + userId.hashCode()
        hashCode = 31 * hashCode + state.hashCode()
        hashCode = 31 * hashCode + isOutbound.hashCode()
        hashCode = 31 * hashCode + keyHash.contentHashCode()
        hashCode = 31 * hashCode + layer.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("SecretChatDto")
            append("(")
            append("id=")
            append(id)
            append(", ")
            append("userId=")
            append(userId)
            append(", ")
            append("state=")
            append(state)
            append(", ")
            append("isOutbound=")
            append(isOutbound)
            append(", ")
            append("keyHash=")
            keyHash
                .contentToString()
                .also { append(it) }
            append(", ")
            append("layer=")
            append(layer)
            append(")")
        }
    }
}
