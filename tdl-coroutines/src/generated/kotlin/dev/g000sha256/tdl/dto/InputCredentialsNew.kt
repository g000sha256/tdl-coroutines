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
 * Applies if a user enters new credentials on a payment provider website.
 *
 * @property data JSON-encoded data with the credential identifier from the payment provider.
 * @property allowSave True, if the credential identifier can be saved on the server side.
 */
public class InputCredentialsNew public constructor(
    public val data: String,
    public val allowSave: Boolean,
) : InputCredentials() {
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
        other as InputCredentialsNew
        if (other.data != data) {
            return false
        }
        return other.allowSave == allowSave
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + data.hashCode()
        hashCode = 31 * hashCode + allowSave.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InputCredentialsNew")
            append("(")
            append("data=")
            append(data)
            append(", ")
            append("allowSave=")
            append(allowSave)
            append(")")
        }
    }
}
