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
import kotlin.LongArray
import kotlin.String

/**
 * The story can be viewed by certain specified users.
 *
 * @property userIds Identifiers of the users; always unknown and empty for non-owned stories.
 */
public class StoryPrivacySettingsSelectedUsers public constructor(
    public val userIds: LongArray,
) : StoryPrivacySettings() {
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
        other as StoryPrivacySettingsSelectedUsers
        return other.userIds.contentEquals(userIds)
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + userIds.contentHashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("StoryPrivacySettingsSelectedUsers")
            append("(")
            append("userIds=")
            userIds
                .contentToString()
                .also { append(it) }
            append(")")
        }
    }
}
