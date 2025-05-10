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
 * This class is an abstract base class.
 * Describes a public forward or repost of a story.
 */
public sealed class PublicForwardDto private constructor() {
    /**
     * Contains a public forward as a message.
     *
     * @property message Information about the message.
     */
    public class Message public constructor(
        public val message: MessageDto,
    ) : PublicForwardDto() {
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
            other as Message
            return other.message == message
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + message.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PublicForwardDto.Message")
                append("(")
                append("message=")
                append(message)
                append(")")
            }
        }
    }

    /**
     * Contains a public repost to a story.
     *
     * @property story Information about the story.
     */
    public class Story public constructor(
        public val story: StoryDto,
    ) : PublicForwardDto() {
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
            other as Story
            return other.story == story
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + story.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PublicForwardDto.Story")
                append("(")
                append("story=")
                append(story)
                append(")")
            }
        }
    }
}
