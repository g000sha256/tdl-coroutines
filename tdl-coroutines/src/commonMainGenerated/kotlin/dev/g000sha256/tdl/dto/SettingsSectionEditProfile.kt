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
 * The profile edit section.
 *
 * @property subsection Subsection of the section; may be one of &quot;&quot;, &quot;set-photo&quot;, &quot;first-name&quot;, &quot;last-name&quot;, &quot;emoji-status&quot;, &quot;bio&quot;, &quot;birthday&quot;, &quot;change-number&quot;, &quot;username&quot;, &quot;your-color&quot;, &quot;channel&quot;, &quot;add-account&quot;, &quot;log-out&quot;, &quot;profile-color/profile&quot;, &quot;profile-color/profile/add-icons&quot;, &quot;profile-color/profile/use-gift&quot;, &quot;profile-color/name&quot;, &quot;profile-color/name/add-icons&quot;, &quot;profile-color/name/use-gift&quot;, &quot;profile-photo/use-emoji&quot;.
 */
public class SettingsSectionEditProfile public constructor(
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
        other as SettingsSectionEditProfile
        return other.subsection == subsection
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + subsection.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("SettingsSectionEditProfile")
            append("(")
            append("subsection=")
            append(subsection)
            append(")")
        }
    }
}
