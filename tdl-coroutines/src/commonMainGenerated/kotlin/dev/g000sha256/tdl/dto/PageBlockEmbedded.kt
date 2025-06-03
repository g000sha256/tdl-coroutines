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
 * An embedded web page.
 *
 * @property url URL of the embedded page, if available.
 * @property html HTML-markup of the embedded page.
 * @property posterPhoto Poster photo, if available; may be null.
 * @property width Block width; 0 if unknown.
 * @property height Block height; 0 if unknown.
 * @property caption Block caption.
 * @property isFullWidth True, if the block must be full width.
 * @property allowScrolling True, if scrolling needs to be allowed.
 */
public class PageBlockEmbedded public constructor(
    public val url: String,
    public val html: String,
    public val posterPhoto: Photo?,
    public val width: Int,
    public val height: Int,
    public val caption: PageBlockCaption,
    public val isFullWidth: Boolean,
    public val allowScrolling: Boolean,
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
        other as PageBlockEmbedded
        if (other.url != url) {
            return false
        }
        if (other.html != html) {
            return false
        }
        if (other.posterPhoto != posterPhoto) {
            return false
        }
        if (other.width != width) {
            return false
        }
        if (other.height != height) {
            return false
        }
        if (other.caption != caption) {
            return false
        }
        if (other.isFullWidth != isFullWidth) {
            return false
        }
        return other.allowScrolling == allowScrolling
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + url.hashCode()
        hashCode = 31 * hashCode + html.hashCode()
        hashCode = 31 * hashCode + posterPhoto.hashCode()
        hashCode = 31 * hashCode + width.hashCode()
        hashCode = 31 * hashCode + height.hashCode()
        hashCode = 31 * hashCode + caption.hashCode()
        hashCode = 31 * hashCode + isFullWidth.hashCode()
        hashCode = 31 * hashCode + allowScrolling.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("PageBlockEmbedded")
            append("(")
            append("url=")
            append(url)
            append(", ")
            append("html=")
            append(html)
            append(", ")
            append("posterPhoto=")
            append(posterPhoto)
            append(", ")
            append("width=")
            append(width)
            append(", ")
            append("height=")
            append(height)
            append(", ")
            append("caption=")
            append(caption)
            append(", ")
            append("isFullWidth=")
            append(isFullWidth)
            append(", ")
            append("allowScrolling=")
            append(allowScrolling)
            append(")")
        }
    }
}
