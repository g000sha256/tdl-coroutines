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
import kotlin.Long
import kotlin.String

/**
 * Contains the exact storage usage statistics split by chats and file type.
 *
 * @property size Total size of files, in bytes.
 * @property count Total number of files.
 * @property byChat Statistics split by chats.
 */
public class StorageStatisticsDto public constructor(
    public val size: Long,
    public val count: Int,
    public val byChat: Array<StorageStatisticsByChatDto>,
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
        other as StorageStatisticsDto
        if (other.size != size) {
            return false
        }
        if (other.count != count) {
            return false
        }
        return other.byChat.contentDeepEquals(byChat)
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + size.hashCode()
        hashCode = 31 * hashCode + count.hashCode()
        hashCode = 31 * hashCode + byChat.contentDeepHashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("StorageStatisticsDto")
            append("(")
            append("size=")
            append(size)
            append(", ")
            append("count=")
            append(count)
            append(", ")
            append("byChat=")
            byChat
                .contentDeepToString()
                .also { append(it) }
            append(")")
        }
    }
}
