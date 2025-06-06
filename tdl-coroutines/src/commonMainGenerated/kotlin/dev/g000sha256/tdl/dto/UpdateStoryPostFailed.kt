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
 * A story failed to post. If the story posting is canceled, then updateStoryDeleted will be received instead of this update.
 *
 * @property story The failed to post story.
 * @property error The cause of the story posting failure.
 * @property errorType Type of the error; may be null if unknown.
 */
public class UpdateStoryPostFailed public constructor(
    public val story: Story,
    public val error: Error,
    public val errorType: CanPostStoryResult?,
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
        other as UpdateStoryPostFailed
        if (other.story != story) {
            return false
        }
        if (other.error != error) {
            return false
        }
        return other.errorType == errorType
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + story.hashCode()
        hashCode = 31 * hashCode + error.hashCode()
        hashCode = 31 * hashCode + errorType.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("UpdateStoryPostFailed")
            append("(")
            append("story=")
            append(story)
            append(", ")
            append("error=")
            append(error)
            append(", ")
            append("errorType=")
            append(errorType)
            append(")")
        }
    }
}
