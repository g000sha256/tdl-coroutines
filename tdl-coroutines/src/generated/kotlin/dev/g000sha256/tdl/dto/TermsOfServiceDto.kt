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
 * Contains Telegram terms of service.
 *
 * @property text Text of the terms of service.
 * @property minUserAge The minimum age of a user to be able to accept the terms; 0 if age isn't restricted.
 * @property showPopup True, if a blocking popup with terms of service must be shown to the user.
 */
public class TermsOfServiceDto public constructor(
    public val text: FormattedTextDto,
    public val minUserAge: Int,
    public val showPopup: Boolean,
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
        other as TermsOfServiceDto
        if (other.text != text) {
            return false
        }
        if (other.minUserAge != minUserAge) {
            return false
        }
        return other.showPopup == showPopup
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + text.hashCode()
        hashCode = 31 * hashCode + minUserAge.hashCode()
        hashCode = 31 * hashCode + showPopup.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("TermsOfServiceDto")
            append("(")
            append("text=")
            append(text)
            append(", ")
            append("minUserAge=")
            append(minUserAge)
            append(", ")
            append("showPopup=")
            append(showPopup)
            append(")")
        }
    }
}
