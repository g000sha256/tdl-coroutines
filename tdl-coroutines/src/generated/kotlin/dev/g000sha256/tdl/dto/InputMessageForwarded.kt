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

package dev.g000sha256.tdl.dto

import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String

/**
 * A forwarded message.
 *
 * @property fromChatId Identifier for the chat this forwarded message came from.
 * @property messageId Identifier of the message to forward. A message can be forwarded only if messageProperties.canBeForwarded.
 * @property inGameShare Pass true if a game message is being shared from a launched game; applies only to game messages.
 * @property replaceVideoStartTimestamp Pass true to replace video start timestamp in the forwarded message.
 * @property newVideoStartTimestamp The new video start timestamp; ignored if replaceVideoStartTimestamp == false.
 * @property copyOptions Options to be used to copy content of the message without reference to the original sender; pass null to forward the message as usual.
 */
public class InputMessageForwarded public constructor(
    public val fromChatId: Long,
    public val messageId: Long,
    public val inGameShare: Boolean,
    public val replaceVideoStartTimestamp: Boolean,
    public val newVideoStartTimestamp: Int,
    public val copyOptions: MessageCopyOptions?,
) : InputMessageContent() {
    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if (other == null) {
            return false
        }
        if (other::class != this::class) {
            return false
        }
        other as InputMessageForwarded
        if (other.fromChatId != fromChatId) {
            return false
        }
        if (other.messageId != messageId) {
            return false
        }
        if (other.inGameShare != inGameShare) {
            return false
        }
        if (other.replaceVideoStartTimestamp != replaceVideoStartTimestamp) {
            return false
        }
        if (other.newVideoStartTimestamp != newVideoStartTimestamp) {
            return false
        }
        return other.copyOptions == copyOptions
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + fromChatId.hashCode()
        hashCode = 31 * hashCode + messageId.hashCode()
        hashCode = 31 * hashCode + inGameShare.hashCode()
        hashCode = 31 * hashCode + replaceVideoStartTimestamp.hashCode()
        hashCode = 31 * hashCode + newVideoStartTimestamp.hashCode()
        hashCode = 31 * hashCode + copyOptions.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InputMessageForwarded")
            append("(")
            append("fromChatId=")
            append(fromChatId)
            append(", ")
            append("messageId=")
            append(messageId)
            append(", ")
            append("inGameShare=")
            append(inGameShare)
            append(", ")
            append("replaceVideoStartTimestamp=")
            append(replaceVideoStartTimestamp)
            append(", ")
            append("newVideoStartTimestamp=")
            append(newVideoStartTimestamp)
            append(", ")
            append("copyOptions=")
            append(copyOptions)
            append(")")
        }
    }
}
