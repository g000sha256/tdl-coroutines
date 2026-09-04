/*
 * Copyright 2026 Georgii Ippolitov (g000sha256)
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
 * Describes one answer option of a poll to be created.
 *
 * @property text Option text; 1-100 characters. Only custom emoji entities are allowed to be added and only by Premium users.
 * @property media Option media; pass null if none. Must be one of the following types: inputPollMediaAnimation, inputPollMediaLink, inputPollMediaLocation, inputPollMediaPhoto, inputPollMediaSticker, inputPollMediaVenue, or inputPollMediaVideo without caption.
 */
public class InputPollOption public constructor(
    public val text: FormattedText,
    public val media: InputPollMedia?,
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
        other as InputPollOption
        if (other.text != text) {
            return false
        }
        return other.media == media
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + text.hashCode()
        hashCode = 31 * hashCode + media.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InputPollOption")
            append("(")
            append("text=")
            append(text)
            append(", ")
            append("media=")
            append(media)
            append(")")
        }
    }
}
