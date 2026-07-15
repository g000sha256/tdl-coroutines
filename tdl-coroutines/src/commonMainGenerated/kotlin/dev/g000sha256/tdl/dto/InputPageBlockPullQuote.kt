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
import kotlin.String

/**
 * A pull quote.
 *
 * @property text Quote text.
 * @property credit Quote credit; pass null if none.
 */
public class InputPageBlockPullQuote public constructor(
    public val text: RichText,
    public val credit: RichText?,
) : InputPageBlock() {
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
        other as InputPageBlockPullQuote
        if (other.text != text) {
            return false
        }
        return other.credit == credit
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + text.hashCode()
        hashCode = 31 * hashCode + credit.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InputPageBlockPullQuote")
            append("(")
            append("text=")
            append(text)
            append(", ")
            append("credit=")
            append(credit)
            append(")")
        }
    }
}
