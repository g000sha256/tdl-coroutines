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

package dev.g000sha256.tdl.dto.update

import kotlin.Any
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String

/**
 * The verification state of an encrypted group call has changed; for group calls not bound to a chat only.
 *
 * @property groupCallId Identifier of the group call.
 * @property generation The call state generation to which the emoji corresponds. If generation is different for two users, then their emoji may be also different.
 * @property emojis Group call state fingerprint represented as 4 emoji; may be empty if the state isn't verified yet.
 */
public class GroupCallVerificationStateUpdateDto public constructor(
    public val groupCallId: Int,
    public val generation: Int,
    public val emojis: Array<String>,
) : UpdateDto() {
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
        other as GroupCallVerificationStateUpdateDto
        if (other.groupCallId != groupCallId) {
            return false
        }
        if (other.generation != generation) {
            return false
        }
        return other.emojis.contentDeepEquals(emojis)
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + groupCallId.hashCode()
        hashCode = 31 * hashCode + generation.hashCode()
        hashCode = 31 * hashCode + emojis.contentDeepHashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("GroupCallVerificationStateUpdateDto")
            append("(")
            append("groupCallId=")
            append(groupCallId)
            append(", ")
            append("generation=")
            append(generation)
            append(", ")
            append("emojis=")
            emojis
                .contentDeepToString()
                .also { append(it) }
            append(")")
        }
    }
}
