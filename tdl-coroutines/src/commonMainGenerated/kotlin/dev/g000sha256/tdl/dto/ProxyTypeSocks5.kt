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
 * A SOCKS5 proxy server.
 *
 * @property username Username for logging in; may be empty.
 * @property password Password for logging in; may be empty.
 */
public class ProxyTypeSocks5 public constructor(
    public val username: String,
    public val password: String,
) : ProxyType() {
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
        other as ProxyTypeSocks5
        if (other.username != username) {
            return false
        }
        return other.password == password
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + username.hashCode()
        hashCode = 31 * hashCode + password.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ProxyTypeSocks5")
            append("(")
            append("username=")
            append(username)
            append(", ")
            append("password=")
            append(password)
            append(")")
        }
    }
}
