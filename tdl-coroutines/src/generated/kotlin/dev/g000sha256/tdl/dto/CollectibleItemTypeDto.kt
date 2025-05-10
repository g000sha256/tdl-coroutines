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
 * Describes a collectible item that can be purchased at https://fragment.com.
 */
public sealed class CollectibleItemTypeDto private constructor() {
    /**
     * A username.
     *
     * @property username The username.
     */
    public class Username public constructor(
        public val username: String,
    ) : CollectibleItemTypeDto() {
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
            other as Username
            return other.username == username
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + username.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("CollectibleItemTypeDto.Username")
                append("(")
                append("username=")
                append(username)
                append(")")
            }
        }
    }

    /**
     * A phone number.
     *
     * @property phoneNumber The phone number.
     */
    public class PhoneNumber public constructor(
        public val phoneNumber: String,
    ) : CollectibleItemTypeDto() {
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
            other as PhoneNumber
            return other.phoneNumber == phoneNumber
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + phoneNumber.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("CollectibleItemTypeDto.PhoneNumber")
                append("(")
                append("phoneNumber=")
                append(phoneNumber)
                append(")")
            }
        }
    }
}
