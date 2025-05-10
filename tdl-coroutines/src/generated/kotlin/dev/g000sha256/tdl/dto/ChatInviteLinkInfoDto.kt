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
import kotlin.Long
import kotlin.LongArray
import kotlin.String

/**
 * Contains information about a chat invite link.
 *
 * @property chatId Chat identifier of the invite link; 0 if the user has no access to the chat before joining.
 * @property accessibleFor If non-zero, the amount of time for which read access to the chat will remain available, in seconds.
 * @property type Type of the chat.
 * @property title Title of the chat.
 * @property photo Chat photo; may be null.
 * @property accentColorId Identifier of the accent color for chat title and background of chat photo.
 * @property description Chat description.
 * @property memberCount Number of members in the chat.
 * @property memberUserIds User identifiers of some chat members that may be known to the current user.
 * @property subscriptionInfo Information about subscription plan that must be paid by the user to use the link; may be null if the link doesn't require subscription.
 * @property createsJoinRequest True, if the link only creates join request.
 * @property isPublic True, if the chat is a public supergroup or channel, i.e. it has a username or it is a location-based supergroup.
 * @property verificationStatus Information about verification status of the chat; may be null if none.
 */
public class ChatInviteLinkInfoDto public constructor(
    public val chatId: Long,
    public val accessibleFor: Int,
    public val type: InviteLinkChatTypeDto,
    public val title: String,
    public val photo: ChatPhotoInfoDto?,
    public val accentColorId: Int,
    public val description: String,
    public val memberCount: Int,
    public val memberUserIds: LongArray,
    public val subscriptionInfo: ChatInviteLinkSubscriptionInfoDto?,
    public val createsJoinRequest: Boolean,
    public val isPublic: Boolean,
    public val verificationStatus: VerificationStatusDto?,
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
        other as ChatInviteLinkInfoDto
        if (other.chatId != chatId) {
            return false
        }
        if (other.accessibleFor != accessibleFor) {
            return false
        }
        if (other.type != type) {
            return false
        }
        if (other.title != title) {
            return false
        }
        if (other.photo != photo) {
            return false
        }
        if (other.accentColorId != accentColorId) {
            return false
        }
        if (other.description != description) {
            return false
        }
        if (other.memberCount != memberCount) {
            return false
        }
        val memberUserIdsEquals = other.memberUserIds.contentEquals(memberUserIds)
        if (!memberUserIdsEquals) {
            return false
        }
        if (other.subscriptionInfo != subscriptionInfo) {
            return false
        }
        if (other.createsJoinRequest != createsJoinRequest) {
            return false
        }
        if (other.isPublic != isPublic) {
            return false
        }
        return other.verificationStatus == verificationStatus
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + chatId.hashCode()
        hashCode = 31 * hashCode + accessibleFor.hashCode()
        hashCode = 31 * hashCode + type.hashCode()
        hashCode = 31 * hashCode + title.hashCode()
        hashCode = 31 * hashCode + photo.hashCode()
        hashCode = 31 * hashCode + accentColorId.hashCode()
        hashCode = 31 * hashCode + description.hashCode()
        hashCode = 31 * hashCode + memberCount.hashCode()
        hashCode = 31 * hashCode + memberUserIds.contentHashCode()
        hashCode = 31 * hashCode + subscriptionInfo.hashCode()
        hashCode = 31 * hashCode + createsJoinRequest.hashCode()
        hashCode = 31 * hashCode + isPublic.hashCode()
        hashCode = 31 * hashCode + verificationStatus.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ChatInviteLinkInfoDto")
            append("(")
            append("chatId=")
            append(chatId)
            append(", ")
            append("accessibleFor=")
            append(accessibleFor)
            append(", ")
            append("type=")
            append(type)
            append(", ")
            append("title=")
            append(title)
            append(", ")
            append("photo=")
            append(photo)
            append(", ")
            append("accentColorId=")
            append(accentColorId)
            append(", ")
            append("description=")
            append(description)
            append(", ")
            append("memberCount=")
            append(memberCount)
            append(", ")
            append("memberUserIds=")
            memberUserIds
                .contentToString()
                .also { append(it) }
            append(", ")
            append("subscriptionInfo=")
            append(subscriptionInfo)
            append(", ")
            append("createsJoinRequest=")
            append(createsJoinRequest)
            append(", ")
            append("isPublic=")
            append(isPublic)
            append(", ")
            append("verificationStatus=")
            append(verificationStatus)
            append(")")
        }
    }
}
