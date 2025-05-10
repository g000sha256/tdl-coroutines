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
 * Represents result of checking whether the current session can be used to transfer a chat ownership to another user.
 */
public sealed class CanTransferOwnershipResultDto private constructor() {
    /**
     * The session can be used.
     */
    public class Ok public constructor() : CanTransferOwnershipResultDto() {
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
            return "CanTransferOwnershipResultDto.Ok()"
        }
    }

    /**
     * The 2-step verification needs to be enabled first.
     */
    public class PasswordNeeded public constructor() : CanTransferOwnershipResultDto() {
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
            return "CanTransferOwnershipResultDto.PasswordNeeded()"
        }
    }

    /**
     * The 2-step verification was enabled recently, user needs to wait.
     *
     * @property retryAfter Time left before the session can be used to transfer ownership of a chat, in seconds.
     */
    public class PasswordTooFresh public constructor(
        public val retryAfter: Int,
    ) : CanTransferOwnershipResultDto() {
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
            other as PasswordTooFresh
            return other.retryAfter == retryAfter
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + retryAfter.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("CanTransferOwnershipResultDto.PasswordTooFresh")
                append("(")
                append("retryAfter=")
                append(retryAfter)
                append(")")
            }
        }
    }

    /**
     * The session was created recently, user needs to wait.
     *
     * @property retryAfter Time left before the session can be used to transfer ownership of a chat, in seconds.
     */
    public class SessionTooFresh public constructor(
        public val retryAfter: Int,
    ) : CanTransferOwnershipResultDto() {
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
            other as SessionTooFresh
            return other.retryAfter == retryAfter
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + retryAfter.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("CanTransferOwnershipResultDto.SessionTooFresh")
                append("(")
                append("retryAfter=")
                append(retryAfter)
                append(")")
            }
        }
    }
}
