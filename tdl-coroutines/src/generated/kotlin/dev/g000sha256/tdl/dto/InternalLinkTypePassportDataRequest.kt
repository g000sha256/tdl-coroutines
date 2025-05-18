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
 * The link contains a request of Telegram passport data. Call getPassportAuthorizationForm with the given parameters to process the link if the link was received from outside of the application; otherwise, ignore it.
 *
 * @property botUserId User identifier of the service's bot; the corresponding user may be unknown yet.
 * @property scope Telegram Passport element types requested by the service.
 * @property publicKey Service's public key.
 * @property nonce Unique request identifier provided by the service.
 * @property callbackUrl An HTTP URL to open once the request is finished, canceled, or failed with the parameters tgPassport=success, tgPassport=cancel, or tgPassport=error&amp;error=... respectively. If empty, then onActivityResult method must be used to return response on Android, or the link tgbot{botUserId}://passport/success or tgbot{botUserId}://passport/cancel must be opened otherwise.
 */
public class InternalLinkTypePassportDataRequest public constructor(
    public val botUserId: Long,
    public val scope: String,
    public val publicKey: String,
    public val nonce: String,
    public val callbackUrl: String,
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
        other as InternalLinkTypePassportDataRequest
        if (other.botUserId != botUserId) {
            return false
        }
        if (other.scope != scope) {
            return false
        }
        if (other.publicKey != publicKey) {
            return false
        }
        if (other.nonce != nonce) {
            return false
        }
        return other.callbackUrl == callbackUrl
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + botUserId.hashCode()
        hashCode = 31 * hashCode + scope.hashCode()
        hashCode = 31 * hashCode + publicKey.hashCode()
        hashCode = 31 * hashCode + nonce.hashCode()
        hashCode = 31 * hashCode + callbackUrl.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InternalLinkTypePassportDataRequest")
            append("(")
            append("botUserId=")
            append(botUserId)
            append(", ")
            append("scope=")
            append(scope)
            append(", ")
            append("publicKey=")
            append(publicKey)
            append(", ")
            append("nonce=")
            append(nonce)
            append(", ")
            append("callbackUrl=")
            append(callbackUrl)
            append(")")
        }
    }
}
