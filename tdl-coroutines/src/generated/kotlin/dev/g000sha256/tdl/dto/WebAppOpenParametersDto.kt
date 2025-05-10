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
 * Options to be used when a Web App is opened.
 *
 * @property theme Preferred Web App theme; pass null to use the default theme.
 * @property applicationName Short name of the current application; 0-64 English letters, digits, and underscores.
 * @property mode The mode in which the Web App is opened; pass null to open in webAppOpenModeFullSize.
 */
public class WebAppOpenParametersDto public constructor(
    public val theme: ThemeParametersDto?,
    public val applicationName: String,
    public val mode: WebAppOpenModeDto?,
) {
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
        other as WebAppOpenParametersDto
        if (other.theme != theme) {
            return false
        }
        if (other.applicationName != applicationName) {
            return false
        }
        return other.mode == mode
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + theme.hashCode()
        hashCode = 31 * hashCode + applicationName.hashCode()
        hashCode = 31 * hashCode + mode.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("WebAppOpenParametersDto")
            append("(")
            append("theme=")
            append(theme)
            append(", ")
            append("applicationName=")
            append(applicationName)
            append(", ")
            append("mode=")
            append(mode)
            append(")")
        }
    }
}
