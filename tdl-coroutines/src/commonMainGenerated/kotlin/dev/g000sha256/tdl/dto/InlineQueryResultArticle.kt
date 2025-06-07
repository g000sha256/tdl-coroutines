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
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Represents a link to an article or web page.
 *
 * @property id Unique identifier of the query result.
 * @property url URL of the result, if it exists.
 * @property title Title of the result.
 * @property description A short description of the result.
 * @property thumbnail Result thumbnail in JPEG format; may be null.
 */
@SerialName(value = "inlineQueryResultArticle")
@Serializable
public class InlineQueryResultArticle public constructor(
    @SerialName(value = "id")
    public val id: String,
    @SerialName(value = "url")
    public val url: String,
    @SerialName(value = "title")
    public val title: String,
    @SerialName(value = "description")
    public val description: String,
    @SerialName(value = "thumbnail")
    public val thumbnail: Thumbnail?,
) : InlineQueryResult() {
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
        other as InlineQueryResultArticle
        if (other.id != id) {
            return false
        }
        if (other.url != url) {
            return false
        }
        if (other.title != title) {
            return false
        }
        if (other.description != description) {
            return false
        }
        return other.thumbnail == thumbnail
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + id.hashCode()
        hashCode = 31 * hashCode + url.hashCode()
        hashCode = 31 * hashCode + title.hashCode()
        hashCode = 31 * hashCode + description.hashCode()
        hashCode = 31 * hashCode + thumbnail.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InlineQueryResultArticle")
            append("(")
            append("id=")
            append(id)
            append(", ")
            append("url=")
            append(url)
            append(", ")
            append("title=")
            append(title)
            append(", ")
            append("description=")
            append(description)
            append(", ")
            append("thumbnail=")
            append(thumbnail)
            append(")")
        }
    }
}
