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
 * Describes a game. Use getInternalLink with internalLinkTypeGame to share the game.
 *
 * @property id Unique game identifier.
 * @property shortName Game short name.
 * @property title Game title.
 * @property text Game text, usually containing scoreboards for a game.
 * @property description Game description.
 * @property photo Game photo.
 * @property animation Game animation; may be null.
 */
public class GameDto public constructor(
    public val id: Long,
    public val shortName: String,
    public val title: String,
    public val text: FormattedTextDto,
    public val description: String,
    public val photo: PhotoDto,
    public val animation: AnimationDto?,
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
        other as GameDto
        if (other.id != id) {
            return false
        }
        if (other.shortName != shortName) {
            return false
        }
        if (other.title != title) {
            return false
        }
        if (other.text != text) {
            return false
        }
        if (other.description != description) {
            return false
        }
        if (other.photo != photo) {
            return false
        }
        return other.animation == animation
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + id.hashCode()
        hashCode = 31 * hashCode + shortName.hashCode()
        hashCode = 31 * hashCode + title.hashCode()
        hashCode = 31 * hashCode + text.hashCode()
        hashCode = 31 * hashCode + description.hashCode()
        hashCode = 31 * hashCode + photo.hashCode()
        hashCode = 31 * hashCode + animation.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("GameDto")
            append("(")
            append("id=")
            append(id)
            append(", ")
            append("shortName=")
            append(shortName)
            append(", ")
            append("title=")
            append(title)
            append(", ")
            append("text=")
            append(text)
            append(", ")
            append("description=")
            append(description)
            append(", ")
            append("photo=")
            append(photo)
            append(", ")
            append("animation=")
            append(animation)
            append(")")
        }
    }
}
