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
 * Contains basic information about the photo of a chat.
 *
 * @property small A small (160x160) chat photo variant in JPEG format. The file can be downloaded only before the photo is changed.
 * @property big A big (640x640) chat photo variant in JPEG format. The file can be downloaded only before the photo is changed.
 * @property minithumbnail Chat photo minithumbnail; may be null.
 * @property hasAnimation True, if the photo has animated variant.
 * @property isPersonal True, if the photo is visible only for the current user.
 */
public class ChatPhotoInfoDto public constructor(
    public val small: FileDto,
    public val big: FileDto,
    public val minithumbnail: MinithumbnailDto?,
    public val hasAnimation: Boolean,
    public val isPersonal: Boolean,
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
        other as ChatPhotoInfoDto
        if (other.small != small) {
            return false
        }
        if (other.big != big) {
            return false
        }
        if (other.minithumbnail != minithumbnail) {
            return false
        }
        if (other.hasAnimation != hasAnimation) {
            return false
        }
        return other.isPersonal == isPersonal
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + small.hashCode()
        hashCode = 31 * hashCode + big.hashCode()
        hashCode = 31 * hashCode + minithumbnail.hashCode()
        hashCode = 31 * hashCode + hasAnimation.hashCode()
        hashCode = 31 * hashCode + isPersonal.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ChatPhotoInfoDto")
            append("(")
            append("small=")
            append(small)
            append(", ")
            append("big=")
            append(big)
            append(", ")
            append("minithumbnail=")
            append(minithumbnail)
            append(", ")
            append("hasAnimation=")
            append(hasAnimation)
            append(", ")
            append("isPersonal=")
            append(isPersonal)
            append(")")
        }
    }
}
