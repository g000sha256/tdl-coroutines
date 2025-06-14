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
 * The transaction is a receiving of a commission from an affiliate program; for regular users, bots and channel chats only.
 *
 * @property chatId Identifier of the chat that created the affiliate program.
 * @property commissionPerMille The number of Telegram Stars received by the affiliate for each 1000 Telegram Stars received by the program owner.
 */
public class StarTransactionTypeAffiliateProgramCommission public constructor(
    public val chatId: Long,
    public val commissionPerMille: Int,
) : StarTransactionType() {
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
        other as StarTransactionTypeAffiliateProgramCommission
        if (other.chatId != chatId) {
            return false
        }
        return other.commissionPerMille == commissionPerMille
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + chatId.hashCode()
        hashCode = 31 * hashCode + commissionPerMille.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("StarTransactionTypeAffiliateProgramCommission")
            append("(")
            append("chatId=")
            append(chatId)
            append(", ")
            append("commissionPerMille=")
            append(commissionPerMille)
            append(")")
        }
    }
}
