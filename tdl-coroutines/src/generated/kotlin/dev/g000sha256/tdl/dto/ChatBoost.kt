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
 * Describes a boost applied to a chat.
 *
 * @property id Unique identifier of the boost.
 * @property count The number of identical boosts applied.
 * @property source Source of the boost.
 * @property startDate Point in time (Unix timestamp) when the chat was boosted.
 * @property expirationDate Point in time (Unix timestamp) when the boost will expire.
 */
public class ChatBoost public constructor(
    public val id: String,
    public val count: Int,
    public val source: ChatBoostSource,
    public val startDate: Int,
    public val expirationDate: Int,
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
        other as ChatBoost
        if (other.id != id) {
            return false
        }
        if (other.count != count) {
            return false
        }
        if (other.source != source) {
            return false
        }
        if (other.startDate != startDate) {
            return false
        }
        return other.expirationDate == expirationDate
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + id.hashCode()
        hashCode = 31 * hashCode + count.hashCode()
        hashCode = 31 * hashCode + source.hashCode()
        hashCode = 31 * hashCode + startDate.hashCode()
        hashCode = 31 * hashCode + expirationDate.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ChatBoost")
            append("(")
            append("id=")
            append(id)
            append(", ")
            append("count=")
            append(count)
            append(", ")
            append("source=")
            append(source)
            append(", ")
            append("startDate=")
            append(startDate)
            append(", ")
            append("expirationDate=")
            append(expirationDate)
            append(")")
        }
    }
}
