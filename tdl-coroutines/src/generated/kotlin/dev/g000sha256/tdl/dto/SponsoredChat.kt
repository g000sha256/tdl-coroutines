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
import kotlin.Int
import kotlin.Long
import kotlin.String

/**
 * Describes a sponsored chat.
 *
 * @property uniqueId Unique identifier of this result.
 * @property chatId Chat identifier.
 * @property sponsorInfo Additional optional information about the sponsor to be shown along with the chat.
 * @property additionalInfo If non-empty, additional information about the sponsored chat to be shown along with the chat.
 */
public class SponsoredChat public constructor(
    public val uniqueId: Long,
    public val chatId: Long,
    public val sponsorInfo: String,
    public val additionalInfo: String,
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
        other as SponsoredChat
        if (other.uniqueId != uniqueId) {
            return false
        }
        if (other.chatId != chatId) {
            return false
        }
        if (other.sponsorInfo != sponsorInfo) {
            return false
        }
        return other.additionalInfo == additionalInfo
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + uniqueId.hashCode()
        hashCode = 31 * hashCode + chatId.hashCode()
        hashCode = 31 * hashCode + sponsorInfo.hashCode()
        hashCode = 31 * hashCode + additionalInfo.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("SponsoredChat")
            append("(")
            append("uniqueId=")
            append(uniqueId)
            append(", ")
            append("chatId=")
            append(chatId)
            append(", ")
            append("sponsorInfo=")
            append(sponsorInfo)
            append(", ")
            append("additionalInfo=")
            append(additionalInfo)
            append(")")
        }
    }
}
