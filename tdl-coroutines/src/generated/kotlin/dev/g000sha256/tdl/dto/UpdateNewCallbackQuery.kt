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
 * A new incoming callback query; for bots only.
 *
 * @property id Unique query identifier.
 * @property senderUserId Identifier of the user who sent the query.
 * @property chatId Identifier of the chat where the query was sent.
 * @property messageId Identifier of the message from which the query originated.
 * @property chatInstance Identifier that uniquely corresponds to the chat to which the message was sent.
 * @property payload Query payload.
 */
public class UpdateNewCallbackQuery public constructor(
    public val id: Long,
    public val senderUserId: Long,
    public val chatId: Long,
    public val messageId: Long,
    public val chatInstance: Long,
    public val payload: CallbackQueryPayload,
) : Update() {
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
        other as UpdateNewCallbackQuery
        if (other.id != id) {
            return false
        }
        if (other.senderUserId != senderUserId) {
            return false
        }
        if (other.chatId != chatId) {
            return false
        }
        if (other.messageId != messageId) {
            return false
        }
        if (other.chatInstance != chatInstance) {
            return false
        }
        return other.payload == payload
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + id.hashCode()
        hashCode = 31 * hashCode + senderUserId.hashCode()
        hashCode = 31 * hashCode + chatId.hashCode()
        hashCode = 31 * hashCode + messageId.hashCode()
        hashCode = 31 * hashCode + chatInstance.hashCode()
        hashCode = 31 * hashCode + payload.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("UpdateNewCallbackQuery")
            append("(")
            append("id=")
            append(id)
            append(", ")
            append("senderUserId=")
            append(senderUserId)
            append(", ")
            append("chatId=")
            append(chatId)
            append(", ")
            append("messageId=")
            append(messageId)
            append(", ")
            append("chatInstance=")
            append(chatInstance)
            append(", ")
            append("payload=")
            append(payload)
            append(")")
        }
    }
}
