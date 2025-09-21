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
import kotlin.Long
import kotlin.String

/**
 * Contains description of user rating.
 *
 * @property level The level of the user; may be negative.
 * @property isMaximumLevelReached True, if the maximum level is reached.
 * @property rating Numerical value of the rating.
 * @property currentLevelRating The rating required for the current level.
 * @property nextLevelRating The rating required for the next level; 0 if the maximum level is reached.
 */
public class UserRating public constructor(
    public val level: Int,
    public val isMaximumLevelReached: Boolean,
    public val rating: Long,
    public val currentLevelRating: Long,
    public val nextLevelRating: Long,
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
        other as UserRating
        if (other.level != level) {
            return false
        }
        if (other.isMaximumLevelReached != isMaximumLevelReached) {
            return false
        }
        if (other.rating != rating) {
            return false
        }
        if (other.currentLevelRating != currentLevelRating) {
            return false
        }
        return other.nextLevelRating == nextLevelRating
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + level.hashCode()
        hashCode = 31 * hashCode + isMaximumLevelReached.hashCode()
        hashCode = 31 * hashCode + rating.hashCode()
        hashCode = 31 * hashCode + currentLevelRating.hashCode()
        hashCode = 31 * hashCode + nextLevelRating.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("UserRating")
            append("(")
            append("level=")
            append(level)
            append(", ")
            append("isMaximumLevelReached=")
            append(isMaximumLevelReached)
            append(", ")
            append("rating=")
            append(rating)
            append(", ")
            append("currentLevelRating=")
            append(currentLevelRating)
            append(", ")
            append("nextLevelRating=")
            append(nextLevelRating)
            append(")")
        }
    }
}
