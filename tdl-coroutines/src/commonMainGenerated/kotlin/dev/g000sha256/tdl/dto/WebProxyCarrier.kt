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
 * Describes a web proxy carrier: an HTTPS relay page, which carries traffic of a web proxy and must be loaded by the application as the top-level document of a hidden web view. Before loading the page, the application must arrange for an object named carrier.bridgeObjectName to be defined in the top-level document whenever its origin is exactly carrier.origin, and in no other document or frame. The object must be read-only and must have two members: a method postMessage(value), which passes an ArrayBuffer or a typed array to processWebProxyCarrierMessage as webProxyCarrierMessageBinary, passes a string as webProxyCarrierMessageText, and rejects any other value; and a property onmessage, which the page sets to a function. The application delivers data to the page by calling that function with an object {data: value}, where value is an ArrayBuffer for binary data and a string for text. Each carrier needs its own web view.
 *
 * @property id Unique identifier of the carrier.
 * @property proxyId Identifier of the added proxy that uses the carrier; 0 if the carrier is used by pingProxy or testProxy.
 * @property url The HTTPS URL to load. The URL contains the capability for the proxy and a fragment, which must be kept; the URL must never be logged or shown to the user.
 * @property origin Origin of the relay page, for example, &quot;https://proxy.example.com&quot;. The web view must not be allowed to navigate to another origin.
 * @property pathPrefix The only path prefix on carrier.origin from which the page may load resources or to which it may send requests, for example, &quot;/&quot; or &quot;/relay/&quot;.
 * @property bridgeObjectName Name of the object to define in the top-level document; currently, always &quot;TelegramWebProxy&quot;.
 * @property isTemporary True, if the carrier is needed only to test the proxy and will be closed after the test. The application may refuse to open such carriers, for example, to avoid creating a web view for every saved proxy.
 */
public class WebProxyCarrier public constructor(
    public val id: Int,
    public val proxyId: Int,
    public val url: String,
    public val origin: String,
    public val pathPrefix: String,
    public val bridgeObjectName: String,
    public val isTemporary: Boolean,
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
        other as WebProxyCarrier
        if (other.id != id) {
            return false
        }
        if (other.proxyId != proxyId) {
            return false
        }
        if (other.url != url) {
            return false
        }
        if (other.origin != origin) {
            return false
        }
        if (other.pathPrefix != pathPrefix) {
            return false
        }
        if (other.bridgeObjectName != bridgeObjectName) {
            return false
        }
        return other.isTemporary == isTemporary
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + id.hashCode()
        hashCode = 31 * hashCode + proxyId.hashCode()
        hashCode = 31 * hashCode + url.hashCode()
        hashCode = 31 * hashCode + origin.hashCode()
        hashCode = 31 * hashCode + pathPrefix.hashCode()
        hashCode = 31 * hashCode + bridgeObjectName.hashCode()
        hashCode = 31 * hashCode + isTemporary.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("WebProxyCarrier")
            append("(")
            append("id=")
            append(id)
            append(", ")
            append("proxyId=")
            append(proxyId)
            append(", ")
            append("url=")
            append(url)
            append(", ")
            append("origin=")
            append(origin)
            append(", ")
            append("pathPrefix=")
            append(pathPrefix)
            append(", ")
            append("bridgeObjectName=")
            append(bridgeObjectName)
            append(", ")
            append("isTemporary=")
            append(isTemporary)
            append(")")
        }
    }
}
