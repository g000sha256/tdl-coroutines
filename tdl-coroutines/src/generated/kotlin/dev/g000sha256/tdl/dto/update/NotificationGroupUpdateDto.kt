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

package dev.g000sha256.tdl.dto.update

import dev.g000sha256.tdl.dto.NotificationDto
import dev.g000sha256.tdl.dto.NotificationGroupTypeDto
import kotlin.Any
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.IntArray
import kotlin.Long
import kotlin.String

/**
 * A list of active notifications in a notification group has changed.
 *
 * @property notificationGroupId Unique notification group identifier.
 * @property type New type of the notification group.
 * @property chatId Identifier of a chat to which all notifications in the group belong.
 * @property notificationSettingsChatId Chat identifier, which notification settings must be applied to the added notifications.
 * @property notificationSoundId Identifier of the notification sound to be played; 0 if sound is disabled.
 * @property totalCount Total number of unread notifications in the group, can be bigger than number of active notifications.
 * @property addedNotifications List of added group notifications, sorted by notification identifier.
 * @property removedNotificationIds Identifiers of removed group notifications, sorted by notification identifier.
 */
public class NotificationGroupUpdateDto public constructor(
    public val notificationGroupId: Int,
    public val type: NotificationGroupTypeDto,
    public val chatId: Long,
    public val notificationSettingsChatId: Long,
    public val notificationSoundId: Long,
    public val totalCount: Int,
    public val addedNotifications: Array<NotificationDto>,
    public val removedNotificationIds: IntArray,
) : UpdateDto() {
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
        other as NotificationGroupUpdateDto
        if (other.notificationGroupId != notificationGroupId) {
            return false
        }
        if (other.type != type) {
            return false
        }
        if (other.chatId != chatId) {
            return false
        }
        if (other.notificationSettingsChatId != notificationSettingsChatId) {
            return false
        }
        if (other.notificationSoundId != notificationSoundId) {
            return false
        }
        if (other.totalCount != totalCount) {
            return false
        }
        val addedNotificationsEquals = other.addedNotifications.contentDeepEquals(addedNotifications)
        if (!addedNotificationsEquals) {
            return false
        }
        return other.removedNotificationIds.contentEquals(removedNotificationIds)
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + notificationGroupId.hashCode()
        hashCode = 31 * hashCode + type.hashCode()
        hashCode = 31 * hashCode + chatId.hashCode()
        hashCode = 31 * hashCode + notificationSettingsChatId.hashCode()
        hashCode = 31 * hashCode + notificationSoundId.hashCode()
        hashCode = 31 * hashCode + totalCount.hashCode()
        hashCode = 31 * hashCode + addedNotifications.contentDeepHashCode()
        hashCode = 31 * hashCode + removedNotificationIds.contentHashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("NotificationGroupUpdateDto")
            append("(")
            append("notificationGroupId=")
            append(notificationGroupId)
            append(", ")
            append("type=")
            append(type)
            append(", ")
            append("chatId=")
            append(chatId)
            append(", ")
            append("notificationSettingsChatId=")
            append(notificationSettingsChatId)
            append(", ")
            append("notificationSoundId=")
            append(notificationSoundId)
            append(", ")
            append("totalCount=")
            append(totalCount)
            append(", ")
            append("addedNotifications=")
            addedNotifications
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("removedNotificationIds=")
            removedNotificationIds
                .contentToString()
                .also { append(it) }
            append(")")
        }
    }
}
