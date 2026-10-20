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
 * A request from a dApp was received through TON Connect.
 *
 * @property sessionId Unique identifier of the TON Connect session.
 * @property state State of the request.
 * @property dappName Name of the dApp; may be empty if unknown.
 * @property topic Topic of the request; may be empty if none.
 * @property traceId Identifier to trace the request; may be empty if none.
 */
public class MessageTonConnectRequest public constructor(
    public val sessionId: Long,
    public val state: TonConnectRequestState,
    public val dappName: String,
    public val topic: String,
    public val traceId: String,
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
        other as MessageTonConnectRequest
        if (other.sessionId != sessionId) {
            return false
        }
        if (other.state != state) {
            return false
        }
        if (other.dappName != dappName) {
            return false
        }
        if (other.topic != topic) {
            return false
        }
        return other.traceId == traceId
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + sessionId.hashCode()
        hashCode = 31 * hashCode + state.hashCode()
        hashCode = 31 * hashCode + dappName.hashCode()
        hashCode = 31 * hashCode + topic.hashCode()
        hashCode = 31 * hashCode + traceId.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("MessageTonConnectRequest")
            append("(")
            append("sessionId=")
            append(sessionId)
            append(", ")
            append("state=")
            append(state)
            append(", ")
            append("dappName=")
            append(dappName)
            append(", ")
            append("topic=")
            append(topic)
            append(", ")
            append("traceId=")
            append(traceId)
            append(")")
        }
    }
}
