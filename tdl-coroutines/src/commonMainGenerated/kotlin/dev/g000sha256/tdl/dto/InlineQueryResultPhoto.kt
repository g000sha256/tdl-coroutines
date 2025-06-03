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
 * Represents a photo.
 *
 * @property id Unique identifier of the query result.
 * @property photo Photo.
 * @property title Title of the result, if known.
 * @property description A short description of the result, if known.
 */
public class InlineQueryResultPhoto public constructor(
    public val id: String,
    public val photo: Photo,
    public val title: String,
    public val description: String,
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
        other as InlineQueryResultPhoto
        if (other.id != id) {
            return false
        }
        if (other.photo != photo) {
            return false
        }
        if (other.title != title) {
            return false
        }
        return other.description == description
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + id.hashCode()
        hashCode = 31 * hashCode + photo.hashCode()
        hashCode = 31 * hashCode + title.hashCode()
        hashCode = 31 * hashCode + description.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InlineQueryResultPhoto")
            append("(")
            append("id=")
            append(id)
            append(", ")
            append("photo=")
            append(photo)
            append(", ")
            append("title=")
            append(title)
            append(", ")
            append("description=")
            append(description)
            append(")")
        }
    }
}
