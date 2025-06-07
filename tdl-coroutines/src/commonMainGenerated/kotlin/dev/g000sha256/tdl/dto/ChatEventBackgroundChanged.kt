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
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The chat background was changed.
 *
 * @property oldBackground Previous background; may be null if none.
 * @property newBackground New background; may be null if none.
 */
@SerialName(value = "chatEventBackgroundChanged")
@Serializable
public class ChatEventBackgroundChanged public constructor(
    @SerialName(value = "old_background")
    public val oldBackground: ChatBackground?,
    @SerialName(value = "new_background")
    public val newBackground: ChatBackground?,
) : ChatEventAction() {
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
        other as ChatEventBackgroundChanged
        if (other.oldBackground != oldBackground) {
            return false
        }
        return other.newBackground == newBackground
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + oldBackground.hashCode()
        hashCode = 31 * hashCode + newBackground.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ChatEventBackgroundChanged")
            append("(")
            append("oldBackground=")
            append(oldBackground)
            append(", ")
            append("newBackground=")
            append(newBackground)
            append(")")
        }
    }
}
