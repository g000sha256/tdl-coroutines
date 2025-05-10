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

import dev.g000sha256.tdl.dto.MessageContentDto
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.String

/**
 * A service notification from the server was received. Upon receiving this the application must show a popup with the content of the notification.
 *
 * @property type Notification type. If type begins with &quot;AUTH_KEY_DROP_&quot;, then two buttons &quot;Cancel&quot; and &quot;Log out&quot; must be shown under notification; if user presses the second, all local data must be destroyed using Destroy method.
 * @property content Notification content.
 */
public class ServiceNotificationUpdateDto public constructor(
    public val type: String,
    public val content: MessageContentDto,
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
        other as ServiceNotificationUpdateDto
        if (other.type != type) {
            return false
        }
        return other.content == content
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + type.hashCode()
        hashCode = 31 * hashCode + content.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ServiceNotificationUpdateDto")
            append("(")
            append("type=")
            append(type)
            append(", ")
            append("content=")
            append(content)
            append(")")
        }
    }
}
