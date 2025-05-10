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
import kotlin.Long
import kotlin.String

/**
 * This class is an abstract base class.
 * Describes parameters to be used for device verification.
 */
public sealed class FirebaseDeviceVerificationParametersDto private constructor() {
    /**
     * Device verification must be performed with the SafetyNet Attestation API.
     *
     * @property nonce Nonce to pass to the SafetyNet Attestation API.
     */
    public class SafetyNet public constructor(
        public val nonce: ByteArray,
    ) : FirebaseDeviceVerificationParametersDto() {
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
            other as SafetyNet
            return other.nonce.contentEquals(nonce)
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + nonce.contentHashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("FirebaseDeviceVerificationParametersDto.SafetyNet")
                append("(")
                append("nonce=")
                nonce
                    .contentToString()
                    .also { append(it) }
                append(")")
            }
        }
    }

    /**
     * Device verification must be performed with the classic Play Integrity verification (https://developer.android.com/google/play/integrity/classic).
     *
     * @property nonce Base64url-encoded nonce to pass to the Play Integrity API.
     * @property cloudProjectNumber Cloud project number to pass to the Play Integrity API.
     */
    public class PlayIntegrity public constructor(
        public val nonce: String,
        public val cloudProjectNumber: Long,
    ) : FirebaseDeviceVerificationParametersDto() {
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
            other as PlayIntegrity
            if (other.nonce != nonce) {
                return false
            }
            return other.cloudProjectNumber == cloudProjectNumber
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + nonce.hashCode()
            hashCode = 31 * hashCode + cloudProjectNumber.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("FirebaseDeviceVerificationParametersDto.PlayIntegrity")
                append("(")
                append("nonce=")
                append(nonce)
                append(", ")
                append("cloudProjectNumber=")
                append(cloudProjectNumber)
                append(")")
            }
        }
    }
}
