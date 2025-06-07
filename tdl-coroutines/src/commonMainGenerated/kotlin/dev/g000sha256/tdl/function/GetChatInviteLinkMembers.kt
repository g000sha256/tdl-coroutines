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

import dev.g000sha256.tdl.dto.ChatInviteLinkMember
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@SerialName(value = "getChatInviteLinkMembers")
@Serializable
internal class GetChatInviteLinkMembers internal constructor(
    @SerialName(value = "chat_id")
    internal val chatId: Long,
    @SerialName(value = "invite_link")
    internal val inviteLink: String,
    @SerialName(value = "only_with_expired_subscription")
    internal val onlyWithExpiredSubscription: Boolean,
    @SerialName(value = "offset_member")
    internal val offsetMember: ChatInviteLinkMember?,
    @SerialName(value = "limit")
    internal val limit: Int,
) : Function()
