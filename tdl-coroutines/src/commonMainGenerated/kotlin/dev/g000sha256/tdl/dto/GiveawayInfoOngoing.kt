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
 * Describes an ongoing giveaway.
 *
 * @property creationDate Point in time (Unix timestamp) when the giveaway was created.
 * @property status Status of the current user in the giveaway.
 * @property isEnded True, if the giveaway has ended and results are being prepared.
 */
@SerialName(value = "giveawayInfoOngoing")
@Serializable
public class GiveawayInfoOngoing public constructor(
    @SerialName(value = "creation_date")
    public val creationDate: Int,
    @SerialName(value = "status")
    public val status: GiveawayParticipantStatus,
    @SerialName(value = "is_ended")
    public val isEnded: Boolean,
) : GiveawayInfo() {
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
        other as GiveawayInfoOngoing
        if (other.creationDate != creationDate) {
            return false
        }
        if (other.status != status) {
            return false
        }
        return other.isEnded == isEnded
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + creationDate.hashCode()
        hashCode = 31 * hashCode + status.hashCode()
        hashCode = 31 * hashCode + isEnded.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("GiveawayInfoOngoing")
            append("(")
            append("creationDate=")
            append(creationDate)
            append(", ")
            append("status=")
            append(status)
            append(", ")
            append("isEnded=")
            append(isEnded)
            append(")")
        }
    }
}
