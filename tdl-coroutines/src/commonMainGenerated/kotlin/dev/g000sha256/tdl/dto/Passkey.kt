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
import kotlin.Long
import kotlin.String

/**
 * Describes a passkey.
 *
 * @property id Unique identifier of the passkey.
 * @property name Name of the passkey.
 * @property additionDate Point in time (Unix timestamp) when the passkey was added.
 * @property lastUsageDate Point in time (Unix timestamp) when the passkey was used last time; 0 if never.
 * @property softwareIconCustomEmojiId Identifier of the custom emoji that is used as the icon of the software, which created the passkey; 0 if unknown.
 */
public class Passkey public constructor(
    public val id: String,
    public val name: String,
    public val additionDate: Int,
    public val lastUsageDate: Int,
    public val softwareIconCustomEmojiId: Long,
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
        other as Passkey
        if (other.id != id) {
            return false
        }
        if (other.name != name) {
            return false
        }
        if (other.additionDate != additionDate) {
            return false
        }
        if (other.lastUsageDate != lastUsageDate) {
            return false
        }
        return other.softwareIconCustomEmojiId == softwareIconCustomEmojiId
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + id.hashCode()
        hashCode = 31 * hashCode + name.hashCode()
        hashCode = 31 * hashCode + additionDate.hashCode()
        hashCode = 31 * hashCode + lastUsageDate.hashCode()
        hashCode = 31 * hashCode + softwareIconCustomEmojiId.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("Passkey")
            append("(")
            append("id=")
            append(id)
            append(", ")
            append("name=")
            append(name)
            append(", ")
            append("additionDate=")
            append(additionDate)
            append(", ")
            append("lastUsageDate=")
            append(lastUsageDate)
            append(", ")
            append("softwareIconCustomEmojiId=")
            append(softwareIconCustomEmojiId)
            append(")")
        }
    }
}
