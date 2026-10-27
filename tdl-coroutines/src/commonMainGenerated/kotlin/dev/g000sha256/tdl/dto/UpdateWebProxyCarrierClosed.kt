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
import kotlin.String

/**
 * A web proxy carrier must be closed. If the page has passed any message to the bridge object, then the application must deliver the string {&quot;t&quot;:&quot;close&quot;} to the page, so that it can end its relay session, and destroy the web view shortly after, for example, in 200 milliseconds; otherwise, the web view must be destroyed immediately. Messages from the carrier received after this update must be ignored.
 *
 * @property carrierId Identifier of the carrier.
 */
public class UpdateWebProxyCarrierClosed public constructor(
    public val carrierId: Int,
) : Update() {
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
        other as UpdateWebProxyCarrierClosed
        return other.carrierId == carrierId
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + carrierId.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("UpdateWebProxyCarrierClosed")
            append("(")
            append("carrierId=")
            append(carrierId)
            append(")")
        }
    }
}
