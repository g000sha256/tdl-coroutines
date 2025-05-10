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
 * This class is an abstract base class.
 * Describes type of sticker, which was used to create a chat photo.
 */
public sealed class ChatPhotoStickerTypeDto private constructor() {
    /**
     * Information about the sticker, which was used to create the chat photo.
     *
     * @property stickerSetId Sticker set identifier.
     * @property stickerId Identifier of the sticker in the set.
     */
    public class RegularOrMask public constructor(
        public val stickerSetId: Long,
        public val stickerId: Long,
    ) : ChatPhotoStickerTypeDto() {
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
            other as RegularOrMask
            if (other.stickerSetId != stickerSetId) {
                return false
            }
            return other.stickerId == stickerId
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + stickerSetId.hashCode()
            hashCode = 31 * hashCode + stickerId.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatPhotoStickerTypeDto.RegularOrMask")
                append("(")
                append("stickerSetId=")
                append(stickerSetId)
                append(", ")
                append("stickerId=")
                append(stickerId)
                append(")")
            }
        }
    }

    /**
     * Information about the custom emoji, which was used to create the chat photo.
     *
     * @property customEmojiId Identifier of the custom emoji.
     */
    public class CustomEmoji public constructor(
        public val customEmojiId: Long,
    ) : ChatPhotoStickerTypeDto() {
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
            other as CustomEmoji
            return other.customEmojiId == customEmojiId
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + customEmojiId.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatPhotoStickerTypeDto.CustomEmoji")
                append("(")
                append("customEmojiId=")
                append(customEmojiId)
                append(")")
            }
        }
    }
}
