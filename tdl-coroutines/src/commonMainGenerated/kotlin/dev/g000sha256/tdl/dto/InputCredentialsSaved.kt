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
 * Applies if a user chooses some previously saved payment credentials. To use their previously saved credentials, the user must have a valid temporary password.
 *
 * @property savedCredentialsId Identifier of the saved credentials.
 */
public class InputCredentialsSaved public constructor(
    public val savedCredentialsId: String,
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
        other as InputCredentialsSaved
        return other.savedCredentialsId == savedCredentialsId
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + savedCredentialsId.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InputCredentialsSaved")
            append("(")
            append("savedCredentialsId=")
            append(savedCredentialsId)
            append(")")
        }
    }
}
