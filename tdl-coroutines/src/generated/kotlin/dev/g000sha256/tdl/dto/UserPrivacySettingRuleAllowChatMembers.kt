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
import kotlin.LongArray
import kotlin.String

/**
 * A rule to allow all members of certain specified basic groups and supergroups to doing something.
 *
 * @property chatIds The chat identifiers, total number of chats in all rules must not exceed 20.
 */
public class UserPrivacySettingRuleAllowChatMembers public constructor(
    public val chatIds: LongArray,
) : UserPrivacySettingRule() {
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
        other as UserPrivacySettingRuleAllowChatMembers
        return other.chatIds.contentEquals(chatIds)
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + chatIds.contentHashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("UserPrivacySettingRuleAllowChatMembers")
            append("(")
            append("chatIds=")
            chatIds
                .contentToString()
                .also { append(it) }
            append(")")
        }
    }
}
