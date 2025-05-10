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
 * This class is an abstract base class.
 * Describes an action suggested to the current user.
 */
public sealed class SuggestedActionDto private constructor() {
    /**
     * Suggests the user to enable archiveAndMuteNewChatsFromUnknownUsers setting in archiveChatListSettings.
     */
    public class EnableArchiveAndMuteNewChats public constructor() : SuggestedActionDto() {
        override fun equals(other: Any?): Boolean {
            if (other === this) {
                return true
            }
            if (other == null) {
                return false
            }
            return this::class == other::class
        }

        override fun hashCode(): Int {
            return this::class.hashCode()
        }

        override fun toString(): String {
            return "SuggestedActionDto.EnableArchiveAndMuteNewChats()"
        }
    }

    /**
     * Suggests the user to check whether they still remember their 2-step verification password.
     */
    public class CheckPassword public constructor() : SuggestedActionDto() {
        override fun equals(other: Any?): Boolean {
            if (other === this) {
                return true
            }
            if (other == null) {
                return false
            }
            return this::class == other::class
        }

        override fun hashCode(): Int {
            return this::class.hashCode()
        }

        override fun toString(): String {
            return "SuggestedActionDto.CheckPassword()"
        }
    }

    /**
     * Suggests the user to check whether authorization phone number is correct and change the phone number if it is inaccessible.
     */
    public class CheckPhoneNumber public constructor() : SuggestedActionDto() {
        override fun equals(other: Any?): Boolean {
            if (other === this) {
                return true
            }
            if (other == null) {
                return false
            }
            return this::class == other::class
        }

        override fun hashCode(): Int {
            return this::class.hashCode()
        }

        override fun toString(): String {
            return "SuggestedActionDto.CheckPhoneNumber()"
        }
    }

    /**
     * Suggests the user to view a hint about the meaning of one and two check marks on sent messages.
     */
    public class ViewChecksHint public constructor() : SuggestedActionDto() {
        override fun equals(other: Any?): Boolean {
            if (other === this) {
                return true
            }
            if (other == null) {
                return false
            }
            return this::class == other::class
        }

        override fun hashCode(): Int {
            return this::class.hashCode()
        }

        override fun toString(): String {
            return "SuggestedActionDto.ViewChecksHint()"
        }
    }

    /**
     * Suggests the user to convert specified supergroup to a broadcast group.
     *
     * @property supergroupId Supergroup identifier.
     */
    public class ConvertToBroadcastGroup public constructor(
        public val supergroupId: Long,
    ) : SuggestedActionDto() {
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
            other as ConvertToBroadcastGroup
            return other.supergroupId == supergroupId
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + supergroupId.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("SuggestedActionDto.ConvertToBroadcastGroup")
                append("(")
                append("supergroupId=")
                append(supergroupId)
                append(")")
            }
        }
    }

    /**
     * Suggests the user to set a 2-step verification password to be able to log in again.
     *
     * @property authorizationDelay The number of days to pass between consecutive authorizations if the user declines to set password; if 0, then the user is advised to set the password for security reasons.
     */
    public class SetPassword public constructor(
        public val authorizationDelay: Int,
    ) : SuggestedActionDto() {
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
            other as SetPassword
            return other.authorizationDelay == authorizationDelay
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + authorizationDelay.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("SuggestedActionDto.SetPassword")
                append("(")
                append("authorizationDelay=")
                append(authorizationDelay)
                append(")")
            }
        }
    }

    /**
     * Suggests the user to upgrade the Premium subscription from monthly payments to annual payments.
     */
    public class UpgradePremium public constructor() : SuggestedActionDto() {
        override fun equals(other: Any?): Boolean {
            if (other === this) {
                return true
            }
            if (other == null) {
                return false
            }
            return this::class == other::class
        }

        override fun hashCode(): Int {
            return this::class.hashCode()
        }

        override fun toString(): String {
            return "SuggestedActionDto.UpgradePremium()"
        }
    }

    /**
     * Suggests the user to restore a recently expired Premium subscription.
     */
    public class RestorePremium public constructor() : SuggestedActionDto() {
        override fun equals(other: Any?): Boolean {
            if (other === this) {
                return true
            }
            if (other == null) {
                return false
            }
            return this::class == other::class
        }

        override fun hashCode(): Int {
            return this::class.hashCode()
        }

        override fun toString(): String {
            return "SuggestedActionDto.RestorePremium()"
        }
    }

    /**
     * Suggests the user to subscribe to the Premium subscription with annual payments.
     */
    public class SubscribeToAnnualPremium public constructor() : SuggestedActionDto() {
        override fun equals(other: Any?): Boolean {
            if (other === this) {
                return true
            }
            if (other == null) {
                return false
            }
            return this::class == other::class
        }

        override fun hashCode(): Int {
            return this::class.hashCode()
        }

        override fun toString(): String {
            return "SuggestedActionDto.SubscribeToAnnualPremium()"
        }
    }

    /**
     * Suggests the user to gift Telegram Premium to friends for Christmas.
     */
    public class GiftPremiumForChristmas public constructor() : SuggestedActionDto() {
        override fun equals(other: Any?): Boolean {
            if (other === this) {
                return true
            }
            if (other == null) {
                return false
            }
            return this::class == other::class
        }

        override fun hashCode(): Int {
            return this::class.hashCode()
        }

        override fun toString(): String {
            return "SuggestedActionDto.GiftPremiumForChristmas()"
        }
    }

    /**
     * Suggests the user to set birthdate.
     */
    public class SetBirthdate public constructor() : SuggestedActionDto() {
        override fun equals(other: Any?): Boolean {
            if (other === this) {
                return true
            }
            if (other == null) {
                return false
            }
            return this::class == other::class
        }

        override fun hashCode(): Int {
            return this::class.hashCode()
        }

        override fun toString(): String {
            return "SuggestedActionDto.SetBirthdate()"
        }
    }

    /**
     * Suggests the user to set profile photo.
     */
    public class SetProfilePhoto public constructor() : SuggestedActionDto() {
        override fun equals(other: Any?): Boolean {
            if (other === this) {
                return true
            }
            if (other == null) {
                return false
            }
            return this::class == other::class
        }

        override fun hashCode(): Int {
            return this::class.hashCode()
        }

        override fun toString(): String {
            return "SuggestedActionDto.SetProfilePhoto()"
        }
    }

    /**
     * Suggests the user to extend their expiring Telegram Premium subscription.
     *
     * @property managePremiumSubscriptionUrl A URL for managing Telegram Premium subscription.
     */
    public class ExtendPremium public constructor(
        public val managePremiumSubscriptionUrl: String,
    ) : SuggestedActionDto() {
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
            other as ExtendPremium
            return other.managePremiumSubscriptionUrl == managePremiumSubscriptionUrl
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + managePremiumSubscriptionUrl.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("SuggestedActionDto.ExtendPremium")
                append("(")
                append("managePremiumSubscriptionUrl=")
                append(managePremiumSubscriptionUrl)
                append(")")
            }
        }
    }

    /**
     * Suggests the user to extend their expiring Telegram Star subscriptions. Call getStarSubscriptions with onlyExpiring == true to get the number of expiring subscriptions and the number of required to buy Telegram Stars.
     */
    public class ExtendStarSubscriptions public constructor() : SuggestedActionDto() {
        override fun equals(other: Any?): Boolean {
            if (other === this) {
                return true
            }
            if (other == null) {
                return false
            }
            return this::class == other::class
        }

        override fun hashCode(): Int {
            return this::class.hashCode()
        }

        override fun toString(): String {
            return "SuggestedActionDto.ExtendStarSubscriptions()"
        }
    }
}
