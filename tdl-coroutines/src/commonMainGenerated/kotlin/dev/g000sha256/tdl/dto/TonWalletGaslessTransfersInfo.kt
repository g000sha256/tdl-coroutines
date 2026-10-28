/*
 * Copyright 2026 Georgii Ippolitov (g000sha256)
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
 * Represents state of gasless transfers for the current user.
 *
 * @property leftCount Number of left gasless transfers. The daily available number of gasless transfers is available as getOption(&quot;ton&#95;wallet&#95;gasless&#95;transfer&#95;daily&#95;count&#95;max&quot;).
 * @property resetDate Point in time (Unix timestamp) when the number of left transfers will be reset; 0 if never.
 * @property relayerAddress Address of the relayer for gasless transfers; may be empty if unavailable.
 */
public class TonWalletGaslessTransfersInfo public constructor(
    public val leftCount: Int,
    public val resetDate: Int,
    public val relayerAddress: String,
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
        other as TonWalletGaslessTransfersInfo
        if (other.leftCount != leftCount) {
            return false
        }
        if (other.resetDate != resetDate) {
            return false
        }
        return other.relayerAddress == relayerAddress
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + leftCount.hashCode()
        hashCode = 31 * hashCode + resetDate.hashCode()
        hashCode = 31 * hashCode + relayerAddress.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("TonWalletGaslessTransfersInfo")
            append("(")
            append("leftCount=")
            append(leftCount)
            append(", ")
            append("resetDate=")
            append(resetDate)
            append(", ")
            append("relayerAddress=")
            append(relayerAddress)
            append(")")
        }
    }
}
