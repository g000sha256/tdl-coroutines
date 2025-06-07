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
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Describes an emoji category.
 *
 * @property name Name of the category.
 * @property icon Custom emoji sticker, which represents icon of the category.
 * @property source Source of stickers for the emoji category.
 * @property isGreeting True, if the category must be shown first when choosing a sticker for the start page.
 */
@SerialName(value = "emojiCategory")
@Serializable
public class EmojiCategory public constructor(
    @SerialName(value = "name")
    public val name: String,
    @SerialName(value = "icon")
    public val icon: Sticker,
    @SerialName(value = "source")
    public val source: EmojiCategorySource,
    @SerialName(value = "is_greeting")
    public val isGreeting: Boolean,
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
        other as EmojiCategory
        if (other.name != name) {
            return false
        }
        if (other.icon != icon) {
            return false
        }
        if (other.source != source) {
            return false
        }
        return other.isGreeting == isGreeting
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + name.hashCode()
        hashCode = 31 * hashCode + icon.hashCode()
        hashCode = 31 * hashCode + source.hashCode()
        hashCode = 31 * hashCode + isGreeting.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("EmojiCategory")
            append("(")
            append("name=")
            append(name)
            append(", ")
            append("icon=")
            append(icon)
            append(", ")
            append("source=")
            append(source)
            append(", ")
            append("isGreeting=")
            append(isGreeting)
            append(")")
        }
    }
}
