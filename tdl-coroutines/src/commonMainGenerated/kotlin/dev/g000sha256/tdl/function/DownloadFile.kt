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

import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@SerialName(value = "downloadFile")
@Serializable
internal class DownloadFile internal constructor(
    @SerialName(value = "file_id")
    internal val fileId: Int,
    @SerialName(value = "priority")
    internal val priority: Int,
    @SerialName(value = "offset")
    internal val offset: Long,
    @SerialName(value = "limit")
    internal val limit: Long,
    @SerialName(value = "synchronous")
    internal val synchronous: Boolean,
) : Function()
