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

/**
 * The link is a link to a user by its phone number. Call searchUserByPhoneNumber with the given phone number to process the link. If the user is found, then call createPrivateChat and open user's profile information screen or the chat itself. If draft text isn't empty, then put the draft text in the input field.
 *
 * @property phoneNumber Phone number of the user.
 * @property draftText Draft text for message to send in the chat.
 * @property openProfile True, if user's profile information screen must be opened; otherwise, the chat itself must be opened.
 */
public class InternalLinkTypeUserPhoneNumber public constructor(
    public val phoneNumber: String,
    public val draftText: String,
    public val openProfile: Boolean,
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
        other as InternalLinkTypeUserPhoneNumber
        if (other.phoneNumber != phoneNumber) {
            return false
        }
        if (other.draftText != draftText) {
            return false
        }
        return other.openProfile == openProfile
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + phoneNumber.hashCode()
        hashCode = 31 * hashCode + draftText.hashCode()
        hashCode = 31 * hashCode + openProfile.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InternalLinkTypeUserPhoneNumber")
            append("(")
            append("phoneNumber=")
            append(phoneNumber)
            append(", ")
            append("draftText=")
            append(draftText)
            append(", ")
            append("openProfile=")
            append(openProfile)
            append(")")
        }
    }
}
