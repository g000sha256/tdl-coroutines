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
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A video message.
 *
 * @property video The video description.
 * @property alternativeVideos Alternative qualities of the video.
 * @property cover Cover of the video; may be null if none.
 * @property startTimestamp Timestamp from which the video playing must start, in seconds.
 * @property caption Video caption.
 * @property showCaptionAboveMedia True, if the caption must be shown above the video; otherwise, the caption must be shown below the video.
 * @property hasSpoiler True, if the video preview must be covered by a spoiler animation.
 * @property isSecret True, if the video thumbnail must be blurred and the video must be shown only while tapped.
 */
@SerialName(value = "messageVideo")
@Serializable
public class MessageVideo public constructor(
    @SerialName(value = "video")
    public val video: Video,
    @SerialName(value = "alternative_videos")
    public val alternativeVideos: Array<AlternativeVideo>,
    @SerialName(value = "cover")
    public val cover: Photo?,
    @SerialName(value = "start_timestamp")
    public val startTimestamp: Int,
    @SerialName(value = "caption")
    public val caption: FormattedText,
    @SerialName(value = "show_caption_above_media")
    public val showCaptionAboveMedia: Boolean,
    @SerialName(value = "has_spoiler")
    public val hasSpoiler: Boolean,
    @SerialName(value = "is_secret")
    public val isSecret: Boolean,
) : MessageContent() {
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
        other as MessageVideo
        if (other.video != video) {
            return false
        }
        val alternativeVideosEquals = other.alternativeVideos.contentDeepEquals(alternativeVideos)
        if (!alternativeVideosEquals) {
            return false
        }
        if (other.cover != cover) {
            return false
        }
        if (other.startTimestamp != startTimestamp) {
            return false
        }
        if (other.caption != caption) {
            return false
        }
        if (other.showCaptionAboveMedia != showCaptionAboveMedia) {
            return false
        }
        if (other.hasSpoiler != hasSpoiler) {
            return false
        }
        return other.isSecret == isSecret
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + video.hashCode()
        hashCode = 31 * hashCode + alternativeVideos.contentDeepHashCode()
        hashCode = 31 * hashCode + cover.hashCode()
        hashCode = 31 * hashCode + startTimestamp.hashCode()
        hashCode = 31 * hashCode + caption.hashCode()
        hashCode = 31 * hashCode + showCaptionAboveMedia.hashCode()
        hashCode = 31 * hashCode + hasSpoiler.hashCode()
        hashCode = 31 * hashCode + isSecret.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("MessageVideo")
            append("(")
            append("video=")
            append(video)
            append(", ")
            append("alternativeVideos=")
            alternativeVideos
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("cover=")
            append(cover)
            append(", ")
            append("startTimestamp=")
            append(startTimestamp)
            append(", ")
            append("caption=")
            append(caption)
            append(", ")
            append("showCaptionAboveMedia=")
            append(showCaptionAboveMedia)
            append(", ")
            append("hasSpoiler=")
            append(hasSpoiler)
            append(", ")
            append("isSecret=")
            append(isSecret)
            append(")")
        }
    }
}
