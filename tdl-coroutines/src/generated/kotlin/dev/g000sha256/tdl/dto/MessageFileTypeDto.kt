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
 * Contains information about a file with messages exported from another app.
 */
public sealed class MessageFileTypeDto private constructor() {
    /**
     * The messages were exported from a private chat.
     *
     * @property name Name of the other party; may be empty if unrecognized.
     */
    public class Private public constructor(
        public val name: String,
    ) : MessageFileTypeDto() {
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
            other as Private
            return other.name == name
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + name.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageFileTypeDto.Private")
                append("(")
                append("name=")
                append(name)
                append(")")
            }
        }
    }

    /**
     * The messages were exported from a group chat.
     *
     * @property title Title of the group chat; may be empty if unrecognized.
     */
    public class Group public constructor(
        public val title: String,
    ) : MessageFileTypeDto() {
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
            other as Group
            return other.title == title
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + title.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("MessageFileTypeDto.Group")
                append("(")
                append("title=")
                append(title)
                append(")")
            }
        }
    }

    /**
     * The messages were exported from a chat of unknown type.
     */
    public class Unknown public constructor() : MessageFileTypeDto() {
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
            return "MessageFileTypeDto.Unknown()"
        }
    }
}
