/*
 * Copyright 2026 Georgii Ippolitov (g000sha256)
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
 * Represents a community consisting of supergroup chats, channel chats and chats with bots.
 *
 * @property id Community identifier.
 * @property haveAccess If false, the community is inaccessible, and the only information known about the community is inside this class. Identifier of the community can't be passed to any method.
 * @property name Community name.
 * @property photo Community photo; may be null.
 * @property date Point in time (Unix timestamp) when the community was joined, or the point in time when the community was created, in case the user is not a member of any chat in the community.
 * @property status Status of the current user in the community.
 * @property permissions Actions that non-administrator community members are allowed to take in the community.
 */
public class Community public constructor(
    public val id: Long,
    public val haveAccess: Boolean,
    public val name: String,
    public val photo: ChatPhotoInfo?,
    public val date: Int,
    public val status: CommunityMemberStatus,
    public val permissions: CommunityPermissions,
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
        other as Community
        if (other.id != id) {
            return false
        }
        if (other.haveAccess != haveAccess) {
            return false
        }
        if (other.name != name) {
            return false
        }
        if (other.photo != photo) {
            return false
        }
        if (other.date != date) {
            return false
        }
        if (other.status != status) {
            return false
        }
        return other.permissions == permissions
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + id.hashCode()
        hashCode = 31 * hashCode + haveAccess.hashCode()
        hashCode = 31 * hashCode + name.hashCode()
        hashCode = 31 * hashCode + photo.hashCode()
        hashCode = 31 * hashCode + date.hashCode()
        hashCode = 31 * hashCode + status.hashCode()
        hashCode = 31 * hashCode + permissions.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("Community")
            append("(")
            append("id=")
            append(id)
            append(", ")
            append("haveAccess=")
            append(haveAccess)
            append(", ")
            append("name=")
            append(name)
            append(", ")
            append("photo=")
            append(photo)
            append(", ")
            append("date=")
            append(date)
            append(", ")
            append("status=")
            append(status)
            append(", ")
            append("permissions=")
            append(permissions)
            append(")")
        }
    }
}
