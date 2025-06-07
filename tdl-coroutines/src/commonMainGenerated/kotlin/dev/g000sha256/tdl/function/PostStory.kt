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

import dev.g000sha256.tdl.dto.FormattedText
import dev.g000sha256.tdl.dto.InputStoryAreas
import dev.g000sha256.tdl.dto.InputStoryContent
import dev.g000sha256.tdl.dto.StoryFullId
import dev.g000sha256.tdl.dto.StoryPrivacySettings
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@SerialName(value = "postStory")
@Serializable
internal class PostStory internal constructor(
    @SerialName(value = "chat_id")
    internal val chatId: Long,
    @SerialName(value = "content")
    internal val content: InputStoryContent,
    @SerialName(value = "areas")
    internal val areas: InputStoryAreas?,
    @SerialName(value = "caption")
    internal val caption: FormattedText?,
    @SerialName(value = "privacy_settings")
    internal val privacySettings: StoryPrivacySettings,
    @SerialName(value = "active_period")
    internal val activePeriod: Int,
    @SerialName(value = "from_story_full_id")
    internal val fromStoryFullId: StoryFullId?,
    @SerialName(value = "is_posted_to_chat_page")
    internal val isPostedToChatPage: Boolean,
    @SerialName(value = "protect_content")
    internal val protectContent: Boolean,
) : Function()
