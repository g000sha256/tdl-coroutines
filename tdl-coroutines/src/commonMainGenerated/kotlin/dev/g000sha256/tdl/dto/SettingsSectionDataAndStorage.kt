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
 * The data and storage settings section.
 *
 * @property subsection Subsection of the section; may be one of &quot;&quot;, &quot;storage&quot;, &quot;storage/edit&quot;, &quot;storage/auto-remove&quot;, &quot;storage/clear-cache&quot;, &quot;storage/max-cache&quot;, &quot;usage&quot;, &quot;usage/mobile&quot;, &quot;usage/wifi&quot;, &quot;usage/reset&quot;, &quot;usage/roaming&quot;, &quot;auto-download/mobile&quot;, &quot;auto-download/mobile/enable&quot;, &quot;auto-download/mobile/usage&quot;, &quot;auto-download/mobile/photos&quot;, &quot;auto-download/mobile/stories&quot;, &quot;auto-download/mobile/videos&quot;, &quot;auto-download/mobile/files&quot;, &quot;auto-download/wifi&quot;, &quot;auto-download/wifi/enable&quot;, &quot;auto-download/wifi/usage&quot;, &quot;auto-download/wifi/photos&quot;, &quot;auto-download/wifi/stories&quot;, &quot;auto-download/wifi/videos&quot;, &quot;auto-download/wifi/files&quot;, &quot;auto-download/roaming&quot;, &quot;auto-download/roaming/enable&quot;, &quot;auto-download/roaming/usage&quot;, &quot;auto-download/roaming/photos&quot;, &quot;auto-download/roaming/stories&quot;, &quot;auto-download/roaming/videos&quot;, &quot;auto-download/roaming/files&quot;, &quot;auto-download/reset&quot;, &quot;save-to-photos/chats&quot;, &quot;save-to-photos/chats/max-video-size&quot;, &quot;save-to-photos/chats/add-exception&quot;, &quot;save-to-photos/chats/delete-all&quot;, &quot;save-to-photos/groups&quot;, &quot;save-to-photos/groups/max-video-size&quot;, &quot;save-to-photos/groups/add-exception&quot;, &quot;save-to-photos/groups/delete-all&quot;, &quot;save-to-photos/channels&quot;, &quot;save-to-photos/channels/max-video-size&quot;, &quot;save-to-photos/channels/add-exception&quot;, &quot;save-to-photos/channels/delete-all&quot;, &quot;less-data-calls&quot;, &quot;open-links&quot;, &quot;share-sheet&quot;, &quot;share-sheet/suggested-chats&quot;, &quot;share-sheet/suggest-by&quot;, &quot;share-sheet/reset&quot;, &quot;saved-edited-photos&quot;, &quot;pause-music&quot;, &quot;raise-to-listen&quot;, &quot;raise-to-speak&quot;, &quot;show-18-content&quot;, &quot;proxy&quot;, &quot;proxy/edit&quot;, &quot;proxy/use-proxy&quot;, &quot;proxy/add-proxy&quot;, &quot;proxy/share-list&quot;, &quot;proxy/use-for-calls&quot;.
 */
public class SettingsSectionDataAndStorage public constructor(
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
        other as SettingsSectionDataAndStorage
        return other.subsection == subsection
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + subsection.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("SettingsSectionDataAndStorage")
            append("(")
            append("subsection=")
            append(subsection)
            append(")")
        }
    }
}
