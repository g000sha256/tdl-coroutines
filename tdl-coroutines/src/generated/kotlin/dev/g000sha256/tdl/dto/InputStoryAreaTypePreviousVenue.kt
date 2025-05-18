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
 * An area pointing to a venue already added to the story.
 *
 * @property venueProvider Provider of the venue.
 * @property venueId Identifier of the venue in the provider database.
 */
public class InputStoryAreaTypePreviousVenue public constructor(
    public val venueProvider: String,
    public val venueId: String,
) : InputStoryAreaType() {
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
        other as InputStoryAreaTypePreviousVenue
        if (other.venueProvider != venueProvider) {
            return false
        }
        return other.venueId == venueId
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + venueProvider.hashCode()
        hashCode = 31 * hashCode + venueId.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InputStoryAreaTypePreviousVenue")
            append("(")
            append("venueProvider=")
            append(venueProvider)
            append(", ")
            append("venueId=")
            append(venueId)
            append(")")
        }
    }
}
