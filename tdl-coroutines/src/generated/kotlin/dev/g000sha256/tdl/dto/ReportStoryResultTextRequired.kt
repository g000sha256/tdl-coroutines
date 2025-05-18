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
import kotlin.ByteArray
import kotlin.Int
import kotlin.String

/**
 * The user must add additional text details to the report.
 *
 * @property optionId Option identifier for the next reportStory request.
 * @property isOptional True, if the user can skip text adding.
 */
public class ReportStoryResultTextRequired public constructor(
    public val optionId: ByteArray,
    public val isOptional: Boolean,
) : ReportStoryResult() {
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
        other as ReportStoryResultTextRequired
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
            append("ReportStoryResultTextRequired")
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
