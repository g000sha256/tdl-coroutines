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
 * A map.
 *
 * @property location Location of the map center.
 * @property zoom Map zoom level.
 * @property width Map width.
 * @property height Map height.
 * @property caption Block caption.
 */
public class PageBlockMap public constructor(
    public val location: Location,
    public val zoom: Int,
    public val width: Int,
    public val height: Int,
    public val caption: PageBlockCaption,
) : PageBlock() {
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
        other as PageBlockMap
        if (other.location != location) {
            return false
        }
        if (other.zoom != zoom) {
            return false
        }
        if (other.width != width) {
            return false
        }
        if (other.height != height) {
            return false
        }
        return other.caption == caption
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + location.hashCode()
        hashCode = 31 * hashCode + zoom.hashCode()
        hashCode = 31 * hashCode + width.hashCode()
        hashCode = 31 * hashCode + height.hashCode()
        hashCode = 31 * hashCode + caption.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("PageBlockMap")
            append("(")
            append("location=")
            append(location)
            append(", ")
            append("zoom=")
            append(zoom)
            append(", ")
            append("width=")
            append(width)
            append(", ")
            append("height=")
            append(height)
            append(", ")
            append("caption=")
            append(caption)
            append(")")
        }
    }
}
