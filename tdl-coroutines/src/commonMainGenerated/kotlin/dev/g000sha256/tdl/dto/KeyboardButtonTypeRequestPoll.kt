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
 * A button that allows the user to create and send a poll when pressed; available only in private chats.
 *
 * @property forceRegular If true, only regular polls must be allowed to create.
 * @property forceQuiz If true, only polls in quiz mode must be allowed to create.
 */
public class KeyboardButtonTypeRequestPoll public constructor(
    public val forceRegular: Boolean,
    public val forceQuiz: Boolean,
) : KeyboardButtonType() {
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
        other as KeyboardButtonTypeRequestPoll
        if (other.forceRegular != forceRegular) {
            return false
        }
        return other.forceQuiz == forceQuiz
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + forceRegular.hashCode()
        hashCode = 31 * hashCode + forceQuiz.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("KeyboardButtonTypeRequestPoll")
            append("(")
            append("forceRegular=")
            append(forceRegular)
            append(", ")
            append("forceQuiz=")
            append(forceQuiz)
            append(")")
        }
    }
}
