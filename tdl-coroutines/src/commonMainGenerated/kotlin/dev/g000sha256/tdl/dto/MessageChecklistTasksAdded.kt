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
import kotlin.Int
import kotlin.Long
import kotlin.String

/**
 * Some tasks were added to a checklist.
 *
 * @property checklistMessageId Identifier of the message with the checklist; may be 0 or an identifier of a deleted message.
 * @property tasks List of tasks added to the checklist.
 */
public class MessageChecklistTasksAdded public constructor(
    public val checklistMessageId: Long,
    public val tasks: Array<ChecklistTask>,
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
        other as MessageChecklistTasksAdded
        if (other.checklistMessageId != checklistMessageId) {
            return false
        }
        return other.tasks.contentDeepEquals(tasks)
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + checklistMessageId.hashCode()
        hashCode = 31 * hashCode + tasks.contentDeepHashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("MessageChecklistTasksAdded")
            append("(")
            append("checklistMessageId=")
            append(checklistMessageId)
            append(", ")
            append("tasks=")
            tasks
                .contentDeepToString()
                .also { append(it) }
            append(")")
        }
    }
}
