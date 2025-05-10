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
 * Describes type of paid message reaction.
 */
public sealed class PaidReactionTypeDto private constructor() {
    /**
     * A paid reaction on behalf of the current user.
     */
    public class Regular public constructor() : PaidReactionTypeDto() {
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
            return "PaidReactionTypeDto.Regular()"
        }
    }

    /**
     * An anonymous paid reaction.
     */
    public class Anonymous public constructor() : PaidReactionTypeDto() {
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
            return "PaidReactionTypeDto.Anonymous()"
        }
    }

    /**
     * A paid reaction on behalf of an owned chat.
     *
     * @property chatId Identifier of the chat.
     */
    public class Chat public constructor(
        public val chatId: Long,
    ) : PaidReactionTypeDto() {
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
            other as Chat
            return other.chatId == chatId
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + chatId.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PaidReactionTypeDto.Chat")
                append("(")
                append("chatId=")
                append(chatId)
                append(")")
            }
        }
    }
}
