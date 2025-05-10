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
 * Contains information about a Web App found by its short name.
 *
 * @property webApp The Web App.
 * @property requestWriteAccess True, if the user must be asked for the permission to the bot to send them messages.
 * @property skipConfirmation True, if there is no need to show an ordinary open URL confirmation before opening the Web App. The field must be ignored and confirmation must be shown anyway if the Web App link was hidden.
 */
public class FoundWebAppDto public constructor(
    public val webApp: WebAppDto,
    public val requestWriteAccess: Boolean,
    public val skipConfirmation: Boolean,
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
        other as FoundWebAppDto
        if (other.webApp != webApp) {
            return false
        }
        if (other.requestWriteAccess != requestWriteAccess) {
            return false
        }
        return other.skipConfirmation == skipConfirmation
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + webApp.hashCode()
        hashCode = 31 * hashCode + requestWriteAccess.hashCode()
        hashCode = 31 * hashCode + skipConfirmation.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("FoundWebAppDto")
            append("(")
            append("webApp=")
            append(webApp)
            append(", ")
            append("requestWriteAccess=")
            append(requestWriteAccess)
            append(", ")
            append("skipConfirmation=")
            append(skipConfirmation)
            append(")")
        }
    }
}
