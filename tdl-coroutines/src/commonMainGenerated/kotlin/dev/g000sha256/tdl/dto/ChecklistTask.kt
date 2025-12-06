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
import kotlin.String

/**
 * Describes a task in a checklist.
 *
 * @property id Unique identifier of the task.
 * @property text Text of the task; may contain only Bold, Italic, Underline, Strikethrough, Spoiler, CustomEmoji, Url, EmailAddress, Mention, Hashtag, Cashtag and PhoneNumber entities.
 * @property completedBy Identifier of the user or chat that completed the task; may be null if the task isn't completed yet.
 * @property completionDate Point in time (Unix timestamp) when the task was completed; 0 if the task isn't completed.
 */
public class ChecklistTask public constructor(
    public val id: Int,
    public val text: FormattedText,
    public val completedBy: MessageSender?,
    public val completionDate: Int,
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
        other as ChecklistTask
        if (other.id != id) {
            return false
        }
        if (other.text != text) {
            return false
        }
        if (other.completedBy != completedBy) {
            return false
        }
        return other.completionDate == completionDate
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + id.hashCode()
        hashCode = 31 * hashCode + text.hashCode()
        hashCode = 31 * hashCode + completedBy.hashCode()
        hashCode = 31 * hashCode + completionDate.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ChecklistTask")
            append("(")
            append("id=")
            append(id)
            append(", ")
            append("text=")
            append(text)
            append(", ")
            append("completedBy=")
            append(completedBy)
            append(", ")
            append("completionDate=")
            append(completionDate)
            append(")")
        }
    }
}
