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
import kotlin.Double
import kotlin.Int
import kotlin.String

/**
 * An animation in MPEG4 format; must be square, at most 10 seconds long, have width between 160 and 1280 and be at most 2MB in size.
 *
 * @property animation Animation to be set as profile photo. Only inputFileLocal and inputFileGenerated are allowed.
 * @property mainFrameTimestamp Timestamp of the frame, which will be used as static chat photo.
 */
public class InputChatPhotoAnimation public constructor(
    public val animation: InputFile,
    public val mainFrameTimestamp: Double,
) : InputChatPhoto() {
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
        other as InputChatPhotoAnimation
        if (other.animation != animation) {
            return false
        }
        return other.mainFrameTimestamp == mainFrameTimestamp
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + animation.hashCode()
        hashCode = 31 * hashCode + mainFrameTimestamp.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InputChatPhotoAnimation")
            append("(")
            append("animation=")
            append(animation)
            append(", ")
            append("mainFrameTimestamp=")
            append(mainFrameTimestamp)
            append(")")
        }
    }
}
