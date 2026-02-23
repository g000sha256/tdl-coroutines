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
 * The notification settings section.
 *
 * @property subsection Subsection of the section; may be one of &quot;&quot;, &quot;accounts&quot;, &quot;private-chats&quot;, &quot;private-chats/edit&quot;, &quot;private-chats/show&quot;, &quot;private-chats/preview&quot;, &quot;private-chats/sound&quot;, &quot;private-chats/add-exception&quot;, &quot;private-chats/delete-exceptions&quot;, &quot;private-chats/light-color&quot;, &quot;private-chats/vibrate&quot;, &quot;private-chats/priority&quot;, &quot;groups&quot;, &quot;groups/edit&quot;, &quot;groups/show&quot;, &quot;groups/preview&quot;, &quot;groups/sound&quot;, &quot;groups/add-exception&quot;, &quot;groups/delete-exceptions&quot;, &quot;groups/light-color&quot;, &quot;groups/vibrate&quot;, &quot;groups/priority&quot;, &quot;channels&quot;, &quot;channels/edit&quot;, &quot;channels/show&quot;, &quot;channels/preview&quot;, &quot;channels/sound&quot;, &quot;channels/add-exception&quot;, &quot;channels/delete-exceptions&quot;, &quot;channels/light-color&quot;, &quot;channels/vibrate&quot;, &quot;channels/priority&quot;, &quot;stories&quot;, &quot;stories/new&quot;, &quot;stories/important&quot;, &quot;stories/show-sender&quot;, &quot;stories/sound&quot;, &quot;stories/add-exception&quot;, &quot;stories/delete-exceptions&quot;, &quot;stories/light-color&quot;, &quot;stories/vibrate&quot;, &quot;stories/priority&quot;, &quot;reactions&quot;, &quot;reactions/messages&quot;, &quot;reactions/stories&quot;, &quot;reactions/show-sender&quot;, &quot;reactions/sound&quot;, &quot;reactions/light-color&quot;, &quot;reactions/vibrate&quot;, &quot;reactions/priority&quot;, &quot;in-app-sounds&quot;, &quot;in-app-vibrate&quot;, &quot;in-app-preview&quot;, &quot;in-chat-sounds&quot;, &quot;in-app-popup&quot;, &quot;lock-screen-names&quot;, &quot;include-channels&quot;, &quot;include-muted-chats&quot;, &quot;count-unread-messages&quot;, &quot;new-contacts&quot;, &quot;pinned-messages&quot;, &quot;reset&quot;, &quot;web&quot;.
 */
public class SettingsSectionNotifications public constructor(
    public val subsection: String,
) : SettingsSection() {
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
        other as SettingsSectionNotifications
        return other.subsection == subsection
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + subsection.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("SettingsSectionNotifications")
            append("(")
            append("subsection=")
            append(subsection)
            append(")")
        }
    }
}
