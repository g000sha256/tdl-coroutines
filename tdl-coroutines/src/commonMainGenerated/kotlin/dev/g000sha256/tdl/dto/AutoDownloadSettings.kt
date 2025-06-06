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
 * Contains auto-download settings.
 *
 * @property isAutoDownloadEnabled True, if the auto-download is enabled.
 * @property maxPhotoFileSize The maximum size of a photo file to be auto-downloaded, in bytes.
 * @property maxVideoFileSize The maximum size of a video file to be auto-downloaded, in bytes.
 * @property maxOtherFileSize The maximum size of other file types to be auto-downloaded, in bytes.
 * @property videoUploadBitrate The maximum suggested bitrate for uploaded videos, in kbit/s.
 * @property preloadLargeVideos True, if the beginning of video files needs to be preloaded for instant playback.
 * @property preloadNextAudio True, if the next audio track needs to be preloaded while the user is listening to an audio file.
 * @property preloadStories True, if stories needs to be preloaded.
 * @property useLessDataForCalls True, if &quot;use less data for calls&quot; option needs to be enabled.
 */
public class AutoDownloadSettings public constructor(
    public val isAutoDownloadEnabled: Boolean,
    public val maxPhotoFileSize: Int,
    public val maxVideoFileSize: Long,
    public val maxOtherFileSize: Long,
    public val videoUploadBitrate: Int,
    public val preloadLargeVideos: Boolean,
    public val preloadNextAudio: Boolean,
    public val preloadStories: Boolean,
    public val useLessDataForCalls: Boolean,
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
        other as AutoDownloadSettings
        if (other.isAutoDownloadEnabled != isAutoDownloadEnabled) {
            return false
        }
        if (other.maxPhotoFileSize != maxPhotoFileSize) {
            return false
        }
        if (other.maxVideoFileSize != maxVideoFileSize) {
            return false
        }
        if (other.maxOtherFileSize != maxOtherFileSize) {
            return false
        }
        if (other.videoUploadBitrate != videoUploadBitrate) {
            return false
        }
        if (other.preloadLargeVideos != preloadLargeVideos) {
            return false
        }
        if (other.preloadNextAudio != preloadNextAudio) {
            return false
        }
        if (other.preloadStories != preloadStories) {
            return false
        }
        return other.useLessDataForCalls == useLessDataForCalls
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + isAutoDownloadEnabled.hashCode()
        hashCode = 31 * hashCode + maxPhotoFileSize.hashCode()
        hashCode = 31 * hashCode + maxVideoFileSize.hashCode()
        hashCode = 31 * hashCode + maxOtherFileSize.hashCode()
        hashCode = 31 * hashCode + videoUploadBitrate.hashCode()
        hashCode = 31 * hashCode + preloadLargeVideos.hashCode()
        hashCode = 31 * hashCode + preloadNextAudio.hashCode()
        hashCode = 31 * hashCode + preloadStories.hashCode()
        hashCode = 31 * hashCode + useLessDataForCalls.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("AutoDownloadSettings")
            append("(")
            append("isAutoDownloadEnabled=")
            append(isAutoDownloadEnabled)
            append(", ")
            append("maxPhotoFileSize=")
            append(maxPhotoFileSize)
            append(", ")
            append("maxVideoFileSize=")
            append(maxVideoFileSize)
            append(", ")
            append("maxOtherFileSize=")
            append(maxOtherFileSize)
            append(", ")
            append("videoUploadBitrate=")
            append(videoUploadBitrate)
            append(", ")
            append("preloadLargeVideos=")
            append(preloadLargeVideos)
            append(", ")
            append("preloadNextAudio=")
            append(preloadNextAudio)
            append(", ")
            append("preloadStories=")
            append(preloadStories)
            append(", ")
            append("useLessDataForCalls=")
            append(useLessDataForCalls)
            append(")")
        }
    }
}
