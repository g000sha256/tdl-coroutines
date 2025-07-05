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
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String

/**
 * Contains a list of advertisements to be shown while a video from a message is watched.
 *
 * @property advertisements List of advertisements.
 * @property startDelay Delay before the first advertisement is shown, in seconds.
 * @property betweenDelay Delay between consecutive advertisements, in seconds.
 */
public class VideoMessageAdvertisements public constructor(
    public val advertisements: Array<VideoMessageAdvertisement>,
    public val startDelay: Int,
    public val betweenDelay: Int,
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
        other as VideoMessageAdvertisements
        val advertisementsEquals = other.advertisements.contentDeepEquals(advertisements)
        if (!advertisementsEquals) {
            return false
        }
        if (other.startDelay != startDelay) {
            return false
        }
        return other.betweenDelay == betweenDelay
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + advertisements.contentDeepHashCode()
        hashCode = 31 * hashCode + startDelay.hashCode()
        hashCode = 31 * hashCode + betweenDelay.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("VideoMessageAdvertisements")
            append("(")
            append("advertisements=")
            advertisements
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("startDelay=")
            append(startDelay)
            append(", ")
            append("betweenDelay=")
            append(betweenDelay)
            append(")")
        }
    }
}
