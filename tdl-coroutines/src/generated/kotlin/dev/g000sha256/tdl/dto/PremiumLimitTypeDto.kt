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
 * Describes type of limit, increased for Premium users.
 */
public sealed class PremiumLimitTypeDto private constructor() {
    /**
     * The maximum number of joined supergroups and channels.
     */
    public class SupergroupCount public constructor() : PremiumLimitTypeDto() {
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
            return "PremiumLimitTypeDto.SupergroupCount()"
        }
    }

    /**
     * The maximum number of pinned chats in the main chat list.
     */
    public class PinnedChatCount public constructor() : PremiumLimitTypeDto() {
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
            return "PremiumLimitTypeDto.PinnedChatCount()"
        }
    }

    /**
     * The maximum number of created public chats.
     */
    public class CreatedPublicChatCount public constructor() : PremiumLimitTypeDto() {
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
            return "PremiumLimitTypeDto.CreatedPublicChatCount()"
        }
    }

    /**
     * The maximum number of saved animations.
     */
    public class SavedAnimationCount public constructor() : PremiumLimitTypeDto() {
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
            return "PremiumLimitTypeDto.SavedAnimationCount()"
        }
    }

    /**
     * The maximum number of favorite stickers.
     */
    public class FavoriteStickerCount public constructor() : PremiumLimitTypeDto() {
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
            return "PremiumLimitTypeDto.FavoriteStickerCount()"
        }
    }

    /**
     * The maximum number of chat folders.
     */
    public class ChatFolderCount public constructor() : PremiumLimitTypeDto() {
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
            return "PremiumLimitTypeDto.ChatFolderCount()"
        }
    }

    /**
     * The maximum number of pinned and always included, or always excluded chats in a chat folder.
     */
    public class ChatFolderChosenChatCount public constructor() : PremiumLimitTypeDto() {
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
            return "PremiumLimitTypeDto.ChatFolderChosenChatCount()"
        }
    }

    /**
     * The maximum number of pinned chats in the archive chat list.
     */
    public class PinnedArchivedChatCount public constructor() : PremiumLimitTypeDto() {
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
            return "PremiumLimitTypeDto.PinnedArchivedChatCount()"
        }
    }

    /**
     * The maximum number of pinned Saved Messages topics.
     */
    public class PinnedSavedMessagesTopicCount public constructor() : PremiumLimitTypeDto() {
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
            return "PremiumLimitTypeDto.PinnedSavedMessagesTopicCount()"
        }
    }

    /**
     * The maximum length of sent media caption.
     */
    public class CaptionLength public constructor() : PremiumLimitTypeDto() {
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
            return "PremiumLimitTypeDto.CaptionLength()"
        }
    }

    /**
     * The maximum length of the user's bio.
     */
    public class BioLength public constructor() : PremiumLimitTypeDto() {
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
            return "PremiumLimitTypeDto.BioLength()"
        }
    }

    /**
     * The maximum number of invite links for a chat folder.
     */
    public class ChatFolderInviteLinkCount public constructor() : PremiumLimitTypeDto() {
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
            return "PremiumLimitTypeDto.ChatFolderInviteLinkCount()"
        }
    }

    /**
     * The maximum number of added shareable chat folders.
     */
    public class ShareableChatFolderCount public constructor() : PremiumLimitTypeDto() {
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
            return "PremiumLimitTypeDto.ShareableChatFolderCount()"
        }
    }

    /**
     * The maximum number of active stories.
     */
    public class ActiveStoryCount public constructor() : PremiumLimitTypeDto() {
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
            return "PremiumLimitTypeDto.ActiveStoryCount()"
        }
    }

    /**
     * The maximum number of stories posted per week.
     */
    public class WeeklyPostedStoryCount public constructor() : PremiumLimitTypeDto() {
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
            return "PremiumLimitTypeDto.WeeklyPostedStoryCount()"
        }
    }

    /**
     * The maximum number of stories posted per month.
     */
    public class MonthlyPostedStoryCount public constructor() : PremiumLimitTypeDto() {
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
            return "PremiumLimitTypeDto.MonthlyPostedStoryCount()"
        }
    }

    /**
     * The maximum length of captions of posted stories.
     */
    public class StoryCaptionLength public constructor() : PremiumLimitTypeDto() {
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
            return "PremiumLimitTypeDto.StoryCaptionLength()"
        }
    }

    /**
     * The maximum number of suggested reaction areas on a story.
     */
    public class StorySuggestedReactionAreaCount public constructor() : PremiumLimitTypeDto() {
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
            return "PremiumLimitTypeDto.StorySuggestedReactionAreaCount()"
        }
    }

    /**
     * The maximum number of received similar chats.
     */
    public class SimilarChatCount public constructor() : PremiumLimitTypeDto() {
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
            return "PremiumLimitTypeDto.SimilarChatCount()"
        }
    }
}
