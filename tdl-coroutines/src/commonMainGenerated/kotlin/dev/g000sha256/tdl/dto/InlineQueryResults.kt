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
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Represents the results of the inline query. Use sendInlineQueryResultMessage to send the result of the query.
 *
 * @property inlineQueryId Unique identifier of the inline query.
 * @property button Button to be shown above inline query results; may be null.
 * @property results Results of the query.
 * @property nextOffset The offset for the next request. If empty, then there are no more results.
 */
@SerialName(value = "inlineQueryResults")
@Serializable
public class InlineQueryResults public constructor(
    @SerialName(value = "inline_query_id")
    public val inlineQueryId: Long,
    @SerialName(value = "button")
    public val button: InlineQueryResultsButton?,
    @SerialName(value = "results")
    public val results: Array<InlineQueryResult>,
    @SerialName(value = "next_offset")
    public val nextOffset: String,
) : Model() {
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
        other as InlineQueryResults
        if (other.inlineQueryId != inlineQueryId) {
            return false
        }
        if (other.button != button) {
            return false
        }
        val resultsEquals = other.results.contentDeepEquals(results)
        if (!resultsEquals) {
            return false
        }
        return other.nextOffset == nextOffset
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + inlineQueryId.hashCode()
        hashCode = 31 * hashCode + button.hashCode()
        hashCode = 31 * hashCode + results.contentDeepHashCode()
        hashCode = 31 * hashCode + nextOffset.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InlineQueryResults")
            append("(")
            append("inlineQueryId=")
            append(inlineQueryId)
            append(", ")
            append("button=")
            append(button)
            append(", ")
            append("results=")
            results
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("nextOffset=")
            append(nextOffset)
            append(")")
        }
    }
}
