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
 * Options to be used for generation of a link preview.
 *
 * @property isDisabled True, if link preview must be disabled.
 * @property url URL to use for link preview. If empty, then the first URL found in the message text will be used.
 * @property forceSmallMedia True, if shown media preview must be small; ignored in secret chats or if the URL isn't explicitly specified.
 * @property forceLargeMedia True, if shown media preview must be large; ignored in secret chats or if the URL isn't explicitly specified.
 * @property showAboveText True, if link preview must be shown above message text; otherwise, the link preview will be shown below the message text; ignored in secret chats.
 */
public class LinkPreviewOptions public constructor(
    public val isDisabled: Boolean,
    public val url: String,
    public val forceSmallMedia: Boolean,
    public val forceLargeMedia: Boolean,
    public val showAboveText: Boolean,
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
        other as LinkPreviewOptions
        if (other.isDisabled != isDisabled) {
            return false
        }
        if (other.url != url) {
            return false
        }
        if (other.forceSmallMedia != forceSmallMedia) {
            return false
        }
        if (other.forceLargeMedia != forceLargeMedia) {
            return false
        }
        return other.showAboveText == showAboveText
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + isDisabled.hashCode()
        hashCode = 31 * hashCode + url.hashCode()
        hashCode = 31 * hashCode + forceSmallMedia.hashCode()
        hashCode = 31 * hashCode + forceLargeMedia.hashCode()
        hashCode = 31 * hashCode + showAboveText.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("LinkPreviewOptions")
            append("(")
            append("isDisabled=")
            append(isDisabled)
            append(", ")
            append("url=")
            append(url)
            append(", ")
            append("forceSmallMedia=")
            append(forceSmallMedia)
            append(", ")
            append("forceLargeMedia=")
            append(forceLargeMedia)
            append(", ")
            append("showAboveText=")
            append(showAboveText)
            append(")")
        }
    }
}
