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
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String

/**
 * An embedded post.
 *
 * @property url URL of the embedded post.
 * @property author Post author.
 * @property authorPhoto Post author photo; may be null.
 * @property date Point in time (Unix timestamp) when the post was created; 0 if unknown.
 * @property pageBlocks Post content.
 * @property caption Post caption.
 */
public class PageBlockEmbeddedPost public constructor(
    public val url: String,
    public val author: String,
    public val authorPhoto: Photo?,
    public val date: Int,
    public val pageBlocks: Array<PageBlock>,
    public val caption: PageBlockCaption,
) : PageBlock() {
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
        other as PageBlockEmbeddedPost
        if (other.url != url) {
            return false
        }
        if (other.author != author) {
            return false
        }
        if (other.authorPhoto != authorPhoto) {
            return false
        }
        if (other.date != date) {
            return false
        }
        val pageBlocksEquals = other.pageBlocks.contentDeepEquals(pageBlocks)
        if (!pageBlocksEquals) {
            return false
        }
        return other.caption == caption
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + url.hashCode()
        hashCode = 31 * hashCode + author.hashCode()
        hashCode = 31 * hashCode + authorPhoto.hashCode()
        hashCode = 31 * hashCode + date.hashCode()
        hashCode = 31 * hashCode + pageBlocks.contentDeepHashCode()
        hashCode = 31 * hashCode + caption.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("PageBlockEmbeddedPost")
            append("(")
            append("url=")
            append(url)
            append(", ")
            append("author=")
            append(author)
            append(", ")
            append("authorPhoto=")
            append(authorPhoto)
            append(", ")
            append("date=")
            append(date)
            append(", ")
            append("pageBlocks=")
            pageBlocks
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("caption=")
            append(caption)
            append(")")
        }
    }
}
