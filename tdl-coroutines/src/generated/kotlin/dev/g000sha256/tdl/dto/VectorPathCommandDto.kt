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
 * This class is an abstract base class.
 * Represents a vector path command.
 */
public sealed class VectorPathCommandDto private constructor() {
    /**
     * A straight line to a given point.
     *
     * @property endPoint The end point of the straight line.
     */
    public class Line public constructor(
        public val endPoint: PointDto,
    ) : VectorPathCommandDto() {
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
            other as Line
            return other.endPoint == endPoint
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + endPoint.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("VectorPathCommandDto.Line")
                append("(")
                append("endPoint=")
                append(endPoint)
                append(")")
            }
        }
    }

    /**
     * A cubic Bézier curve to a given point.
     *
     * @property startControlPoint The start control point of the curve.
     * @property endControlPoint The end control point of the curve.
     * @property endPoint The end point of the curve.
     */
    public class CubicBezierCurve public constructor(
        public val startControlPoint: PointDto,
        public val endControlPoint: PointDto,
        public val endPoint: PointDto,
    ) : VectorPathCommandDto() {
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
            other as CubicBezierCurve
            if (other.startControlPoint != startControlPoint) {
                return false
            }
            if (other.endControlPoint != endControlPoint) {
                return false
            }
            return other.endPoint == endPoint
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + startControlPoint.hashCode()
            hashCode = 31 * hashCode + endControlPoint.hashCode()
            hashCode = 31 * hashCode + endPoint.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("VectorPathCommandDto.CubicBezierCurve")
                append("(")
                append("startControlPoint=")
                append(startControlPoint)
                append(", ")
                append("endControlPoint=")
                append(endControlPoint)
                append(", ")
                append("endPoint=")
                append(endPoint)
                append(")")
            }
        }
    }
}
