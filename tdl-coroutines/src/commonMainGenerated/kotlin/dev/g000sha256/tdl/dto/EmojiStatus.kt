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
 * Describes an emoji to be shown instead of the Telegram Premium badge.
 *
 * @property type Type of the emoji status.
 * @property expirationDate Point in time (Unix timestamp) when the status will expire; 0 if never.
 */
public class EmojiStatus public constructor(
    public val type: EmojiStatusType,
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
        other as EmojiStatus
        if (other.type != type) {
            return false
        }
        return other.expirationDate == expirationDate
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + type.hashCode()
        hashCode = 31 * hashCode + expirationDate.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("EmojiStatus")
            append("(")
            append("type=")
            append(type)
            append(", ")
            append("expirationDate=")
            append(expirationDate)
            append(")")
        }
    }
}
