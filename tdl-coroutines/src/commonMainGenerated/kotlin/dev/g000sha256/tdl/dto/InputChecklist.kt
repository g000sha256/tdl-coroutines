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
import kotlin.String

/**
 * Describes a checklist to be sent.
 *
 * @property title Title of the checklist; 1-getOption(&quot;checklist_title_length_max&quot;) characters. May contain only Bold, Italic, Underline, Strikethrough, Spoiler, and CustomEmoji entities.
 * @property tasks List of tasks in the checklist; 1-getOption(&quot;checklist_task_count_max&quot;) tasks.
 * @property othersCanAddTasks True, if other users can add tasks to the list.
 * @property othersCanMarkTasksAsDone True, if other users can mark tasks as done or not done.
 */
public class InputChecklist public constructor(
    public val title: FormattedText,
    public val tasks: Array<InputChecklistTask>,
    public val othersCanAddTasks: Boolean,
    public val othersCanMarkTasksAsDone: Boolean,
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
        other as InputChecklist
        if (other.title != title) {
            return false
        }
        val tasksEquals = other.tasks.contentDeepEquals(tasks)
        if (!tasksEquals) {
            return false
        }
        if (other.othersCanAddTasks != othersCanAddTasks) {
            return false
        }
        return other.othersCanMarkTasksAsDone == othersCanMarkTasksAsDone
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + title.hashCode()
        hashCode = 31 * hashCode + tasks.contentDeepHashCode()
        hashCode = 31 * hashCode + othersCanAddTasks.hashCode()
        hashCode = 31 * hashCode + othersCanMarkTasksAsDone.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InputChecklist")
            append("(")
            append("title=")
            append(title)
            append(", ")
            append("tasks=")
            tasks
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("othersCanAddTasks=")
            append(othersCanAddTasks)
            append(", ")
            append("othersCanMarkTasksAsDone=")
            append(othersCanMarkTasksAsDone)
            append(")")
        }
    }
}
