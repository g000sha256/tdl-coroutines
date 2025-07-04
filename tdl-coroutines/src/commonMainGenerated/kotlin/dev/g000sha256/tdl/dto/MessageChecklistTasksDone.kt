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
import kotlin.IntArray
import kotlin.Long
import kotlin.String

/**
 * Some tasks from a checklist were marked as done or not done.
 *
 * @property checklistMessageId Identifier of the message with the checklist; can be 0 if the message was deleted.
 * @property markedAsDoneTaskIds Identifiers of tasks that were marked as done.
 * @property markedAsNotDoneTaskIds Identifiers of tasks that were marked as not done.
 */
public class MessageChecklistTasksDone public constructor(
    public val checklistMessageId: Long,
    public val markedAsDoneTaskIds: IntArray,
    public val markedAsNotDoneTaskIds: IntArray,
) : MessageContent() {
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
        other as MessageChecklistTasksDone
        if (other.checklistMessageId != checklistMessageId) {
            return false
        }
        val markedAsDoneTaskIdsEquals = other.markedAsDoneTaskIds.contentEquals(markedAsDoneTaskIds)
        if (!markedAsDoneTaskIdsEquals) {
            return false
        }
        return other.markedAsNotDoneTaskIds.contentEquals(markedAsNotDoneTaskIds)
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + checklistMessageId.hashCode()
        hashCode = 31 * hashCode + markedAsDoneTaskIds.contentHashCode()
        hashCode = 31 * hashCode + markedAsNotDoneTaskIds.contentHashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("MessageChecklistTasksDone")
            append("(")
            append("checklistMessageId=")
            append(checklistMessageId)
            append(", ")
            append("markedAsDoneTaskIds=")
            markedAsDoneTaskIds
                .contentToString()
                .also { append(it) }
            append(", ")
            append("markedAsNotDoneTaskIds=")
            markedAsNotDoneTaskIds
                .contentToString()
                .also { append(it) }
            append(")")
        }
    }
}
