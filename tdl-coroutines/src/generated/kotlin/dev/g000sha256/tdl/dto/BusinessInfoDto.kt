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
 * Contains information about a Telegram Business account.
 *
 * @property location Location of the business; may be null if none.
 * @property openingHours Opening hours of the business; may be null if none. The hours are guaranteed to be valid and has already been split by week days.
 * @property localOpeningHours Opening hours of the business in the local time; may be null if none. The hours are guaranteed to be valid and has already been split by week days. Local time zone identifier will be empty. An updateUserFullInfo update is not triggered when value of this field changes.
 * @property nextOpenIn Time left before the business will open the next time, in seconds; 0 if unknown. An updateUserFullInfo update is not triggered when value of this field changes.
 * @property nextCloseIn Time left before the business will close the next time, in seconds; 0 if unknown. An updateUserFullInfo update is not triggered when value of this field changes.
 * @property greetingMessageSettings The greeting message; may be null if none or the Business account is not of the current user.
 * @property awayMessageSettings The away message; may be null if none or the Business account is not of the current user.
 * @property startPage Information about start page of the account; may be null if none.
 */
public class BusinessInfoDto public constructor(
    public val location: BusinessLocationDto?,
    public val openingHours: BusinessOpeningHoursDto?,
    public val localOpeningHours: BusinessOpeningHoursDto?,
    public val nextOpenIn: Int,
    public val nextCloseIn: Int,
    public val greetingMessageSettings: BusinessGreetingMessageSettingsDto?,
    public val awayMessageSettings: BusinessAwayMessageSettingsDto?,
    public val startPage: BusinessStartPageDto?,
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
        other as BusinessInfoDto
        if (other.location != location) {
            return false
        }
        if (other.openingHours != openingHours) {
            return false
        }
        if (other.localOpeningHours != localOpeningHours) {
            return false
        }
        if (other.nextOpenIn != nextOpenIn) {
            return false
        }
        if (other.nextCloseIn != nextCloseIn) {
            return false
        }
        if (other.greetingMessageSettings != greetingMessageSettings) {
            return false
        }
        if (other.awayMessageSettings != awayMessageSettings) {
            return false
        }
        return other.startPage == startPage
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + location.hashCode()
        hashCode = 31 * hashCode + openingHours.hashCode()
        hashCode = 31 * hashCode + localOpeningHours.hashCode()
        hashCode = 31 * hashCode + nextOpenIn.hashCode()
        hashCode = 31 * hashCode + nextCloseIn.hashCode()
        hashCode = 31 * hashCode + greetingMessageSettings.hashCode()
        hashCode = 31 * hashCode + awayMessageSettings.hashCode()
        hashCode = 31 * hashCode + startPage.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("BusinessInfoDto")
            append("(")
            append("location=")
            append(location)
            append(", ")
            append("openingHours=")
            append(openingHours)
            append(", ")
            append("localOpeningHours=")
            append(localOpeningHours)
            append(", ")
            append("nextOpenIn=")
            append(nextOpenIn)
            append(", ")
            append("nextCloseIn=")
            append(nextCloseIn)
            append(", ")
            append("greetingMessageSettings=")
            append(greetingMessageSettings)
            append(", ")
            append("awayMessageSettings=")
            append(awayMessageSettings)
            append(", ")
            append("startPage=")
            append(startPage)
            append(")")
        }
    }
}
