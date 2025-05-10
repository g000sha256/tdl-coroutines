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

package dev.g000sha256.tdl.dto.update

import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.String

/**
 * The parameters of speech recognition without Telegram Premium subscription has changed.
 *
 * @property maxMediaDuration The maximum allowed duration of media for speech recognition without Telegram Premium subscription, in seconds.
 * @property weeklyCount The total number of allowed speech recognitions per week; 0 if none.
 * @property leftCount Number of left speech recognition attempts this week.
 * @property nextResetDate Point in time (Unix timestamp) when the weekly number of tries will reset; 0 if unknown.
 */
public class SpeechRecognitionTrialUpdateDto public constructor(
    public val maxMediaDuration: Int,
    public val weeklyCount: Int,
    public val leftCount: Int,
    public val nextResetDate: Int,
) : UpdateDto() {
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
        other as SpeechRecognitionTrialUpdateDto
        if (other.maxMediaDuration != maxMediaDuration) {
            return false
        }
        if (other.weeklyCount != weeklyCount) {
            return false
        }
        if (other.leftCount != leftCount) {
            return false
        }
        return other.nextResetDate == nextResetDate
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + maxMediaDuration.hashCode()
        hashCode = 31 * hashCode + weeklyCount.hashCode()
        hashCode = 31 * hashCode + leftCount.hashCode()
        hashCode = 31 * hashCode + nextResetDate.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("SpeechRecognitionTrialUpdateDto")
            append("(")
            append("maxMediaDuration=")
            append(maxMediaDuration)
            append(", ")
            append("weeklyCount=")
            append(weeklyCount)
            append(", ")
            append("leftCount=")
            append(leftCount)
            append(", ")
            append("nextResetDate=")
            append(nextResetDate)
            append(")")
        }
    }
}
