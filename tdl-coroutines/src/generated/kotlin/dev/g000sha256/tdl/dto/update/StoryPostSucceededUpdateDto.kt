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

import dev.g000sha256.tdl.dto.StoryDto
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.String

/**
 * A story has been successfully posted.
 *
 * @property story The posted story.
 * @property oldStoryId The previous temporary story identifier.
 */
public class StoryPostSucceededUpdateDto public constructor(
    public val story: StoryDto,
    public val oldStoryId: Int,
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
        other as StoryPostSucceededUpdateDto
        if (other.story != story) {
            return false
        }
        return other.oldStoryId == oldStoryId
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + story.hashCode()
        hashCode = 31 * hashCode + oldStoryId.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("StoryPostSucceededUpdateDto")
            append("(")
            append("story=")
            append(story)
            append(", ")
            append("oldStoryId=")
            append(oldStoryId)
            append(")")
        }
    }
}
