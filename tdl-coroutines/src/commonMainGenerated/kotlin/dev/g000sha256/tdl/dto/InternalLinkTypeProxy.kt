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
 * The link is a link to a proxy. Call addProxy with the given parameters to process the link and add the proxy.
 *
 * @property server Proxy server domain or IP address.
 * @property port Proxy server port.
 * @property type Type of the proxy.
 */
public class InternalLinkTypeProxy public constructor(
    public val server: String,
    public val port: Int,
    public val type: ProxyType,
) : InternalLinkType() {
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
        other as InternalLinkTypeProxy
        if (other.server != server) {
            return false
        }
        if (other.port != port) {
            return false
        }
        return other.type == type
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + server.hashCode()
        hashCode = 31 * hashCode + port.hashCode()
        hashCode = 31 * hashCode + type.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InternalLinkTypeProxy")
            append("(")
            append("server=")
            append(server)
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
