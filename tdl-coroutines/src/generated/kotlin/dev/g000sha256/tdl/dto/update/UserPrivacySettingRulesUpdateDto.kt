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

import dev.g000sha256.tdl.dto.UserPrivacySettingDto
import dev.g000sha256.tdl.dto.UserPrivacySettingRulesDto
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.String

/**
 * Some privacy setting rules have been changed.
 *
 * @property setting The privacy setting.
 * @property rules New privacy rules.
 */
public class UserPrivacySettingRulesUpdateDto public constructor(
    public val setting: UserPrivacySettingDto,
    public val rules: UserPrivacySettingRulesDto,
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
        other as UserPrivacySettingRulesUpdateDto
        if (other.setting != setting) {
            return false
        }
        return other.rules == rules
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + setting.hashCode()
        hashCode = 31 * hashCode + rules.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("UserPrivacySettingRulesUpdateDto")
            append("(")
            append("setting=")
            append(setting)
            append(", ")
            append("rules=")
            append(rules)
            append(")")
        }
    }
}
