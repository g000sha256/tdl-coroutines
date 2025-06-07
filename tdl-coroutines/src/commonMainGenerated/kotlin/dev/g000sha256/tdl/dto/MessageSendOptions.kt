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
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Options to be used when a message is sent.
 *
 * @property disableNotification Pass true to disable notification for the message.
 * @property fromBackground Pass true if the message is sent from the background.
 * @property protectContent Pass true if the content of the message must be protected from forwarding and saving; for bots only.
 * @property allowPaidBroadcast Pass true to allow the message to ignore regular broadcast limits for a small fee; for bots only.
 * @property paidMessageStarCount The number of Telegram Stars the user agreed to pay to send the messages.
 * @property updateOrderOfInstalledStickerSets Pass true if the user explicitly chosen a sticker or a custom emoji from an installed sticker set; applicable only to sendMessage and sendMessageAlbum.
 * @property schedulingState Message scheduling state; pass null to send message immediately. Messages sent to a secret chat, to a chat with paid messages, live location messages and self-destructing messages can't be scheduled.
 * @property effectId Identifier of the effect to apply to the message; pass 0 if none; applicable only to sendMessage and sendMessageAlbum in private chats.
 * @property sendingId Non-persistent identifier, which will be returned back in messageSendingStatePending object and can be used to match sent messages and corresponding updateNewMessage updates.
 * @property onlyPreview Pass true to get a fake message instead of actually sending them.
 */
@SerialName(value = "messageSendOptions")
@Serializable
public class MessageSendOptions public constructor(
    @SerialName(value = "disable_notification")
    public val disableNotification: Boolean,
    @SerialName(value = "from_background")
    public val fromBackground: Boolean,
    @SerialName(value = "protect_content")
    public val protectContent: Boolean,
    @SerialName(value = "allow_paid_broadcast")
    public val allowPaidBroadcast: Boolean,
    @SerialName(value = "paid_message_star_count")
    public val paidMessageStarCount: Long,
    @SerialName(value = "update_order_of_installed_sticker_sets")
    public val updateOrderOfInstalledStickerSets: Boolean,
    @SerialName(value = "scheduling_state")
    public val schedulingState: MessageSchedulingState?,
    @SerialName(value = "effect_id")
    public val effectId: Long,
    @SerialName(value = "sending_id")
    public val sendingId: Int,
    @SerialName(value = "only_preview")
    public val onlyPreview: Boolean,
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
        other as MessageSendOptions
        if (other.disableNotification != disableNotification) {
            return false
        }
        if (other.fromBackground != fromBackground) {
            return false
        }
        if (other.protectContent != protectContent) {
            return false
        }
        if (other.allowPaidBroadcast != allowPaidBroadcast) {
            return false
        }
        if (other.paidMessageStarCount != paidMessageStarCount) {
            return false
        }
        if (other.updateOrderOfInstalledStickerSets != updateOrderOfInstalledStickerSets) {
            return false
        }
        if (other.schedulingState != schedulingState) {
            return false
        }
        if (other.effectId != effectId) {
            return false
        }
        if (other.sendingId != sendingId) {
            return false
        }
        return other.onlyPreview == onlyPreview
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + disableNotification.hashCode()
        hashCode = 31 * hashCode + fromBackground.hashCode()
        hashCode = 31 * hashCode + protectContent.hashCode()
        hashCode = 31 * hashCode + allowPaidBroadcast.hashCode()
        hashCode = 31 * hashCode + paidMessageStarCount.hashCode()
        hashCode = 31 * hashCode + updateOrderOfInstalledStickerSets.hashCode()
        hashCode = 31 * hashCode + schedulingState.hashCode()
        hashCode = 31 * hashCode + effectId.hashCode()
        hashCode = 31 * hashCode + sendingId.hashCode()
        hashCode = 31 * hashCode + onlyPreview.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("MessageSendOptions")
            append("(")
            append("disableNotification=")
            append(disableNotification)
            append(", ")
            append("fromBackground=")
            append(fromBackground)
            append(", ")
            append("protectContent=")
            append(protectContent)
            append(", ")
            append("allowPaidBroadcast=")
            append(allowPaidBroadcast)
            append(", ")
            append("paidMessageStarCount=")
            append(paidMessageStarCount)
            append(", ")
            append("updateOrderOfInstalledStickerSets=")
            append(updateOrderOfInstalledStickerSets)
            append(", ")
            append("schedulingState=")
            append(schedulingState)
            append(", ")
            append("effectId=")
            append(effectId)
            append(", ")
            append("sendingId=")
            append(sendingId)
            append(", ")
            append("onlyPreview=")
            append(onlyPreview)
            append(")")
        }
    }
}
