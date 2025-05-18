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
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String

/**
 * The parameters of animation search through getOption(&quot;animation_search_bot_username&quot;) bot has changed.
 *
 * @property provider Name of the animation search provider.
 * @property emojis The new list of emojis suggested for searching.
 */
public class UpdateAnimationSearchParameters public constructor(
    public val provider: String,
    public val emojis: Array<String>,
) : Update() {
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
        other as UpdateAnimationSearchParameters
        if (other.provider != provider) {
            return false
        }
        return other.emojis.contentDeepEquals(emojis)
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + provider.hashCode()
        hashCode = 31 * hashCode + emojis.contentDeepHashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("UpdateAnimationSearchParameters")
            append("(")
            append("provider=")
            append(provider)
            append(", ")
            append("emojis=")
            emojis
                .contentDeepToString()
                .also { append(it) }
            append(")")
        }
    }
}
