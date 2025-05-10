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
 * Describes a source from which the Premium features screen is opened.
 */
public sealed class PremiumSourceDto private constructor() {
    /**
     * A limit was exceeded.
     *
     * @property limitType Type of the exceeded limit.
     */
    public class LimitExceeded public constructor(
        public val limitType: PremiumLimitTypeDto,
    ) : PremiumSourceDto() {
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
            other as LimitExceeded
            return other.limitType == limitType
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + limitType.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PremiumSourceDto.LimitExceeded")
                append("(")
                append("limitType=")
                append(limitType)
                append(")")
            }
        }
    }

    /**
     * A user tried to use a Premium feature.
     *
     * @property feature The used feature.
     */
    public class Feature public constructor(
        public val feature: PremiumFeatureDto,
    ) : PremiumSourceDto() {
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
            other as Feature
            return other.feature == feature
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + feature.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PremiumSourceDto.Feature")
                append("(")
                append("feature=")
                append(feature)
                append(")")
            }
        }
    }

    /**
     * A user tried to use a Business feature.
     *
     * @property feature The used feature; pass null if none specific feature was used.
     */
    public class BusinessFeature public constructor(
        public val feature: BusinessFeatureDto?,
    ) : PremiumSourceDto() {
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
            other as BusinessFeature
            return other.feature == feature
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + feature.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PremiumSourceDto.BusinessFeature")
                append("(")
                append("feature=")
                append(feature)
                append(")")
            }
        }
    }

    /**
     * A user tried to use a Premium story feature.
     *
     * @property feature The used feature.
     */
    public class StoryFeature public constructor(
        public val feature: PremiumStoryFeatureDto,
    ) : PremiumSourceDto() {
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
            other as StoryFeature
            return other.feature == feature
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + feature.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PremiumSourceDto.StoryFeature")
                append("(")
                append("feature=")
                append(feature)
                append(")")
            }
        }
    }

    /**
     * A user opened an internal link of the type internalLinkTypePremiumFeatures.
     *
     * @property referrer The referrer from the link.
     */
    public class Link public constructor(
        public val referrer: String,
    ) : PremiumSourceDto() {
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
            other as Link
            return other.referrer == referrer
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + referrer.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PremiumSourceDto.Link")
                append("(")
                append("referrer=")
                append(referrer)
                append(")")
            }
        }
    }

    /**
     * A user opened the Premium features screen from settings.
     */
    public class Settings public constructor() : PremiumSourceDto() {
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
            return "PremiumSourceDto.Settings()"
        }
    }
}
