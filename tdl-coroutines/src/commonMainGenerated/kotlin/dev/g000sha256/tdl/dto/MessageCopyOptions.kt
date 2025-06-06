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
import kotlin.String

/**
 * Options to be used when a message content is copied without reference to the original sender. Service messages, messages with messageInvoice, messagePaidMedia, messageGiveaway, or messageGiveawayWinners content can't be copied.
 *
 * @property sendCopy True, if content of the message needs to be copied without reference to the original sender. Always true if the message is forwarded to a secret chat or is local. Use messageProperties.canBeSaved and messageProperties.canBeCopiedToSecretChat to check whether the message is suitable.
 * @property replaceCaption True, if media caption of the message copy needs to be replaced. Ignored if sendCopy is false.
 * @property newCaption New message caption; pass null to copy message without caption. Ignored if replaceCaption is false.
 * @property newShowCaptionAboveMedia True, if new caption must be shown above the media; otherwise, new caption must be shown below the media; not supported in secret chats. Ignored if replaceCaption is false.
 */
public class MessageCopyOptions public constructor(
    public val sendCopy: Boolean,
    public val replaceCaption: Boolean,
    public val newCaption: FormattedText?,
    public val newShowCaptionAboveMedia: Boolean,
) {
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
        other as MessageCopyOptions
        if (other.sendCopy != sendCopy) {
            return false
        }
        if (other.replaceCaption != replaceCaption) {
            return false
        }
        if (other.newCaption != newCaption) {
            return false
        }
        return other.newShowCaptionAboveMedia == newShowCaptionAboveMedia
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + sendCopy.hashCode()
        hashCode = 31 * hashCode + replaceCaption.hashCode()
        hashCode = 31 * hashCode + newCaption.hashCode()
        hashCode = 31 * hashCode + newShowCaptionAboveMedia.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("MessageCopyOptions")
            append("(")
            append("sendCopy=")
            append(sendCopy)
            append(", ")
            append("replaceCaption=")
            append(replaceCaption)
            append(", ")
            append("newCaption=")
            append(newCaption)
            append(", ")
            append("newShowCaptionAboveMedia=")
            append(newShowCaptionAboveMedia)
            append(")")
        }
    }
}
