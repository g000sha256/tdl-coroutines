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
 * Represents a ready to send inline message. Use sendInlineQueryResultMessage to send the message.
 *
 * @property inlineQueryId Unique identifier of the inline query to pass to sendInlineQueryResultMessage.
 * @property result Resulted inline message of the query.
 * @property chatTypes Types of the chats to which the message can be sent.
 */
public class PreparedInlineMessageDto public constructor(
    public val inlineQueryId: Long,
    public val result: InlineQueryResultDto,
    public val chatTypes: TargetChatTypesDto,
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
        other as PreparedInlineMessageDto
        if (other.inlineQueryId != inlineQueryId) {
            return false
        }
        if (other.result != result) {
            return false
        }
        return other.chatTypes == chatTypes
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + inlineQueryId.hashCode()
        hashCode = 31 * hashCode + result.hashCode()
        hashCode = 31 * hashCode + chatTypes.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("PreparedInlineMessageDto")
            append("(")
            append("inlineQueryId=")
            append(inlineQueryId)
            append(", ")
            append("result=")
            append(result)
            append(", ")
            append("chatTypes=")
            append(chatTypes)
            append(")")
        }
    }
}
