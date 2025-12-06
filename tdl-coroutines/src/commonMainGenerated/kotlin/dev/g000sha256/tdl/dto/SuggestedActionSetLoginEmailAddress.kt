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
 * Suggests the user to add login email address. Call isLoginEmailAddressRequired, and then setLoginEmailAddress or checkLoginEmailAddressCode to change the login email address.
 *
 * @property canBeHidden True, if the suggested action can be hidden using hideSuggestedAction. Otherwise, the user must not be able to use the app without setting up the email address.
 */
public class SuggestedActionSetLoginEmailAddress public constructor(
    public val canBeHidden: Boolean,
) : SuggestedAction() {
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
        other as SuggestedActionSetLoginEmailAddress
        return other.canBeHidden == canBeHidden
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + canBeHidden.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("SuggestedActionSetLoginEmailAddress")
            append("(")
            append("canBeHidden=")
            append(canBeHidden)
            append(")")
        }
    }
}
