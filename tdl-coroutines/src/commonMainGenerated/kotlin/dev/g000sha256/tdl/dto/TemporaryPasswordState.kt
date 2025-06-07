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
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Returns information about the availability of a temporary password, which can be used for payments.
 *
 * @property hasPassword True, if a temporary password is available.
 * @property validFor Time left before the temporary password expires, in seconds.
 */
@SerialName(value = "temporaryPasswordState")
@Serializable
public class TemporaryPasswordState public constructor(
    @SerialName(value = "has_password")
    public val hasPassword: Boolean,
    @SerialName(value = "valid_for")
    public val validFor: Int,
) : Model() {
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
        other as TemporaryPasswordState
        if (other.hasPassword != hasPassword) {
            return false
        }
        return other.validFor == validFor
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + hasPassword.hashCode()
        hashCode = 31 * hashCode + validFor.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("TemporaryPasswordState")
            append("(")
            append("hasPassword=")
            append(hasPassword)
            append(", ")
            append("validFor=")
            append(validFor)
            append(")")
        }
    }
}
