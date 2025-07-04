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
 * Describes a task in a checklist to be sent.
 *
 * @property id Unique identifier of the task; must be positive.
 * @property text Text of the task; 1-getOption(&quot;checklist_task_text_length_max&quot;) characters without line feeds. May contain only Bold, Italic, Underline, Strikethrough, Spoiler, and CustomEmoji entities.
 */
public class InputChecklistTask public constructor(
    public val id: Int,
    public val text: FormattedText,
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
        other as InputChecklistTask
        if (other.id != id) {
            return false
        }
        return other.text == text
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + id.hashCode()
        hashCode = 31 * hashCode + text.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InputChecklistTask")
            append("(")
            append("id=")
            append(id)
            append(", ")
            append("text=")
            append(text)
            append(")")
        }
    }
}
