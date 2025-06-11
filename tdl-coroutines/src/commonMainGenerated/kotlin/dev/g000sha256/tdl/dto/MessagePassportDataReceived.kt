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
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String

/**
 * Telegram Passport data has been received; for bots only.
 *
 * @property elements List of received Telegram Passport elements.
 * @property credentials Encrypted data credentials.
 */
public class MessagePassportDataReceived public constructor(
    public val elements: Array<EncryptedPassportElement>,
    public val credentials: EncryptedCredentials,
) : MessageContent() {
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
        other as MessagePassportDataReceived
        val elementsEquals = other.elements.contentDeepEquals(elements)
        if (!elementsEquals) {
            return false
        }
        return other.credentials == credentials
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + elements.contentDeepHashCode()
        hashCode = 31 * hashCode + credentials.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("MessagePassportDataReceived")
            append("(")
            append("elements=")
            elements
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("credentials=")
            append(credentials)
            append(")")
        }
    }
}
