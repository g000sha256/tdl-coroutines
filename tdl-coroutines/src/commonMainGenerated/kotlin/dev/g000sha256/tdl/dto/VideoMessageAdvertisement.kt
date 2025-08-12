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
import kotlin.Long
import kotlin.String

/**
 * Describes an advertisent to be shown while a video from a message is watched.
 *
 * @property uniqueId Unique identifier of this result.
 * @property text Text of the advertisement.
 * @property minDisplayDuration The minimum amount of time the advertisement must be displayed before it can be hidden by the user, in seconds.
 * @property maxDisplayDuration The maximum amount of time the advertisement must be displayed before it must be automatically hidden, in seconds.
 * @property canBeReported True, if the advertisement can be reported to Telegram moderators through reportVideoMessageAdvertisement.
 * @property sponsor Information about the sponsor of the advertisement.
 * @property title Title of the sponsored message.
 * @property additionalInfo If non-empty, additional information about the sponsored message to be shown along with the message.
 */
public class VideoMessageAdvertisement public constructor(
    public val uniqueId: Long,
    public val text: String,
    public val minDisplayDuration: Int,
    public val maxDisplayDuration: Int,
    public val canBeReported: Boolean,
    public val sponsor: AdvertisementSponsor,
    public val title: String,
    public val additionalInfo: String,
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
        other as VideoMessageAdvertisement
        if (other.uniqueId != uniqueId) {
            return false
        }
        if (other.text != text) {
            return false
        }
        if (other.minDisplayDuration != minDisplayDuration) {
            return false
        }
        if (other.maxDisplayDuration != maxDisplayDuration) {
            return false
        }
        if (other.canBeReported != canBeReported) {
            return false
        }
        if (other.sponsor != sponsor) {
            return false
        }
        if (other.title != title) {
            return false
        }
        return other.additionalInfo == additionalInfo
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + uniqueId.hashCode()
        hashCode = 31 * hashCode + text.hashCode()
        hashCode = 31 * hashCode + minDisplayDuration.hashCode()
        hashCode = 31 * hashCode + maxDisplayDuration.hashCode()
        hashCode = 31 * hashCode + canBeReported.hashCode()
        hashCode = 31 * hashCode + sponsor.hashCode()
        hashCode = 31 * hashCode + title.hashCode()
        hashCode = 31 * hashCode + additionalInfo.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("VideoMessageAdvertisement")
            append("(")
            append("uniqueId=")
            append(uniqueId)
            append(", ")
            append("text=")
            append(text)
            append(", ")
            append("minDisplayDuration=")
            append(minDisplayDuration)
            append(", ")
            append("maxDisplayDuration=")
            append(maxDisplayDuration)
            append(", ")
            append("canBeReported=")
            append(canBeReported)
            append(", ")
            append("sponsor=")
            append(sponsor)
            append(", ")
            append("title=")
            append(title)
            append(", ")
            append("additionalInfo=")
            append(additionalInfo)
            append(")")
        }
    }
}
