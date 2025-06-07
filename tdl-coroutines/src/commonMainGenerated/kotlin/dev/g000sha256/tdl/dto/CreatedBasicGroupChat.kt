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
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Contains information about a newly created basic group chat.
 *
 * @property chatId Chat identifier.
 * @property failedToAddMembers Information about failed to add members.
 */
@SerialName(value = "createdBasicGroupChat")
@Serializable
public class CreatedBasicGroupChat public constructor(
    @SerialName(value = "chat_id")
    public val chatId: Long,
    @SerialName(value = "failed_to_add_members")
    public val failedToAddMembers: FailedToAddMembers,
) : Model() {
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
        other as CreatedBasicGroupChat
        if (other.chatId != chatId) {
            return false
        }
        return other.failedToAddMembers == failedToAddMembers
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + chatId.hashCode()
        hashCode = 31 * hashCode + failedToAddMembers.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("CreatedBasicGroupChat")
            append("(")
            append("chatId=")
            append(chatId)
            append(", ")
            append("failedToAddMembers=")
            append(failedToAddMembers)
            append(")")
        }
    }
}
