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
import kotlin.LongArray
import kotlin.String
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Describes private chats chosen for automatic interaction with a business.
 *
 * @property chatIds Identifiers of selected private chats.
 * @property excludedChatIds Identifiers of private chats that are always excluded; for businessConnectedBot only.
 * @property selectExistingChats True, if all existing private chats are selected.
 * @property selectNewChats True, if all new private chats are selected.
 * @property selectContacts True, if all private chats with contacts are selected.
 * @property selectNonContacts True, if all private chats with non-contacts are selected.
 * @property excludeSelected If true, then all private chats except the selected are chosen. Otherwise, only the selected chats are chosen.
 */
@SerialName(value = "businessRecipients")
@Serializable
public class BusinessRecipients public constructor(
    @SerialName(value = "chat_ids")
    public val chatIds: LongArray,
    @SerialName(value = "excluded_chat_ids")
    public val excludedChatIds: LongArray,
    @SerialName(value = "select_existing_chats")
    public val selectExistingChats: Boolean,
    @SerialName(value = "select_new_chats")
    public val selectNewChats: Boolean,
    @SerialName(value = "select_contacts")
    public val selectContacts: Boolean,
    @SerialName(value = "select_non_contacts")
    public val selectNonContacts: Boolean,
    @SerialName(value = "exclude_selected")
    public val excludeSelected: Boolean,
) : Model() {
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
        other as BusinessRecipients
        val chatIdsEquals = other.chatIds.contentEquals(chatIds)
        if (!chatIdsEquals) {
            return false
        }
        val excludedChatIdsEquals = other.excludedChatIds.contentEquals(excludedChatIds)
        if (!excludedChatIdsEquals) {
            return false
        }
        if (other.selectExistingChats != selectExistingChats) {
            return false
        }
        if (other.selectNewChats != selectNewChats) {
            return false
        }
        if (other.selectContacts != selectContacts) {
            return false
        }
        if (other.selectNonContacts != selectNonContacts) {
            return false
        }
        return other.excludeSelected == excludeSelected
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + chatIds.contentHashCode()
        hashCode = 31 * hashCode + excludedChatIds.contentHashCode()
        hashCode = 31 * hashCode + selectExistingChats.hashCode()
        hashCode = 31 * hashCode + selectNewChats.hashCode()
        hashCode = 31 * hashCode + selectContacts.hashCode()
        hashCode = 31 * hashCode + selectNonContacts.hashCode()
        hashCode = 31 * hashCode + excludeSelected.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("BusinessRecipients")
            append("(")
            append("chatIds=")
            chatIds
                .contentToString()
                .also { append(it) }
            append(", ")
            append("excludedChatIds=")
            excludedChatIds
                .contentToString()
                .also { append(it) }
            append(", ")
            append("selectExistingChats=")
            append(selectExistingChats)
            append(", ")
            append("selectNewChats=")
            append(selectNewChats)
            append(", ")
            append("selectContacts=")
            append(selectContacts)
            append(", ")
            append("selectNonContacts=")
            append(selectNonContacts)
            append(", ")
            append("excludeSelected=")
            append(excludeSelected)
            append(")")
        }
    }
}
