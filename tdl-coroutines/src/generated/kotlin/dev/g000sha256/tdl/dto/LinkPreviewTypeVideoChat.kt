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
 * The link is a link to a video chat.
 *
 * @property photo Photo of the chat with the video chat; may be null if none.
 * @property isLiveStream True, if the video chat is expected to be a live stream in a channel or a broadcast group.
 */
public class LinkPreviewTypeVideoChat public constructor(
    public val photo: ChatPhoto?,
    public val isLiveStream: Boolean,
) : LinkPreviewType() {
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
        other as LinkPreviewTypeVideoChat
        if (other.photo != photo) {
            return false
        }
        return other.isLiveStream == isLiveStream
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + photo.hashCode()
        hashCode = 31 * hashCode + isLiveStream.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("LinkPreviewTypeVideoChat")
            append("(")
            append("photo=")
            append(photo)
            append(", ")
            append("isLiveStream=")
            append(isLiveStream)
            append(")")
        }
    }
}
