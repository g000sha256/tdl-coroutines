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
 * A forum topic has been edited.
 *
 * @property name If non-empty, the new name of the topic.
 * @property editIconCustomEmojiId True, if icon's customEmojiId is changed.
 * @property iconCustomEmojiId New unique identifier of the custom emoji shown on the topic icon; 0 if none. Must be ignored if editIconCustomEmojiId is false.
 */
public class MessageForumTopicEdited public constructor(
    public val name: String,
    public val editIconCustomEmojiId: Boolean,
    public val iconCustomEmojiId: Long,
) : MessageContent() {
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
        other as MessageForumTopicEdited
        if (other.name != name) {
            return false
        }
        if (other.editIconCustomEmojiId != editIconCustomEmojiId) {
            return false
        }
        return other.iconCustomEmojiId == iconCustomEmojiId
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + name.hashCode()
        hashCode = 31 * hashCode + editIconCustomEmojiId.hashCode()
        hashCode = 31 * hashCode + iconCustomEmojiId.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("MessageForumTopicEdited")
            append("(")
            append("name=")
            append(name)
            append(", ")
            append("editIconCustomEmojiId=")
            append(editIconCustomEmojiId)
            append(", ")
            append("iconCustomEmojiId=")
            append(iconCustomEmojiId)
            append(")")
        }
    }
}
