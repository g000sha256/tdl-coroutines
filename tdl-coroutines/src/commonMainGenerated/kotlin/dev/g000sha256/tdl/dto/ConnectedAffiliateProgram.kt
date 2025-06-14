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
 * Describes an affiliate program that was connected to an affiliate.
 *
 * @property url The link that can be used to refer users if the program is still active.
 * @property botUserId User identifier of the bot created the program.
 * @property parameters The parameters of the affiliate program.
 * @property connectionDate Point in time (Unix timestamp) when the affiliate program was connected.
 * @property isDisconnected True, if the program was canceled by the bot, or disconnected by the chat owner and isn't available anymore.
 * @property userCount The number of users that used the affiliate program.
 * @property revenueStarCount The number of Telegram Stars that were earned by the affiliate program.
 */
public class ConnectedAffiliateProgram public constructor(
    public val url: String,
    public val botUserId: Long,
    public val parameters: AffiliateProgramParameters,
    public val connectionDate: Int,
    public val isDisconnected: Boolean,
    public val userCount: Long,
    public val revenueStarCount: Long,
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
        other as ConnectedAffiliateProgram
        if (other.url != url) {
            return false
        }
        if (other.botUserId != botUserId) {
            return false
        }
        if (other.parameters != parameters) {
            return false
        }
        if (other.connectionDate != connectionDate) {
            return false
        }
        if (other.isDisconnected != isDisconnected) {
            return false
        }
        if (other.userCount != userCount) {
            return false
        }
        return other.revenueStarCount == revenueStarCount
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + url.hashCode()
        hashCode = 31 * hashCode + botUserId.hashCode()
        hashCode = 31 * hashCode + parameters.hashCode()
        hashCode = 31 * hashCode + connectionDate.hashCode()
        hashCode = 31 * hashCode + isDisconnected.hashCode()
        hashCode = 31 * hashCode + userCount.hashCode()
        hashCode = 31 * hashCode + revenueStarCount.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ConnectedAffiliateProgram")
            append("(")
            append("url=")
            append(url)
            append(", ")
            append("botUserId=")
            append(botUserId)
            append(", ")
            append("parameters=")
            append(parameters)
            append(", ")
            append("connectionDate=")
            append(connectionDate)
            append(", ")
            append("isDisconnected=")
            append(isDisconnected)
            append(", ")
            append("userCount=")
            append(userCount)
            append(", ")
            append("revenueStarCount=")
            append(revenueStarCount)
            append(")")
        }
    }
}
