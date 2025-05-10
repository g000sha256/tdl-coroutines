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
 * Contains autosave settings for an autosave settings scope.
 *
 * @property autosavePhotos True, if photo autosave is enabled.
 * @property autosaveVideos True, if video autosave is enabled.
 * @property maxVideoFileSize The maximum size of a video file to be autosaved, in bytes; 512 KB - 4000 MB.
 */
public class ScopeAutosaveSettingsDto public constructor(
    public val autosavePhotos: Boolean,
    public val autosaveVideos: Boolean,
    public val maxVideoFileSize: Long,
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
        other as ScopeAutosaveSettingsDto
        if (other.autosavePhotos != autosavePhotos) {
            return false
        }
        if (other.autosaveVideos != autosaveVideos) {
            return false
        }
        return other.maxVideoFileSize == maxVideoFileSize
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + autosavePhotos.hashCode()
        hashCode = 31 * hashCode + autosaveVideos.hashCode()
        hashCode = 31 * hashCode + maxVideoFileSize.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ScopeAutosaveSettingsDto")
            append("(")
            append("autosavePhotos=")
            append(autosavePhotos)
            append(", ")
            append("autosaveVideos=")
            append(autosaveVideos)
            append(", ")
            append("maxVideoFileSize=")
            append(maxVideoFileSize)
            append(")")
        }
    }
}
