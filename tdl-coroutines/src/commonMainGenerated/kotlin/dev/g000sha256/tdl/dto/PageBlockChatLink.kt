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
 * A link to a chat.
 *
 * @property title Chat title.
 * @property photo Chat photo; may be null.
 * @property accentColorId Identifier of the accent color for chat title and background of chat photo.
 * @property username Chat username by which all other information about the chat can be resolved.
 */
public class PageBlockChatLink public constructor(
    public val title: String,
    public val photo: ChatPhotoInfo?,
    public val accentColorId: Int,
    public val username: String,
) : PageBlock() {
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
        other as PageBlockChatLink
        if (other.title != title) {
            return false
        }
        if (other.photo != photo) {
            return false
        }
        if (other.accentColorId != accentColorId) {
            return false
        }
        return other.username == username
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + title.hashCode()
        hashCode = 31 * hashCode + photo.hashCode()
        hashCode = 31 * hashCode + accentColorId.hashCode()
        hashCode = 31 * hashCode + username.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("PageBlockChatLink")
            append("(")
            append("title=")
            append(title)
            append(", ")
            append("photo=")
            append(photo)
            append(", ")
            append("accentColorId=")
            append(accentColorId)
            append(", ")
            append("username=")
            append(username)
            append(")")
        }
    }
}
