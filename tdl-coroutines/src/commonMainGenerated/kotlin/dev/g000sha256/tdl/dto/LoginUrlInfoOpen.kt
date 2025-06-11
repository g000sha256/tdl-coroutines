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
 * An HTTP URL needs to be open.
 *
 * @property url The URL to open.
 * @property skipConfirmation True, if there is no need to show an ordinary open URL confirmation.
 */
public class LoginUrlInfoOpen public constructor(
    public val url: String,
    public val skipConfirmation: Boolean,
) : LoginUrlInfo() {
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
        other as LoginUrlInfoOpen
        if (other.url != url) {
            return false
        }
        return other.skipConfirmation == skipConfirmation
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + url.hashCode()
        hashCode = 31 * hashCode + skipConfirmation.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("LoginUrlInfoOpen")
            append("(")
            append("url=")
            append(url)
            append(", ")
            append("skipConfirmation=")
            append(skipConfirmation)
            append(")")
        }
    }
}
