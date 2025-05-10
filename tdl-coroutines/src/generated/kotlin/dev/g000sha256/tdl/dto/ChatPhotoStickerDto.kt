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
 * Information about the sticker, which was used to create the chat photo. The sticker is shown at the center of the photo and occupies at most 67% of it.
 *
 * @property type Type of the sticker.
 * @property backgroundFill The fill to be used as background for the sticker; rotation angle in backgroundFillGradient isn't supported.
 */
public class ChatPhotoStickerDto public constructor(
    public val type: ChatPhotoStickerTypeDto,
    public val backgroundFill: BackgroundFillDto,
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
        other as ChatPhotoStickerDto
        if (other.type != type) {
            return false
        }
        return other.backgroundFill == backgroundFill
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + type.hashCode()
        hashCode = 31 * hashCode + backgroundFill.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ChatPhotoStickerDto")
            append("(")
            append("type=")
            append(type)
            append(", ")
            append("backgroundFill=")
            append(backgroundFill)
            append(")")
        }
    }
}
