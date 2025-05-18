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
 * Contains information about one website the current user is logged in with Telegram.
 *
 * @property id Website identifier.
 * @property domainName The domain name of the website.
 * @property botUserId User identifier of a bot linked with the website.
 * @property browser The version of a browser used to log in.
 * @property platform Operating system the browser is running on.
 * @property logInDate Point in time (Unix timestamp) when the user was logged in.
 * @property lastActiveDate Point in time (Unix timestamp) when obtained authorization was last used.
 * @property ipAddress IP address from which the user was logged in, in human-readable format.
 * @property location Human-readable description of a country and a region from which the user was logged in, based on the IP address.
 */
public class ConnectedWebsite public constructor(
    public val id: Long,
    public val domainName: String,
    public val botUserId: Long,
    public val browser: String,
    public val platform: String,
    public val logInDate: Int,
    public val lastActiveDate: Int,
    public val ipAddress: String,
    public val location: String,
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
        other as ConnectedWebsite
        if (other.id != id) {
            return false
        }
        if (other.domainName != domainName) {
            return false
        }
        if (other.botUserId != botUserId) {
            return false
        }
        if (other.browser != browser) {
            return false
        }
        if (other.platform != platform) {
            return false
        }
        if (other.logInDate != logInDate) {
            return false
        }
        if (other.lastActiveDate != lastActiveDate) {
            return false
        }
        if (other.ipAddress != ipAddress) {
            return false
        }
        return other.location == location
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + id.hashCode()
        hashCode = 31 * hashCode + domainName.hashCode()
        hashCode = 31 * hashCode + botUserId.hashCode()
        hashCode = 31 * hashCode + browser.hashCode()
        hashCode = 31 * hashCode + platform.hashCode()
        hashCode = 31 * hashCode + logInDate.hashCode()
        hashCode = 31 * hashCode + lastActiveDate.hashCode()
        hashCode = 31 * hashCode + ipAddress.hashCode()
        hashCode = 31 * hashCode + location.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ConnectedWebsite")
            append("(")
            append("id=")
            append(id)
            append(", ")
            append("domainName=")
            append(domainName)
            append(", ")
            append("botUserId=")
            append(botUserId)
            append(", ")
            append("browser=")
            append(browser)
            append(", ")
            append("platform=")
            append(platform)
            append(", ")
            append("logInDate=")
            append(logInDate)
            append(", ")
            append("lastActiveDate=")
            append(lastActiveDate)
            append(", ")
            append("ipAddress=")
            append(ipAddress)
            append(", ")
            append("location=")
            append(location)
            append(")")
        }
    }
}
