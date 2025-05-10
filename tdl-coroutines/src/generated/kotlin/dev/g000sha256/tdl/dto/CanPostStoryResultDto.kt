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
 * Represents result of checking whether the current user can post a story on behalf of the specific chat.
 */
public sealed class CanPostStoryResultDto private constructor() {
    /**
     * A story can be sent.
     */
    public class Ok public constructor() : CanPostStoryResultDto() {
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
            return "CanPostStoryResultDto.Ok()"
        }
    }

    /**
     * The user must subscribe to Telegram Premium to be able to post stories.
     */
    public class PremiumNeeded public constructor() : CanPostStoryResultDto() {
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
            return "CanPostStoryResultDto.PremiumNeeded()"
        }
    }

    /**
     * The chat must be boosted first by Telegram Premium subscribers to post more stories. Call getChatBoostStatus to get current boost status of the chat.
     */
    public class BoostNeeded public constructor() : CanPostStoryResultDto() {
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
            return "CanPostStoryResultDto.BoostNeeded()"
        }
    }

    /**
     * The limit for the number of active stories exceeded. The user can buy Telegram Premium, delete an active story, or wait for the oldest story to expire.
     */
    public class ActiveStoryLimitExceeded public constructor() : CanPostStoryResultDto() {
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
            return "CanPostStoryResultDto.ActiveStoryLimitExceeded()"
        }
    }

    /**
     * The weekly limit for the number of posted stories exceeded. The user needs to buy Telegram Premium or wait specified time.
     *
     * @property retryAfter Time left before the user can post the next story.
     */
    public class WeeklyLimitExceeded public constructor(
        public val retryAfter: Int,
    ) : CanPostStoryResultDto() {
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
            other as WeeklyLimitExceeded
            return other.retryAfter == retryAfter
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + retryAfter.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("CanPostStoryResultDto.WeeklyLimitExceeded")
                append("(")
                append("retryAfter=")
                append(retryAfter)
                append(")")
            }
        }
    }

    /**
     * The monthly limit for the number of posted stories exceeded. The user needs to buy Telegram Premium or wait specified time.
     *
     * @property retryAfter Time left before the user can post the next story.
     */
    public class MonthlyLimitExceeded public constructor(
        public val retryAfter: Int,
    ) : CanPostStoryResultDto() {
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
            other as MonthlyLimitExceeded
            return other.retryAfter == retryAfter
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + retryAfter.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("CanPostStoryResultDto.MonthlyLimitExceeded")
                append("(")
                append("retryAfter=")
                append(retryAfter)
                append(")")
            }
        }
    }
}
