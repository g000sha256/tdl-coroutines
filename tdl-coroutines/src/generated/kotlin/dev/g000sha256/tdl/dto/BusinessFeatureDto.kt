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
 * Describes a feature available to Business user accounts.
 */
public sealed class BusinessFeatureDto private constructor() {
    /**
     * The ability to set location.
     */
    public class Location public constructor() : BusinessFeatureDto() {
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
            return "BusinessFeatureDto.Location()"
        }
    }

    /**
     * The ability to set opening hours.
     */
    public class OpeningHours public constructor() : BusinessFeatureDto() {
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
            return "BusinessFeatureDto.OpeningHours()"
        }
    }

    /**
     * The ability to use quick replies.
     */
    public class QuickReplies public constructor() : BusinessFeatureDto() {
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
            return "BusinessFeatureDto.QuickReplies()"
        }
    }

    /**
     * The ability to set up a greeting message.
     */
    public class GreetingMessage public constructor() : BusinessFeatureDto() {
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
            return "BusinessFeatureDto.GreetingMessage()"
        }
    }

    /**
     * The ability to set up an away message.
     */
    public class AwayMessage public constructor() : BusinessFeatureDto() {
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
            return "BusinessFeatureDto.AwayMessage()"
        }
    }

    /**
     * The ability to create links to the business account with predefined message text.
     */
    public class AccountLinks public constructor() : BusinessFeatureDto() {
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
            return "BusinessFeatureDto.AccountLinks()"
        }
    }

    /**
     * The ability to customize start page.
     */
    public class StartPage public constructor() : BusinessFeatureDto() {
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
            return "BusinessFeatureDto.StartPage()"
        }
    }

    /**
     * The ability to connect a bot to the account.
     */
    public class Bots public constructor() : BusinessFeatureDto() {
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
            return "BusinessFeatureDto.Bots()"
        }
    }

    /**
     * The ability to show an emoji status along with the business name.
     */
    public class EmojiStatus public constructor() : BusinessFeatureDto() {
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
            return "BusinessFeatureDto.EmojiStatus()"
        }
    }

    /**
     * The ability to display folder names for each chat in the chat list.
     */
    public class ChatFolderTags public constructor() : BusinessFeatureDto() {
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
            return "BusinessFeatureDto.ChatFolderTags()"
        }
    }

    /**
     * Allowed to use many additional features for stories.
     */
    public class UpgradedStories public constructor() : BusinessFeatureDto() {
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
            return "BusinessFeatureDto.UpgradedStories()"
        }
    }
}
