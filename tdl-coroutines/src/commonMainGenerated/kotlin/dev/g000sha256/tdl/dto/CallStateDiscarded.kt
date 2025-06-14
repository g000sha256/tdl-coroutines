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
 * The call has ended successfully.
 *
 * @property reason The reason why the call has ended.
 * @property needRating True, if the call rating must be sent to the server.
 * @property needDebugInformation True, if the call debug information must be sent to the server.
 * @property needLog True, if the call log must be sent to the server.
 */
public class CallStateDiscarded public constructor(
    public val reason: CallDiscardReason,
    public val needRating: Boolean,
    public val needDebugInformation: Boolean,
    public val needLog: Boolean,
) : CallState() {
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
        other as CallStateDiscarded
        if (other.reason != reason) {
            return false
        }
        if (other.needRating != needRating) {
            return false
        }
        if (other.needDebugInformation != needDebugInformation) {
            return false
        }
        return other.needLog == needLog
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + reason.hashCode()
        hashCode = 31 * hashCode + needRating.hashCode()
        hashCode = 31 * hashCode + needDebugInformation.hashCode()
        hashCode = 31 * hashCode + needLog.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("CallStateDiscarded")
            append("(")
            append("reason=")
            append(reason)
            append(", ")
            append("needRating=")
            append(needRating)
            append(", ")
            append("needDebugInformation=")
            append(needDebugInformation)
            append(", ")
            append("needLog=")
            append(needLog)
            append(")")
        }
    }
}
