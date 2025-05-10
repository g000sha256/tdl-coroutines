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
 * A request can't be completed unless reCAPTCHA verification is performed; for official mobile applications only. The method setApplicationVerificationToken must be called once the verification is completed or failed.
 *
 * @property verificationId Unique identifier for the verification process.
 * @property action The action for the check.
 * @property recaptchaKeyId Identifier of the reCAPTCHA key.
 */
public class ApplicationRecaptchaVerificationRequiredUpdateDto public constructor(
    public val verificationId: Long,
    public val action: String,
    public val recaptchaKeyId: String,
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
        other as ApplicationRecaptchaVerificationRequiredUpdateDto
        if (other.verificationId != verificationId) {
            return false
        }
        if (other.action != action) {
            return false
        }
        return other.recaptchaKeyId == recaptchaKeyId
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + verificationId.hashCode()
        hashCode = 31 * hashCode + action.hashCode()
        hashCode = 31 * hashCode + recaptchaKeyId.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ApplicationRecaptchaVerificationRequiredUpdateDto")
            append("(")
            append("verificationId=")
            append(verificationId)
            append(", ")
            append("action=")
            append(action)
            append(", ")
            append("recaptchaKeyId=")
            append(recaptchaKeyId)
            append(")")
        }
    }
}
