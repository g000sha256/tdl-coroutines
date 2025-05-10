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
 * Contains information about a message draft.
 *
 * @property replyTo Information about the message to be replied; must be of the type inputMessageReplyToMessage; may be null if none.
 * @property date Point in time (Unix timestamp) when the draft was created.
 * @property inputMessageText Content of the message draft; must be of the type inputMessageText, inputMessageVideoNote, or inputMessageVoiceNote.
 * @property effectId Identifier of the effect to apply to the message when it is sent; 0 if none.
 */
public class DraftMessageDto public constructor(
    public val replyTo: InputMessageReplyToDto?,
    public val date: Int,
    public val inputMessageText: InputMessageContentDto,
    public val effectId: Long,
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
        other as DraftMessageDto
        if (other.replyTo != replyTo) {
            return false
        }
        if (other.date != date) {
            return false
        }
        if (other.inputMessageText != inputMessageText) {
            return false
        }
        return other.effectId == effectId
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + replyTo.hashCode()
        hashCode = 31 * hashCode + date.hashCode()
        hashCode = 31 * hashCode + inputMessageText.hashCode()
        hashCode = 31 * hashCode + effectId.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("DraftMessageDto")
            append("(")
            append("replyTo=")
            append(replyTo)
            append(", ")
            append("date=")
            append(date)
            append(", ")
            append("inputMessageText=")
            append(inputMessageText)
            append(", ")
            append("effectId=")
            append(effectId)
            append(")")
        }
    }
}
