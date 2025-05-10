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
 * Represents a tag used in Saved Messages or a Saved Messages topic.
 *
 * @property tag The tag.
 * @property label Label of the tag; 0-12 characters. Always empty if the tag is returned for a Saved Messages topic.
 * @property count Number of times the tag was used; may be 0 if the tag has non-empty label.
 */
public class SavedMessagesTagDto public constructor(
    public val tag: ReactionTypeDto,
    public val label: String,
    public val count: Int,
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
        other as SavedMessagesTagDto
        if (other.tag != tag) {
            return false
        }
        if (other.label != label) {
            return false
        }
        return other.count == count
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + tag.hashCode()
        hashCode = 31 * hashCode + label.hashCode()
        hashCode = 31 * hashCode + count.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("SavedMessagesTagDto")
            append("(")
            append("tag=")
            append(tag)
            append(", ")
            append("label=")
            append(label)
            append(", ")
            append("count=")
            append(count)
            append(")")
        }
    }
}
