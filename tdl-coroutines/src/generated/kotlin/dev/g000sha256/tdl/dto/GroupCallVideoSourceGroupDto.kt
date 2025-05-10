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
import kotlin.IntArray
import kotlin.String

/**
 * Describes a group of video synchronization source identifiers.
 *
 * @property semantics The semantics of sources, one of &quot;SIM&quot; or &quot;FID&quot;.
 * @property sourceIds The list of synchronization source identifiers.
 */
public class GroupCallVideoSourceGroupDto public constructor(
    public val semantics: String,
    public val sourceIds: IntArray,
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
        other as GroupCallVideoSourceGroupDto
        if (other.semantics != semantics) {
            return false
        }
        return other.sourceIds.contentEquals(sourceIds)
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + semantics.hashCode()
        hashCode = 31 * hashCode + sourceIds.contentHashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("GroupCallVideoSourceGroupDto")
            append("(")
            append("semantics=")
            append(semantics)
            append(", ")
            append("sourceIds=")
            sourceIds
                .contentToString()
                .also { append(it) }
            append(")")
        }
    }
}
