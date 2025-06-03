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
 * A graph data.
 *
 * @property jsonData Graph data in JSON format.
 * @property zoomToken If non-empty, a token which can be used to receive a zoomed in graph.
 */
public class StatisticalGraphData public constructor(
    public val jsonData: String,
    public val zoomToken: String,
) : StatisticalGraph() {
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
        other as StatisticalGraphData
        if (other.jsonData != jsonData) {
            return false
        }
        return other.zoomToken == zoomToken
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + jsonData.hashCode()
        hashCode = 31 * hashCode + zoomToken.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("StatisticalGraphData")
            append("(")
            append("jsonData=")
            append(jsonData)
            append(", ")
            append("zoomToken=")
            append(zoomToken)
            append(")")
        }
    }
}
