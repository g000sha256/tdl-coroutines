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
 * Contains auto-download settings presets for the current user.
 *
 * @property low Preset with lowest settings; expected to be used by default when roaming.
 * @property medium Preset with medium settings; expected to be used by default when using mobile data.
 * @property high Preset with highest settings; expected to be used by default when connected on Wi-Fi.
 */
public class AutoDownloadSettingsPresetsDto public constructor(
    public val low: AutoDownloadSettingsDto,
    public val medium: AutoDownloadSettingsDto,
    public val high: AutoDownloadSettingsDto,
) {
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
        other as AutoDownloadSettingsPresetsDto
        if (other.low != low) {
            return false
        }
        if (other.medium != medium) {
            return false
        }
        return other.high == high
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + low.hashCode()
        hashCode = 31 * hashCode + medium.hashCode()
        hashCode = 31 * hashCode + high.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("AutoDownloadSettingsPresetsDto")
            append("(")
            append("low=")
            append(low)
            append(", ")
            append("medium=")
            append(medium)
            append(", ")
            append("high=")
            append(high)
            append(")")
        }
    }
}
