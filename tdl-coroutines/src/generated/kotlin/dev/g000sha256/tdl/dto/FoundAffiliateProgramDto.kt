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
 * Describes a found affiliate program.
 *
 * @property botUserId User identifier of the bot created the program.
 * @property info Information about the affiliate program.
 */
public class FoundAffiliateProgramDto public constructor(
    public val botUserId: Long,
    public val info: AffiliateProgramInfoDto,
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
        other as FoundAffiliateProgramDto
        if (other.botUserId != botUserId) {
            return false
        }
        return other.info == info
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + botUserId.hashCode()
        hashCode = 31 * hashCode + info.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("FoundAffiliateProgramDto")
            append("(")
            append("botUserId=")
            append(botUserId)
            append(", ")
            append("info=")
            append(info)
            append(")")
        }
    }
}
