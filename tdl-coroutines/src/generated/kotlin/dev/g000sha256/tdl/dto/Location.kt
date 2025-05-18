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
import kotlin.Double
import kotlin.Int
import kotlin.String

/**
 * Describes a location on planet Earth.
 *
 * @property latitude Latitude of the location in degrees; as defined by the sender.
 * @property longitude Longitude of the location, in degrees; as defined by the sender.
 * @property horizontalAccuracy The estimated horizontal accuracy of the location, in meters; as defined by the sender. 0 if unknown.
 */
public class Location public constructor(
    public val latitude: Double,
    public val longitude: Double,
    public val horizontalAccuracy: Double,
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
        other as Location
        if (other.latitude != latitude) {
            return false
        }
        if (other.longitude != longitude) {
            return false
        }
        return other.horizontalAccuracy == horizontalAccuracy
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + latitude.hashCode()
        hashCode = 31 * hashCode + longitude.hashCode()
        hashCode = 31 * hashCode + horizontalAccuracy.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("Location")
            append("(")
            append("latitude=")
            append(latitude)
            append(", ")
            append("longitude=")
            append(longitude)
            append(", ")
            append("horizontalAccuracy=")
            append(horizontalAccuracy)
            append(")")
        }
    }
}
