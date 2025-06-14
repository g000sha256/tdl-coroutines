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
 * Describes parameters of an affiliate program.
 *
 * @property commissionPerMille The number of Telegram Stars received by the affiliate for each 1000 Telegram Stars received by the program owner; getOption(&quot;affiliate_program_commission_per_mille_min&quot;)-getOption(&quot;affiliate_program_commission_per_mille_max&quot;).
 * @property monthCount Number of months the program will be active; 0-36. If 0, then the program is eternal.
 */
public class AffiliateProgramParameters public constructor(
    public val commissionPerMille: Int,
    public val monthCount: Int,
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
        other as AffiliateProgramParameters
        if (other.commissionPerMille != commissionPerMille) {
            return false
        }
        return other.monthCount == monthCount
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + commissionPerMille.hashCode()
        hashCode = 31 * hashCode + monthCount.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("AffiliateProgramParameters")
            append("(")
            append("commissionPerMille=")
            append(commissionPerMille)
            append(", ")
            append("monthCount=")
            append(monthCount)
            append(")")
        }
    }
}
