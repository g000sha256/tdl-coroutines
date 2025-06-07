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

import dev.g000sha256.tdl.dto.ShippingOption
import kotlin.Array
import kotlin.Long
import kotlin.String
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@SerialName(value = "answerShippingQuery")
@Serializable
internal class AnswerShippingQuery internal constructor(
    @SerialName(value = "shipping_query_id")
    internal val shippingQueryId: Long,
    @SerialName(value = "shipping_options")
    internal val shippingOptions: Array<ShippingOption>,
    @SerialName(value = "error_message")
    internal val errorMessage: String,
) : Function()
