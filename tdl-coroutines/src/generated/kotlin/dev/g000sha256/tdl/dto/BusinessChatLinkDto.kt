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
 * Contains information about a business chat link.
 *
 * @property link The HTTPS link.
 * @property text Message draft text that will be added to the input field.
 * @property title Link title.
 * @property viewCount Number of times the link was used.
 */
public class BusinessChatLinkDto public constructor(
    public val link: String,
    public val text: FormattedTextDto,
    public val title: String,
    public val viewCount: Int,
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
        other as BusinessChatLinkDto
        if (other.link != link) {
            return false
        }
        if (other.text != text) {
            return false
        }
        if (other.title != title) {
            return false
        }
        return other.viewCount == viewCount
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + link.hashCode()
        hashCode = 31 * hashCode + text.hashCode()
        hashCode = 31 * hashCode + title.hashCode()
        hashCode = 31 * hashCode + viewCount.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("BusinessChatLinkDto")
            append("(")
            append("link=")
            append(link)
            append(", ")
            append("text=")
            append(text)
            append(", ")
            append("title=")
            append(title)
            append(", ")
            append("viewCount=")
            append(viewCount)
            append(")")
        }
    }
}
