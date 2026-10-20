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
import kotlin.ByteArray
import kotlin.Int
import kotlin.Long
import kotlin.String

/**
 * Represents a pending TON Connect request.
 *
 * @property sessionId Unique identifier of the session.
 * @property messageId Unique identifier of the service message in the chat 777000 with the request.
 * @property body Body of the request.
 * @property expirationDate Point in time (Unix timestamp) when the request will expire; 0 if never.
 * @property topic Topic of the request; may be empty if none.
 * @property traceId Identifier to trace the request; may be empty if none.
 */
public class TonConnectRequest public constructor(
    public val sessionId: Long,
    public val messageId: Long,
    public val body: ByteArray,
    public val expirationDate: Int,
    public val topic: String,
    public val traceId: String,
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
        other as TonConnectRequest
        if (other.sessionId != sessionId) {
            return false
        }
        if (other.messageId != messageId) {
            return false
        }
        val bodyEquals = other.body.contentEquals(body)
        if (!bodyEquals) {
            return false
        }
        if (other.expirationDate != expirationDate) {
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
        hashCode = 31 * hashCode + messageId.hashCode()
        hashCode = 31 * hashCode + body.contentHashCode()
        hashCode = 31 * hashCode + expirationDate.hashCode()
        hashCode = 31 * hashCode + topic.hashCode()
        hashCode = 31 * hashCode + traceId.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("TonConnectRequest")
            append("(")
            append("sessionId=")
            append(sessionId)
            append(", ")
            append("messageId=")
            append(messageId)
            append(", ")
            append("body=")
            body
                .contentToString()
                .also { append(it) }
            append(", ")
            append("expirationDate=")
            append(expirationDate)
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
