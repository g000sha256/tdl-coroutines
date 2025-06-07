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

import dev.g000sha256.tdl.dto.MessageSender
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@SerialName(value = "getReceivedGifts")
@Serializable
internal class GetReceivedGifts internal constructor(
    @SerialName(value = "business_connection_id")
    internal val businessConnectionId: String,
    @SerialName(value = "owner_id")
    internal val ownerId: MessageSender,
    @SerialName(value = "exclude_unsaved")
    internal val excludeUnsaved: Boolean,
    @SerialName(value = "exclude_saved")
    internal val excludeSaved: Boolean,
    @SerialName(value = "exclude_unlimited")
    internal val excludeUnlimited: Boolean,
    @SerialName(value = "exclude_limited")
    internal val excludeLimited: Boolean,
    @SerialName(value = "exclude_upgraded")
    internal val excludeUpgraded: Boolean,
    @SerialName(value = "sort_by_price")
    internal val sortByPrice: Boolean,
    @SerialName(value = "offset")
    internal val offset: String,
    @SerialName(value = "limit")
    internal val limit: Int,
) : Function()
