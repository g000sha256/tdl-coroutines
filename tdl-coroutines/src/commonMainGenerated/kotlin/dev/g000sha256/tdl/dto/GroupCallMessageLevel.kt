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
import kotlin.Long
import kotlin.String

/**
 * Represents a level of features for a message sent in a live story group call.
 *
 * @property minStarCount The minimum number of Telegram Stars required to get features of the level.
 * @property pinDuration The amount of time the message of this level will be pinned, in seconds.
 * @property maxTextLength The maximum allowed length of the message text.
 * @property maxCustomEmojiCount The maximum allowed number of custom emoji in the message text.
 * @property firstColor The first color used to show the message text in the RGB format.
 * @property secondColor The second color used to show the message text in the RGB format.
 * @property backgroundColor Background color for the message the RGB format.
 */
public class GroupCallMessageLevel public constructor(
    public val minStarCount: Long,
    public val pinDuration: Int,
    public val maxTextLength: Int,
    public val maxCustomEmojiCount: Int,
    public val firstColor: Int,
    public val secondColor: Int,
    public val backgroundColor: Int,
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
        other as GroupCallMessageLevel
        if (other.minStarCount != minStarCount) {
            return false
        }
        if (other.pinDuration != pinDuration) {
            return false
        }
        if (other.maxTextLength != maxTextLength) {
            return false
        }
        if (other.maxCustomEmojiCount != maxCustomEmojiCount) {
            return false
        }
        if (other.firstColor != firstColor) {
            return false
        }
        if (other.secondColor != secondColor) {
            return false
        }
        return other.backgroundColor == backgroundColor
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + minStarCount.hashCode()
        hashCode = 31 * hashCode + pinDuration.hashCode()
        hashCode = 31 * hashCode + maxTextLength.hashCode()
        hashCode = 31 * hashCode + maxCustomEmojiCount.hashCode()
        hashCode = 31 * hashCode + firstColor.hashCode()
        hashCode = 31 * hashCode + secondColor.hashCode()
        hashCode = 31 * hashCode + backgroundColor.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("GroupCallMessageLevel")
            append("(")
            append("minStarCount=")
            append(minStarCount)
            append(", ")
            append("pinDuration=")
            append(pinDuration)
            append(", ")
            append("maxTextLength=")
            append(maxTextLength)
            append(", ")
            append("maxCustomEmojiCount=")
            append(maxCustomEmojiCount)
            append(", ")
            append("firstColor=")
            append(firstColor)
            append(", ")
            append("secondColor=")
            append(secondColor)
            append(", ")
            append("backgroundColor=")
            append(backgroundColor)
            append(")")
        }
    }
}
