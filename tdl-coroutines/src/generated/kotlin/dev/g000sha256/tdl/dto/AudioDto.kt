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
 * Describes an audio file. Audio is usually in MP3 or M4A format.
 *
 * @property duration Duration of the audio, in seconds; as defined by the sender.
 * @property title Title of the audio; as defined by the sender.
 * @property performer Performer of the audio; as defined by the sender.
 * @property fileName Original name of the file; as defined by the sender.
 * @property mimeType The MIME type of the file; as defined by the sender.
 * @property albumCoverMinithumbnail The minithumbnail of the album cover; may be null.
 * @property albumCoverThumbnail The thumbnail of the album cover in JPEG format; as defined by the sender. The full size thumbnail is expected to be extracted from the downloaded audio file; may be null.
 * @property externalAlbumCovers Album cover variants to use if the downloaded audio file contains no album cover. Provided thumbnail dimensions are approximate.
 * @property audio File containing the audio.
 */
public class AudioDto public constructor(
    public val duration: Int,
    public val title: String,
    public val performer: String,
    public val fileName: String,
    public val mimeType: String,
    public val albumCoverMinithumbnail: MinithumbnailDto?,
    public val albumCoverThumbnail: ThumbnailDto?,
    public val externalAlbumCovers: Array<ThumbnailDto>,
    public val audio: FileDto,
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
        other as AudioDto
        if (other.duration != duration) {
            return false
        }
        if (other.title != title) {
            return false
        }
        if (other.performer != performer) {
            return false
        }
        if (other.fileName != fileName) {
            return false
        }
        if (other.mimeType != mimeType) {
            return false
        }
        if (other.albumCoverMinithumbnail != albumCoverMinithumbnail) {
            return false
        }
        if (other.albumCoverThumbnail != albumCoverThumbnail) {
            return false
        }
        val externalAlbumCoversEquals = other.externalAlbumCovers.contentDeepEquals(externalAlbumCovers)
        if (!externalAlbumCoversEquals) {
            return false
        }
        return other.audio == audio
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + duration.hashCode()
        hashCode = 31 * hashCode + title.hashCode()
        hashCode = 31 * hashCode + performer.hashCode()
        hashCode = 31 * hashCode + fileName.hashCode()
        hashCode = 31 * hashCode + mimeType.hashCode()
        hashCode = 31 * hashCode + albumCoverMinithumbnail.hashCode()
        hashCode = 31 * hashCode + albumCoverThumbnail.hashCode()
        hashCode = 31 * hashCode + externalAlbumCovers.contentDeepHashCode()
        hashCode = 31 * hashCode + audio.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("AudioDto")
            append("(")
            append("duration=")
            append(duration)
            append(", ")
            append("title=")
            append(title)
            append(", ")
            append("performer=")
            append(performer)
            append(", ")
            append("fileName=")
            append(fileName)
            append(", ")
            append("mimeType=")
            append(mimeType)
            append(", ")
            append("albumCoverMinithumbnail=")
            append(albumCoverMinithumbnail)
            append(", ")
            append("albumCoverThumbnail=")
            append(albumCoverThumbnail)
            append(", ")
            append("externalAlbumCovers=")
            externalAlbumCovers
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("audio=")
            append(audio)
            append(")")
        }
    }
}
