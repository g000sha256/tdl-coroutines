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
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String

/**
 * Describes a group of notifications.
 *
 * @property id Unique persistent auto-incremented from 1 identifier of the notification group.
 * @property type Type of the group.
 * @property chatId Identifier of a chat to which all notifications in the group belong.
 * @property totalCount Total number of active notifications in the group.
 * @property notifications The list of active notifications.
 */
public class NotificationGroup public constructor(
    public val id: Int,
    public val type: NotificationGroupType,
    public val chatId: Long,
    public val totalCount: Int,
    public val notifications: Array<Notification>,
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
        other as NotificationGroup
        if (other.id != id) {
            return false
        }
        if (other.type != type) {
            return false
        }
        if (other.chatId != chatId) {
            return false
        }
        if (other.totalCount != totalCount) {
            return false
        }
        return other.notifications.contentDeepEquals(notifications)
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + id.hashCode()
        hashCode = 31 * hashCode + type.hashCode()
        hashCode = 31 * hashCode + chatId.hashCode()
        hashCode = 31 * hashCode + totalCount.hashCode()
        hashCode = 31 * hashCode + notifications.contentDeepHashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("NotificationGroup")
            append("(")
            append("id=")
            append(id)
            append(", ")
            append("type=")
            append(type)
            append(", ")
            append("chatId=")
            append(chatId)
            append(", ")
            append("totalCount=")
            append(totalCount)
            append(", ")
            append("notifications=")
            notifications
                .contentDeepToString()
                .also { append(it) }
            append(")")
        }
    }
}
