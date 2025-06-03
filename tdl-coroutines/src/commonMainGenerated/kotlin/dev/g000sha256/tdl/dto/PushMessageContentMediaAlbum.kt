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
 * A media album.
 *
 * @property totalCount Number of messages in the album.
 * @property hasPhotos True, if the album has at least one photo.
 * @property hasVideos True, if the album has at least one video file.
 * @property hasAudios True, if the album has at least one audio file.
 * @property hasDocuments True, if the album has at least one document.
 */
public class PushMessageContentMediaAlbum public constructor(
    public val totalCount: Int,
    public val hasPhotos: Boolean,
    public val hasVideos: Boolean,
    public val hasAudios: Boolean,
    public val hasDocuments: Boolean,
) : PushMessageContent() {
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
        other as PushMessageContentMediaAlbum
        if (other.totalCount != totalCount) {
            return false
        }
        if (other.hasPhotos != hasPhotos) {
            return false
        }
        if (other.hasVideos != hasVideos) {
            return false
        }
        if (other.hasAudios != hasAudios) {
            return false
        }
        return other.hasDocuments == hasDocuments
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + totalCount.hashCode()
        hashCode = 31 * hashCode + hasPhotos.hashCode()
        hashCode = 31 * hashCode + hasVideos.hashCode()
        hashCode = 31 * hashCode + hasAudios.hashCode()
        hashCode = 31 * hashCode + hasDocuments.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("PushMessageContentMediaAlbum")
            append("(")
            append("totalCount=")
            append(totalCount)
            append(", ")
            append("hasPhotos=")
            append(hasPhotos)
            append(", ")
            append("hasVideos=")
            append(hasVideos)
            append(", ")
            append("hasAudios=")
            append(hasAudios)
            append(", ")
            append("hasDocuments=")
            append(hasDocuments)
            append(")")
        }
    }
}
