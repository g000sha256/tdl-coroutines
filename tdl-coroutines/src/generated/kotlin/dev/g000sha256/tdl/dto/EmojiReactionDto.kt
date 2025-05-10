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
 * Contains information about an emoji reaction.
 *
 * @property emoji Text representation of the reaction.
 * @property title Reaction title.
 * @property isActive True, if the reaction can be added to new messages and enabled in chats.
 * @property staticIcon Static icon for the reaction.
 * @property appearAnimation Appear animation for the reaction.
 * @property selectAnimation Select animation for the reaction.
 * @property activateAnimation Activate animation for the reaction.
 * @property effectAnimation Effect animation for the reaction.
 * @property aroundAnimation Around animation for the reaction; may be null.
 * @property centerAnimation Center animation for the reaction; may be null.
 */
public class EmojiReactionDto public constructor(
    public val emoji: String,
    public val title: String,
    public val isActive: Boolean,
    public val staticIcon: StickerDto,
    public val appearAnimation: StickerDto,
    public val selectAnimation: StickerDto,
    public val activateAnimation: StickerDto,
    public val effectAnimation: StickerDto,
    public val aroundAnimation: StickerDto?,
    public val centerAnimation: StickerDto?,
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
        other as EmojiReactionDto
        if (other.emoji != emoji) {
            return false
        }
        if (other.title != title) {
            return false
        }
        if (other.isActive != isActive) {
            return false
        }
        if (other.staticIcon != staticIcon) {
            return false
        }
        if (other.appearAnimation != appearAnimation) {
            return false
        }
        if (other.selectAnimation != selectAnimation) {
            return false
        }
        if (other.activateAnimation != activateAnimation) {
            return false
        }
        if (other.effectAnimation != effectAnimation) {
            return false
        }
        if (other.aroundAnimation != aroundAnimation) {
            return false
        }
        return other.centerAnimation == centerAnimation
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + emoji.hashCode()
        hashCode = 31 * hashCode + title.hashCode()
        hashCode = 31 * hashCode + isActive.hashCode()
        hashCode = 31 * hashCode + staticIcon.hashCode()
        hashCode = 31 * hashCode + appearAnimation.hashCode()
        hashCode = 31 * hashCode + selectAnimation.hashCode()
        hashCode = 31 * hashCode + activateAnimation.hashCode()
        hashCode = 31 * hashCode + effectAnimation.hashCode()
        hashCode = 31 * hashCode + aroundAnimation.hashCode()
        hashCode = 31 * hashCode + centerAnimation.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("EmojiReactionDto")
            append("(")
            append("emoji=")
            append(emoji)
            append(", ")
            append("title=")
            append(title)
            append(", ")
            append("isActive=")
            append(isActive)
            append(", ")
            append("staticIcon=")
            append(staticIcon)
            append(", ")
            append("appearAnimation=")
            append(appearAnimation)
            append(", ")
            append("selectAnimation=")
            append(selectAnimation)
            append(", ")
            append("activateAnimation=")
            append(activateAnimation)
            append(", ")
            append("effectAnimation=")
            append(effectAnimation)
            append(", ")
            append("aroundAnimation=")
            append(aroundAnimation)
            append(", ")
            append("centerAnimation=")
            append(centerAnimation)
            append(")")
        }
    }
}
