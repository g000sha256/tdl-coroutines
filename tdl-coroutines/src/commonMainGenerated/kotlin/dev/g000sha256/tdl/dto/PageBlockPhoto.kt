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
 * A photo.
 *
 * @property photo Photo file; may be null.
 * @property caption Photo caption.
 * @property url URL that needs to be opened when the photo is clicked.
 */
public class PageBlockPhoto public constructor(
    public val photo: Photo?,
    public val caption: PageBlockCaption,
    public val url: String,
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
        other as PageBlockPhoto
        if (other.photo != photo) {
            return false
        }
        if (other.caption != caption) {
            return false
        }
        return other.url == url
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + photo.hashCode()
        hashCode = 31 * hashCode + caption.hashCode()
        hashCode = 31 * hashCode + url.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("PageBlockPhoto")
            append("(")
            append("photo=")
            append(photo)
            append(", ")
            append("caption=")
            append(caption)
            append(", ")
            append("url=")
            append(url)
            append(")")
        }
    }
}
