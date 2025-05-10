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
 * Describes a story feature available to Premium users.
 */
public sealed class PremiumStoryFeatureDto private constructor() {
    /**
     * Stories of the current user are displayed before stories of non-Premium contacts, supergroups, and channels.
     */
    public class PriorityOrder public constructor() : PremiumStoryFeatureDto() {
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
            return "PremiumStoryFeatureDto.PriorityOrder()"
        }
    }

    /**
     * The ability to hide the fact that the user viewed other's stories.
     */
    public class StealthMode public constructor() : PremiumStoryFeatureDto() {
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
            return "PremiumStoryFeatureDto.StealthMode()"
        }
    }

    /**
     * The ability to check who opened the current user's stories after they expire.
     */
    public class PermanentViewsHistory public constructor() : PremiumStoryFeatureDto() {
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
            return "PremiumStoryFeatureDto.PermanentViewsHistory()"
        }
    }

    /**
     * The ability to set custom expiration duration for stories.
     */
    public class CustomExpirationDuration public constructor() : PremiumStoryFeatureDto() {
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
            return "PremiumStoryFeatureDto.CustomExpirationDuration()"
        }
    }

    /**
     * The ability to save other's unprotected stories.
     */
    public class SaveStories public constructor() : PremiumStoryFeatureDto() {
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
            return "PremiumStoryFeatureDto.SaveStories()"
        }
    }

    /**
     * The ability to use links and formatting in story caption, and use inputStoryAreaTypeLink areas.
     */
    public class LinksAndFormatting public constructor() : PremiumStoryFeatureDto() {
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
            return "PremiumStoryFeatureDto.LinksAndFormatting()"
        }
    }

    /**
     * The ability to choose better quality for viewed stories.
     */
    public class VideoQuality public constructor() : PremiumStoryFeatureDto() {
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
            return "PremiumStoryFeatureDto.VideoQuality()"
        }
    }
}
