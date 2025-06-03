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
 * A button that requests users to be shared by the current user; available only in private chats. Use the method shareUsersWithBot to complete the request.
 *
 * @property id Unique button identifier.
 * @property restrictUserIsBot True, if the shared users must or must not be bots.
 * @property userIsBot True, if the shared users must be bots; otherwise, the shared users must not be bots. Ignored if restrictUserIsBot is false.
 * @property restrictUserIsPremium True, if the shared users must or must not be Telegram Premium users.
 * @property userIsPremium True, if the shared users must be Telegram Premium users; otherwise, the shared users must not be Telegram Premium users. Ignored if restrictUserIsPremium is false.
 * @property maxQuantity The maximum number of users to share.
 * @property requestName Pass true to request name of the users; bots only.
 * @property requestUsername Pass true to request username of the users; bots only.
 * @property requestPhoto Pass true to request photo of the users; bots only.
 */
public class KeyboardButtonTypeRequestUsers public constructor(
    public val id: Int,
    public val restrictUserIsBot: Boolean,
    public val userIsBot: Boolean,
    public val restrictUserIsPremium: Boolean,
    public val userIsPremium: Boolean,
    public val maxQuantity: Int,
    public val requestName: Boolean,
    public val requestUsername: Boolean,
    public val requestPhoto: Boolean,
) : KeyboardButtonType() {
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
        other as KeyboardButtonTypeRequestUsers
        if (other.id != id) {
            return false
        }
        if (other.restrictUserIsBot != restrictUserIsBot) {
            return false
        }
        if (other.userIsBot != userIsBot) {
            return false
        }
        if (other.restrictUserIsPremium != restrictUserIsPremium) {
            return false
        }
        if (other.userIsPremium != userIsPremium) {
            return false
        }
        if (other.maxQuantity != maxQuantity) {
            return false
        }
        if (other.requestName != requestName) {
            return false
        }
        if (other.requestUsername != requestUsername) {
            return false
        }
        return other.requestPhoto == requestPhoto
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + id.hashCode()
        hashCode = 31 * hashCode + restrictUserIsBot.hashCode()
        hashCode = 31 * hashCode + userIsBot.hashCode()
        hashCode = 31 * hashCode + restrictUserIsPremium.hashCode()
        hashCode = 31 * hashCode + userIsPremium.hashCode()
        hashCode = 31 * hashCode + maxQuantity.hashCode()
        hashCode = 31 * hashCode + requestName.hashCode()
        hashCode = 31 * hashCode + requestUsername.hashCode()
        hashCode = 31 * hashCode + requestPhoto.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("KeyboardButtonTypeRequestUsers")
            append("(")
            append("id=")
            append(id)
            append(", ")
            append("restrictUserIsBot=")
            append(restrictUserIsBot)
            append(", ")
            append("userIsBot=")
            append(userIsBot)
            append(", ")
            append("restrictUserIsPremium=")
            append(restrictUserIsPremium)
            append(", ")
            append("userIsPremium=")
            append(userIsPremium)
            append(", ")
            append("maxQuantity=")
            append(maxQuantity)
            append(", ")
            append("requestName=")
            append(requestName)
            append(", ")
            append("requestUsername=")
            append(requestUsername)
            append(", ")
            append("requestPhoto=")
            append(requestPhoto)
            append(")")
        }
    }
}
