/*
 * Copyright 2026 Georgii Ippolitov (g000sha256)
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
 * A message draft generation was stopped by the user.
 *
 * @property chatId Chat identifier.
 * @property forumTopicId The forum topic identifier of the message draft.
 * @property draftId Identifier of the message draft within the message thread.
 */
public class UpdateStopMessageDraft public constructor(
    public val chatId: Long,
    public val forumTopicId: Int,
    public val draftId: Long,
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
        other as UpdateStopMessageDraft
        if (other.chatId != chatId) {
            return false
        }
        if (other.forumTopicId != forumTopicId) {
            return false
        }
        return other.draftId == draftId
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + chatId.hashCode()
        hashCode = 31 * hashCode + forumTopicId.hashCode()
        hashCode = 31 * hashCode + draftId.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("UpdateStopMessageDraft")
            append("(")
            append("chatId=")
            append(chatId)
            append(", ")
            append("forumTopicId=")
            append(forumTopicId)
            append(", ")
            append("draftId=")
            append(draftId)
            append(")")
        }
    }
}
