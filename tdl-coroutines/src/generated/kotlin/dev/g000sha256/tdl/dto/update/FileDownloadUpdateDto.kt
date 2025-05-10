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

package dev.g000sha256.tdl.dto.update

import dev.g000sha256.tdl.dto.DownloadedFileCountsDto
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.String

/**
 * A file download was changed. This update is sent only after file download list is loaded for the first time.
 *
 * @property fileId File identifier.
 * @property completeDate Point in time (Unix timestamp) when the file downloading was completed; 0 if the file downloading isn't completed.
 * @property isPaused True, if downloading of the file is paused.
 * @property counts New number of being downloaded and recently downloaded files found.
 */
public class FileDownloadUpdateDto public constructor(
    public val fileId: Int,
    public val completeDate: Int,
    public val isPaused: Boolean,
    public val counts: DownloadedFileCountsDto,
) : UpdateDto() {
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
        other as FileDownloadUpdateDto
        if (other.fileId != fileId) {
            return false
        }
        if (other.completeDate != completeDate) {
            return false
        }
        if (other.isPaused != isPaused) {
            return false
        }
        return other.counts == counts
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + fileId.hashCode()
        hashCode = 31 * hashCode + completeDate.hashCode()
        hashCode = 31 * hashCode + isPaused.hashCode()
        hashCode = 31 * hashCode + counts.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("FileDownloadUpdateDto")
            append("(")
            append("fileId=")
            append(fileId)
            append(", ")
            append("completeDate=")
            append(completeDate)
            append(", ")
            append("isPaused=")
            append(isPaused)
            append(", ")
            append("counts=")
            append(counts)
            append(")")
        }
    }
}
