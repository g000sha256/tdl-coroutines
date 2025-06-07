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
 * Represents a set of filters used to obtain a chat event log.
 *
 * @property messageEdits True, if message edits need to be returned.
 * @property messageDeletions True, if message deletions need to be returned.
 * @property messagePins True, if pin/unpin events need to be returned.
 * @property memberJoins True, if members joining events need to be returned.
 * @property memberLeaves True, if members leaving events need to be returned.
 * @property memberInvites True, if invited member events need to be returned.
 * @property memberPromotions True, if member promotion/demotion events need to be returned.
 * @property memberRestrictions True, if member restricted/unrestricted/banned/unbanned events need to be returned.
 * @property infoChanges True, if changes in chat information need to be returned.
 * @property settingChanges True, if changes in chat settings need to be returned.
 * @property inviteLinkChanges True, if changes to invite links need to be returned.
 * @property videoChatChanges True, if video chat actions need to be returned.
 * @property forumChanges True, if forum-related actions need to be returned.
 * @property subscriptionExtensions True, if subscription extensions need to be returned.
 */
@SerialName(value = "chatEventLogFilters")
@Serializable
public class ChatEventLogFilters public constructor(
    @SerialName(value = "message_edits")
    public val messageEdits: Boolean,
    @SerialName(value = "message_deletions")
    public val messageDeletions: Boolean,
    @SerialName(value = "message_pins")
    public val messagePins: Boolean,
    @SerialName(value = "member_joins")
    public val memberJoins: Boolean,
    @SerialName(value = "member_leaves")
    public val memberLeaves: Boolean,
    @SerialName(value = "member_invites")
    public val memberInvites: Boolean,
    @SerialName(value = "member_promotions")
    public val memberPromotions: Boolean,
    @SerialName(value = "member_restrictions")
    public val memberRestrictions: Boolean,
    @SerialName(value = "info_changes")
    public val infoChanges: Boolean,
    @SerialName(value = "setting_changes")
    public val settingChanges: Boolean,
    @SerialName(value = "invite_link_changes")
    public val inviteLinkChanges: Boolean,
    @SerialName(value = "video_chat_changes")
    public val videoChatChanges: Boolean,
    @SerialName(value = "forum_changes")
    public val forumChanges: Boolean,
    @SerialName(value = "subscription_extensions")
    public val subscriptionExtensions: Boolean,
) : Model() {
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
        other as ChatEventLogFilters
        if (other.messageEdits != messageEdits) {
            return false
        }
        if (other.messageDeletions != messageDeletions) {
            return false
        }
        if (other.messagePins != messagePins) {
            return false
        }
        if (other.memberJoins != memberJoins) {
            return false
        }
        if (other.memberLeaves != memberLeaves) {
            return false
        }
        if (other.memberInvites != memberInvites) {
            return false
        }
        if (other.memberPromotions != memberPromotions) {
            return false
        }
        if (other.memberRestrictions != memberRestrictions) {
            return false
        }
        if (other.infoChanges != infoChanges) {
            return false
        }
        if (other.settingChanges != settingChanges) {
            return false
        }
        if (other.inviteLinkChanges != inviteLinkChanges) {
            return false
        }
        if (other.videoChatChanges != videoChatChanges) {
            return false
        }
        if (other.forumChanges != forumChanges) {
            return false
        }
        return other.subscriptionExtensions == subscriptionExtensions
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + messageEdits.hashCode()
        hashCode = 31 * hashCode + messageDeletions.hashCode()
        hashCode = 31 * hashCode + messagePins.hashCode()
        hashCode = 31 * hashCode + memberJoins.hashCode()
        hashCode = 31 * hashCode + memberLeaves.hashCode()
        hashCode = 31 * hashCode + memberInvites.hashCode()
        hashCode = 31 * hashCode + memberPromotions.hashCode()
        hashCode = 31 * hashCode + memberRestrictions.hashCode()
        hashCode = 31 * hashCode + infoChanges.hashCode()
        hashCode = 31 * hashCode + settingChanges.hashCode()
        hashCode = 31 * hashCode + inviteLinkChanges.hashCode()
        hashCode = 31 * hashCode + videoChatChanges.hashCode()
        hashCode = 31 * hashCode + forumChanges.hashCode()
        hashCode = 31 * hashCode + subscriptionExtensions.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ChatEventLogFilters")
            append("(")
            append("messageEdits=")
            append(messageEdits)
            append(", ")
            append("messageDeletions=")
            append(messageDeletions)
            append(", ")
            append("messagePins=")
            append(messagePins)
            append(", ")
            append("memberJoins=")
            append(memberJoins)
            append(", ")
            append("memberLeaves=")
            append(memberLeaves)
            append(", ")
            append("memberInvites=")
            append(memberInvites)
            append(", ")
            append("memberPromotions=")
            append(memberPromotions)
            append(", ")
            append("memberRestrictions=")
            append(memberRestrictions)
            append(", ")
            append("infoChanges=")
            append(infoChanges)
            append(", ")
            append("settingChanges=")
            append(settingChanges)
            append(", ")
            append("inviteLinkChanges=")
            append(inviteLinkChanges)
            append(", ")
            append("videoChatChanges=")
            append(videoChatChanges)
            append(", ")
            append("forumChanges=")
            append(forumChanges)
            append(", ")
            append("subscriptionExtensions=")
            append(subscriptionExtensions)
            append(")")
        }
    }
}
