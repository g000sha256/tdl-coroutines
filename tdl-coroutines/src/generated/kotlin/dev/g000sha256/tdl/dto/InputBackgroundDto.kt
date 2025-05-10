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
 * This class is an abstract base class.
 * Contains information about background to set.
 */
public sealed class InputBackgroundDto private constructor() {
    /**
     * A background from a local file.
     *
     * @property background Background file to use. Only inputFileLocal and inputFileGenerated are supported. The file must be in JPEG format for wallpapers and in PNG format for patterns.
     */
    public class Local public constructor(
        public val background: InputFileDto,
    ) : InputBackgroundDto() {
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
            other as Local
            return other.background == background
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + background.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InputBackgroundDto.Local")
                append("(")
                append("background=")
                append(background)
                append(")")
            }
        }
    }

    /**
     * A background from the server.
     *
     * @property backgroundId The background identifier.
     */
    public class Remote public constructor(
        public val backgroundId: Long,
    ) : InputBackgroundDto() {
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
            other as Remote
            return other.backgroundId == backgroundId
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + backgroundId.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InputBackgroundDto.Remote")
                append("(")
                append("backgroundId=")
                append(backgroundId)
                append(")")
            }
        }
    }

    /**
     * A background previously set in the chat; for chat backgrounds only.
     *
     * @property messageId Identifier of the message with the background.
     */
    public class Previous public constructor(
        public val messageId: Long,
    ) : InputBackgroundDto() {
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
            other as Previous
            return other.messageId == messageId
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + messageId.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InputBackgroundDto.Previous")
                append("(")
                append("messageId=")
                append(messageId)
                append(")")
            }
        }
    }
}
