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
 * The freeze state of the current user's account has changed.
 *
 * @property isFrozen True, if the account is frozen.
 * @property freezingDate Point in time (Unix timestamp) when the account was frozen; 0 if the account isn't frozen.
 * @property deletionDate Point in time (Unix timestamp) when the account will be deleted and can't be unfrozen; 0 if the account isn't frozen.
 * @property appealLink The link to open to send an appeal to unfreeze the account.
 */
public class UpdateFreezeState public constructor(
    public val isFrozen: Boolean,
    public val freezingDate: Int,
    public val deletionDate: Int,
    public val appealLink: String,
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
        other as UpdateFreezeState
        if (other.isFrozen != isFrozen) {
            return false
        }
        if (other.freezingDate != freezingDate) {
            return false
        }
        if (other.deletionDate != deletionDate) {
            return false
        }
        return other.appealLink == appealLink
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + isFrozen.hashCode()
        hashCode = 31 * hashCode + freezingDate.hashCode()
        hashCode = 31 * hashCode + deletionDate.hashCode()
        hashCode = 31 * hashCode + appealLink.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("UpdateFreezeState")
            append("(")
            append("isFrozen=")
            append(isFrozen)
            append(", ")
            append("freezingDate=")
            append(freezingDate)
            append(", ")
            append("deletionDate=")
            append(deletionDate)
            append(", ")
            append("appealLink=")
            append(appealLink)
            append(")")
        }
    }
}
