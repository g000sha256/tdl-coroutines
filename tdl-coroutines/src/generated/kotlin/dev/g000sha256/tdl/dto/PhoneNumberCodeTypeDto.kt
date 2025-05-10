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
 * Describes type of the request for which a code is sent to a phone number.
 */
public sealed class PhoneNumberCodeTypeDto private constructor() {
    /**
     * Checks ownership of a new phone number to change the user's authentication phone number; for official Android and iOS applications only.
     */
    public class Change public constructor() : PhoneNumberCodeTypeDto() {
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
            return "PhoneNumberCodeTypeDto.Change()"
        }
    }

    /**
     * Verifies ownership of a phone number to be added to the user's Telegram Passport.
     */
    public class Verify public constructor() : PhoneNumberCodeTypeDto() {
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
            return "PhoneNumberCodeTypeDto.Verify()"
        }
    }

    /**
     * Confirms ownership of a phone number to prevent account deletion while handling links of the type internalLinkTypePhoneNumberConfirmation.
     *
     * @property hash Hash value from the link.
     */
    public class ConfirmOwnership public constructor(
        public val hash: String,
    ) : PhoneNumberCodeTypeDto() {
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
            other as ConfirmOwnership
            return other.hash == hash
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + hash.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PhoneNumberCodeTypeDto.ConfirmOwnership")
                append("(")
                append("hash=")
                append(hash)
                append(")")
            }
        }
    }
}
