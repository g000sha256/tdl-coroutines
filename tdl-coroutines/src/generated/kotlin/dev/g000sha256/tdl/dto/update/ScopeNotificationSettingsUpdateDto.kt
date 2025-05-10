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

import dev.g000sha256.tdl.dto.NotificationSettingsScopeDto
import dev.g000sha256.tdl.dto.ScopeNotificationSettingsDto
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.String

/**
 * Notification settings for some type of chats were updated.
 *
 * @property scope Types of chats for which notification settings were updated.
 * @property notificationSettings The new notification settings.
 */
public class ScopeNotificationSettingsUpdateDto public constructor(
    public val scope: NotificationSettingsScopeDto,
    public val notificationSettings: ScopeNotificationSettingsDto,
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
        other as ScopeNotificationSettingsUpdateDto
        if (other.scope != scope) {
            return false
        }
        return other.notificationSettings == notificationSettings
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + scope.hashCode()
        hashCode = 31 * hashCode + notificationSettings.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ScopeNotificationSettingsUpdateDto")
            append("(")
            append("scope=")
            append(scope)
            append(", ")
            append("notificationSettings=")
            append(notificationSettings)
            append(")")
        }
    }
}
