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
 * Represents a list of affiliate programs that were connected to an affiliate.
 *
 * @property totalCount The total number of affiliate programs that were connected to the affiliate.
 * @property programs The list of connected affiliate programs.
 * @property nextOffset The offset for the next request. If empty, then there are no more results.
 */
public class ConnectedAffiliateProgramsDto public constructor(
    public val totalCount: Int,
    public val programs: Array<ConnectedAffiliateProgramDto>,
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
        other as ConnectedAffiliateProgramsDto
        if (other.totalCount != totalCount) {
            return false
        }
        val programsEquals = other.programs.contentDeepEquals(programs)
        if (!programsEquals) {
            return false
        }
        return other.nextOffset == nextOffset
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + totalCount.hashCode()
        hashCode = 31 * hashCode + programs.contentDeepHashCode()
        hashCode = 31 * hashCode + nextOffset.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ConnectedAffiliateProgramsDto")
            append("(")
            append("totalCount=")
            append(totalCount)
            append(", ")
            append("programs=")
            programs
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("nextOffset=")
            append(nextOffset)
            append(")")
        }
    }
}
