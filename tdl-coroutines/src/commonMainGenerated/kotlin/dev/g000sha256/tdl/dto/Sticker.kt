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
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Describes a sticker.
 *
 * @property id Unique sticker identifier within the set; 0 if none.
 * @property setId Identifier of the sticker set to which the sticker belongs; 0 if none.
 * @property width Sticker width; as defined by the sender.
 * @property height Sticker height; as defined by the sender.
 * @property emoji Emoji corresponding to the sticker.
 * @property format Sticker format.
 * @property fullType Sticker's full type.
 * @property thumbnail Sticker thumbnail in WEBP or JPEG format; may be null.
 * @property sticker File containing the sticker.
 */
@SerialName(value = "sticker")
@Serializable
public class Sticker public constructor(
    @SerialName(value = "id")
    public val id: Long,
    @SerialName(value = "set_id")
    public val setId: Long,
    @SerialName(value = "width")
    public val width: Int,
    @SerialName(value = "height")
    public val height: Int,
    @SerialName(value = "emoji")
    public val emoji: String,
    @SerialName(value = "format")
    public val format: StickerFormat,
    @SerialName(value = "full_type")
    public val fullType: StickerFullType,
    @SerialName(value = "thumbnail")
    public val thumbnail: Thumbnail?,
    @SerialName(value = "sticker")
    public val sticker: File,
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
        other as Sticker
        if (other.id != id) {
            return false
        }
        if (other.setId != setId) {
            return false
        }
        if (other.width != width) {
            return false
        }
        if (other.height != height) {
            return false
        }
        if (other.emoji != emoji) {
            return false
        }
        if (other.format != format) {
            return false
        }
        if (other.fullType != fullType) {
            return false
        }
        if (other.thumbnail != thumbnail) {
            return false
        }
        return other.sticker == sticker
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + id.hashCode()
        hashCode = 31 * hashCode + setId.hashCode()
        hashCode = 31 * hashCode + width.hashCode()
        hashCode = 31 * hashCode + height.hashCode()
        hashCode = 31 * hashCode + emoji.hashCode()
        hashCode = 31 * hashCode + format.hashCode()
        hashCode = 31 * hashCode + fullType.hashCode()
        hashCode = 31 * hashCode + thumbnail.hashCode()
        hashCode = 31 * hashCode + sticker.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("Sticker")
            append("(")
            append("id=")
            append(id)
            append(", ")
            append("setId=")
            append(setId)
            append(", ")
            append("width=")
            append(width)
            append(", ")
            append("height=")
            append(height)
            append(", ")
            append("emoji=")
            append(emoji)
            append(", ")
            append("format=")
            append(format)
            append(", ")
            append("fullType=")
            append(fullType)
            append(", ")
            append("thumbnail=")
            append(thumbnail)
            append(", ")
            append("sticker=")
            append(sticker)
            append(")")
        }
    }
}
