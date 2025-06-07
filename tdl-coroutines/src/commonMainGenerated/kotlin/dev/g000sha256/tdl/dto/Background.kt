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
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Describes a chat background.
 *
 * @property id Unique background identifier.
 * @property isDefault True, if this is one of default backgrounds.
 * @property isDark True, if the background is dark and is recommended to be used with dark theme.
 * @property name Unique background name.
 * @property document Document with the background; may be null. Null only for filled and chat theme backgrounds.
 * @property type Type of the background.
 */
@SerialName(value = "background")
@Serializable
public class Background public constructor(
    @SerialName(value = "id")
    public val id: Long,
    @SerialName(value = "is_default")
    public val isDefault: Boolean,
    @SerialName(value = "is_dark")
    public val isDark: Boolean,
    @SerialName(value = "name")
    public val name: String,
    @SerialName(value = "document")
    public val document: Document?,
    @SerialName(value = "type")
    public val type: BackgroundType,
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
        other as Background
        if (other.id != id) {
            return false
        }
        if (other.isDefault != isDefault) {
            return false
        }
        if (other.isDark != isDark) {
            return false
        }
        if (other.name != name) {
            return false
        }
        if (other.document != document) {
            return false
        }
        return other.type == type
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + id.hashCode()
        hashCode = 31 * hashCode + isDefault.hashCode()
        hashCode = 31 * hashCode + isDark.hashCode()
        hashCode = 31 * hashCode + name.hashCode()
        hashCode = 31 * hashCode + document.hashCode()
        hashCode = 31 * hashCode + type.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("Background")
            append("(")
            append("id=")
            append(id)
            append(", ")
            append("isDefault=")
            append(isDefault)
            append(", ")
            append("isDark=")
            append(isDark)
            append(", ")
            append("name=")
            append(name)
            append(", ")
            append("document=")
            append(document)
            append(", ")
            append("type=")
            append(type)
            append(")")
        }
    }
}
