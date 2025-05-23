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
 * Contains a list of text entities.
 *
 * @property entities List of text entities.
 */
public class TextEntities public constructor(
    public val entities: Array<TextEntity>,
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
        other as TextEntities
        return other.entities.contentDeepEquals(entities)
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + entities.contentDeepHashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("TextEntities")
            append("(")
            append("entities=")
            entities
                .contentDeepToString()
                .also { append(it) }
            append(")")
        }
    }
}
