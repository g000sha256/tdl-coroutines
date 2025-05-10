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
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String

/**
 * This class is an abstract base class.
 * Describes result of sponsored message or chat report.
 */
public sealed class ReportSponsoredResultDto private constructor() {
    /**
     * The message was reported successfully.
     */
    public class Ok public constructor() : ReportSponsoredResultDto() {
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
            return "ReportSponsoredResultDto.Ok()"
        }
    }

    /**
     * The sponsored message is too old or not found.
     */
    public class Failed public constructor() : ReportSponsoredResultDto() {
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
            return "ReportSponsoredResultDto.Failed()"
        }
    }

    /**
     * The user must choose an option to report the message and repeat request with the chosen option.
     *
     * @property title Title for the option choice.
     * @property options List of available options.
     */
    public class OptionRequired public constructor(
        public val title: String,
        public val options: Array<ReportOptionDto>,
    ) : ReportSponsoredResultDto() {
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
            other as OptionRequired
            if (other.title != title) {
                return false
            }
            return other.options.contentDeepEquals(options)
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + title.hashCode()
            hashCode = 31 * hashCode + options.contentDeepHashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ReportSponsoredResultDto.OptionRequired")
                append("(")
                append("title=")
                append(title)
                append(", ")
                append("options=")
                options
                    .contentDeepToString()
                    .also { append(it) }
                append(")")
            }
        }
    }

    /**
     * Sponsored messages were hidden for the user in all chats.
     */
    public class AdsHidden public constructor() : ReportSponsoredResultDto() {
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
            return "ReportSponsoredResultDto.AdsHidden()"
        }
    }

    /**
     * The user asked to hide sponsored messages, but Telegram Premium is required for this.
     */
    public class PremiumRequired public constructor() : ReportSponsoredResultDto() {
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
            return "ReportSponsoredResultDto.PremiumRequired()"
        }
    }
}
