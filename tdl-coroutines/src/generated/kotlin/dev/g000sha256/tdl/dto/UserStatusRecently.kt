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
import kotlin.Boolean
import kotlin.Int
import kotlin.String

/**
 * The user was online recently.
 *
 * @property byMyPrivacySettings Exact user's status is hidden because the current user enabled userPrivacySettingShowStatus privacy setting for the user and has no Telegram Premium.
 */
public class UserStatusRecently public constructor(
    public val byMyPrivacySettings: Boolean,
) : UserStatus() {
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
        other as UserStatusRecently
        return other.byMyPrivacySettings == byMyPrivacySettings
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + byMyPrivacySettings.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("UserStatusRecently")
            append("(")
            append("byMyPrivacySettings=")
            append(byMyPrivacySettings)
            append(")")
        }
    }
}
