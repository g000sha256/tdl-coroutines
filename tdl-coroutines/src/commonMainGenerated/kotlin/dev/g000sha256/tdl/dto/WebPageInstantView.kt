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
 * Describes an instant view page for a web page.
 *
 * @property pageBlocks Content of the instant view page.
 * @property viewCount Number of the instant view views; 0 if unknown.
 * @property version Version of the instant view; currently, can be 1 or 2.
 * @property isRtl True, if the instant view must be shown from right to left.
 * @property isFull True, if the instant view contains the full page. A network request might be needed to get the full instant view.
 * @property feedbackLink An internal link to be opened to leave feedback about the instant view.
 */
public class WebPageInstantView public constructor(
    public val pageBlocks: Array<PageBlock>,
    public val viewCount: Int,
    public val version: Int,
    public val isRtl: Boolean,
    public val isFull: Boolean,
    public val feedbackLink: InternalLinkType,
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
        other as WebPageInstantView
        val pageBlocksEquals = other.pageBlocks.contentDeepEquals(pageBlocks)
        if (!pageBlocksEquals) {
            return false
        }
        if (other.viewCount != viewCount) {
            return false
        }
        if (other.version != version) {
            return false
        }
        if (other.isRtl != isRtl) {
            return false
        }
        if (other.isFull != isFull) {
            return false
        }
        return other.feedbackLink == feedbackLink
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + pageBlocks.contentDeepHashCode()
        hashCode = 31 * hashCode + viewCount.hashCode()
        hashCode = 31 * hashCode + version.hashCode()
        hashCode = 31 * hashCode + isRtl.hashCode()
        hashCode = 31 * hashCode + isFull.hashCode()
        hashCode = 31 * hashCode + feedbackLink.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("WebPageInstantView")
            append("(")
            append("pageBlocks=")
            pageBlocks
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("viewCount=")
            append(viewCount)
            append(", ")
            append("version=")
            append(version)
            append(", ")
            append("isRtl=")
            append(isRtl)
            append(", ")
            append("isFull=")
            append(isFull)
            append(", ")
            append("feedbackLink=")
            append(feedbackLink)
            append(")")
        }
    }
}
