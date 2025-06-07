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
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Contains information about a limit, increased for Premium users.
 *
 * @property type The type of the limit.
 * @property defaultValue Default value of the limit.
 * @property premiumValue Value of the limit for Premium users.
 */
@SerialName(value = "premiumLimit")
@Serializable
public class PremiumLimit public constructor(
    @SerialName(value = "type")
    public val type: PremiumLimitType,
    @SerialName(value = "default_value")
    public val defaultValue: Int,
    @SerialName(value = "premium_value")
    public val premiumValue: Int,
) : Model() {
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
        other as PremiumLimit
        if (other.type != type) {
            return false
        }
        if (other.defaultValue != defaultValue) {
            return false
        }
        return other.premiumValue == premiumValue
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + type.hashCode()
        hashCode = 31 * hashCode + defaultValue.hashCode()
        hashCode = 31 * hashCode + premiumValue.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("PremiumLimit")
            append("(")
            append("type=")
            append(type)
            append(", ")
            append("defaultValue=")
            append(defaultValue)
            append(", ")
            append("premiumValue=")
            append(premiumValue)
            append(")")
        }
    }
}
