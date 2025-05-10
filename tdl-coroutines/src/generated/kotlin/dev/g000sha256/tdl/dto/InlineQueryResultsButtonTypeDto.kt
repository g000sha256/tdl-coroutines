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
 * Represents type of button in results of inline query.
 */
public sealed class InlineQueryResultsButtonTypeDto private constructor() {
    /**
     * Describes the button that opens a private chat with the bot and sends a start message to the bot with the given parameter.
     *
     * @property parameter The parameter for the bot start message.
     */
    public class StartBot public constructor(
        public val parameter: String,
    ) : InlineQueryResultsButtonTypeDto() {
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
            other as StartBot
            return other.parameter == parameter
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + parameter.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InlineQueryResultsButtonTypeDto.StartBot")
                append("(")
                append("parameter=")
                append(parameter)
                append(")")
            }
        }
    }

    /**
     * Describes the button that opens a Web App by calling getWebAppUrl.
     *
     * @property url An HTTP URL to pass to getWebAppUrl.
     */
    public class WebApp public constructor(
        public val url: String,
    ) : InlineQueryResultsButtonTypeDto() {
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
            other as WebApp
            return other.url == url
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + url.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("InlineQueryResultsButtonTypeDto.WebApp")
                append("(")
                append("url=")
                append(url)
                append(")")
            }
        }
    }
}
