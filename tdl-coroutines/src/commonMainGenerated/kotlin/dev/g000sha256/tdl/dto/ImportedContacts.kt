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
import kotlin.IntArray
import kotlin.LongArray
import kotlin.String

/**
 * Represents the result of an importContacts request.
 *
 * @property userIds User identifiers of the imported contacts in the same order as they were specified in the request; 0 if the contact is not yet a registered user.
 * @property importerCount The number of users that imported the corresponding contact; 0 for already registered users or if unavailable.
 */
public class ImportedContacts public constructor(
    public val userIds: LongArray,
    public val importerCount: IntArray,
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
        other as ImportedContacts
        val userIdsEquals = other.userIds.contentEquals(userIds)
        if (!userIdsEquals) {
            return false
        }
        return other.importerCount.contentEquals(importerCount)
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + userIds.contentHashCode()
        hashCode = 31 * hashCode + importerCount.contentHashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ImportedContacts")
            append("(")
            append("userIds=")
            userIds
                .contentToString()
                .also { append(it) }
            append(", ")
            append("importerCount=")
            importerCount
                .contentToString()
                .also { append(it) }
            append(")")
        }
    }
}
