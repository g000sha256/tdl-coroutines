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
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String

/**
 * Contains information about a Telegram Passport authorization form that was requested.
 *
 * @property id Unique identifier of the authorization form.
 * @property requiredElements Telegram Passport elements that must be provided to complete the form.
 * @property privacyPolicyUrl URL for the privacy policy of the service; may be empty.
 */
public class PassportAuthorizationForm public constructor(
    public val id: Int,
    public val requiredElements: Array<PassportRequiredElement>,
    public val privacyPolicyUrl: String,
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
        other as PassportAuthorizationForm
        if (other.id != id) {
            return false
        }
        val requiredElementsEquals = other.requiredElements.contentDeepEquals(requiredElements)
        if (!requiredElementsEquals) {
            return false
        }
        return other.privacyPolicyUrl == privacyPolicyUrl
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + id.hashCode()
        hashCode = 31 * hashCode + requiredElements.contentDeepHashCode()
        hashCode = 31 * hashCode + privacyPolicyUrl.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("PassportAuthorizationForm")
            append("(")
            append("id=")
            append(id)
            append(", ")
            append("requiredElements=")
            requiredElements
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("privacyPolicyUrl=")
            append(privacyPolicyUrl)
            append(")")
        }
    }
}
