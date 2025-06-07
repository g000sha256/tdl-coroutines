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
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * An authorization confirmation dialog needs to be shown to the user.
 *
 * @property url An HTTP URL to be opened.
 * @property domain A domain of the URL.
 * @property botUserId User identifier of a bot linked with the website.
 * @property requestWriteAccess True, if the user must be asked for the permission to the bot to send them messages.
 */
@SerialName(value = "loginUrlInfoRequestConfirmation")
@Serializable
public class LoginUrlInfoRequestConfirmation public constructor(
    @SerialName(value = "url")
    public val url: String,
    @SerialName(value = "domain")
    public val domain: String,
    @SerialName(value = "bot_user_id")
    public val botUserId: Long,
    @SerialName(value = "request_write_access")
    public val requestWriteAccess: Boolean,
) : LoginUrlInfo() {
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
        other as LoginUrlInfoRequestConfirmation
        if (other.url != url) {
            return false
        }
        if (other.domain != domain) {
            return false
        }
        if (other.botUserId != botUserId) {
            return false
        }
        return other.requestWriteAccess == requestWriteAccess
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + url.hashCode()
        hashCode = 31 * hashCode + domain.hashCode()
        hashCode = 31 * hashCode + botUserId.hashCode()
        hashCode = 31 * hashCode + requestWriteAccess.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("LoginUrlInfoRequestConfirmation")
            append("(")
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
            append(")")
        }
    }
}
