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
 * The link is a link to an album of stories. Call searchPublicChat with the given username, then call getStoryAlbumStories with the received chat identifier and the given story album identifier, then show the story album if received.
 *
 * @property storyAlbumOwnerUsername Username of the owner of the story album.
 * @property storyAlbumId Story album identifier.
 */
public class InternalLinkTypeStoryAlbum public constructor(
    public val storyAlbumOwnerUsername: String,
    public val storyAlbumId: Int,
) : InternalLinkType() {
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
        other as InternalLinkTypeStoryAlbum
        if (other.storyAlbumOwnerUsername != storyAlbumOwnerUsername) {
            return false
        }
        return other.storyAlbumId == storyAlbumId
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + storyAlbumOwnerUsername.hashCode()
        hashCode = 31 * hashCode + storyAlbumId.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InternalLinkTypeStoryAlbum")
            append("(")
            append("storyAlbumOwnerUsername=")
            append(storyAlbumOwnerUsername)
            append(", ")
            append("storyAlbumId=")
            append(storyAlbumId)
            append(")")
        }
    }
}
