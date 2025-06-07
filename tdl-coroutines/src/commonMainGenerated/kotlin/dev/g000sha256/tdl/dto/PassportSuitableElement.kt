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
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Contains information about a Telegram Passport element that was requested by a service.
 *
 * @property type Type of the element.
 * @property isSelfieRequired True, if a selfie is required with the identity document.
 * @property isTranslationRequired True, if a certified English translation is required with the document.
 * @property isNativeNameRequired True, if personal details must include the user's name in the language of their country of residence.
 */
@SerialName(value = "passportSuitableElement")
@Serializable
public class PassportSuitableElement public constructor(
    @SerialName(value = "type")
    public val type: PassportElementType,
    @SerialName(value = "is_selfie_required")
    public val isSelfieRequired: Boolean,
    @SerialName(value = "is_translation_required")
    public val isTranslationRequired: Boolean,
    @SerialName(value = "is_native_name_required")
    public val isNativeNameRequired: Boolean,
) : Model() {
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
        other as PassportSuitableElement
        if (other.type != type) {
            return false
        }
        if (other.isSelfieRequired != isSelfieRequired) {
            return false
        }
        if (other.isTranslationRequired != isTranslationRequired) {
            return false
        }
        return other.isNativeNameRequired == isNativeNameRequired
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + type.hashCode()
        hashCode = 31 * hashCode + isSelfieRequired.hashCode()
        hashCode = 31 * hashCode + isTranslationRequired.hashCode()
        hashCode = 31 * hashCode + isNativeNameRequired.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("PassportSuitableElement")
            append("(")
            append("type=")
            append(type)
            append(", ")
            append("isSelfieRequired=")
            append(isSelfieRequired)
            append(", ")
            append("isTranslationRequired=")
            append(isTranslationRequired)
            append(", ")
            append("isNativeNameRequired=")
            append(isNativeNameRequired)
            append(")")
        }
    }
}
