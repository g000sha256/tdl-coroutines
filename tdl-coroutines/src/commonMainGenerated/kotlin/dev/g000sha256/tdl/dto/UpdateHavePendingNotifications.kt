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
 * Describes whether there are some pending notification updates. Can be used to prevent application from killing, while there are some pending notifications.
 *
 * @property haveDelayedNotifications True, if there are some delayed notification updates, which will be sent soon.
 * @property haveUnreceivedNotifications True, if there can be some yet unreceived notifications, which are being fetched from the server.
 */
public class UpdateHavePendingNotifications public constructor(
    public val haveDelayedNotifications: Boolean,
    public val haveUnreceivedNotifications: Boolean,
) : Update() {
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
        other as UpdateHavePendingNotifications
        if (other.haveDelayedNotifications != haveDelayedNotifications) {
            return false
        }
        return other.haveUnreceivedNotifications == haveUnreceivedNotifications
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + haveDelayedNotifications.hashCode()
        hashCode = 31 * hashCode + haveUnreceivedNotifications.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("UpdateHavePendingNotifications")
            append("(")
            append("haveDelayedNotifications=")
            append(haveDelayedNotifications)
            append(", ")
            append("haveUnreceivedNotifications=")
            append(haveUnreceivedNotifications)
            append(")")
        }
    }
}
