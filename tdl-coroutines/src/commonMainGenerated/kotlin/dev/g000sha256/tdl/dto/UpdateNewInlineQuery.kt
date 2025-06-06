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
 * A new incoming inline query; for bots only.
 *
 * @property id Unique query identifier.
 * @property senderUserId Identifier of the user who sent the query.
 * @property userLocation User location; may be null.
 * @property chatType The type of the chat from which the query originated; may be null if unknown.
 * @property query Text of the query.
 * @property offset Offset of the first entry to return.
 */
public class UpdateNewInlineQuery public constructor(
    public val id: Long,
    public val senderUserId: Long,
    public val userLocation: Location?,
    public val chatType: ChatType?,
    public val query: String,
    public val offset: String,
) : Update() {
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
        other as UpdateNewInlineQuery
        if (other.id != id) {
            return false
        }
        if (other.senderUserId != senderUserId) {
            return false
        }
        if (other.userLocation != userLocation) {
            return false
        }
        if (other.chatType != chatType) {
            return false
        }
        if (other.query != query) {
            return false
        }
        return other.offset == offset
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + id.hashCode()
        hashCode = 31 * hashCode + senderUserId.hashCode()
        hashCode = 31 * hashCode + userLocation.hashCode()
        hashCode = 31 * hashCode + chatType.hashCode()
        hashCode = 31 * hashCode + query.hashCode()
        hashCode = 31 * hashCode + offset.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("UpdateNewInlineQuery")
            append("(")
            append("id=")
            append(id)
            append(", ")
            append("senderUserId=")
            append(senderUserId)
            append(", ")
            append("userLocation=")
            append(userLocation)
            append(", ")
            append("chatType=")
            append(chatType)
            append(", ")
            append("query=")
            append(query)
            append(", ")
            append("offset=")
            append(offset)
            append(")")
        }
    }
}
