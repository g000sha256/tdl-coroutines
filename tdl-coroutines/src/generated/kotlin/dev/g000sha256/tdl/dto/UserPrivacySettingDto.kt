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
 * Describes available user privacy settings.
 */
public sealed class UserPrivacySettingDto private constructor() {
    /**
     * A privacy setting for managing whether the user's online status is visible.
     */
    public class ShowStatus public constructor() : UserPrivacySettingDto() {
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
            return "UserPrivacySettingDto.ShowStatus()"
        }
    }

    /**
     * A privacy setting for managing whether the user's profile photo is visible.
     */
    public class ShowProfilePhoto public constructor() : UserPrivacySettingDto() {
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
            return "UserPrivacySettingDto.ShowProfilePhoto()"
        }
    }

    /**
     * A privacy setting for managing whether a link to the user's account is included in forwarded messages.
     */
    public class ShowLinkInForwardedMessages public constructor() : UserPrivacySettingDto() {
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
            return "UserPrivacySettingDto.ShowLinkInForwardedMessages()"
        }
    }

    /**
     * A privacy setting for managing whether the user's phone number is visible.
     */
    public class ShowPhoneNumber public constructor() : UserPrivacySettingDto() {
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
            return "UserPrivacySettingDto.ShowPhoneNumber()"
        }
    }

    /**
     * A privacy setting for managing whether the user's bio is visible.
     */
    public class ShowBio public constructor() : UserPrivacySettingDto() {
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
            return "UserPrivacySettingDto.ShowBio()"
        }
    }

    /**
     * A privacy setting for managing whether the user's birthdate is visible.
     */
    public class ShowBirthdate public constructor() : UserPrivacySettingDto() {
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
            return "UserPrivacySettingDto.ShowBirthdate()"
        }
    }

    /**
     * A privacy setting for managing whether the user can be invited to chats.
     */
    public class AllowChatInvites public constructor() : UserPrivacySettingDto() {
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
            return "UserPrivacySettingDto.AllowChatInvites()"
        }
    }

    /**
     * A privacy setting for managing whether the user can be called.
     */
    public class AllowCalls public constructor() : UserPrivacySettingDto() {
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
            return "UserPrivacySettingDto.AllowCalls()"
        }
    }

    /**
     * A privacy setting for managing whether peer-to-peer connections can be used for calls.
     */
    public class AllowPeerToPeerCalls public constructor() : UserPrivacySettingDto() {
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
            return "UserPrivacySettingDto.AllowPeerToPeerCalls()"
        }
    }

    /**
     * A privacy setting for managing whether the user can be found by their phone number. Checked only if the phone number is not known to the other user. Can be set only to &quot;Allow contacts&quot; or &quot;Allow all&quot;.
     */
    public class AllowFindingByPhoneNumber public constructor() : UserPrivacySettingDto() {
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
            return "UserPrivacySettingDto.AllowFindingByPhoneNumber()"
        }
    }

    /**
     * A privacy setting for managing whether the user can receive voice and video messages in private chats; for Telegram Premium users only.
     */
    public class AllowPrivateVoiceAndVideoNoteMessages public constructor() : UserPrivacySettingDto() {
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
            return "UserPrivacySettingDto.AllowPrivateVoiceAndVideoNoteMessages()"
        }
    }

    /**
     * A privacy setting for managing whether received gifts are automatically shown on the user's profile page.
     */
    public class AutosaveGifts public constructor() : UserPrivacySettingDto() {
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
            return "UserPrivacySettingDto.AutosaveGifts()"
        }
    }

    /**
     * A privacy setting for managing whether the user can receive messages without additional payment.
     */
    public class AllowUnpaidMessages public constructor() : UserPrivacySettingDto() {
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
            return "UserPrivacySettingDto.AllowUnpaidMessages()"
        }
    }
}
