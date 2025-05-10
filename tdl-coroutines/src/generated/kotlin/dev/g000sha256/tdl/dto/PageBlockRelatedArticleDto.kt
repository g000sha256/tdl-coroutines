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
 * Contains information about a related article.
 *
 * @property url Related article URL.
 * @property title Article title; may be empty.
 * @property description Article description; may be empty.
 * @property photo Article photo; may be null.
 * @property author Article author; may be empty.
 * @property publishDate Point in time (Unix timestamp) when the article was published; 0 if unknown.
 */
public class PageBlockRelatedArticleDto public constructor(
    public val url: String,
    public val title: String,
    public val description: String,
    public val photo: PhotoDto?,
    public val author: String,
    public val publishDate: Int,
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
        other as PageBlockRelatedArticleDto
        if (other.url != url) {
            return false
        }
        if (other.title != title) {
            return false
        }
        if (other.description != description) {
            return false
        }
        if (other.photo != photo) {
            return false
        }
        if (other.author != author) {
            return false
        }
        return other.publishDate == publishDate
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + url.hashCode()
        hashCode = 31 * hashCode + title.hashCode()
        hashCode = 31 * hashCode + description.hashCode()
        hashCode = 31 * hashCode + photo.hashCode()
        hashCode = 31 * hashCode + author.hashCode()
        hashCode = 31 * hashCode + publishDate.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("PageBlockRelatedArticleDto")
            append("(")
            append("url=")
            append(url)
            append(", ")
            append("title=")
            append(title)
            append(", ")
            append("description=")
            append(description)
            append(", ")
            append("photo=")
            append(photo)
            append(", ")
            append("author=")
            append(author)
            append(", ")
            append("publishDate=")
            append(publishDate)
            append(")")
        }
    }
}
