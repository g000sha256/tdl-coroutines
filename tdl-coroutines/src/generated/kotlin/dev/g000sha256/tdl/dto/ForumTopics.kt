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
import kotlin.Long
import kotlin.String

/**
 * Describes a list of forum topics.
 *
 * @property totalCount Approximate total number of forum topics found.
 * @property topics List of forum topics.
 * @property nextOffsetDate Offset date for the next getForumTopics request.
 * @property nextOffsetMessageId Offset message identifier for the next getForumTopics request.
 * @property nextOffsetMessageThreadId Offset message thread identifier for the next getForumTopics request.
 */
public class ForumTopics public constructor(
    public val totalCount: Int,
    public val topics: Array<ForumTopic>,
    public val nextOffsetDate: Int,
    public val nextOffsetMessageId: Long,
    public val nextOffsetMessageThreadId: Long,
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
        other as ForumTopics
        if (other.totalCount != totalCount) {
            return false
        }
        val topicsEquals = other.topics.contentDeepEquals(topics)
        if (!topicsEquals) {
            return false
        }
        if (other.nextOffsetDate != nextOffsetDate) {
            return false
        }
        if (other.nextOffsetMessageId != nextOffsetMessageId) {
            return false
        }
        return other.nextOffsetMessageThreadId == nextOffsetMessageThreadId
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + totalCount.hashCode()
        hashCode = 31 * hashCode + topics.contentDeepHashCode()
        hashCode = 31 * hashCode + nextOffsetDate.hashCode()
        hashCode = 31 * hashCode + nextOffsetMessageId.hashCode()
        hashCode = 31 * hashCode + nextOffsetMessageThreadId.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ForumTopics")
            append("(")
            append("totalCount=")
            append(totalCount)
            append(", ")
            append("topics=")
            topics
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("nextOffsetDate=")
            append(nextOffsetDate)
            append(", ")
            append("nextOffsetMessageId=")
            append(nextOffsetMessageId)
            append(", ")
            append("nextOffsetMessageThreadId=")
            append(nextOffsetMessageThreadId)
            append(")")
        }
    }
}
