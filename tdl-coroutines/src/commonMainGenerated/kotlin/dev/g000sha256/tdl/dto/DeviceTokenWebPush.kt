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
 * A token for web Push API.
 *
 * @property endpoint Absolute URL exposed by the push service where the application server can send push messages; may be empty to deregister a device.
 * @property p256dhBase64url Base64url-encoded P-256 elliptic curve Diffie-Hellman public key.
 * @property authBase64url Base64url-encoded authentication secret.
 */
@SerialName(value = "deviceTokenWebPush")
@Serializable
public class DeviceTokenWebPush public constructor(
    @SerialName(value = "endpoint")
    public val endpoint: String,
    @SerialName(value = "p256dh_base64url")
    public val p256dhBase64url: String,
    @SerialName(value = "auth_base64url")
    public val authBase64url: String,
) : DeviceToken() {
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
        other as DeviceTokenWebPush
        if (other.endpoint != endpoint) {
            return false
        }
        if (other.p256dhBase64url != p256dhBase64url) {
            return false
        }
        return other.authBase64url == authBase64url
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + endpoint.hashCode()
        hashCode = 31 * hashCode + p256dhBase64url.hashCode()
        hashCode = 31 * hashCode + authBase64url.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("DeviceTokenWebPush")
            append("(")
            append("endpoint=")
            append(endpoint)
            append(", ")
            append("p256dhBase64url=")
            append(p256dhBase64url)
            append(", ")
            append("authBase64url=")
            append(authBase64url)
            append(")")
        }
    }
}
