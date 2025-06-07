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
 * Represents a user contact.
 *
 * @property id Unique identifier of the query result.
 * @property contact A user contact.
 * @property thumbnail Result thumbnail in JPEG format; may be null.
 */
@SerialName(value = "inlineQueryResultContact")
@Serializable
public class InlineQueryResultContact public constructor(
    @SerialName(value = "id")
    public val id: String,
    @SerialName(value = "contact")
    public val contact: Contact,
    @SerialName(value = "thumbnail")
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
        other as InlineQueryResultContact
        if (other.id != id) {
            return false
        }
        if (other.contact != contact) {
            return false
        }
        return other.thumbnail == thumbnail
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + id.hashCode()
        hashCode = 31 * hashCode + contact.hashCode()
        hashCode = 31 * hashCode + thumbnail.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InlineQueryResultContact")
            append("(")
            append("id=")
            append(id)
            append(", ")
            append("contact=")
            append(contact)
            append(", ")
            append("thumbnail=")
            append(thumbnail)
            append(")")
        }
    }
}
