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
 * Information about the sponsor of an advertisement.
 *
 * @property url URL of the sponsor to be opened when the advertisement is clicked.
 * @property photo Photo of the sponsor; may be null if must not be shown.
 * @property info Additional optional information about the sponsor to be shown along with the advertisement.
 */
public class AdvertisementSponsor public constructor(
    public val url: String,
    public val photo: Photo?,
    public val info: String,
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
        other as AdvertisementSponsor
        if (other.url != url) {
            return false
        }
        if (other.photo != photo) {
            return false
        }
        return other.info == info
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + url.hashCode()
        hashCode = 31 * hashCode + photo.hashCode()
        hashCode = 31 * hashCode + info.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("AdvertisementSponsor")
            append("(")
            append("url=")
            append(url)
            append(", ")
            append("photo=")
            append(photo)
            append(", ")
            append("info=")
            append(info)
            append(")")
        }
    }
}
