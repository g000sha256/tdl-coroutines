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
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Information about a group call was updated.
 *
 * @property groupCall New data about the group call.
 */
@SerialName(value = "updateGroupCall")
@Serializable
public class UpdateGroupCall public constructor(
    @SerialName(value = "group_call")
    public val groupCall: GroupCall,
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
        other as UpdateGroupCall
        return other.groupCall == groupCall
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + groupCall.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("UpdateGroupCall")
            append("(")
            append("groupCall=")
            append(groupCall)
            append(")")
        }
    }
}
