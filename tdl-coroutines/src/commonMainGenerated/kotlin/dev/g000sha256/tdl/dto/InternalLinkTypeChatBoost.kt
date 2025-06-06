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
 * The link is a link to boost a Telegram chat. Call getChatBoostLinkInfo with the given URL to process the link. If the chat is found, then call getChatBoostStatus and getAvailableChatBoostSlots to get the current boost status and check whether the chat can be boosted. If the user wants to boost the chat and the chat can be boosted, then call boostChat.
 *
 * @property url URL to be passed to getChatBoostLinkInfo.
 */
public class InternalLinkTypeChatBoost public constructor(
    public val url: String,
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
        other as InternalLinkTypeChatBoost
        return other.url == url
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + url.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InternalLinkTypeChatBoost")
            append("(")
            append("url=")
            append(url)
            append(")")
        }
    }
}
