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
 * Describes the exact type of problem with a call.
 */
public sealed class CallProblemDto private constructor() {
    /**
     * The user heard their own voice.
     */
    public class Echo public constructor() : CallProblemDto() {
        override fun equals(other: Any?): Boolean {
            if (other === this) {
                return true
            }
            if (other == null) {
                return false
            }
            return this::class == other::class
        }

        override fun hashCode(): Int {
            return this::class.hashCode()
        }

        override fun toString(): String {
            return "CallProblemDto.Echo()"
        }
    }

    /**
     * The user heard background noise.
     */
    public class Noise public constructor() : CallProblemDto() {
        override fun equals(other: Any?): Boolean {
            if (other === this) {
                return true
            }
            if (other == null) {
                return false
            }
            return this::class == other::class
        }

        override fun hashCode(): Int {
            return this::class.hashCode()
        }

        override fun toString(): String {
            return "CallProblemDto.Noise()"
        }
    }

    /**
     * The other side kept disappearing.
     */
    public class Interruptions public constructor() : CallProblemDto() {
        override fun equals(other: Any?): Boolean {
            if (other === this) {
                return true
            }
            if (other == null) {
                return false
            }
            return this::class == other::class
        }

        override fun hashCode(): Int {
            return this::class.hashCode()
        }

        override fun toString(): String {
            return "CallProblemDto.Interruptions()"
        }
    }

    /**
     * The speech was distorted.
     */
    public class DistortedSpeech public constructor() : CallProblemDto() {
        override fun equals(other: Any?): Boolean {
            if (other === this) {
                return true
            }
            if (other == null) {
                return false
            }
            return this::class == other::class
        }

        override fun hashCode(): Int {
            return this::class.hashCode()
        }

        override fun toString(): String {
            return "CallProblemDto.DistortedSpeech()"
        }
    }

    /**
     * The user couldn't hear the other side.
     */
    public class SilentLocal public constructor() : CallProblemDto() {
        override fun equals(other: Any?): Boolean {
            if (other === this) {
                return true
            }
            if (other == null) {
                return false
            }
            return this::class == other::class
        }

        override fun hashCode(): Int {
            return this::class.hashCode()
        }

        override fun toString(): String {
            return "CallProblemDto.SilentLocal()"
        }
    }

    /**
     * The other side couldn't hear the user.
     */
    public class SilentRemote public constructor() : CallProblemDto() {
        override fun equals(other: Any?): Boolean {
            if (other === this) {
                return true
            }
            if (other == null) {
                return false
            }
            return this::class == other::class
        }

        override fun hashCode(): Int {
            return this::class.hashCode()
        }

        override fun toString(): String {
            return "CallProblemDto.SilentRemote()"
        }
    }

    /**
     * The call ended unexpectedly.
     */
    public class Dropped public constructor() : CallProblemDto() {
        override fun equals(other: Any?): Boolean {
            if (other === this) {
                return true
            }
            if (other == null) {
                return false
            }
            return this::class == other::class
        }

        override fun hashCode(): Int {
            return this::class.hashCode()
        }

        override fun toString(): String {
            return "CallProblemDto.Dropped()"
        }
    }

    /**
     * The video was distorted.
     */
    public class DistortedVideo public constructor() : CallProblemDto() {
        override fun equals(other: Any?): Boolean {
            if (other === this) {
                return true
            }
            if (other == null) {
                return false
            }
            return this::class == other::class
        }

        override fun hashCode(): Int {
            return this::class.hashCode()
        }

        override fun toString(): String {
            return "CallProblemDto.DistortedVideo()"
        }
    }

    /**
     * The video was pixelated.
     */
    public class PixelatedVideo public constructor() : CallProblemDto() {
        override fun equals(other: Any?): Boolean {
            if (other === this) {
                return true
            }
            if (other == null) {
                return false
            }
            return this::class == other::class
        }

        override fun hashCode(): Int {
            return this::class.hashCode()
        }

        override fun toString(): String {
            return "CallProblemDto.PixelatedVideo()"
        }
    }
}
