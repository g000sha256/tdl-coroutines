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
 * Describes name of a chat folder.
 *
 * @property text The text of the chat folder name; 1-12 characters without line feeds. May contain only CustomEmoji entities.
 * @property animateCustomEmoji True, if custom emoji in the name must be animated.
 */
public class ChatFolderName public constructor(
    public val text: FormattedText,
    public val animateCustomEmoji: Boolean,
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
        other as ChatFolderName
        if (other.text != text) {
            return false
        }
        return other.animateCustomEmoji == animateCustomEmoji
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + text.hashCode()
        hashCode = 31 * hashCode + animateCustomEmoji.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ChatFolderName")
            append("(")
            append("text=")
            append(text)
            append(", ")
            append("animateCustomEmoji=")
            append(animateCustomEmoji)
            append(")")
        }
    }
}
