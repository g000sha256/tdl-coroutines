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
 * Contains information about a notification.
 *
 * @property id Unique persistent identifier of this notification.
 * @property date Notification date.
 * @property isSilent True, if the notification was explicitly sent without sound.
 * @property type Notification type.
 */
public class Notification public constructor(
    public val id: Int,
    public val date: Int,
    public val isSilent: Boolean,
    public val type: NotificationType,
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
        other as Notification
        if (other.id != id) {
            return false
        }
        if (other.date != date) {
            return false
        }
        if (other.isSilent != isSilent) {
            return false
        }
        return other.type == type
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + id.hashCode()
        hashCode = 31 * hashCode + date.hashCode()
        hashCode = 31 * hashCode + isSilent.hashCode()
        hashCode = 31 * hashCode + type.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("Notification")
            append("(")
            append("id=")
            append(id)
            append(", ")
            append("date=")
            append(date)
            append(", ")
            append("isSilent=")
            append(isSilent)
            append(", ")
            append("type=")
            append(type)
            append(")")
        }
    }
}
