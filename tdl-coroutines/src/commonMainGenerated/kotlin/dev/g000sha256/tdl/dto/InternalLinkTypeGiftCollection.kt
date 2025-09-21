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
 * The link is a link to a gift collection. Call searchPublicChat with the given username, then call getReceivedGifts with the received gift owner identifier and the given collection identifier, then show the collection if received.
 *
 * @property giftOwnerUsername Username of the owner of the gift collection.
 * @property collectionId Gift collection identifier.
 */
public class InternalLinkTypeGiftCollection public constructor(
    public val giftOwnerUsername: String,
    public val collectionId: Int,
) : InternalLinkType() {
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
        other as InternalLinkTypeGiftCollection
        if (other.giftOwnerUsername != giftOwnerUsername) {
            return false
        }
        return other.collectionId == collectionId
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + giftOwnerUsername.hashCode()
        hashCode = 31 * hashCode + collectionId.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InternalLinkTypeGiftCollection")
            append("(")
            append("giftOwnerUsername=")
            append(giftOwnerUsername)
            append(", ")
            append("collectionId=")
            append(collectionId)
            append(")")
        }
    }
}
