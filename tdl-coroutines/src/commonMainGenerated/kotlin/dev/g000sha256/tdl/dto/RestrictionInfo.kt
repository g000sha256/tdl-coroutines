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
 * Contains information about restrictions that must be applied to a chat or a message.
 *
 * @property restrictionReason A human-readable description of the reason why access to the content must be restricted. If empty, then the content can be accessed, but may be covered by hidden with 18+ spoiler anyway.
 * @property hasSensitiveContent True, if media content of the messages must be hidden with 18+ spoiler. Use value of the option &quot;can_ignore_sensitive_content_restrictions&quot; to check whether the current user can ignore the restriction. If age verification parameters were received in updateAgeVerificationParameters, then the user must complete age verification to ignore the restriction. Set the option &quot;ignore_sensitive_content_restrictions&quot; to true if the user passes age verification.
 */
public class RestrictionInfo public constructor(
    public val restrictionReason: String,
    public val hasSensitiveContent: Boolean,
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
        other as RestrictionInfo
        if (other.restrictionReason != restrictionReason) {
            return false
        }
        return other.hasSensitiveContent == hasSensitiveContent
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + restrictionReason.hashCode()
        hashCode = 31 * hashCode + hasSensitiveContent.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("RestrictionInfo")
            append("(")
            append("restrictionReason=")
            append(restrictionReason)
            append(", ")
            append("hasSensitiveContent=")
            append(hasSensitiveContent)
            append(")")
        }
    }
}
