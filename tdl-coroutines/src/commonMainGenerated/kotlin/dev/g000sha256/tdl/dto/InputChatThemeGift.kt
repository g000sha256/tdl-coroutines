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
 * A theme based on an upgraded gift.
 *
 * @property name Name of the upgraded gift. A gift can be used only in one chat in a time. When the same gift is used in another chat, theme in the previous chat is reset to default.
 */
public class InputChatThemeGift public constructor(
    public val name: String,
) : InputChatTheme() {
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
        other as InputChatThemeGift
        return other.name == name
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + name.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InputChatThemeGift")
            append("(")
            append("name=")
            append(name)
            append(")")
        }
    }
}
