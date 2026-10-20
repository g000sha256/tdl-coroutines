/*
 * Copyright 2026 Georgii Ippolitov (g000sha256)
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
 * Represents a challenge for TON wallet ownership proof.
 *
 * @property payload Payload of the challenge.
 * @property domain Domain of the proof requester.
 */
public class TonWalletOwnershipProofChallenge public constructor(
    public val payload: String,
    public val domain: String,
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
        other as TonWalletOwnershipProofChallenge
        if (other.payload != payload) {
            return false
        }
        return other.domain == domain
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + payload.hashCode()
        hashCode = 31 * hashCode + domain.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("TonWalletOwnershipProofChallenge")
            append("(")
            append("payload=")
            append(payload)
            append(", ")
            append("domain=")
            append(domain)
            append(")")
        }
    }
}
