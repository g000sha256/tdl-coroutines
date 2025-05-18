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
 * The link is a link to a chat.
 *
 * @property type Type of the chat.
 * @property photo Photo of the chat; may be null.
 * @property createsJoinRequest True, if the link only creates join request.
 */
public class LinkPreviewTypeChat public constructor(
    public val type: InviteLinkChatType,
    public val photo: ChatPhoto?,
    public val createsJoinRequest: Boolean,
) : LinkPreviewType() {
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
        other as LinkPreviewTypeChat
        if (other.type != type) {
            return false
        }
        if (other.photo != photo) {
            return false
        }
        return other.createsJoinRequest == createsJoinRequest
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + type.hashCode()
        hashCode = 31 * hashCode + photo.hashCode()
        hashCode = 31 * hashCode + createsJoinRequest.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("LinkPreviewTypeChat")
            append("(")
            append("type=")
            append(type)
            append(", ")
            append("photo=")
            append(photo)
            append(", ")
            append("createsJoinRequest=")
            append(createsJoinRequest)
            append(")")
        }
    }
}
