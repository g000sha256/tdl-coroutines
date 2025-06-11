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
 * A user in the chat came within proximity alert range.
 *
 * @property travelerId The identifier of a user or chat that triggered the proximity alert.
 * @property watcherId The identifier of a user or chat that subscribed for the proximity alert.
 * @property distance The distance between the users.
 */
public class MessageProximityAlertTriggered public constructor(
    public val travelerId: MessageSender,
    public val watcherId: MessageSender,
    public val distance: Int,
) : MessageContent() {
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
        other as MessageProximityAlertTriggered
        if (other.travelerId != travelerId) {
            return false
        }
        if (other.watcherId != watcherId) {
            return false
        }
        return other.distance == distance
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + travelerId.hashCode()
        hashCode = 31 * hashCode + watcherId.hashCode()
        hashCode = 31 * hashCode + distance.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("MessageProximityAlertTriggered")
            append("(")
            append("travelerId=")
            append(travelerId)
            append(", ")
            append("watcherId=")
            append(watcherId)
            append(", ")
            append("distance=")
            append(distance)
            append(")")
        }
    }
}
