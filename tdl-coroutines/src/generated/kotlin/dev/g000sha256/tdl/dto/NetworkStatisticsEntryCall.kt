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
import kotlin.Long
import kotlin.String

/**
 * Contains information about the total amount of data that was used for calls.
 *
 * @property networkType Type of the network the data was sent through. Call setNetworkType to maintain the actual network type.
 * @property sentBytes Total number of bytes sent.
 * @property receivedBytes Total number of bytes received.
 * @property duration Total call duration, in seconds.
 */
public class NetworkStatisticsEntryCall public constructor(
    public val networkType: NetworkType,
    public val sentBytes: Long,
    public val receivedBytes: Long,
    public val duration: Double,
) : NetworkStatisticsEntry() {
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
        other as NetworkStatisticsEntryCall
        if (other.networkType != networkType) {
            return false
        }
        if (other.sentBytes != sentBytes) {
            return false
        }
        if (other.receivedBytes != receivedBytes) {
            return false
        }
        return other.duration == duration
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + networkType.hashCode()
        hashCode = 31 * hashCode + sentBytes.hashCode()
        hashCode = 31 * hashCode + receivedBytes.hashCode()
        hashCode = 31 * hashCode + duration.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("NetworkStatisticsEntryCall")
            append("(")
            append("networkType=")
            append(networkType)
            append(", ")
            append("sentBytes=")
            append(sentBytes)
            append(", ")
            append("receivedBytes=")
            append(receivedBytes)
            append(", ")
            append("duration=")
            append(duration)
            append(")")
        }
    }
}
