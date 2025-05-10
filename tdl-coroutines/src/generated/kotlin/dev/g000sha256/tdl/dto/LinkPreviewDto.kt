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
 * Describes a link preview.
 *
 * @property url Original URL of the link.
 * @property displayUrl URL to display.
 * @property siteName Short name of the site (e.g., Google Docs, App Store).
 * @property title Title of the content.
 * @property description Description of the content.
 * @property author Author of the content.
 * @property type Type of the link preview.
 * @property hasLargeMedia True, if size of media in the preview can be changed.
 * @property showLargeMedia True, if large media preview must be shown; otherwise, the media preview must be shown small and only the first frame must be shown for videos.
 * @property showMediaAboveDescription True, if media must be shown above link preview description; otherwise, the media must be shown below the description.
 * @property skipConfirmation True, if there is no need to show an ordinary open URL confirmation, when opening the URL from the preview, because the URL is shown in the message text in clear.
 * @property showAboveText True, if the link preview must be shown above message text; otherwise, the link preview must be shown below the message text.
 * @property instantViewVersion Version of instant view (currently, can be 1 or 2) for the web page; 0 if none.
 */
public class LinkPreviewDto public constructor(
    public val url: String,
    public val displayUrl: String,
    public val siteName: String,
    public val title: String,
    public val description: FormattedTextDto,
    public val author: String,
    public val type: LinkPreviewTypeDto,
    public val hasLargeMedia: Boolean,
    public val showLargeMedia: Boolean,
    public val showMediaAboveDescription: Boolean,
    public val skipConfirmation: Boolean,
    public val showAboveText: Boolean,
    public val instantViewVersion: Int,
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
        other as LinkPreviewDto
        if (other.url != url) {
            return false
        }
        if (other.displayUrl != displayUrl) {
            return false
        }
        if (other.siteName != siteName) {
            return false
        }
        if (other.title != title) {
            return false
        }
        if (other.description != description) {
            return false
        }
        if (other.author != author) {
            return false
        }
        if (other.type != type) {
            return false
        }
        if (other.hasLargeMedia != hasLargeMedia) {
            return false
        }
        if (other.showLargeMedia != showLargeMedia) {
            return false
        }
        if (other.showMediaAboveDescription != showMediaAboveDescription) {
            return false
        }
        if (other.skipConfirmation != skipConfirmation) {
            return false
        }
        if (other.showAboveText != showAboveText) {
            return false
        }
        return other.instantViewVersion == instantViewVersion
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + url.hashCode()
        hashCode = 31 * hashCode + displayUrl.hashCode()
        hashCode = 31 * hashCode + siteName.hashCode()
        hashCode = 31 * hashCode + title.hashCode()
        hashCode = 31 * hashCode + description.hashCode()
        hashCode = 31 * hashCode + author.hashCode()
        hashCode = 31 * hashCode + type.hashCode()
        hashCode = 31 * hashCode + hasLargeMedia.hashCode()
        hashCode = 31 * hashCode + showLargeMedia.hashCode()
        hashCode = 31 * hashCode + showMediaAboveDescription.hashCode()
        hashCode = 31 * hashCode + skipConfirmation.hashCode()
        hashCode = 31 * hashCode + showAboveText.hashCode()
        hashCode = 31 * hashCode + instantViewVersion.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("LinkPreviewDto")
            append("(")
            append("url=")
            append(url)
            append(", ")
            append("displayUrl=")
            append(displayUrl)
            append(", ")
            append("siteName=")
            append(siteName)
            append(", ")
            append("title=")
            append(title)
            append(", ")
            append("description=")
            append(description)
            append(", ")
            append("author=")
            append(author)
            append(", ")
            append("type=")
            append(type)
            append(", ")
            append("hasLargeMedia=")
            append(hasLargeMedia)
            append(", ")
            append("showLargeMedia=")
            append(showLargeMedia)
            append(", ")
            append("showMediaAboveDescription=")
            append(showMediaAboveDescription)
            append(", ")
            append("skipConfirmation=")
            append(skipConfirmation)
            append(", ")
            append("showAboveText=")
            append(showAboveText)
            append(", ")
            append("instantViewVersion=")
            append(instantViewVersion)
            append(")")
        }
    }
}
