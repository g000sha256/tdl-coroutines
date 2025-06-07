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

import dev.g000sha256.tdl.dto.GroupCallVideoQuality
import kotlin.Int
import kotlin.Long
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@SerialName(value = "getVideoChatStreamSegment")
@Serializable
internal class GetVideoChatStreamSegment internal constructor(
    @SerialName(value = "group_call_id")
    internal val groupCallId: Int,
    @SerialName(value = "time_offset")
    internal val timeOffset: Long,
    @SerialName(value = "scale")
    internal val scale: Int,
    @SerialName(value = "channel_id")
    internal val channelId: Int,
    @SerialName(value = "video_quality")
    internal val videoQuality: GroupCallVideoQuality?,
) : Function()
