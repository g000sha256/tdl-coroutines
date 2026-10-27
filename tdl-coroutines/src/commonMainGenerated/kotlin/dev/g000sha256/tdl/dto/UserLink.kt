/*
 * Copyright 2025-2026 Georgii Ippolitov (g000sha256)
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
 * Contains an HTTPS URL, which can be used to get information about a user.
 *
 * @property url The URL.
 * @property expiresIn Left time for which the link is valid, in seconds; 0 if the link is permanent.
 * @property canGetPermanentLink True, if a permanent link to the current user can be received; false if all links to the current user expire.
 */
public class UserLink public constructor(
    public val url: String,
    public val expiresIn: Int,
    public val canGetPermanentLink: Boolean,
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
        other as UserLink
        if (other.url != url) {
            return false
        }
        if (other.expiresIn != expiresIn) {
            return false
        }
        return other.canGetPermanentLink == canGetPermanentLink
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + url.hashCode()
        hashCode = 31 * hashCode + expiresIn.hashCode()
        hashCode = 31 * hashCode + canGetPermanentLink.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("UserLink")
            append("(")
            append("url=")
            append(url)
            append(", ")
            append("expiresIn=")
            append(expiresIn)
            append(", ")
            append("canGetPermanentLink=")
            append(canGetPermanentLink)
            append(")")
        }
    }
}
