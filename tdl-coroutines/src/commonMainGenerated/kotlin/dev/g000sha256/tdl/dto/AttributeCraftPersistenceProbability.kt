/*
 * Copyright 2026 Georgii Ippolitov (g000sha256)
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
import kotlin.IntArray
import kotlin.String

/**
 * Describes chance of the crafted gift to have the backdrop or symbol of one of the original gifts.
 *
 * @property persistenceChancePerMille The 4 numbers that describe probability of the craft result to have the same attribute as one of the original gifts if 1, 2, 3, or 4 gifts with the attribute are used in the craft. Each number represents the number of crafted gifts with the original attribute per 1000 successful craftings.
 */
public class AttributeCraftPersistenceProbability public constructor(
    public val persistenceChancePerMille: IntArray,
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
        other as AttributeCraftPersistenceProbability
        return other.persistenceChancePerMille.contentEquals(persistenceChancePerMille)
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + persistenceChancePerMille.contentHashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("AttributeCraftPersistenceProbability")
            append("(")
            append("persistenceChancePerMille=")
            persistenceChancePerMille
                .contentToString()
                .also { append(it) }
            append(")")
        }
    }
}
