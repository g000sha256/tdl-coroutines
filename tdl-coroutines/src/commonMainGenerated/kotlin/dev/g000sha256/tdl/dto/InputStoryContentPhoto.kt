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
import kotlin.IntArray
import kotlin.String

/**
 * A photo story.
 *
 * @property photo Photo to send. The photo must be at most 10 MB in size. The photo size must be 1080x1920.
 * @property addedStickerFileIds File identifiers of the stickers added to the photo, if applicable.
 */
public class InputStoryContentPhoto public constructor(
    public val photo: InputFile,
    public val addedStickerFileIds: IntArray,
) : InputStoryContent() {
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
        other as InputStoryContentPhoto
        if (other.photo != photo) {
            return false
        }
        return other.addedStickerFileIds.contentEquals(addedStickerFileIds)
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + photo.hashCode()
        hashCode = 31 * hashCode + addedStickerFileIds.contentHashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InputStoryContentPhoto")
            append("(")
            append("photo=")
            append(photo)
            append(", ")
            append("addedStickerFileIds=")
            addedStickerFileIds
                .contentToString()
                .also { append(it) }
            append(")")
        }
    }
}
