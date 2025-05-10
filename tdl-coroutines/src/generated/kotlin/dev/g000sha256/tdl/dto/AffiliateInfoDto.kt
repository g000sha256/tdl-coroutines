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
 * Contains information about an affiliate that received commission from a Telegram Star transaction.
 *
 * @property commissionPerMille The number of Telegram Stars received by the affiliate for each 1000 Telegram Stars received by the program owner.
 * @property affiliateChatId Identifier of the chat which received the commission.
 * @property starAmount The amount of Telegram Stars that were received by the affiliate; can be negative for refunds.
 */
public class AffiliateInfoDto public constructor(
    public val commissionPerMille: Int,
    public val affiliateChatId: Long,
    public val starAmount: StarAmountDto,
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
        other as AffiliateInfoDto
        if (other.commissionPerMille != commissionPerMille) {
            return false
        }
        if (other.affiliateChatId != affiliateChatId) {
            return false
        }
        return other.starAmount == starAmount
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + commissionPerMille.hashCode()
        hashCode = 31 * hashCode + affiliateChatId.hashCode()
        hashCode = 31 * hashCode + starAmount.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("AffiliateInfoDto")
            append("(")
            append("commissionPerMille=")
            append(commissionPerMille)
            append(", ")
            append("affiliateChatId=")
            append(affiliateChatId)
            append(", ")
            append("starAmount=")
            append(starAmount)
            append(")")
        }
    }
}
