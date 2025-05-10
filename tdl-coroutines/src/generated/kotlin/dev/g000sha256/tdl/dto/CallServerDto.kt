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
import kotlin.Long
import kotlin.String

/**
 * Describes a server for relaying call data.
 *
 * @property id Server identifier.
 * @property ipAddress Server IPv4 address.
 * @property ipv6Address Server IPv6 address.
 * @property port Server port number.
 * @property type Server type.
 */
public class CallServerDto public constructor(
    public val id: Long,
    public val ipAddress: String,
    public val ipv6Address: String,
    public val port: Int,
    public val type: CallServerTypeDto,
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
        other as CallServerDto
        if (other.id != id) {
            return false
        }
        if (other.ipAddress != ipAddress) {
            return false
        }
        if (other.ipv6Address != ipv6Address) {
            return false
        }
        if (other.port != port) {
            return false
        }
        return other.type == type
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + id.hashCode()
        hashCode = 31 * hashCode + ipAddress.hashCode()
        hashCode = 31 * hashCode + ipv6Address.hashCode()
        hashCode = 31 * hashCode + port.hashCode()
        hashCode = 31 * hashCode + type.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("CallServerDto")
            append("(")
            append("id=")
            append(id)
            append(", ")
            append("ipAddress=")
            append(ipAddress)
            append(", ")
            append("ipv6Address=")
            append(ipv6Address)
            append(", ")
            append("port=")
            append(port)
            append(", ")
            append("type=")
            append(type)
            append(")")
        }
    }
}
