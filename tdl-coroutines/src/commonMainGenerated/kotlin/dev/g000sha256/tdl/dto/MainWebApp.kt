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
 * Contains information about the main Web App of a bot.
 *
 * @property url URL of the Web App to open.
 * @property mode The mode in which the Web App must be opened.
 */
public class MainWebApp public constructor(
    public val url: String,
    public val mode: WebAppOpenMode,
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
        other as MainWebApp
        if (other.url != url) {
            return false
        }
        return other.mode == mode
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + url.hashCode()
        hashCode = 31 * hashCode + mode.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("MainWebApp")
            append("(")
            append("url=")
            append(url)
            append(", ")
            append("mode=")
            append(mode)
            append(")")
        }
    }
}
