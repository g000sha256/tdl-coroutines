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
 * The state of the file download list has changed.
 *
 * @property totalSize Total size of files in the file download list, in bytes.
 * @property totalCount Total number of files in the file download list.
 * @property downloadedSize Total downloaded size of files in the file download list, in bytes.
 */
public class UpdateFileDownloads public constructor(
    public val totalSize: Long,
    public val totalCount: Int,
    public val downloadedSize: Long,
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
        other as UpdateFileDownloads
        if (other.totalSize != totalSize) {
            return false
        }
        if (other.totalCount != totalCount) {
            return false
        }
        return other.downloadedSize == downloadedSize
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + totalSize.hashCode()
        hashCode = 31 * hashCode + totalCount.hashCode()
        hashCode = 31 * hashCode + downloadedSize.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("UpdateFileDownloads")
            append("(")
            append("totalSize=")
            append(totalSize)
            append(", ")
            append("totalCount=")
            append(totalCount)
            append(", ")
            append("downloadedSize=")
            append(downloadedSize)
            append(")")
        }
    }
}
