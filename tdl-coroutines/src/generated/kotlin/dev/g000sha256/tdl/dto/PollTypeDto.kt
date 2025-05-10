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
 * Describes the type of poll.
 */
public sealed class PollTypeDto private constructor() {
    /**
     * A regular poll.
     *
     * @property allowMultipleAnswers True, if multiple answer options can be chosen simultaneously.
     */
    public class Regular public constructor(
        public val allowMultipleAnswers: Boolean,
    ) : PollTypeDto() {
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
            other as Regular
            return other.allowMultipleAnswers == allowMultipleAnswers
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + allowMultipleAnswers.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PollTypeDto.Regular")
                append("(")
                append("allowMultipleAnswers=")
                append(allowMultipleAnswers)
                append(")")
            }
        }
    }

    /**
     * A poll in quiz mode, which has exactly one correct answer option and can be answered only once.
     *
     * @property correctOptionId 0-based identifier of the correct answer option; -1 for a yet unanswered poll.
     * @property explanation Text that is shown when the user chooses an incorrect answer or taps on the lamp icon; 0-200 characters with at most 2 line feeds; empty for a yet unanswered poll.
     */
    public class Quiz public constructor(
        public val correctOptionId: Int,
        public val explanation: FormattedTextDto,
    ) : PollTypeDto() {
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
            other as Quiz
            if (other.correctOptionId != correctOptionId) {
                return false
            }
            return other.explanation == explanation
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + correctOptionId.hashCode()
            hashCode = 31 * hashCode + explanation.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PollTypeDto.Quiz")
                append("(")
                append("correctOptionId=")
                append(correctOptionId)
                append(", ")
                append("explanation=")
                append(explanation)
                append(")")
            }
        }
    }
}
