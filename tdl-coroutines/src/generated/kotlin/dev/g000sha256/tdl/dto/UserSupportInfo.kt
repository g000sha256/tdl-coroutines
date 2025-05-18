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
 * Contains custom information about the user.
 *
 * @property message Information message.
 * @property author Information author.
 * @property date Information change date.
 */
public class UserSupportInfo public constructor(
    public val message: FormattedText,
    public val author: String,
    public val date: Int,
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
        other as UserSupportInfo
        if (other.message != message) {
            return false
        }
        if (other.author != author) {
            return false
        }
        return other.date == date
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + message.hashCode()
        hashCode = 31 * hashCode + author.hashCode()
        hashCode = 31 * hashCode + date.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("UserSupportInfo")
            append("(")
            append("message=")
            append(message)
            append(", ")
            append("author=")
            append(author)
            append(", ")
            append("date=")
            append(date)
            append(")")
        }
    }
}
