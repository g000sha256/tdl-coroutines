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
import kotlin.String
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Describes autosave settings.
 *
 * @property privateChatSettings Default autosave settings for private chats.
 * @property groupSettings Default autosave settings for basic group and supergroup chats.
 * @property channelSettings Default autosave settings for channel chats.
 * @property exceptions Autosave settings for specific chats.
 */
@SerialName(value = "autosaveSettings")
@Serializable
public class AutosaveSettings public constructor(
    @SerialName(value = "private_chat_settings")
    public val privateChatSettings: ScopeAutosaveSettings,
    @SerialName(value = "group_settings")
    public val groupSettings: ScopeAutosaveSettings,
    @SerialName(value = "channel_settings")
    public val channelSettings: ScopeAutosaveSettings,
    @SerialName(value = "exceptions")
    public val exceptions: Array<AutosaveSettingsException>,
) : Model() {
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
        other as AutosaveSettings
        if (other.privateChatSettings != privateChatSettings) {
            return false
        }
        if (other.groupSettings != groupSettings) {
            return false
        }
        if (other.channelSettings != channelSettings) {
            return false
        }
        return other.exceptions.contentDeepEquals(exceptions)
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + privateChatSettings.hashCode()
        hashCode = 31 * hashCode + groupSettings.hashCode()
        hashCode = 31 * hashCode + channelSettings.hashCode()
        hashCode = 31 * hashCode + exceptions.contentDeepHashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("AutosaveSettings")
            append("(")
            append("privateChatSettings=")
            append(privateChatSettings)
            append(", ")
            append("groupSettings=")
            append(groupSettings)
            append(", ")
            append("channelSettings=")
            append(channelSettings)
            append(", ")
            append("exceptions=")
            exceptions
                .contentDeepToString()
                .also { append(it) }
            append(")")
        }
    }
}
