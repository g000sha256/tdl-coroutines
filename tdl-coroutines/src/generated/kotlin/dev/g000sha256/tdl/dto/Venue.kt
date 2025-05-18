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
 * Describes a venue.
 *
 * @property location Venue location; as defined by the sender.
 * @property title Venue name; as defined by the sender.
 * @property address Venue address; as defined by the sender.
 * @property provider Provider of the venue database; as defined by the sender. Currently, only &quot;foursquare&quot; and &quot;gplaces&quot; (Google Places) need to be supported.
 * @property id Identifier of the venue in the provider database; as defined by the sender.
 * @property type Type of the venue in the provider database; as defined by the sender.
 */
public class Venue public constructor(
    public val location: Location,
    public val title: String,
    public val address: String,
    public val provider: String,
    public val id: String,
    public val type: String,
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
        other as Venue
        if (other.location != location) {
            return false
        }
        if (other.title != title) {
            return false
        }
        if (other.address != address) {
            return false
        }
        if (other.provider != provider) {
            return false
        }
        if (other.id != id) {
            return false
        }
        return other.type == type
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + location.hashCode()
        hashCode = 31 * hashCode + title.hashCode()
        hashCode = 31 * hashCode + address.hashCode()
        hashCode = 31 * hashCode + provider.hashCode()
        hashCode = 31 * hashCode + id.hashCode()
        hashCode = 31 * hashCode + type.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("Venue")
            append("(")
            append("location=")
            append(location)
            append(", ")
            append("title=")
            append(title)
            append(", ")
            append("address=")
            append(address)
            append(", ")
            append("provider=")
            append(provider)
            append(", ")
            append("id=")
            append(id)
            append(", ")
            append("type=")
            append(type)
            append(")")
        }
    }
}
