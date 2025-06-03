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
 * The link is a link to a sticker set. Call searchStickerSet with the given sticker set name to process the link and show the sticker set. If the sticker set is found and the user wants to add it, then call changeStickerSet.
 *
 * @property stickerSetName Name of the sticker set.
 * @property expectCustomEmoji True, if the sticker set is expected to contain custom emoji.
 */
public class InternalLinkTypeStickerSet public constructor(
    public val stickerSetName: String,
    public val expectCustomEmoji: Boolean,
) : InternalLinkType() {
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
        other as InternalLinkTypeStickerSet
        if (other.stickerSetName != stickerSetName) {
            return false
        }
        return other.expectCustomEmoji == expectCustomEmoji
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + stickerSetName.hashCode()
        hashCode = 31 * hashCode + expectCustomEmoji.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InternalLinkTypeStickerSet")
            append("(")
            append("stickerSetName=")
            append(stickerSetName)
            append(", ")
            append("expectCustomEmoji=")
            append(expectCustomEmoji)
            append(")")
        }
    }
}
