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
 * Represents an animation file.
 *
 * @property id Unique identifier of the query result.
 * @property animation Animation file.
 * @property title Animation title.
 */
public class InlineQueryResultAnimation public constructor(
    public val id: String,
    public val animation: Animation,
    public val title: String,
) : InlineQueryResult() {
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
        other as InlineQueryResultAnimation
        if (other.id != id) {
            return false
        }
        if (other.animation != animation) {
            return false
        }
        return other.title == title
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + id.hashCode()
        hashCode = 31 * hashCode + animation.hashCode()
        hashCode = 31 * hashCode + title.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InlineQueryResultAnimation")
            append("(")
            append("id=")
            append(id)
            append(", ")
            append("animation=")
            append(animation)
            append(", ")
            append("title=")
            append(title)
            append(")")
        }
    }
}
