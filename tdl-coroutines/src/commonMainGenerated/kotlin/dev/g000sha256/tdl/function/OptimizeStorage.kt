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

import dev.g000sha256.tdl.dto.FileType
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.LongArray

internal class OptimizeStorage internal constructor(
    internal val size: Long,
    internal val ttl: Int,
    internal val count: Int,
    internal val immunityDelay: Int,
    internal val fileTypes: Array<FileType>,
    internal val chatIds: LongArray,
    internal val excludeChatIds: LongArray,
    internal val returnDeletedFileStatistics: Boolean,
    internal val chatLimit: Int,
)
