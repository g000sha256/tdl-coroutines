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

package dev.g000sha256.tdl.function

import dev.g000sha256.tdl.dto.InlineQueryResultsButton
import dev.g000sha256.tdl.dto.InputInlineQueryResult
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@SerialName(value = "answerInlineQuery")
@Serializable
internal class AnswerInlineQuery internal constructor(
    @SerialName(value = "inline_query_id")
    internal val inlineQueryId: Long,
    @SerialName(value = "is_personal")
    internal val isPersonal: Boolean,
    @SerialName(value = "button")
    internal val button: InlineQueryResultsButton?,
    @SerialName(value = "results")
    internal val results: Array<InputInlineQueryResult>,
    @SerialName(value = "cache_time")
    internal val cacheTime: Int,
    @SerialName(value = "next_offset")
    internal val nextOffset: String,
) : Function()
