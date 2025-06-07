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
import kotlin.IntArray
import kotlin.String
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A video message.
 *
 * @property video Video to be sent. The video is expected to be re-encoded to MPEG4 format with H.264 codec by the sender.
 * @property thumbnail Video thumbnail; pass null to skip thumbnail uploading.
 * @property cover Cover of the video; pass null to skip cover uploading; not supported in secret chats and for self-destructing messages.
 * @property startTimestamp Timestamp from which the video playing must start, in seconds.
 * @property addedStickerFileIds File identifiers of the stickers added to the video, if applicable.
 * @property duration Duration of the video, in seconds.
 * @property width Video width.
 * @property height Video height.
 * @property supportsStreaming True, if the video is expected to be streamed.
 * @property caption Video caption; pass null to use an empty caption; 0-getOption(&quot;message_caption_length_max&quot;) characters.
 * @property showCaptionAboveMedia True, if the caption must be shown above the video; otherwise, the caption must be shown below the video; not supported in secret chats.
 * @property selfDestructType Video self-destruct type; pass null if none; private chats only.
 * @property hasSpoiler True, if the video preview must be covered by a spoiler animation; not supported in secret chats.
 */
@SerialName(value = "inputMessageVideo")
@Serializable
public class InputMessageVideo public constructor(
    @SerialName(value = "video")
    public val video: InputFile,
    @SerialName(value = "thumbnail")
    public val thumbnail: InputThumbnail?,
    @SerialName(value = "cover")
    public val cover: InputFile?,
    @SerialName(value = "start_timestamp")
    public val startTimestamp: Int,
    @SerialName(value = "added_sticker_file_ids")
    public val addedStickerFileIds: IntArray,
    @SerialName(value = "duration")
    public val duration: Int,
    @SerialName(value = "width")
    public val width: Int,
    @SerialName(value = "height")
    public val height: Int,
    @SerialName(value = "supports_streaming")
    public val supportsStreaming: Boolean,
    @SerialName(value = "caption")
    public val caption: FormattedText?,
    @SerialName(value = "show_caption_above_media")
    public val showCaptionAboveMedia: Boolean,
    @SerialName(value = "self_destruct_type")
    public val selfDestructType: MessageSelfDestructType?,
    @SerialName(value = "has_spoiler")
    public val hasSpoiler: Boolean,
) : InputMessageContent() {
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
        other as InputMessageVideo
        if (other.video != video) {
            return false
        }
        if (other.thumbnail != thumbnail) {
            return false
        }
        if (other.cover != cover) {
            return false
        }
        if (other.startTimestamp != startTimestamp) {
            return false
        }
        val addedStickerFileIdsEquals = other.addedStickerFileIds.contentEquals(addedStickerFileIds)
        if (!addedStickerFileIdsEquals) {
            return false
        }
        if (other.duration != duration) {
            return false
        }
        if (other.width != width) {
            return false
        }
        if (other.height != height) {
            return false
        }
        if (other.supportsStreaming != supportsStreaming) {
            return false
        }
        if (other.caption != caption) {
            return false
        }
        if (other.showCaptionAboveMedia != showCaptionAboveMedia) {
            return false
        }
        if (other.selfDestructType != selfDestructType) {
            return false
        }
        return other.hasSpoiler == hasSpoiler
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + video.hashCode()
        hashCode = 31 * hashCode + thumbnail.hashCode()
        hashCode = 31 * hashCode + cover.hashCode()
        hashCode = 31 * hashCode + startTimestamp.hashCode()
        hashCode = 31 * hashCode + addedStickerFileIds.contentHashCode()
        hashCode = 31 * hashCode + duration.hashCode()
        hashCode = 31 * hashCode + width.hashCode()
        hashCode = 31 * hashCode + height.hashCode()
        hashCode = 31 * hashCode + supportsStreaming.hashCode()
        hashCode = 31 * hashCode + caption.hashCode()
        hashCode = 31 * hashCode + showCaptionAboveMedia.hashCode()
        hashCode = 31 * hashCode + selfDestructType.hashCode()
        hashCode = 31 * hashCode + hasSpoiler.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InputMessageVideo")
            append("(")
            append("video=")
            append(video)
            append(", ")
            append("thumbnail=")
            append(thumbnail)
            append(", ")
            append("cover=")
            append(cover)
            append(", ")
            append("startTimestamp=")
            append(startTimestamp)
            append(", ")
            append("addedStickerFileIds=")
            addedStickerFileIds
                .contentToString()
                .also { append(it) }
            append(", ")
            append("duration=")
            append(duration)
            append(", ")
            append("width=")
            append(width)
            append(", ")
            append("height=")
            append(height)
            append(", ")
            append("supportsStreaming=")
            append(supportsStreaming)
            append(", ")
            append("caption=")
            append(caption)
            append(", ")
            append("showCaptionAboveMedia=")
            append(showCaptionAboveMedia)
            append(", ")
            append("selfDestructType=")
            append(selfDestructType)
            append(", ")
            append("hasSpoiler=")
            append(hasSpoiler)
            append(")")
        }
    }
}
