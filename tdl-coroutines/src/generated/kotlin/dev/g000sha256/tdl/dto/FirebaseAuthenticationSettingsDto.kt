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
 * Contains settings for Firebase Authentication in the official applications.
 */
public sealed class FirebaseAuthenticationSettingsDto private constructor() {
    /**
     * Settings for Firebase Authentication in the official Android application.
     */
    public class Android public constructor() : FirebaseAuthenticationSettingsDto() {
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
            return "FirebaseAuthenticationSettingsDto.Android()"
        }
    }

    /**
     * Settings for Firebase Authentication in the official iOS application.
     *
     * @property deviceToken Device token from Apple Push Notification service.
     * @property isAppSandbox True, if App Sandbox is enabled.
     */
    public class Ios public constructor(
        public val deviceToken: String,
        public val isAppSandbox: Boolean,
    ) : FirebaseAuthenticationSettingsDto() {
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
            other as Ios
            if (other.deviceToken != deviceToken) {
                return false
            }
            return other.isAppSandbox == isAppSandbox
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + deviceToken.hashCode()
            hashCode = 31 * hashCode + isAppSandbox.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("FirebaseAuthenticationSettingsDto.Ios")
                append("(")
                append("deviceToken=")
                append(deviceToken)
                append(", ")
                append("isAppSandbox=")
                append(isAppSandbox)
                append(")")
            }
        }
    }
}
