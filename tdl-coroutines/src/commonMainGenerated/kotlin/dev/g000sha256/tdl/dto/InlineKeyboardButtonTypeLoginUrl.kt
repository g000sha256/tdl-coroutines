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
 * A button that opens a specified URL and automatically authorize the current user by calling getLoginUrlInfo.
 *
 * @property url An HTTP URL to pass to getLoginUrlInfo.
 * @property id Unique button identifier.
 * @property forwardText If non-empty, new text of the button in forwarded messages.
 */
public class InlineKeyboardButtonTypeLoginUrl public constructor(
    public val url: String,
    public val id: Long,
    public val forwardText: String,
) : InlineKeyboardButtonType() {
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
        other as InlineKeyboardButtonTypeLoginUrl
        if (other.url != url) {
            return false
        }
        if (other.id != id) {
            return false
        }
        return other.forwardText == forwardText
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + url.hashCode()
        hashCode = 31 * hashCode + id.hashCode()
        hashCode = 31 * hashCode + forwardText.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InlineKeyboardButtonTypeLoginUrl")
            append("(")
            append("url=")
            append(url)
            append(", ")
            append("id=")
            append(id)
            append(", ")
            append("forwardText=")
            append(forwardText)
            append(")")
        }
    }
}
