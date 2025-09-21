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
 * Describes album of stories.
 *
 * @property id Unique identifier of the album.
 * @property name Name of the album.
 * @property photoIcon Icon of the album; may be null if none.
 * @property videoIcon Video icon of the album; may be null if none.
 */
public class StoryAlbum public constructor(
    public val id: Int,
    public val name: String,
    public val photoIcon: Photo?,
    public val videoIcon: Video?,
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
        other as StoryAlbum
        if (other.id != id) {
            return false
        }
        if (other.name != name) {
            return false
        }
        if (other.photoIcon != photoIcon) {
            return false
        }
        return other.videoIcon == videoIcon
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + id.hashCode()
        hashCode = 31 * hashCode + name.hashCode()
        hashCode = 31 * hashCode + photoIcon.hashCode()
        hashCode = 31 * hashCode + videoIcon.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("StoryAlbum")
            append("(")
            append("id=")
            append(id)
            append(", ")
            append("name=")
            append(name)
            append(", ")
            append("photoIcon=")
            append(photoIcon)
            append(", ")
            append("videoIcon=")
            append(videoIcon)
            append(")")
        }
    }
}
