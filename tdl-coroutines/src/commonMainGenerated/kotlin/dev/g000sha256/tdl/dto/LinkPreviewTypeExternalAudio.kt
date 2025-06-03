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
 * The link is a link to an audio file.
 *
 * @property url URL of the audio file.
 * @property mimeType MIME type of the audio file.
 * @property duration Duration of the audio, in seconds; 0 if unknown.
 */
public class LinkPreviewTypeExternalAudio public constructor(
    public val url: String,
    public val mimeType: String,
    public val duration: Int,
) : LinkPreviewType() {
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
        other as LinkPreviewTypeExternalAudio
        if (other.url != url) {
            return false
        }
        if (other.mimeType != mimeType) {
            return false
        }
        return other.duration == duration
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + url.hashCode()
        hashCode = 31 * hashCode + mimeType.hashCode()
        hashCode = 31 * hashCode + duration.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("LinkPreviewTypeExternalAudio")
            append("(")
            append("url=")
            append(url)
            append(", ")
            append("mimeType=")
            append(mimeType)
            append(", ")
            append("duration=")
            append(duration)
            append(")")
        }
    }
}
