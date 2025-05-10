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
 * Describes the type of URL linking to an internal Telegram entity.
 */
public sealed class TMeUrlTypeDto private constructor() {
    /**
     * A URL linking to a user.
     *
     * @property userId Identifier of the user.
     */
    public class User public constructor(
        public val userId: Long,
    ) : TMeUrlTypeDto() {
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
            other as User
            return other.userId == userId
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + userId.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("TMeUrlTypeDto.User")
                append("(")
                append("userId=")
                append(userId)
                append(")")
            }
        }
    }

    /**
     * A URL linking to a public supergroup or channel.
     *
     * @property supergroupId Identifier of the supergroup or channel.
     */
    public class Supergroup public constructor(
        public val supergroupId: Long,
    ) : TMeUrlTypeDto() {
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
            other as Supergroup
            return other.supergroupId == supergroupId
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + supergroupId.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("TMeUrlTypeDto.Supergroup")
                append("(")
                append("supergroupId=")
                append(supergroupId)
                append(")")
            }
        }
    }

    /**
     * A chat invite link.
     *
     * @property info Information about the chat invite link.
     */
    public class ChatInvite public constructor(
        public val info: ChatInviteLinkInfoDto,
    ) : TMeUrlTypeDto() {
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
            other as ChatInvite
            return other.info == info
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + info.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("TMeUrlTypeDto.ChatInvite")
                append("(")
                append("info=")
                append(info)
                append(")")
            }
        }
    }

    /**
     * A URL linking to a sticker set.
     *
     * @property stickerSetId Identifier of the sticker set.
     */
    public class StickerSet public constructor(
        public val stickerSetId: Long,
    ) : TMeUrlTypeDto() {
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
            other as StickerSet
            return other.stickerSetId == stickerSetId
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + stickerSetId.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("TMeUrlTypeDto.StickerSet")
                append("(")
                append("stickerSetId=")
                append(stickerSetId)
                append(")")
            }
        }
    }
}
