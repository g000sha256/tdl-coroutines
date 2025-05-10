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
 * Contains information about a language pack.
 *
 * @property id Unique language pack identifier.
 * @property baseLanguagePackId Identifier of a base language pack; may be empty. If a string is missed in the language pack, then it must be fetched from base language pack. Unsupported in custom language packs.
 * @property name Language name.
 * @property nativeName Name of the language in that language.
 * @property pluralCode A language code to be used to apply plural forms. See https://www.unicode.org/cldr/charts/latest/supplemental/language_plural_rules.html for more information.
 * @property isOfficial True, if the language pack is official.
 * @property isRtl True, if the language pack strings are RTL.
 * @property isBeta True, if the language pack is a beta language pack.
 * @property isInstalled True, if the language pack is installed by the current user.
 * @property totalStringCount Total number of non-deleted strings from the language pack.
 * @property translatedStringCount Total number of translated strings from the language pack.
 * @property localStringCount Total number of non-deleted strings from the language pack available locally.
 * @property translationUrl Link to language translation interface; empty for custom local language packs.
 */
public class LanguagePackInfoDto public constructor(
    public val id: String,
    public val baseLanguagePackId: String,
    public val name: String,
    public val nativeName: String,
    public val pluralCode: String,
    public val isOfficial: Boolean,
    public val isRtl: Boolean,
    public val isBeta: Boolean,
    public val isInstalled: Boolean,
    public val totalStringCount: Int,
    public val translatedStringCount: Int,
    public val localStringCount: Int,
    public val translationUrl: String,
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
        other as LanguagePackInfoDto
        if (other.id != id) {
            return false
        }
        if (other.baseLanguagePackId != baseLanguagePackId) {
            return false
        }
        if (other.name != name) {
            return false
        }
        if (other.nativeName != nativeName) {
            return false
        }
        if (other.pluralCode != pluralCode) {
            return false
        }
        if (other.isOfficial != isOfficial) {
            return false
        }
        if (other.isRtl != isRtl) {
            return false
        }
        if (other.isBeta != isBeta) {
            return false
        }
        if (other.isInstalled != isInstalled) {
            return false
        }
        if (other.totalStringCount != totalStringCount) {
            return false
        }
        if (other.translatedStringCount != translatedStringCount) {
            return false
        }
        if (other.localStringCount != localStringCount) {
            return false
        }
        return other.translationUrl == translationUrl
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + id.hashCode()
        hashCode = 31 * hashCode + baseLanguagePackId.hashCode()
        hashCode = 31 * hashCode + name.hashCode()
        hashCode = 31 * hashCode + nativeName.hashCode()
        hashCode = 31 * hashCode + pluralCode.hashCode()
        hashCode = 31 * hashCode + isOfficial.hashCode()
        hashCode = 31 * hashCode + isRtl.hashCode()
        hashCode = 31 * hashCode + isBeta.hashCode()
        hashCode = 31 * hashCode + isInstalled.hashCode()
        hashCode = 31 * hashCode + totalStringCount.hashCode()
        hashCode = 31 * hashCode + translatedStringCount.hashCode()
        hashCode = 31 * hashCode + localStringCount.hashCode()
        hashCode = 31 * hashCode + translationUrl.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("LanguagePackInfoDto")
            append("(")
            append("id=")
            append(id)
            append(", ")
            append("baseLanguagePackId=")
            append(baseLanguagePackId)
            append(", ")
            append("name=")
            append(name)
            append(", ")
            append("nativeName=")
            append(nativeName)
            append(", ")
            append("pluralCode=")
            append(pluralCode)
            append(", ")
            append("isOfficial=")
            append(isOfficial)
            append(", ")
            append("isRtl=")
            append(isRtl)
            append(", ")
            append("isBeta=")
            append(isBeta)
            append(", ")
            append("isInstalled=")
            append(isInstalled)
            append(", ")
            append("totalStringCount=")
            append(totalStringCount)
            append(", ")
            append("translatedStringCount=")
            append(translatedStringCount)
            append(", ")
            append("localStringCount=")
            append(localStringCount)
            append(", ")
            append("translationUrl=")
            append(translationUrl)
            append(")")
        }
    }
}
