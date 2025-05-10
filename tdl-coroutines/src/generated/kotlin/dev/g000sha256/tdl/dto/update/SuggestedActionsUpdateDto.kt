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

package dev.g000sha256.tdl.dto.update

import dev.g000sha256.tdl.dto.SuggestedActionDto
import kotlin.Any
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String

/**
 * The list of suggested to the user actions has changed.
 *
 * @property addedActions Added suggested actions.
 * @property removedActions Removed suggested actions.
 */
public class SuggestedActionsUpdateDto public constructor(
    public val addedActions: Array<SuggestedActionDto>,
    public val removedActions: Array<SuggestedActionDto>,
) : UpdateDto() {
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
        other as SuggestedActionsUpdateDto
        val addedActionsEquals = other.addedActions.contentDeepEquals(addedActions)
        if (!addedActionsEquals) {
            return false
        }
        return other.removedActions.contentDeepEquals(removedActions)
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + addedActions.contentDeepHashCode()
        hashCode = 31 * hashCode + removedActions.contentDeepHashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("SuggestedActionsUpdateDto")
            append("(")
            append("addedActions=")
            addedActions
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("removedActions=")
            removedActions
                .contentDeepToString()
                .also { append(it) }
            append(")")
        }
    }
}
