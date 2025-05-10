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
import kotlin.ByteArray
import kotlin.Int
import kotlin.String

/**
 * This class is an abstract base class.
 * Describes result of story report.
 */
public sealed class ReportStoryResultDto private constructor() {
    /**
     * The story was reported successfully.
     */
    public class Ok public constructor() : ReportStoryResultDto() {
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
            return "ReportStoryResultDto.Ok()"
        }
    }

    /**
     * The user must choose an option to report the story and repeat request with the chosen option.
     *
     * @property title Title for the option choice.
     * @property options List of available options.
     */
    public class OptionRequired public constructor(
        public val title: String,
        public val options: Array<ReportOptionDto>,
    ) : ReportStoryResultDto() {
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
                append("ReportStoryResultDto.OptionRequired")
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
     * The user must add additional text details to the report.
     *
     * @property optionId Option identifier for the next reportStory request.
     * @property isOptional True, if the user can skip text adding.
     */
    public class TextRequired public constructor(
        public val optionId: ByteArray,
        public val isOptional: Boolean,
    ) : ReportStoryResultDto() {
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
            other as TextRequired
            val optionIdEquals = other.optionId.contentEquals(optionId)
            if (!optionIdEquals) {
                return false
            }
            return other.isOptional == isOptional
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + optionId.contentHashCode()
            hashCode = 31 * hashCode + isOptional.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ReportStoryResultDto.TextRequired")
                append("(")
                append("optionId=")
                optionId
                    .contentToString()
                    .also { append(it) }
                append(", ")
                append("isOptional=")
                append(isOptional)
                append(")")
            }
        }
    }
}
