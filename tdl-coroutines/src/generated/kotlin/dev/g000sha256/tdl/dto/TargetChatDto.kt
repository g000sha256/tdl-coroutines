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
 * Describes the target chat to be opened.
 */
public sealed class TargetChatDto private constructor() {
    /**
     * The currently opened chat and forum topic must be kept.
     */
    public class Current public constructor() : TargetChatDto() {
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
            return "TargetChatDto.Current()"
        }
    }

    /**
     * The chat needs to be chosen by the user among chats of the specified types.
     *
     * @property types Allowed types for the chat.
     */
    public class Chosen public constructor(
        public val types: TargetChatTypesDto,
    ) : TargetChatDto() {
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
            other as Chosen
            return other.types == types
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + types.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("TargetChatDto.Chosen")
                append("(")
                append("types=")
                append(types)
                append(")")
            }
        }
    }

    /**
     * The chat needs to be open with the provided internal link.
     *
     * @property link An internal link pointing to the chat.
     */
    public class InternalLink public constructor(
        public val link: InternalLinkTypeDto,
    ) : TargetChatDto() {
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
            other as InternalLink
            return other.link == link
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + link.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("TargetChatDto.InternalLink")
                append("(")
                append("link=")
                append(link)
                append(")")
            }
        }
    }
}
