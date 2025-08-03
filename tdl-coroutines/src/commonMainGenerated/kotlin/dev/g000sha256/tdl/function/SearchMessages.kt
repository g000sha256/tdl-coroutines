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

import dev.g000sha256.tdl.dto.ChatList
import dev.g000sha256.tdl.dto.SearchMessagesChatTypeFilter
import dev.g000sha256.tdl.dto.SearchMessagesFilter
import kotlin.Int
import kotlin.String

internal class SearchMessages internal constructor(
    internal val chatList: ChatList?,
    internal val query: String,
    internal val offset: String,
    internal val limit: Int,
    internal val filter: SearchMessagesFilter?,
    internal val chatTypeFilter: SearchMessagesChatTypeFilter?,
    internal val minDate: Int,
    internal val maxDate: Int,
)
