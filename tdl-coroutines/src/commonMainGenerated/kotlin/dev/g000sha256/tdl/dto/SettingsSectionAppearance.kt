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
 * The appearance section.
 *
 * @property subsection Subsection of the section; may be one of &quot;&quot;, &quot;themes&quot;, &quot;themes/edit&quot;, &quot;themes/create&quot;, &quot;wallpapers&quot;, &quot;wallpapers/edit&quot;, &quot;wallpapers/set&quot;, &quot;wallpapers/choose-photo&quot;, &quot;your-color/profile&quot;, &quot;your-color/profile/add-icons&quot;, &quot;your-color/profile/use-gift&quot;, &quot;your-color/profile/reset&quot;, &quot;your-color/name&quot;, &quot;your-color/name/add-icons&quot;, &quot;your-color/name/use-gift&quot;, &quot;night-mode&quot;, &quot;auto-night-mode&quot;, &quot;text-size&quot;, &quot;text-size/use-system&quot;, &quot;message-corners&quot;, &quot;animations&quot;, &quot;stickers-and-emoji&quot;, &quot;stickers-and-emoji/edit&quot;, &quot;stickers-and-emoji/trending&quot;, &quot;stickers-and-emoji/archived&quot;, &quot;stickers-and-emoji/archived/edit&quot;, &quot;stickers-and-emoji/emoji&quot;, &quot;stickers-and-emoji/emoji/edit&quot;, &quot;stickers-and-emoji/emoji/archived&quot;, &quot;stickers-and-emoji/emoji/archived/edit&quot;, &quot;stickers-and-emoji/emoji/suggest&quot;, &quot;stickers-and-emoji/emoji/quick-reaction&quot;, &quot;stickers-and-emoji/emoji/quick-reaction/choose&quot;, &quot;stickers-and-emoji/suggest-by-emoji&quot;, &quot;stickers-and-emoji/large-emoji&quot;, &quot;stickers-and-emoji/dynamic-order&quot;, &quot;stickers-and-emoji/emoji/show-more&quot;, &quot;app-icon&quot;, &quot;tap-for-next-media&quot;.
 */
public class SettingsSectionAppearance public constructor(
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
        other as SettingsSectionAppearance
        return other.subsection == subsection
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + subsection.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("SettingsSectionAppearance")
            append("(")
            append("subsection=")
            append(subsection)
            append(")")
        }
    }
}
