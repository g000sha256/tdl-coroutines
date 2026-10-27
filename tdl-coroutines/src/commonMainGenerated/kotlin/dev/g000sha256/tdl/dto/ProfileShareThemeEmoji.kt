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
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String

/**
 * A theme with emoji placed on a background.
 *
 * @property emojis The emoji; 0-6 regular or custom emoji. If empty, then useDefaultBackground is false.
 * @property useDefaultBackground True, if the default background is used; otherwise, the backdrop with identifier backgroundBackdropId is used as background.
 * @property backgroundBackdropId Identifier of the backdrop used as background; must be ignored if useDefaultBackground is true. Use getProfileShareThemeBackdrops to get details about the backdrop.
 */
public class ProfileShareThemeEmoji public constructor(
    public val emojis: Array<EmojiType>,
    public val useDefaultBackground: Boolean,
    public val backgroundBackdropId: Int,
) : ProfileShareTheme() {
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
        other as ProfileShareThemeEmoji
        val emojisEquals = other.emojis.contentDeepEquals(emojis)
        if (!emojisEquals) {
            return false
        }
        if (other.useDefaultBackground != useDefaultBackground) {
            return false
        }
        return other.backgroundBackdropId == backgroundBackdropId
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + emojis.contentDeepHashCode()
        hashCode = 31 * hashCode + useDefaultBackground.hashCode()
        hashCode = 31 * hashCode + backgroundBackdropId.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ProfileShareThemeEmoji")
            append("(")
            append("emojis=")
            emojis
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("useDefaultBackground=")
            append(useDefaultBackground)
            append(", ")
            append("backgroundBackdropId=")
            append(backgroundBackdropId)
            append(")")
        }
    }
}
