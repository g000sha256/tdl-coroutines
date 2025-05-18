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
import kotlin.Long
import kotlin.String

/**
 * A new high score was achieved in a game.
 *
 * @property gameMessageId Identifier of the message with the game, can be an identifier of a deleted message.
 * @property gameId Identifier of the game; may be different from the games presented in the message with the game.
 * @property score New score.
 */
public class MessageGameScore public constructor(
    public val gameMessageId: Long,
    public val gameId: Long,
    public val score: Int,
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
        other as MessageGameScore
        if (other.gameMessageId != gameMessageId) {
            return false
        }
        if (other.gameId != gameId) {
            return false
        }
        return other.score == score
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + gameMessageId.hashCode()
        hashCode = 31 * hashCode + gameId.hashCode()
        hashCode = 31 * hashCode + score.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("MessageGameScore")
            append("(")
            append("gameMessageId=")
            append(gameMessageId)
            append(", ")
            append("gameId=")
            append(gameId)
            append(", ")
            append("score=")
            append(score)
            append(")")
        }
    }
}
