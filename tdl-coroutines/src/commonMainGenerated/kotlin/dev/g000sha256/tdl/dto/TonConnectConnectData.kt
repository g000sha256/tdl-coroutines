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
 * Contains data required to give access to the TON wallet of the current user in acceptOauthRequest.
 *
 * @property sessionId Unique identifier of the session.
 * @property challengeAnswer Answer to the challenge received from setTonConnectSessionWalletClientId.
 * @property body Body of the result of the connection request as in sendTonConnectSessionConnectResult.
 * @property proof Proof of the TON wallet ownership for the payload oauthLinkInfo.tonProofPayload.
 */
public class TonConnectConnectData public constructor(
    public val sessionId: Long,
    public val challengeAnswer: ByteArray,
    public val body: ByteArray,
    public val proof: TonWalletOwnershipProof,
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
        other as TonConnectConnectData
        if (other.sessionId != sessionId) {
            return false
        }
        val challengeAnswerEquals = other.challengeAnswer.contentEquals(challengeAnswer)
        if (!challengeAnswerEquals) {
            return false
        }
        val bodyEquals = other.body.contentEquals(body)
        if (!bodyEquals) {
            return false
        }
        return other.proof == proof
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + sessionId.hashCode()
        hashCode = 31 * hashCode + challengeAnswer.contentHashCode()
        hashCode = 31 * hashCode + body.contentHashCode()
        hashCode = 31 * hashCode + proof.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("TonConnectConnectData")
            append("(")
            append("sessionId=")
            append(sessionId)
            append(", ")
            append("challengeAnswer=")
            challengeAnswer
                .contentToString()
                .also { append(it) }
            append(", ")
            append("body=")
            body
                .contentToString()
                .also { append(it) }
            append(", ")
            append("proof=")
            append(proof)
            append(")")
        }
    }
}
