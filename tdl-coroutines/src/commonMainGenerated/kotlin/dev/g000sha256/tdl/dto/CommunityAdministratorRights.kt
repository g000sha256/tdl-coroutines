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
 * Describes rights of the administrator in a community.
 *
 * @property canManageCommunity True, if the user is an administrator. Implied by any other privilege.
 * @property canChangeInfo True, if the administrator can change the community name, photo, and other settings.
 * @property canEditChatList True, if the user can change the chats added to the community.
 * @property canPromoteMembers True, if the administrator can add new administrators with a subset of their own privileges or demote administrators that were directly or indirectly promoted by them.
 * @property canBanMembers True, if the administrator can ban, or unban community members.
 */
public class CommunityAdministratorRights public constructor(
    public val canManageCommunity: Boolean,
    public val canChangeInfo: Boolean,
    public val canEditChatList: Boolean,
    public val canPromoteMembers: Boolean,
    public val canBanMembers: Boolean,
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
        other as CommunityAdministratorRights
        if (other.canManageCommunity != canManageCommunity) {
            return false
        }
        if (other.canChangeInfo != canChangeInfo) {
            return false
        }
        if (other.canEditChatList != canEditChatList) {
            return false
        }
        if (other.canPromoteMembers != canPromoteMembers) {
            return false
        }
        return other.canBanMembers == canBanMembers
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + canManageCommunity.hashCode()
        hashCode = 31 * hashCode + canChangeInfo.hashCode()
        hashCode = 31 * hashCode + canEditChatList.hashCode()
        hashCode = 31 * hashCode + canPromoteMembers.hashCode()
        hashCode = 31 * hashCode + canBanMembers.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("CommunityAdministratorRights")
            append("(")
            append("canManageCommunity=")
            append(canManageCommunity)
            append(", ")
            append("canChangeInfo=")
            append(canChangeInfo)
            append(", ")
            append("canEditChatList=")
            append(canEditChatList)
            append(", ")
            append("canPromoteMembers=")
            append(canPromoteMembers)
            append(", ")
            append("canBanMembers=")
            append(canBanMembers)
            append(")")
        }
    }
}
