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
import kotlin.Long
import kotlin.String

/**
 * Describes a style that can be used to compose a text.
 *
 * @property name Name of the style.
 * @property customEmojiId Identifier of the custom emoji corresponding to the style; 0 if none.
 * @property title Title of the style in the user application's language.
 * @property isCustom True, if the style is created by a user.
 * @property isCreator True, if the user is creator of the style.
 * @property installCount Number of users that installed the style; for created custom styles only; 0 if unknown.
 * @property prompt Prompt of the style; for created custom styles only.
 * @property creatorUserId User identifier of the creator of the style; 0 if none or unknown.
 * @property englishExample Example of the style usage in English; may be null if unknown.
 */
public class TextCompositionStyle public constructor(
    public val name: String,
    public val customEmojiId: Long,
    public val title: String,
    public val isCustom: Boolean,
    public val isCreator: Boolean,
    public val installCount: Int,
    public val prompt: String,
    public val creatorUserId: Long,
    public val englishExample: TextCompositionStyleExample?,
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
        other as TextCompositionStyle
        if (other.name != name) {
            return false
        }
        if (other.customEmojiId != customEmojiId) {
            return false
        }
        if (other.title != title) {
            return false
        }
        if (other.isCustom != isCustom) {
            return false
        }
        if (other.isCreator != isCreator) {
            return false
        }
        if (other.installCount != installCount) {
            return false
        }
        if (other.prompt != prompt) {
            return false
        }
        if (other.creatorUserId != creatorUserId) {
            return false
        }
        return other.englishExample == englishExample
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + name.hashCode()
        hashCode = 31 * hashCode + customEmojiId.hashCode()
        hashCode = 31 * hashCode + title.hashCode()
        hashCode = 31 * hashCode + isCustom.hashCode()
        hashCode = 31 * hashCode + isCreator.hashCode()
        hashCode = 31 * hashCode + installCount.hashCode()
        hashCode = 31 * hashCode + prompt.hashCode()
        hashCode = 31 * hashCode + creatorUserId.hashCode()
        hashCode = 31 * hashCode + englishExample.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("TextCompositionStyle")
            append("(")
            append("name=")
            append(name)
            append(", ")
            append("customEmojiId=")
            append(customEmojiId)
            append(", ")
            append("title=")
            append(title)
            append(", ")
            append("isCustom=")
            append(isCustom)
            append(", ")
            append("isCreator=")
            append(isCreator)
            append(", ")
            append("installCount=")
            append(installCount)
            append(", ")
            append("prompt=")
            append(prompt)
            append(", ")
            append("creatorUserId=")
            append(creatorUserId)
            append(", ")
            append("englishExample=")
            append(englishExample)
            append(")")
        }
    }
}
