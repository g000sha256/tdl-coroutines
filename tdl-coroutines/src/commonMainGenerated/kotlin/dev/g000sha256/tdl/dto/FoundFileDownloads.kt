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
 * Contains a list of downloaded files, found by a search.
 *
 * @property totalCounts Total number of suitable files, ignoring offset.
 * @property files The list of files.
 * @property nextOffset The offset for the next request. If empty, then there are no more results.
 */
public class FoundFileDownloads public constructor(
    public val totalCounts: DownloadedFileCounts,
    public val files: Array<FileDownload>,
    public val nextOffset: String,
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
        other as FoundFileDownloads
        if (other.totalCounts != totalCounts) {
            return false
        }
        val filesEquals = other.files.contentDeepEquals(files)
        if (!filesEquals) {
            return false
        }
        return other.nextOffset == nextOffset
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + totalCounts.hashCode()
        hashCode = 31 * hashCode + files.contentDeepHashCode()
        hashCode = 31 * hashCode + nextOffset.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("FoundFileDownloads")
            append("(")
            append("totalCounts=")
            append(totalCounts)
            append(", ")
            append("files=")
            files
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("nextOffset=")
            append(nextOffset)
            append(")")
        }
    }
}
