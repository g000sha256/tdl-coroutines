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
 * Contains a list of story areas to be added.
 *
 * @property areas List of input story areas. Currently, a story can have up to 10 inputStoryAreaTypeLocation, inputStoryAreaTypeFoundVenue, and inputStoryAreaTypePreviousVenue areas, up to getOption(&quot;story_suggested_reaction_area_count_max&quot;) inputStoryAreaTypeSuggestedReaction areas, up to 1 inputStoryAreaTypeMessage area, up to getOption(&quot;story_link_area_count_max&quot;) inputStoryAreaTypeLink areas if the current user is a Telegram Premium user, up to 3 inputStoryAreaTypeWeather areas, and up to 1 inputStoryAreaTypeUpgradedGift area.
 */
public class InputStoryAreas public constructor(
    public val areas: Array<InputStoryArea>,
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
        other as InputStoryAreas
        return other.areas.contentDeepEquals(areas)
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + areas.contentDeepHashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InputStoryAreas")
            append("(")
            append("areas=")
            areas
                .contentDeepToString()
                .also { append(it) }
            append(")")
        }
    }
}
