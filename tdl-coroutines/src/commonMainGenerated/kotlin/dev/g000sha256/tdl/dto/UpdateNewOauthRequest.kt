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
 * An OAuth authorization request was received.
 *
 * @property domain A domain of the URL where the user authorizes.
 * @property location Human-readable description of a country and a region from which the authorization is performed, based on the IP address.
 * @property url The URL to pass to getOauthLinkInfo; the link is valid for 60 seconds.
 */
public class UpdateNewOauthRequest public constructor(
    public val domain: String,
    public val location: String,
    public val url: String,
) : Update() {
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
        other as UpdateNewOauthRequest
        if (other.domain != domain) {
            return false
        }
        if (other.location != location) {
            return false
        }
        return other.url == url
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + domain.hashCode()
        hashCode = 31 * hashCode + location.hashCode()
        hashCode = 31 * hashCode + url.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("UpdateNewOauthRequest")
            append("(")
            append("domain=")
            append(domain)
            append(", ")
            append("location=")
            append(location)
            append(", ")
            append("url=")
            append(url)
            append(")")
        }
    }
}
