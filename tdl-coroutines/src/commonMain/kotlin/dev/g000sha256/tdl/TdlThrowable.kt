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

package dev.g000sha256.tdl

/**
 * Exception type representing an error response from TDLib, intended for use with [Result].
 *
 * @property code The error code.
 * @property message A human-readable error message.
 *
 * @see TdlResult
 * @see toResult
 */
public class TdlThrowable internal constructor(
    public val code: Int,
    override val message: String,
) : Throwable(message = message)
