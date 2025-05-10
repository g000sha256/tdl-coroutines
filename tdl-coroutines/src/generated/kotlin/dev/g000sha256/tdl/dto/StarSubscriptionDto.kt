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
 * Contains information about subscription to a channel chat, a bot, or a business account that was paid in Telegram Stars.
 *
 * @property id Unique identifier of the subscription.
 * @property chatId Identifier of the chat that is subscribed.
 * @property expirationDate Point in time (Unix timestamp) when the subscription will expire or expired.
 * @property isCanceled True, if the subscription was canceled.
 * @property isExpiring True, if the subscription expires soon and there are no enough Telegram Stars on the user's balance to extend it.
 * @property pricing The subscription plan.
 * @property type Type of the subscription.
 */
public class StarSubscriptionDto public constructor(
    public val id: String,
    public val chatId: Long,
    public val expirationDate: Int,
    public val isCanceled: Boolean,
    public val isExpiring: Boolean,
    public val pricing: StarSubscriptionPricingDto,
    public val type: StarSubscriptionTypeDto,
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
        other as StarSubscriptionDto
        if (other.id != id) {
            return false
        }
        if (other.chatId != chatId) {
            return false
        }
        if (other.expirationDate != expirationDate) {
            return false
        }
        if (other.isCanceled != isCanceled) {
            return false
        }
        if (other.isExpiring != isExpiring) {
            return false
        }
        if (other.pricing != pricing) {
            return false
        }
        return other.type == type
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + id.hashCode()
        hashCode = 31 * hashCode + chatId.hashCode()
        hashCode = 31 * hashCode + expirationDate.hashCode()
        hashCode = 31 * hashCode + isCanceled.hashCode()
        hashCode = 31 * hashCode + isExpiring.hashCode()
        hashCode = 31 * hashCode + pricing.hashCode()
        hashCode = 31 * hashCode + type.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("StarSubscriptionDto")
            append("(")
            append("id=")
            append(id)
            append(", ")
            append("chatId=")
            append(chatId)
            append(", ")
            append("expirationDate=")
            append(expirationDate)
            append(", ")
            append("isCanceled=")
            append(isCanceled)
            append(", ")
            append("isExpiring=")
            append(isExpiring)
            append(", ")
            append("pricing=")
            append(pricing)
            append(", ")
            append("type=")
            append(type)
            append(")")
        }
    }
}
