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
 * Contains information about a proxy server.
 *
 * @property id Unique identifier of the proxy.
 * @property server Proxy server domain or IP address.
 * @property port Proxy server port.
 * @property lastUsedDate Point in time (Unix timestamp) when the proxy was last used; 0 if never.
 * @property isEnabled True, if the proxy is enabled now.
 * @property type Type of the proxy.
 */
public class Proxy public constructor(
    public val id: Int,
    public val server: String,
    public val port: Int,
    public val lastUsedDate: Int,
    public val isEnabled: Boolean,
    public val type: ProxyType,
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
        other as Proxy
        if (other.id != id) {
            return false
        }
        if (other.server != server) {
            return false
        }
        if (other.port != port) {
            return false
        }
        if (other.lastUsedDate != lastUsedDate) {
            return false
        }
        if (other.isEnabled != isEnabled) {
            return false
        }
        return other.type == type
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + id.hashCode()
        hashCode = 31 * hashCode + server.hashCode()
        hashCode = 31 * hashCode + port.hashCode()
        hashCode = 31 * hashCode + lastUsedDate.hashCode()
        hashCode = 31 * hashCode + isEnabled.hashCode()
        hashCode = 31 * hashCode + type.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("Proxy")
            append("(")
            append("id=")
            append(id)
            append(", ")
            append("server=")
            append(server)
            append(", ")
            append("port=")
            append(port)
            append(", ")
            append("lastUsedDate=")
            append(lastUsedDate)
            append(", ")
            append("isEnabled=")
            append(isEnabled)
            append(", ")
            append("type=")
            append(type)
            append(")")
        }
    }
}
