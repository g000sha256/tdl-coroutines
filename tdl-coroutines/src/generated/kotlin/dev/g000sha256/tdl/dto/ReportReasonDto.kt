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
 * Describes the reason why a chat is reported.
 */
public sealed class ReportReasonDto private constructor() {
    /**
     * The chat contains spam messages.
     */
    public class Spam public constructor() : ReportReasonDto() {
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
            return "ReportReasonDto.Spam()"
        }
    }

    /**
     * The chat promotes violence.
     */
    public class Violence public constructor() : ReportReasonDto() {
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
            return "ReportReasonDto.Violence()"
        }
    }

    /**
     * The chat contains pornographic messages.
     */
    public class Pornography public constructor() : ReportReasonDto() {
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
            return "ReportReasonDto.Pornography()"
        }
    }

    /**
     * The chat has child abuse related content.
     */
    public class ChildAbuse public constructor() : ReportReasonDto() {
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
            return "ReportReasonDto.ChildAbuse()"
        }
    }

    /**
     * The chat contains copyrighted content.
     */
    public class Copyright public constructor() : ReportReasonDto() {
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
            return "ReportReasonDto.Copyright()"
        }
    }

    /**
     * The location-based chat is unrelated to its stated location.
     */
    public class UnrelatedLocation public constructor() : ReportReasonDto() {
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
            return "ReportReasonDto.UnrelatedLocation()"
        }
    }

    /**
     * The chat represents a fake account.
     */
    public class Fake public constructor() : ReportReasonDto() {
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
            return "ReportReasonDto.Fake()"
        }
    }

    /**
     * The chat has illegal drugs related content.
     */
    public class IllegalDrugs public constructor() : ReportReasonDto() {
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
            return "ReportReasonDto.IllegalDrugs()"
        }
    }

    /**
     * The chat contains messages with personal details.
     */
    public class PersonalDetails public constructor() : ReportReasonDto() {
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
            return "ReportReasonDto.PersonalDetails()"
        }
    }

    /**
     * A custom reason provided by the user.
     */
    public class Custom public constructor() : ReportReasonDto() {
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
            return "ReportReasonDto.Custom()"
        }
    }
}
