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
 * The payload for a callback button requiring password.
 *
 * @property password The 2-step verification password for the current user.
 * @property data Data that was attached to the callback button.
 */
public class CallbackQueryPayloadDataWithPassword public constructor(
    public val password: String,
    public val data: ByteArray,
) : CallbackQueryPayload() {
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
        other as CallbackQueryPayloadDataWithPassword
        if (other.password != password) {
            return false
        }
        return other.data.contentEquals(data)
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + password.hashCode()
        hashCode = 31 * hashCode + data.contentHashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("CallbackQueryPayloadDataWithPassword")
            append("(")
            append("password=")
            append(password)
            append(", ")
            append("data=")
            data
                .contentToString()
                .also { append(it) }
            append(")")
        }
    }
}
