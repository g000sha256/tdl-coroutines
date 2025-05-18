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
 * Contains a list of message positions.
 *
 * @property totalCount Total number of messages found.
 * @property positions List of message positions.
 */
public class MessagePositions public constructor(
    public val totalCount: Int,
    public val positions: Array<MessagePosition>,
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
        other as MessagePositions
        if (other.totalCount != totalCount) {
            return false
        }
        return other.positions.contentDeepEquals(positions)
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + totalCount.hashCode()
        hashCode = 31 * hashCode + positions.contentDeepHashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("MessagePositions")
            append("(")
            append("totalCount=")
            append(totalCount)
            append(", ")
            append("positions=")
            positions
                .contentDeepToString()
                .also { append(it) }
            append(")")
        }
    }
}
