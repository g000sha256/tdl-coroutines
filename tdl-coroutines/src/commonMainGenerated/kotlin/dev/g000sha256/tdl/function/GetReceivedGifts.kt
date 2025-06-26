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

internal class GetReceivedGifts internal constructor(
    internal val businessConnectionId: String,
    internal val ownerId: MessageSender,
    internal val excludeUnsaved: Boolean,
    internal val excludeSaved: Boolean,
    internal val excludeUnlimited: Boolean,
    internal val excludeLimited: Boolean,
    internal val excludeUpgraded: Boolean,
    internal val sortByPrice: Boolean,
    internal val offset: String,
    internal val limit: Int,
)
