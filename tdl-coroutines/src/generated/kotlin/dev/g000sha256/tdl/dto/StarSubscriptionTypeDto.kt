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
 * This class is an abstract base class.
 * Describes type of subscription paid in Telegram Stars.
 */
public sealed class StarSubscriptionTypeDto private constructor() {
    /**
     * Describes a subscription to a channel chat.
     *
     * @property canReuse True, if the subscription is active and the user can use the method reuseStarSubscription to join the subscribed chat again.
     * @property inviteLink The invite link that can be used to renew the subscription if it has been expired; may be empty, if the link isn't available anymore.
     */
    public class Channel public constructor(
        public val canReuse: Boolean,
        public val inviteLink: String,
    ) : StarSubscriptionTypeDto() {
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
            other as Channel
            if (other.canReuse != canReuse) {
                return false
            }
            return other.inviteLink == inviteLink
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + canReuse.hashCode()
            hashCode = 31 * hashCode + inviteLink.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("StarSubscriptionTypeDto.Channel")
                append("(")
                append("canReuse=")
                append(canReuse)
                append(", ")
                append("inviteLink=")
                append(inviteLink)
                append(")")
            }
        }
    }

    /**
     * Describes a subscription in a bot or a business account.
     *
     * @property isCanceledByBot True, if the subscription was canceled by the bot and can't be extended.
     * @property title Subscription invoice title.
     * @property photo Subscription invoice photo.
     * @property invoiceLink The link to the subscription invoice.
     */
    public class Bot public constructor(
        public val isCanceledByBot: Boolean,
        public val title: String,
        public val photo: PhotoDto,
        public val invoiceLink: String,
    ) : StarSubscriptionTypeDto() {
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
            other as Bot
            if (other.isCanceledByBot != isCanceledByBot) {
                return false
            }
            if (other.title != title) {
                return false
            }
            if (other.photo != photo) {
                return false
            }
            return other.invoiceLink == invoiceLink
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + isCanceledByBot.hashCode()
            hashCode = 31 * hashCode + title.hashCode()
            hashCode = 31 * hashCode + photo.hashCode()
            hashCode = 31 * hashCode + invoiceLink.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("StarSubscriptionTypeDto.Bot")
                append("(")
                append("isCanceledByBot=")
                append(isCanceledByBot)
                append(", ")
                append("title=")
                append(title)
                append(", ")
                append("photo=")
                append(photo)
                append(", ")
                append("invoiceLink=")
                append(invoiceLink)
                append(")")
            }
        }
    }
}
