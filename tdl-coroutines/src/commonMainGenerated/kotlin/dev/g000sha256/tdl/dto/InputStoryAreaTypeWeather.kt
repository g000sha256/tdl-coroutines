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
 * An area with information about weather.
 *
 * @property temperature Temperature, in degree Celsius.
 * @property emoji Emoji representing the weather.
 * @property backgroundColor A color of the area background in the ARGB format.
 */
public class InputStoryAreaTypeWeather public constructor(
    public val temperature: Double,
    public val emoji: String,
    public val backgroundColor: Int,
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
        other as InputStoryAreaTypeWeather
        if (other.temperature != temperature) {
            return false
        }
        if (other.emoji != emoji) {
            return false
        }
        return other.backgroundColor == backgroundColor
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + temperature.hashCode()
        hashCode = 31 * hashCode + emoji.hashCode()
        hashCode = 31 * hashCode + backgroundColor.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InputStoryAreaTypeWeather")
            append("(")
            append("temperature=")
            append(temperature)
            append(", ")
            append("emoji=")
            append(emoji)
            append(", ")
            append("backgroundColor=")
            append(backgroundColor)
            append(")")
        }
    }
}
