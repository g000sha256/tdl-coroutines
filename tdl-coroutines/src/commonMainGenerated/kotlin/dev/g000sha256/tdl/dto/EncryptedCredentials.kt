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
import kotlin.ByteArray
import kotlin.Int
import kotlin.String

/**
 * Contains encrypted Telegram Passport data credentials.
 *
 * @property data The encrypted credentials.
 * @property hash The decrypted data hash.
 * @property secret Secret for data decryption, encrypted with the service's public key.
 */
public class EncryptedCredentials public constructor(
    public val data: ByteArray,
    public val hash: ByteArray,
    public val secret: ByteArray,
) {
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
        other as EncryptedCredentials
        val dataEquals = other.data.contentEquals(data)
        if (!dataEquals) {
            return false
        }
        val hashEquals = other.hash.contentEquals(hash)
        if (!hashEquals) {
            return false
        }
        return other.secret.contentEquals(secret)
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + data.contentHashCode()
        hashCode = 31 * hashCode + hash.contentHashCode()
        hashCode = 31 * hashCode + secret.contentHashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("EncryptedCredentials")
            append("(")
            append("data=")
            data
                .contentToString()
                .also { append(it) }
            append(", ")
            append("hash=")
            hash
                .contentToString()
                .also { append(it) }
            append(", ")
            append("secret=")
            secret
                .contentToString()
                .also { append(it) }
            append(")")
        }
    }
}
