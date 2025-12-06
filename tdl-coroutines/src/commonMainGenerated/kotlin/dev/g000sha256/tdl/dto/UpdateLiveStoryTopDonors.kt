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
 * The list of top donors in live story group call has changed.
 *
 * @property groupCallId Identifier of the group call.
 * @property donors New list of live story donors.
 */
public class UpdateLiveStoryTopDonors public constructor(
    public val groupCallId: Int,
    public val donors: LiveStoryDonors,
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
        other as UpdateLiveStoryTopDonors
        if (other.groupCallId != groupCallId) {
            return false
        }
        return other.donors == donors
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + groupCallId.hashCode()
        hashCode = 31 * hashCode + donors.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("UpdateLiveStoryTopDonors")
            append("(")
            append("groupCallId=")
            append(groupCallId)
            append(", ")
            append("donors=")
            append(donors)
            append(")")
        }
    }
}
