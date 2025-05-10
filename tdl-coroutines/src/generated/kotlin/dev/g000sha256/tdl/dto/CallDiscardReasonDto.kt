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
 * This class is an abstract base class.
 * Describes the reason why a call was discarded.
 */
public sealed class CallDiscardReasonDto private constructor() {
    /**
     * The call wasn't discarded, or the reason is unknown.
     */
    public class Empty public constructor() : CallDiscardReasonDto() {
        override fun equals(other: Any?): Boolean {
            if (other === this) {
                return true
            }
            if (other == null) {
                return false
            }
            return this::class == other::class
        }

        override fun hashCode(): Int {
            return this::class.hashCode()
        }

        override fun toString(): String {
            return "CallDiscardReasonDto.Empty()"
        }
    }

    /**
     * The call was ended before the conversation started. It was canceled by the caller or missed by the other party.
     */
    public class Missed public constructor() : CallDiscardReasonDto() {
        override fun equals(other: Any?): Boolean {
            if (other === this) {
                return true
            }
            if (other == null) {
                return false
            }
            return this::class == other::class
        }

        override fun hashCode(): Int {
            return this::class.hashCode()
        }

        override fun toString(): String {
            return "CallDiscardReasonDto.Missed()"
        }
    }

    /**
     * The call was ended before the conversation started. It was declined by the other party.
     */
    public class Declined public constructor() : CallDiscardReasonDto() {
        override fun equals(other: Any?): Boolean {
            if (other === this) {
                return true
            }
            if (other == null) {
                return false
            }
            return this::class == other::class
        }

        override fun hashCode(): Int {
            return this::class.hashCode()
        }

        override fun toString(): String {
            return "CallDiscardReasonDto.Declined()"
        }
    }

    /**
     * The call was ended during the conversation because the users were disconnected.
     */
    public class Disconnected public constructor() : CallDiscardReasonDto() {
        override fun equals(other: Any?): Boolean {
            if (other === this) {
                return true
            }
            if (other == null) {
                return false
            }
            return this::class == other::class
        }

        override fun hashCode(): Int {
            return this::class.hashCode()
        }

        override fun toString(): String {
            return "CallDiscardReasonDto.Disconnected()"
        }
    }

    /**
     * The call was ended because one of the parties hung up.
     */
    public class HungUp public constructor() : CallDiscardReasonDto() {
        override fun equals(other: Any?): Boolean {
            if (other === this) {
                return true
            }
            if (other == null) {
                return false
            }
            return this::class == other::class
        }

        override fun hashCode(): Int {
            return this::class.hashCode()
        }

        override fun toString(): String {
            return "CallDiscardReasonDto.HungUp()"
        }
    }

    /**
     * The call was ended because it has been upgraded to a group call.
     *
     * @property inviteLink Invite link for the group call.
     */
    public class UpgradeToGroupCall public constructor(
        public val inviteLink: String,
    ) : CallDiscardReasonDto() {
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
            other as UpgradeToGroupCall
            return other.inviteLink == inviteLink
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + inviteLink.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("CallDiscardReasonDto.UpgradeToGroupCall")
                append("(")
                append("inviteLink=")
                append(inviteLink)
                append(")")
            }
        }
    }
}
