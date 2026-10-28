/*
 * Copyright 2026 Georgii Ippolitov (g000sha256)
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
 * A web proxy server. MTProto traffic goes through an HTTPS relay page hosted by the application in a hidden web view; see updateWebProxyCarrierOpened. The proxy server must be a domain name and the port must be 443.
 *
 * @property path Base path of the relay on the server, without leading and trailing slashes; may be empty. Consists of 0-128 characters; each &quot;/&quot;-separated segment must match &#91;A-Za-z0-9&#93;&#91;A-Za-z0-9&#95;-&#93;&#42;.
 * @property secret The MTProto proxy secret in hexadecimal encoding; must be 16 bytes long, optionally prefixed with the byte 0xdd.
 */
public class ProxyTypeWeb public constructor(
    public val path: String,
    public val secret: String,
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
        other as ProxyTypeWeb
        if (other.path != path) {
            return false
        }
        return other.secret == secret
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + path.hashCode()
        hashCode = 31 * hashCode + secret.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ProxyTypeWeb")
            append("(")
            append("path=")
            append(path)
            append(", ")
            append("secret=")
            append(secret)
            append(")")
        }
    }
}
