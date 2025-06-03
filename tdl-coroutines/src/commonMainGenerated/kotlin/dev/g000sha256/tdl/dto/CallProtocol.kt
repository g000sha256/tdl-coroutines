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
 * Specifies the supported call protocols.
 *
 * @property udpP2p True, if UDP peer-to-peer connections are supported.
 * @property udpReflector True, if connection through UDP reflectors is supported.
 * @property minLayer The minimum supported API layer; use 65.
 * @property maxLayer The maximum supported API layer; use 92.
 * @property libraryVersions List of supported tgcalls versions.
 */
public class CallProtocol public constructor(
    public val udpP2p: Boolean,
    public val udpReflector: Boolean,
    public val minLayer: Int,
    public val maxLayer: Int,
    public val libraryVersions: Array<String>,
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
        other as CallProtocol
        if (other.udpP2p != udpP2p) {
            return false
        }
        if (other.udpReflector != udpReflector) {
            return false
        }
        if (other.minLayer != minLayer) {
            return false
        }
        if (other.maxLayer != maxLayer) {
            return false
        }
        return other.libraryVersions.contentDeepEquals(libraryVersions)
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + udpP2p.hashCode()
        hashCode = 31 * hashCode + udpReflector.hashCode()
        hashCode = 31 * hashCode + minLayer.hashCode()
        hashCode = 31 * hashCode + maxLayer.hashCode()
        hashCode = 31 * hashCode + libraryVersions.contentDeepHashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("CallProtocol")
            append("(")
            append("udpP2p=")
            append(udpP2p)
            append(", ")
            append("udpReflector=")
            append(udpReflector)
            append(", ")
            append("minLayer=")
            append(minLayer)
            append(", ")
            append("maxLayer=")
            append(maxLayer)
            append(", ")
            append("libraryVersions=")
            libraryVersions
                .contentDeepToString()
                .also { append(it) }
            append(")")
        }
    }
}
