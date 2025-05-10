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
 * Represents a file.
 *
 * @property id Unique file identifier.
 * @property size File size, in bytes; 0 if unknown.
 * @property expectedSize Approximate file size in bytes in case the exact file size is unknown. Can be used to show download/upload progress.
 * @property local Information about the local copy of the file.
 * @property remote Information about the remote copy of the file.
 */
public class FileDto public constructor(
    public val id: Int,
    public val size: Long,
    public val expectedSize: Long,
    public val local: LocalFileDto,
    public val remote: RemoteFileDto,
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
        other as FileDto
        if (other.id != id) {
            return false
        }
        if (other.size != size) {
            return false
        }
        if (other.expectedSize != expectedSize) {
            return false
        }
        if (other.local != local) {
            return false
        }
        return other.remote == remote
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + id.hashCode()
        hashCode = 31 * hashCode + size.hashCode()
        hashCode = 31 * hashCode + expectedSize.hashCode()
        hashCode = 31 * hashCode + local.hashCode()
        hashCode = 31 * hashCode + remote.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("FileDto")
            append("(")
            append("id=")
            append(id)
            append(", ")
            append("size=")
            append(size)
            append(", ")
            append("expectedSize=")
            append(expectedSize)
            append(", ")
            append("local=")
            append(local)
            append(", ")
            append("remote=")
            append(remote)
            append(")")
        }
    }
}
