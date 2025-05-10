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

package dev.g000sha256.tdl.dto.update

import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String

/**
 * A request can't be completed unless application verification is performed; for official mobile applications only. The method setApplicationVerificationToken must be called once the verification is completed or failed.
 *
 * @property verificationId Unique identifier for the verification process.
 * @property nonce Unique base64url-encoded nonce for the classic Play Integrity verification (https://developer.android.com/google/play/integrity/classic) for Android, or a unique string to compare with verifyNonce field from a push notification for iOS.
 * @property cloudProjectNumber Cloud project number to pass to the Play Integrity API on Android.
 */
public class ApplicationVerificationRequiredUpdateDto public constructor(
    public val verificationId: Long,
    public val nonce: String,
    public val cloudProjectNumber: Long,
) : UpdateDto() {
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
        other as ApplicationVerificationRequiredUpdateDto
        if (other.verificationId != verificationId) {
            return false
        }
        if (other.nonce != nonce) {
            return false
        }
        return other.cloudProjectNumber == cloudProjectNumber
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + verificationId.hashCode()
        hashCode = 31 * hashCode + nonce.hashCode()
        hashCode = 31 * hashCode + cloudProjectNumber.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ApplicationVerificationRequiredUpdateDto")
            append("(")
            append("verificationId=")
            append(verificationId)
            append(", ")
            append("nonce=")
            append(nonce)
            append(", ")
            append("cloudProjectNumber=")
            append(cloudProjectNumber)
            append(")")
        }
    }
}
