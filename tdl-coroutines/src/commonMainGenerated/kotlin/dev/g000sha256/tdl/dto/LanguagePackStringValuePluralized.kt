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
 * A language pack string which has different forms based on the number of some object it mentions. See https://www.unicode.org/cldr/charts/latest/supplemental/language_plural_rules.html for more information.
 *
 * @property zeroValue Value for zero objects.
 * @property oneValue Value for one object.
 * @property twoValue Value for two objects.
 * @property fewValue Value for few objects.
 * @property manyValue Value for many objects.
 * @property otherValue Default value.
 */
@SerialName(value = "languagePackStringValuePluralized")
@Serializable
public class LanguagePackStringValuePluralized public constructor(
    @SerialName(value = "zero_value")
    public val zeroValue: String,
    @SerialName(value = "one_value")
    public val oneValue: String,
    @SerialName(value = "two_value")
    public val twoValue: String,
    @SerialName(value = "few_value")
    public val fewValue: String,
    @SerialName(value = "many_value")
    public val manyValue: String,
    @SerialName(value = "other_value")
    public val otherValue: String,
) : LanguagePackStringValue() {
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
        other as LanguagePackStringValuePluralized
        if (other.zeroValue != zeroValue) {
            return false
        }
        if (other.oneValue != oneValue) {
            return false
        }
        if (other.twoValue != twoValue) {
            return false
        }
        if (other.fewValue != fewValue) {
            return false
        }
        if (other.manyValue != manyValue) {
            return false
        }
        return other.otherValue == otherValue
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + zeroValue.hashCode()
        hashCode = 31 * hashCode + oneValue.hashCode()
        hashCode = 31 * hashCode + twoValue.hashCode()
        hashCode = 31 * hashCode + fewValue.hashCode()
        hashCode = 31 * hashCode + manyValue.hashCode()
        hashCode = 31 * hashCode + otherValue.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("LanguagePackStringValuePluralized")
            append("(")
            append("zeroValue=")
            append(zeroValue)
            append(", ")
            append("oneValue=")
            append(oneValue)
            append(", ")
            append("twoValue=")
            append(twoValue)
            append(", ")
            append("fewValue=")
            append(fewValue)
            append(", ")
            append("manyValue=")
            append(manyValue)
            append(", ")
            append("otherValue=")
            append(otherValue)
            append(")")
        }
    }
}
