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
 * Contains the storage usage statistics for a specific file type.
 *
 * @property fileType File type.
 * @property size Total size of the files, in bytes.
 * @property count Total number of files.
 */
public class StorageStatisticsByFileTypeDto public constructor(
    public val fileType: FileTypeDto,
    public val size: Long,
    public val count: Int,
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
        other as StorageStatisticsByFileTypeDto
        if (other.fileType != fileType) {
            return false
        }
        if (other.size != size) {
            return false
        }
        return other.count == count
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + fileType.hashCode()
        hashCode = 31 * hashCode + size.hashCode()
        hashCode = 31 * hashCode + count.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("StorageStatisticsByFileTypeDto")
            append("(")
            append("fileType=")
            append(fileType)
            append(", ")
            append("size=")
            append(size)
            append(", ")
            append("count=")
            append(count)
            append(")")
        }
    }
}
