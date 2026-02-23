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
 * The privacy and security section.
 *
 * @property subsection Subsection of the section; may be one of &quot;&quot;, &quot;blocked&quot;, &quot;blocked/edit&quot;, &quot;blocked/block-user&quot;, &quot;blocked/block-user/chats&quot;, &quot;blocked/block-user/contacts&quot;, &quot;active-websites&quot;, &quot;active-websites/edit&quot;, &quot;active-websites/disconnect-all&quot;, &quot;passcode&quot;, &quot;passcode/disable&quot;, &quot;passcode/change&quot;, &quot;passcode/auto-lock&quot;, &quot;passcode/face-id&quot;, &quot;passcode/fingerprint&quot;, &quot;2sv&quot;, &quot;2sv/change&quot;, &quot;2sv/disable&quot;, &quot;2sv/change-email&quot;, &quot;passkey&quot;, &quot;passkey/create&quot;, &quot;auto-delete&quot;, &quot;auto-delete/set-custom&quot;, &quot;login-email&quot;, &quot;phone-number&quot;, &quot;phone-number/never&quot;, &quot;phone-number/always&quot;, &quot;last-seen&quot;, &quot;last-seen/never&quot;, &quot;last-seen/always&quot;, &quot;last-seen/hide-read-time&quot;, &quot;profile-photos&quot;, &quot;profile-photos/never&quot;, &quot;profile-photos/always&quot;, &quot;profile-photos/set-public&quot;, &quot;profile-photos/update-public&quot;, &quot;profile-photos/remove-public&quot;, &quot;bio&quot;, &quot;bio/never&quot;, &quot;bio/always&quot;, &quot;gifts&quot;, &quot;gifts/show-icon&quot;, &quot;gifts/never&quot;, &quot;gifts/always&quot;, &quot;gifts/accepted-types&quot;, &quot;birthday&quot;, &quot;birthday/add&quot;, &quot;birthday/never&quot;, &quot;birthday/always&quot;, &quot;saved-music&quot;, &quot;saved-music/never&quot;, &quot;saved-music/always&quot;, &quot;forwards&quot;, &quot;forwards/never&quot;, &quot;forwards/always&quot;, &quot;calls&quot;, &quot;calls/never&quot;, &quot;calls/always&quot;, &quot;calls/p2p&quot;, &quot;calls/p2p/never&quot;, &quot;calls/p2p/always&quot;, &quot;calls/ios-integration&quot;, &quot;voice&quot;, &quot;voice/never&quot;, &quot;voice/always&quot;, &quot;messages&quot;, &quot;messages/set-price&quot;, &quot;messages/exceptions&quot;, &quot;invites&quot;, &quot;invites/never&quot;, &quot;invites/always&quot;, &quot;self-destruct&quot;, &quot;data-settings&quot;, &quot;data-settings/sync-contacts&quot;, &quot;data-settings/delete-synced&quot;, &quot;data-settings/suggest-contacts&quot;, &quot;data-settings/delete-cloud-drafts&quot;, &quot;data-settings/clear-payment-info&quot;, &quot;data-settings/link-previews&quot;, &quot;data-settings/bot-settings&quot;, &quot;data-settings/map-provider&quot;, &quot;archive-and-mute&quot;.
 */
public class SettingsSectionPrivacyAndSecurity public constructor(
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
        other as SettingsSectionPrivacyAndSecurity
        return other.subsection == subsection
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + subsection.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("SettingsSectionPrivacyAndSecurity")
            append("(")
            append("subsection=")
            append(subsection)
            append(")")
        }
    }
}
