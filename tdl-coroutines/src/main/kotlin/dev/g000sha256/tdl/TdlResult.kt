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
 * Represents a response from TDLib, which is either [Failure] or [Success].
 */
public sealed class TdlResult<out T> private constructor() {

    /**
     * Represents an error response from TDLib.
     *
     * @property code The error code.
     * @property message A human-readable error message.
     */
    public class Failure internal constructor(public val code: Int, public val message: String) : TdlResult<Nothing>()

    /**
     * Represents a successful response from TDLib.
     *
     * @property result The resulting value on success.
     */
    public class Success<T> internal constructor(public val result: T) : TdlResult<T>()

}