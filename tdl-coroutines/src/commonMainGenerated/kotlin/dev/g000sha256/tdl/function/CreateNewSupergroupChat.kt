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

import dev.g000sha256.tdl.dto.ChatLocation
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@SerialName(value = "createNewSupergroupChat")
@Serializable
internal class CreateNewSupergroupChat internal constructor(
    @SerialName(value = "title")
    internal val title: String,
    @SerialName(value = "is_forum")
    internal val isForum: Boolean,
    @SerialName(value = "is_channel")
    internal val isChannel: Boolean,
    @SerialName(value = "description")
    internal val description: String,
    @SerialName(value = "location")
    internal val location: ChatLocation?,
    @SerialName(value = "message_auto_delete_time")
    internal val messageAutoDeleteTime: Int,
    @SerialName(value = "for_import")
    internal val forImport: Boolean,
) : Function()
