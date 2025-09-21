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
 * Contains a list of messages found by a public post search.
 *
 * @property messages List of found public posts.
 * @property nextOffset The offset for the next request. If empty, then there are no more results.
 * @property searchLimits Updated public post search limits after the query; repeated requests with the same query will be free; may be null if they didn't change.
 * @property areLimitsExceeded True, if the query has failed because search limits are exceeded. In this case searchLimits.dailyFreeQueryCount will be equal to 0.
 */
public class FoundPublicPosts public constructor(
    public val messages: Array<Message>,
    public val nextOffset: String,
    public val searchLimits: PublicPostSearchLimits?,
    public val areLimitsExceeded: Boolean,
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
        other as FoundPublicPosts
        val messagesEquals = other.messages.contentDeepEquals(messages)
        if (!messagesEquals) {
            return false
        }
        if (other.nextOffset != nextOffset) {
            return false
        }
        if (other.searchLimits != searchLimits) {
            return false
        }
        return other.areLimitsExceeded == areLimitsExceeded
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + messages.contentDeepHashCode()
        hashCode = 31 * hashCode + nextOffset.hashCode()
        hashCode = 31 * hashCode + searchLimits.hashCode()
        hashCode = 31 * hashCode + areLimitsExceeded.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("FoundPublicPosts")
            append("(")
            append("messages=")
            messages
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("nextOffset=")
            append(nextOffset)
            append(", ")
            append("searchLimits=")
            append(searchLimits)
            append(", ")
            append("areLimitsExceeded=")
            append(areLimitsExceeded)
            append(")")
        }
    }
}
