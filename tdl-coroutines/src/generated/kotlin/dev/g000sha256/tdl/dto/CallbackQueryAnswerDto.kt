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
 * Contains a bot's answer to a callback query.
 *
 * @property text Text of the answer.
 * @property showAlert True, if an alert must be shown to the user instead of a toast notification.
 * @property url URL to be opened.
 */
public class CallbackQueryAnswerDto public constructor(
    public val text: String,
    public val showAlert: Boolean,
    public val url: String,
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
        other as CallbackQueryAnswerDto
        if (other.text != text) {
            return false
        }
        if (other.showAlert != showAlert) {
            return false
        }
        return other.url == url
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + text.hashCode()
        hashCode = 31 * hashCode + showAlert.hashCode()
        hashCode = 31 * hashCode + url.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("CallbackQueryAnswerDto")
            append("(")
            append("text=")
            append(text)
            append(", ")
            append("showAlert=")
            append(showAlert)
            append(", ")
            append("url=")
            append(url)
            append(")")
        }
    }
}
