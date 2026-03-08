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
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String

/**
 * Information about the OAuth authorization.
 *
 * @property userId Identifier of the user for which the link was generated; may be 0 if unknown. The corresponding user may be unknown. If the user is logged in the app, then they must be chosen for authorization by default.
 * @property url An HTTP URL where the user authorizes.
 * @property domain A domain of the URL.
 * @property botUserId User identifier of a bot linked with the website.
 * @property requestWriteAccess True, if the user must be asked for the permission to the bot to send them messages.
 * @property requestPhoneNumberAccess True, if the user must be asked for the permission to share their phone number.
 * @property browser The version of a browser used for the authorization.
 * @property platform Operating system the browser is running on.
 * @property ipAddress IP address from which the authorization is performed, in human-readable format.
 * @property location Human-readable description of a country and a region from which the authorization is performed, based on the IP address.
 * @property matchCodeFirst True, if code matching dialog must be shown first and checkOauthRequestMatchCode must be called before acceptOauthRequest. Otherwise, checkOauthRequestMatchCode must not be called.
 * @property matchCodes The list of codes to match; may be empty if irrelevant.
 */
public class OauthLinkInfo public constructor(
    public val userId: Long,
    public val url: String,
    public val domain: String,
    public val botUserId: Long,
    public val requestWriteAccess: Boolean,
    public val requestPhoneNumberAccess: Boolean,
    public val browser: String,
    public val platform: String,
    public val ipAddress: String,
    public val location: String,
    public val matchCodeFirst: Boolean,
    public val matchCodes: Array<String>,
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
        other as OauthLinkInfo
        if (other.userId != userId) {
            return false
        }
        if (other.url != url) {
            return false
        }
        if (other.domain != domain) {
            return false
        }
        if (other.botUserId != botUserId) {
            return false
        }
        if (other.requestWriteAccess != requestWriteAccess) {
            return false
        }
        if (other.requestPhoneNumberAccess != requestPhoneNumberAccess) {
            return false
        }
        if (other.browser != browser) {
            return false
        }
        if (other.platform != platform) {
            return false
        }
        if (other.ipAddress != ipAddress) {
            return false
        }
        if (other.location != location) {
            return false
        }
        if (other.matchCodeFirst != matchCodeFirst) {
            return false
        }
        return other.matchCodes.contentDeepEquals(matchCodes)
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + userId.hashCode()
        hashCode = 31 * hashCode + url.hashCode()
        hashCode = 31 * hashCode + domain.hashCode()
        hashCode = 31 * hashCode + botUserId.hashCode()
        hashCode = 31 * hashCode + requestWriteAccess.hashCode()
        hashCode = 31 * hashCode + requestPhoneNumberAccess.hashCode()
        hashCode = 31 * hashCode + browser.hashCode()
        hashCode = 31 * hashCode + platform.hashCode()
        hashCode = 31 * hashCode + ipAddress.hashCode()
        hashCode = 31 * hashCode + location.hashCode()
        hashCode = 31 * hashCode + matchCodeFirst.hashCode()
        hashCode = 31 * hashCode + matchCodes.contentDeepHashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("OauthLinkInfo")
            append("(")
            append("userId=")
            append(userId)
            append(", ")
            append("url=")
            append(url)
            append(", ")
            append("domain=")
            append(domain)
            append(", ")
            append("botUserId=")
            append(botUserId)
            append(", ")
            append("requestWriteAccess=")
            append(requestWriteAccess)
            append(", ")
            append("requestPhoneNumberAccess=")
            append(requestPhoneNumberAccess)
            append(", ")
            append("browser=")
            append(browser)
            append(", ")
            append("platform=")
            append(platform)
            append(", ")
            append("ipAddress=")
            append(ipAddress)
            append(", ")
            append("location=")
            append(location)
            append(", ")
            append("matchCodeFirst=")
            append(matchCodeFirst)
            append(", ")
            append("matchCodes=")
            matchCodes
                .contentDeepToString()
                .also { append(it) }
            append(")")
        }
    }
}
