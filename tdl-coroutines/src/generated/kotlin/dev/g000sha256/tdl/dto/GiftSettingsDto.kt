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
 * Contains settings for gift receiving for a user.
 *
 * @property showGiftButton True, if a button for sending a gift to the user or by the user must always be shown in the input field.
 * @property acceptedGiftTypes Types of gifts accepted by the user; for Telegram Premium users only.
 */
public class GiftSettingsDto public constructor(
    public val showGiftButton: Boolean,
    public val acceptedGiftTypes: AcceptedGiftTypesDto,
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
        other as GiftSettingsDto
        if (other.showGiftButton != showGiftButton) {
            return false
        }
        return other.acceptedGiftTypes == acceptedGiftTypes
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + showGiftButton.hashCode()
        hashCode = 31 * hashCode + acceptedGiftTypes.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("GiftSettingsDto")
            append("(")
            append("showGiftButton=")
            append(showGiftButton)
            append(", ")
            append("acceptedGiftTypes=")
            append(acceptedGiftTypes)
            append(")")
        }
    }
}
