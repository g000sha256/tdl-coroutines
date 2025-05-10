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

package dev.g000sha256.tdl.dto.update

import dev.g000sha256.tdl.dto.LocationDto
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String

/**
 * The user has chosen a result of an inline query; for bots only.
 *
 * @property senderUserId Identifier of the user who sent the query.
 * @property userLocation User location; may be null.
 * @property query Text of the query.
 * @property resultId Identifier of the chosen result.
 * @property inlineMessageId Identifier of the sent inline message, if known.
 */
public class NewChosenInlineResultUpdateDto public constructor(
    public val senderUserId: Long,
    public val userLocation: LocationDto?,
    public val query: String,
    public val resultId: String,
    public val inlineMessageId: String,
) : UpdateDto() {
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
        other as NewChosenInlineResultUpdateDto
        if (other.senderUserId != senderUserId) {
            return false
        }
        if (other.userLocation != userLocation) {
            return false
        }
        if (other.query != query) {
            return false
        }
        if (other.resultId != resultId) {
            return false
        }
        return other.inlineMessageId == inlineMessageId
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + senderUserId.hashCode()
        hashCode = 31 * hashCode + userLocation.hashCode()
        hashCode = 31 * hashCode + query.hashCode()
        hashCode = 31 * hashCode + resultId.hashCode()
        hashCode = 31 * hashCode + inlineMessageId.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("NewChosenInlineResultUpdateDto")
            append("(")
            append("senderUserId=")
            append(senderUserId)
            append(", ")
            append("userLocation=")
            append(userLocation)
            append(", ")
            append("query=")
            append(query)
            append(", ")
            append("resultId=")
            append(resultId)
            append(", ")
            append("inlineMessageId=")
            append(inlineMessageId)
            append(")")
        }
    }
}
