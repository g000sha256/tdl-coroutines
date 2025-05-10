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
 * Describes a reason why an external chat is shown in a chat list.
 */
public sealed class ChatSourceDto private constructor() {
    /**
     * The chat is sponsored by the user's MTProxy server.
     */
    public class MtprotoProxy public constructor() : ChatSourceDto() {
        override fun equals(other: Any?): Boolean {
            if (other === this) {
                return true
            }
            if (other == null) {
                return false
            }
            return this::class == other::class
        }

        override fun hashCode(): Int {
            return this::class.hashCode()
        }

        override fun toString(): String {
            return "ChatSourceDto.MtprotoProxy()"
        }
    }

    /**
     * The chat contains a public service announcement.
     *
     * @property type The type of the announcement.
     * @property text The text of the announcement.
     */
    public class PublicServiceAnnouncement public constructor(
        public val type: String,
        public val text: String,
    ) : ChatSourceDto() {
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
            other as PublicServiceAnnouncement
            if (other.type != type) {
                return false
            }
            return other.text == text
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + type.hashCode()
            hashCode = 31 * hashCode + text.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("ChatSourceDto.PublicServiceAnnouncement")
                append("(")
                append("type=")
                append(type)
                append(", ")
                append("text=")
                append(text)
                append(")")
            }
        }
    }
}
