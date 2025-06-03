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
import kotlin.Long
import kotlin.String

/**
 * Contains information about one session in a Telegram application used by the current user. Sessions must be shown to the user in the returned order.
 *
 * @property id Session identifier.
 * @property isCurrent True, if this session is the current session.
 * @property isPasswordPending True, if a 2-step verification password is needed to complete authorization of the session.
 * @property isUnconfirmed True, if the session wasn't confirmed from another session.
 * @property canAcceptSecretChats True, if incoming secret chats can be accepted by the session.
 * @property canAcceptCalls True, if incoming calls can be accepted by the session.
 * @property type Session type based on the system and application version, which can be used to display a corresponding icon.
 * @property apiId Telegram API identifier, as provided by the application.
 * @property applicationName Name of the application, as provided by the application.
 * @property applicationVersion The version of the application, as provided by the application.
 * @property isOfficialApplication True, if the application is an official application or uses the apiId of an official application.
 * @property deviceModel Model of the device the application has been run or is running on, as provided by the application.
 * @property platform Operating system the application has been run or is running on, as provided by the application.
 * @property systemVersion Version of the operating system the application has been run or is running on, as provided by the application.
 * @property logInDate Point in time (Unix timestamp) when the user has logged in.
 * @property lastActiveDate Point in time (Unix timestamp) when the session was last used.
 * @property ipAddress IP address from which the session was created, in human-readable format.
 * @property location A human-readable description of the location from which the session was created, based on the IP address.
 */
public class Session public constructor(
    public val id: Long,
    public val isCurrent: Boolean,
    public val isPasswordPending: Boolean,
    public val isUnconfirmed: Boolean,
    public val canAcceptSecretChats: Boolean,
    public val canAcceptCalls: Boolean,
    public val type: SessionType,
    public val apiId: Int,
    public val applicationName: String,
    public val applicationVersion: String,
    public val isOfficialApplication: Boolean,
    public val deviceModel: String,
    public val platform: String,
    public val systemVersion: String,
    public val logInDate: Int,
    public val lastActiveDate: Int,
    public val ipAddress: String,
    public val location: String,
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
        other as Session
        if (other.id != id) {
            return false
        }
        if (other.isCurrent != isCurrent) {
            return false
        }
        if (other.isPasswordPending != isPasswordPending) {
            return false
        }
        if (other.isUnconfirmed != isUnconfirmed) {
            return false
        }
        if (other.canAcceptSecretChats != canAcceptSecretChats) {
            return false
        }
        if (other.canAcceptCalls != canAcceptCalls) {
            return false
        }
        if (other.type != type) {
            return false
        }
        if (other.apiId != apiId) {
            return false
        }
        if (other.applicationName != applicationName) {
            return false
        }
        if (other.applicationVersion != applicationVersion) {
            return false
        }
        if (other.isOfficialApplication != isOfficialApplication) {
            return false
        }
        if (other.deviceModel != deviceModel) {
            return false
        }
        if (other.platform != platform) {
            return false
        }
        if (other.systemVersion != systemVersion) {
            return false
        }
        if (other.logInDate != logInDate) {
            return false
        }
        if (other.lastActiveDate != lastActiveDate) {
            return false
        }
        if (other.ipAddress != ipAddress) {
            return false
        }
        return other.location == location
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + id.hashCode()
        hashCode = 31 * hashCode + isCurrent.hashCode()
        hashCode = 31 * hashCode + isPasswordPending.hashCode()
        hashCode = 31 * hashCode + isUnconfirmed.hashCode()
        hashCode = 31 * hashCode + canAcceptSecretChats.hashCode()
        hashCode = 31 * hashCode + canAcceptCalls.hashCode()
        hashCode = 31 * hashCode + type.hashCode()
        hashCode = 31 * hashCode + apiId.hashCode()
        hashCode = 31 * hashCode + applicationName.hashCode()
        hashCode = 31 * hashCode + applicationVersion.hashCode()
        hashCode = 31 * hashCode + isOfficialApplication.hashCode()
        hashCode = 31 * hashCode + deviceModel.hashCode()
        hashCode = 31 * hashCode + platform.hashCode()
        hashCode = 31 * hashCode + systemVersion.hashCode()
        hashCode = 31 * hashCode + logInDate.hashCode()
        hashCode = 31 * hashCode + lastActiveDate.hashCode()
        hashCode = 31 * hashCode + ipAddress.hashCode()
        hashCode = 31 * hashCode + location.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("Session")
            append("(")
            append("id=")
            append(id)
            append(", ")
            append("isCurrent=")
            append(isCurrent)
            append(", ")
            append("isPasswordPending=")
            append(isPasswordPending)
            append(", ")
            append("isUnconfirmed=")
            append(isUnconfirmed)
            append(", ")
            append("canAcceptSecretChats=")
            append(canAcceptSecretChats)
            append(", ")
            append("canAcceptCalls=")
            append(canAcceptCalls)
            append(", ")
            append("type=")
            append(type)
            append(", ")
            append("apiId=")
            append(apiId)
            append(", ")
            append("applicationName=")
            append(applicationName)
            append(", ")
            append("applicationVersion=")
            append(applicationVersion)
            append(", ")
            append("isOfficialApplication=")
            append(isOfficialApplication)
            append(", ")
            append("deviceModel=")
            append(deviceModel)
            append(", ")
            append("platform=")
            append(platform)
            append(", ")
            append("systemVersion=")
            append(systemVersion)
            append(", ")
            append("logInDate=")
            append(logInDate)
            append(", ")
            append("lastActiveDate=")
            append(lastActiveDate)
            append(", ")
            append("ipAddress=")
            append(ipAddress)
            append(", ")
            append("location=")
            append(location)
            append(")")
        }
    }
}
