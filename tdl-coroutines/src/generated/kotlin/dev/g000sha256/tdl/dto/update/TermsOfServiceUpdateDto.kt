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

package dev.g000sha256.tdl.dto.update

import dev.g000sha256.tdl.dto.TermsOfServiceDto
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.String

/**
 * New terms of service must be accepted by the user. If the terms of service are declined, then the deleteAccount method must be called with the reason &quot;Decline ToS update&quot;.
 *
 * @property termsOfServiceId Identifier of the terms of service.
 * @property termsOfService The new terms of service.
 */
public class TermsOfServiceUpdateDto public constructor(
    public val termsOfServiceId: String,
    public val termsOfService: TermsOfServiceDto,
) : UpdateDto() {
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
        other as TermsOfServiceUpdateDto
        if (other.termsOfServiceId != termsOfServiceId) {
            return false
        }
        return other.termsOfService == termsOfService
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + termsOfServiceId.hashCode()
        hashCode = 31 * hashCode + termsOfService.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("TermsOfServiceUpdateDto")
            append("(")
            append("termsOfServiceId=")
            append(termsOfServiceId)
            append(", ")
            append("termsOfService=")
            append(termsOfService)
            append(")")
        }
    }
}
