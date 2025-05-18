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
 * Contains information about original story that was reposted.
 *
 * @property origin Origin of the story that was reposted.
 * @property isContentModified True, if story content was modified during reposting; otherwise, story wasn't modified.
 */
public class StoryRepostInfo public constructor(
    public val origin: StoryOrigin,
    public val isContentModified: Boolean,
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
        other as StoryRepostInfo
        if (other.origin != origin) {
            return false
        }
        return other.isContentModified == isContentModified
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + origin.hashCode()
        hashCode = 31 * hashCode + isContentModified.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("StoryRepostInfo")
            append("(")
            append("origin=")
            append(origin)
            append(", ")
            append("isContentModified=")
            append(isContentModified)
            append(")")
        }
    }
}
