/*
 * Copyright 2026 Georgii Ippolitov (g000sha256)
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
 * The user is a member of the community and has some additional privileges.
 *
 * @property canBeEdited True, if the current user can edit the administrator privileges for the called user.
 * @property rights Rights of the administrator.
 */
public class CommunityMemberStatusAdministrator public constructor(
    public val canBeEdited: Boolean,
    public val rights: CommunityAdministratorRights,
) : CommunityMemberStatus() {
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
        other as CommunityMemberStatusAdministrator
        if (other.canBeEdited != canBeEdited) {
            return false
        }
        return other.rights == rights
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + canBeEdited.hashCode()
        hashCode = 31 * hashCode + rights.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("CommunityMemberStatusAdministrator")
            append("(")
            append("canBeEdited=")
            append(canBeEdited)
            append(", ")
            append("rights=")
            append(rights)
            append(")")
        }
    }
}
