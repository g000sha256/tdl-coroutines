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
 * Represents a data needed to subscribe for push notifications through registerDevice method. To use specific push notification service, the correct application platform must be specified and a valid server authentication data must be uploaded at https://my.telegram.org.
 */
public sealed class DeviceTokenDto private constructor() {
    /**
     * A token for Firebase Cloud Messaging.
     *
     * @property token Device registration token; may be empty to deregister a device.
     * @property encrypt True, if push notifications must be additionally encrypted.
     */
    public class FirebaseCloudMessaging public constructor(
        public val token: String,
        public val encrypt: Boolean,
    ) : DeviceTokenDto() {
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
            other as FirebaseCloudMessaging
            if (other.token != token) {
                return false
            }
            return other.encrypt == encrypt
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + token.hashCode()
            hashCode = 31 * hashCode + encrypt.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("DeviceTokenDto.FirebaseCloudMessaging")
                append("(")
                append("token=")
                append(token)
                append(", ")
                append("encrypt=")
                append(encrypt)
                append(")")
            }
        }
    }

    /**
     * A token for Apple Push Notification service.
     *
     * @property deviceToken Device token; may be empty to deregister a device.
     * @property isAppSandbox True, if App Sandbox is enabled.
     */
    public class ApplePush public constructor(
        public val deviceToken: String,
        public val isAppSandbox: Boolean,
    ) : DeviceTokenDto() {
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
            other as ApplePush
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
                append("DeviceTokenDto.ApplePush")
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

    /**
     * A token for Apple Push Notification service VoIP notifications.
     *
     * @property deviceToken Device token; may be empty to deregister a device.
     * @property isAppSandbox True, if App Sandbox is enabled.
     * @property encrypt True, if push notifications must be additionally encrypted.
     */
    public class ApplePushVoIP public constructor(
        public val deviceToken: String,
        public val isAppSandbox: Boolean,
        public val encrypt: Boolean,
    ) : DeviceTokenDto() {
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
            other as ApplePushVoIP
            if (other.deviceToken != deviceToken) {
                return false
            }
            if (other.isAppSandbox != isAppSandbox) {
                return false
            }
            return other.encrypt == encrypt
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + deviceToken.hashCode()
            hashCode = 31 * hashCode + isAppSandbox.hashCode()
            hashCode = 31 * hashCode + encrypt.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("DeviceTokenDto.ApplePushVoIP")
                append("(")
                append("deviceToken=")
                append(deviceToken)
                append(", ")
                append("isAppSandbox=")
                append(isAppSandbox)
                append(", ")
                append("encrypt=")
                append(encrypt)
                append(")")
            }
        }
    }

    /**
     * A token for Windows Push Notification Services.
     *
     * @property accessToken The access token that will be used to send notifications; may be empty to deregister a device.
     */
    public class WindowsPush public constructor(
        public val accessToken: String,
    ) : DeviceTokenDto() {
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
            other as WindowsPush
            return other.accessToken == accessToken
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + accessToken.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("DeviceTokenDto.WindowsPush")
                append("(")
                append("accessToken=")
                append(accessToken)
                append(")")
            }
        }
    }

    /**
     * A token for Microsoft Push Notification Service.
     *
     * @property channelUri Push notification channel URI; may be empty to deregister a device.
     */
    public class MicrosoftPush public constructor(
        public val channelUri: String,
    ) : DeviceTokenDto() {
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
            other as MicrosoftPush
            return other.channelUri == channelUri
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + channelUri.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("DeviceTokenDto.MicrosoftPush")
                append("(")
                append("channelUri=")
                append(channelUri)
                append(")")
            }
        }
    }

    /**
     * A token for Microsoft Push Notification Service VoIP channel.
     *
     * @property channelUri Push notification channel URI; may be empty to deregister a device.
     */
    public class MicrosoftPushVoIP public constructor(
        public val channelUri: String,
    ) : DeviceTokenDto() {
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
            other as MicrosoftPushVoIP
            return other.channelUri == channelUri
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + channelUri.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("DeviceTokenDto.MicrosoftPushVoIP")
                append("(")
                append("channelUri=")
                append(channelUri)
                append(")")
            }
        }
    }

    /**
     * A token for web Push API.
     *
     * @property endpoint Absolute URL exposed by the push service where the application server can send push messages; may be empty to deregister a device.
     * @property p256dhBase64url Base64url-encoded P-256 elliptic curve Diffie-Hellman public key.
     * @property authBase64url Base64url-encoded authentication secret.
     */
    public class WebPush public constructor(
        public val endpoint: String,
        public val p256dhBase64url: String,
        public val authBase64url: String,
    ) : DeviceTokenDto() {
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
            other as WebPush
            if (other.endpoint != endpoint) {
                return false
            }
            if (other.p256dhBase64url != p256dhBase64url) {
                return false
            }
            return other.authBase64url == authBase64url
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + endpoint.hashCode()
            hashCode = 31 * hashCode + p256dhBase64url.hashCode()
            hashCode = 31 * hashCode + authBase64url.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("DeviceTokenDto.WebPush")
                append("(")
                append("endpoint=")
                append(endpoint)
                append(", ")
                append("p256dhBase64url=")
                append(p256dhBase64url)
                append(", ")
                append("authBase64url=")
                append(authBase64url)
                append(")")
            }
        }
    }

    /**
     * A token for Simple Push API for Firefox OS.
     *
     * @property endpoint Absolute URL exposed by the push service where the application server can send push messages; may be empty to deregister a device.
     */
    public class SimplePush public constructor(
        public val endpoint: String,
    ) : DeviceTokenDto() {
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
            other as SimplePush
            return other.endpoint == endpoint
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + endpoint.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("DeviceTokenDto.SimplePush")
                append("(")
                append("endpoint=")
                append(endpoint)
                append(")")
            }
        }
    }

    /**
     * A token for Ubuntu Push Client service.
     *
     * @property token Token; may be empty to deregister a device.
     */
    public class UbuntuPush public constructor(
        public val token: String,
    ) : DeviceTokenDto() {
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
            other as UbuntuPush
            return other.token == token
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + token.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("DeviceTokenDto.UbuntuPush")
                append("(")
                append("token=")
                append(token)
                append(")")
            }
        }
    }

    /**
     * A token for BlackBerry Push Service.
     *
     * @property token Token; may be empty to deregister a device.
     */
    public class BlackBerryPush public constructor(
        public val token: String,
    ) : DeviceTokenDto() {
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
            other as BlackBerryPush
            return other.token == token
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + token.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("DeviceTokenDto.BlackBerryPush")
                append("(")
                append("token=")
                append(token)
                append(")")
            }
        }
    }

    /**
     * A token for Tizen Push Service.
     *
     * @property regId Push service registration identifier; may be empty to deregister a device.
     */
    public class TizenPush public constructor(
        public val regId: String,
    ) : DeviceTokenDto() {
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
            other as TizenPush
            return other.regId == regId
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + regId.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("DeviceTokenDto.TizenPush")
                append("(")
                append("regId=")
                append(regId)
                append(")")
            }
        }
    }

    /**
     * A token for HUAWEI Push Service.
     *
     * @property token Device registration token; may be empty to deregister a device.
     * @property encrypt True, if push notifications must be additionally encrypted.
     */
    public class HuaweiPush public constructor(
        public val token: String,
        public val encrypt: Boolean,
    ) : DeviceTokenDto() {
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
            other as HuaweiPush
            if (other.token != token) {
                return false
            }
            return other.encrypt == encrypt
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + token.hashCode()
            hashCode = 31 * hashCode + encrypt.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("DeviceTokenDto.HuaweiPush")
                append("(")
                append("token=")
                append(token)
                append(", ")
                append("encrypt=")
                append(encrypt)
                append(")")
            }
        }
    }
}
