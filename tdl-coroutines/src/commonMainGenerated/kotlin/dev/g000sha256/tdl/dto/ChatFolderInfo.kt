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
 * Contains basic information about a chat folder.
 *
 * @property id Unique chat folder identifier.
 * @property name The name of the folder.
 * @property icon The chosen or default icon for the chat folder.
 * @property colorId The identifier of the chosen color for the chat folder icon; from -1 to 6. If -1, then color is disabled.
 * @property isShareable True, if at least one link has been created for the folder.
 * @property hasMyInviteLinks True, if the chat folder has invite links created by the current user.
 */
public class ChatFolderInfo public constructor(
    public val id: Int,
    public val name: ChatFolderName,
    public val icon: ChatFolderIcon,
    public val colorId: Int,
    public val isShareable: Boolean,
    public val hasMyInviteLinks: Boolean,
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
        other as ChatFolderInfo
        if (other.id != id) {
            return false
        }
        if (other.name != name) {
            return false
        }
        if (other.icon != icon) {
            return false
        }
        if (other.colorId != colorId) {
            return false
        }
        if (other.isShareable != isShareable) {
            return false
        }
        return other.hasMyInviteLinks == hasMyInviteLinks
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + id.hashCode()
        hashCode = 31 * hashCode + name.hashCode()
        hashCode = 31 * hashCode + icon.hashCode()
        hashCode = 31 * hashCode + colorId.hashCode()
        hashCode = 31 * hashCode + isShareable.hashCode()
        hashCode = 31 * hashCode + hasMyInviteLinks.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ChatFolderInfo")
            append("(")
            append("id=")
            append(id)
            append(", ")
            append("name=")
            append(name)
            append(", ")
            append("icon=")
            append(icon)
            append(", ")
            append("colorId=")
            append(colorId)
            append(", ")
            append("isShareable=")
            append(isShareable)
            append(", ")
            append("hasMyInviteLinks=")
            append(hasMyInviteLinks)
            append(")")
        }
    }
}
