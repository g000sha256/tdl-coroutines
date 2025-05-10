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
 * Describes a user contact.
 *
 * @property phoneNumber Phone number of the user.
 * @property firstName First name of the user; 1-255 characters in length.
 * @property lastName Last name of the user.
 * @property vcard Additional data about the user in a form of vCard; 0-2048 bytes in length.
 * @property userId Identifier of the user, if known; 0 otherwise.
 */
public class ContactDto public constructor(
    public val phoneNumber: String,
    public val firstName: String,
    public val lastName: String,
    public val vcard: String,
    public val userId: Long,
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
        other as ContactDto
        if (other.phoneNumber != phoneNumber) {
            return false
        }
        if (other.firstName != firstName) {
            return false
        }
        if (other.lastName != lastName) {
            return false
        }
        if (other.vcard != vcard) {
            return false
        }
        return other.userId == userId
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + phoneNumber.hashCode()
        hashCode = 31 * hashCode + firstName.hashCode()
        hashCode = 31 * hashCode + lastName.hashCode()
        hashCode = 31 * hashCode + vcard.hashCode()
        hashCode = 31 * hashCode + userId.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ContactDto")
            append("(")
            append("phoneNumber=")
            append(phoneNumber)
            append(", ")
            append("firstName=")
            append(firstName)
            append(", ")
            append("lastName=")
            append(lastName)
            append(", ")
            append("vcard=")
            append(vcard)
            append(", ")
            append("userId=")
            append(userId)
            append(")")
        }
    }
}
