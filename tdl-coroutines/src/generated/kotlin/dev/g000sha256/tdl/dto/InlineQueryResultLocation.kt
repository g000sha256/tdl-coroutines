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
 * Represents a point on the map.
 *
 * @property id Unique identifier of the query result.
 * @property location Location result.
 * @property title Title of the result.
 * @property thumbnail Result thumbnail in JPEG format; may be null.
 */
public class InlineQueryResultLocation public constructor(
    public val id: String,
    public val location: Location,
    public val title: String,
    public val thumbnail: Thumbnail?,
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
        other as InlineQueryResultLocation
        if (other.id != id) {
            return false
        }
        if (other.location != location) {
            return false
        }
        if (other.title != title) {
            return false
        }
        return other.thumbnail == thumbnail
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + id.hashCode()
        hashCode = 31 * hashCode + location.hashCode()
        hashCode = 31 * hashCode + title.hashCode()
        hashCode = 31 * hashCode + thumbnail.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InlineQueryResultLocation")
            append("(")
            append("id=")
            append(id)
            append(", ")
            append("location=")
            append(location)
            append(", ")
            append("title=")
            append(title)
            append(", ")
            append("thumbnail=")
            append(thumbnail)
            append(")")
        }
    }
}
