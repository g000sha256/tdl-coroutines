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
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String

/**
 * Represents short information about a sticker set.
 *
 * @property id Identifier of the sticker set.
 * @property title Title of the sticker set.
 * @property name Name of the sticker set.
 * @property thumbnail Sticker set thumbnail in WEBP, TGS, or WEBM format with width and height 100; may be null. The file can be downloaded only before the thumbnail is changed.
 * @property thumbnailOutline Sticker set thumbnail's outline; may be null if unknown.
 * @property isOwned True, if the sticker set is owned by the current user.
 * @property isInstalled True, if the sticker set has been installed by the current user.
 * @property isArchived True, if the sticker set has been archived. A sticker set can't be installed and archived simultaneously.
 * @property isOfficial True, if the sticker set is official.
 * @property stickerType Type of the stickers in the set.
 * @property needsRepainting True, if stickers in the sticker set are custom emoji that must be repainted; for custom emoji sticker sets only.
 * @property isAllowedAsChatEmojiStatus True, if stickers in the sticker set are custom emoji that can be used as chat emoji status; for custom emoji sticker sets only.
 * @property isViewed True for already viewed trending sticker sets.
 * @property size Total number of stickers in the set.
 * @property covers Up to the first 5 stickers from the set, depending on the context. If the application needs more stickers the full sticker set needs to be requested.
 */
public class StickerSetInfo public constructor(
    public val id: Long,
    public val title: String,
    public val name: String,
    public val thumbnail: Thumbnail?,
    public val thumbnailOutline: Outline?,
    public val isOwned: Boolean,
    public val isInstalled: Boolean,
    public val isArchived: Boolean,
    public val isOfficial: Boolean,
    public val stickerType: StickerType,
    public val needsRepainting: Boolean,
    public val isAllowedAsChatEmojiStatus: Boolean,
    public val isViewed: Boolean,
    public val size: Int,
    public val covers: Array<Sticker>,
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
        other as StickerSetInfo
        if (other.id != id) {
            return false
        }
        if (other.title != title) {
            return false
        }
        if (other.name != name) {
            return false
        }
        if (other.thumbnail != thumbnail) {
            return false
        }
        if (other.thumbnailOutline != thumbnailOutline) {
            return false
        }
        if (other.isOwned != isOwned) {
            return false
        }
        if (other.isInstalled != isInstalled) {
            return false
        }
        if (other.isArchived != isArchived) {
            return false
        }
        if (other.isOfficial != isOfficial) {
            return false
        }
        if (other.stickerType != stickerType) {
            return false
        }
        if (other.needsRepainting != needsRepainting) {
            return false
        }
        if (other.isAllowedAsChatEmojiStatus != isAllowedAsChatEmojiStatus) {
            return false
        }
        if (other.isViewed != isViewed) {
            return false
        }
        if (other.size != size) {
            return false
        }
        return other.covers.contentDeepEquals(covers)
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + id.hashCode()
        hashCode = 31 * hashCode + title.hashCode()
        hashCode = 31 * hashCode + name.hashCode()
        hashCode = 31 * hashCode + thumbnail.hashCode()
        hashCode = 31 * hashCode + thumbnailOutline.hashCode()
        hashCode = 31 * hashCode + isOwned.hashCode()
        hashCode = 31 * hashCode + isInstalled.hashCode()
        hashCode = 31 * hashCode + isArchived.hashCode()
        hashCode = 31 * hashCode + isOfficial.hashCode()
        hashCode = 31 * hashCode + stickerType.hashCode()
        hashCode = 31 * hashCode + needsRepainting.hashCode()
        hashCode = 31 * hashCode + isAllowedAsChatEmojiStatus.hashCode()
        hashCode = 31 * hashCode + isViewed.hashCode()
        hashCode = 31 * hashCode + size.hashCode()
        hashCode = 31 * hashCode + covers.contentDeepHashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("StickerSetInfo")
            append("(")
            append("id=")
            append(id)
            append(", ")
            append("title=")
            append(title)
            append(", ")
            append("name=")
            append(name)
            append(", ")
            append("thumbnail=")
            append(thumbnail)
            append(", ")
            append("thumbnailOutline=")
            append(thumbnailOutline)
            append(", ")
            append("isOwned=")
            append(isOwned)
            append(", ")
            append("isInstalled=")
            append(isInstalled)
            append(", ")
            append("isArchived=")
            append(isArchived)
            append(", ")
            append("isOfficial=")
            append(isOfficial)
            append(", ")
            append("stickerType=")
            append(stickerType)
            append(", ")
            append("needsRepainting=")
            append(needsRepainting)
            append(", ")
            append("isAllowedAsChatEmojiStatus=")
            append(isAllowedAsChatEmojiStatus)
            append(", ")
            append("isViewed=")
            append(isViewed)
            append(", ")
            append("size=")
            append(size)
            append(", ")
            append("covers=")
            covers
                .contentDeepToString()
                .also { append(it) }
            append(")")
        }
    }
}
