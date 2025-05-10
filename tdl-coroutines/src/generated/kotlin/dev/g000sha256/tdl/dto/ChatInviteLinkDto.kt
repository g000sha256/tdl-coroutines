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
import kotlin.String

/**
 * Contains a chat invite link.
 *
 * @property inviteLink Chat invite link.
 * @property name Name of the link.
 * @property creatorUserId User identifier of an administrator created the link.
 * @property date Point in time (Unix timestamp) when the link was created.
 * @property editDate Point in time (Unix timestamp) when the link was last edited; 0 if never or unknown.
 * @property expirationDate Point in time (Unix timestamp) when the link will expire; 0 if never.
 * @property subscriptionPricing Information about subscription plan that is applied to the users joining the chat by the link; may be null if the link doesn't require subscription.
 * @property memberLimit The maximum number of members, which can join the chat using the link simultaneously; 0 if not limited. Always 0 if the link requires approval.
 * @property memberCount Number of chat members, which joined the chat using the link.
 * @property expiredMemberCount Number of chat members, which joined the chat using the link, but have already left because of expired subscription; for subscription links only.
 * @property pendingJoinRequestCount Number of pending join requests created using this link.
 * @property createsJoinRequest True, if the link only creates join request. If true, total number of joining members will be unlimited.
 * @property isPrimary True, if the link is primary. Primary invite link can't have name, expiration date, or usage limit. There is exactly one primary invite link for each administrator with canInviteUsers right at a given time.
 * @property isRevoked True, if the link was revoked.
 */
public class ChatInviteLinkDto public constructor(
    public val inviteLink: String,
    public val name: String,
    public val creatorUserId: Long,
    public val date: Int,
    public val editDate: Int,
    public val expirationDate: Int,
    public val subscriptionPricing: StarSubscriptionPricingDto?,
    public val memberLimit: Int,
    public val memberCount: Int,
    public val expiredMemberCount: Int,
    public val pendingJoinRequestCount: Int,
    public val createsJoinRequest: Boolean,
    public val isPrimary: Boolean,
    public val isRevoked: Boolean,
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
        other as ChatInviteLinkDto
        if (other.inviteLink != inviteLink) {
            return false
        }
        if (other.name != name) {
            return false
        }
        if (other.creatorUserId != creatorUserId) {
            return false
        }
        if (other.date != date) {
            return false
        }
        if (other.editDate != editDate) {
            return false
        }
        if (other.expirationDate != expirationDate) {
            return false
        }
        if (other.subscriptionPricing != subscriptionPricing) {
            return false
        }
        if (other.memberLimit != memberLimit) {
            return false
        }
        if (other.memberCount != memberCount) {
            return false
        }
        if (other.expiredMemberCount != expiredMemberCount) {
            return false
        }
        if (other.pendingJoinRequestCount != pendingJoinRequestCount) {
            return false
        }
        if (other.createsJoinRequest != createsJoinRequest) {
            return false
        }
        if (other.isPrimary != isPrimary) {
            return false
        }
        return other.isRevoked == isRevoked
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + inviteLink.hashCode()
        hashCode = 31 * hashCode + name.hashCode()
        hashCode = 31 * hashCode + creatorUserId.hashCode()
        hashCode = 31 * hashCode + date.hashCode()
        hashCode = 31 * hashCode + editDate.hashCode()
        hashCode = 31 * hashCode + expirationDate.hashCode()
        hashCode = 31 * hashCode + subscriptionPricing.hashCode()
        hashCode = 31 * hashCode + memberLimit.hashCode()
        hashCode = 31 * hashCode + memberCount.hashCode()
        hashCode = 31 * hashCode + expiredMemberCount.hashCode()
        hashCode = 31 * hashCode + pendingJoinRequestCount.hashCode()
        hashCode = 31 * hashCode + createsJoinRequest.hashCode()
        hashCode = 31 * hashCode + isPrimary.hashCode()
        hashCode = 31 * hashCode + isRevoked.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ChatInviteLinkDto")
            append("(")
            append("inviteLink=")
            append(inviteLink)
            append(", ")
            append("name=")
            append(name)
            append(", ")
            append("creatorUserId=")
            append(creatorUserId)
            append(", ")
            append("date=")
            append(date)
            append(", ")
            append("editDate=")
            append(editDate)
            append(", ")
            append("expirationDate=")
            append(expirationDate)
            append(", ")
            append("subscriptionPricing=")
            append(subscriptionPricing)
            append(", ")
            append("memberLimit=")
            append(memberLimit)
            append(", ")
            append("memberCount=")
            append(memberCount)
            append(", ")
            append("expiredMemberCount=")
            append(expiredMemberCount)
            append(", ")
            append("pendingJoinRequestCount=")
            append(pendingJoinRequestCount)
            append(", ")
            append("createsJoinRequest=")
            append(createsJoinRequest)
            append(", ")
            append("isPrimary=")
            append(isPrimary)
            append(", ")
            append("isRevoked=")
            append(isRevoked)
            append(")")
        }
    }
}
