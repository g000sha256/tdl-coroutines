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

import dev.g000sha256.tdl.dto.WebAppOpenParameters
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@SerialName(value = "getWebAppLinkUrl")
@Serializable
internal class GetWebAppLinkUrl internal constructor(
    @SerialName(value = "chat_id")
    internal val chatId: Long,
    @SerialName(value = "bot_user_id")
    internal val botUserId: Long,
    @SerialName(value = "web_app_short_name")
    internal val webAppShortName: String,
    @SerialName(value = "start_parameter")
    internal val startParameter: String,
    @SerialName(value = "allow_write_access")
    internal val allowWriteAccess: Boolean,
    @SerialName(value = "parameters")
    internal val parameters: WebAppOpenParameters,
) : Function()
