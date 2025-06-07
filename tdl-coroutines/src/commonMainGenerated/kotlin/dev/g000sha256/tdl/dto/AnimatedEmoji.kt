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
 * Describes an animated or custom representation of an emoji.
 *
 * @property sticker Sticker for the emoji; may be null if yet unknown for a custom emoji. If the sticker is a custom emoji, then it can have arbitrary format.
 * @property stickerWidth Expected width of the sticker, which can be used if the sticker is null.
 * @property stickerHeight Expected height of the sticker, which can be used if the sticker is null.
 * @property fitzpatrickType Emoji modifier fitzpatrick type; 0-6; 0 if none.
 * @property sound File containing the sound to be played when the sticker is clicked; may be null. The sound is encoded with the Opus codec, and stored inside an OGG container.
 */
@SerialName(value = "animatedEmoji")
@Serializable
public class AnimatedEmoji public constructor(
    @SerialName(value = "sticker")
    public val sticker: Sticker?,
    @SerialName(value = "sticker_width")
    public val stickerWidth: Int,
    @SerialName(value = "sticker_height")
    public val stickerHeight: Int,
    @SerialName(value = "fitzpatrick_type")
    public val fitzpatrickType: Int,
    @SerialName(value = "sound")
    public val sound: File?,
) : Model() {
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
        other as AnimatedEmoji
        if (other.sticker != sticker) {
            return false
        }
        if (other.stickerWidth != stickerWidth) {
            return false
        }
        if (other.stickerHeight != stickerHeight) {
            return false
        }
        if (other.fitzpatrickType != fitzpatrickType) {
            return false
        }
        return other.sound == sound
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + sticker.hashCode()
        hashCode = 31 * hashCode + stickerWidth.hashCode()
        hashCode = 31 * hashCode + stickerHeight.hashCode()
        hashCode = 31 * hashCode + fitzpatrickType.hashCode()
        hashCode = 31 * hashCode + sound.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("AnimatedEmoji")
            append("(")
            append("sticker=")
            append(sticker)
            append(", ")
            append("stickerWidth=")
            append(stickerWidth)
            append(", ")
            append("stickerHeight=")
            append(stickerHeight)
            append(", ")
            append("fitzpatrickType=")
            append(fitzpatrickType)
            append(", ")
            append("sound=")
            append(sound)
            append(")")
        }
    }
}
