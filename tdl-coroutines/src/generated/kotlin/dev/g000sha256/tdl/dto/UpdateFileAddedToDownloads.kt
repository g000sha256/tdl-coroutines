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
 * A file was added to the file download list. This update is sent only after file download list is loaded for the first time.
 *
 * @property fileDownload The added file download.
 * @property counts New number of being downloaded and recently downloaded files found.
 */
public class UpdateFileAddedToDownloads public constructor(
    public val fileDownload: FileDownload,
    public val counts: DownloadedFileCounts,
) : Update() {
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
        other as UpdateFileAddedToDownloads
        if (other.fileDownload != fileDownload) {
            return false
        }
        return other.counts == counts
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + fileDownload.hashCode()
        hashCode = 31 * hashCode + counts.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("UpdateFileAddedToDownloads")
            append("(")
            append("fileDownload=")
            append(fileDownload)
            append(", ")
            append("counts=")
            append(counts)
            append(")")
        }
    }
}
