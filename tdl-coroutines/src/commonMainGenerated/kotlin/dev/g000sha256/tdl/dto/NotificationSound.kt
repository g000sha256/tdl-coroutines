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
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Describes a notification sound in MP3 format.
 *
 * @property id Unique identifier of the notification sound.
 * @property duration Duration of the sound, in seconds.
 * @property date Point in time (Unix timestamp) when the sound was created.
 * @property title Title of the notification sound.
 * @property data Arbitrary data, defined while the sound was uploaded.
 * @property sound File containing the sound.
 */
@SerialName(value = "notificationSound")
@Serializable
public class NotificationSound public constructor(
    @SerialName(value = "id")
    public val id: Long,
    @SerialName(value = "duration")
    public val duration: Int,
    @SerialName(value = "date")
    public val date: Int,
    @SerialName(value = "title")
    public val title: String,
    @SerialName(value = "data")
    public val data: String,
    @SerialName(value = "sound")
    public val sound: File,
) : Model() {
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
        other as NotificationSound
        if (other.id != id) {
            return false
        }
        if (other.duration != duration) {
            return false
        }
        if (other.date != date) {
            return false
        }
        if (other.title != title) {
            return false
        }
        if (other.data != data) {
            return false
        }
        return other.sound == sound
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + id.hashCode()
        hashCode = 31 * hashCode + duration.hashCode()
        hashCode = 31 * hashCode + date.hashCode()
        hashCode = 31 * hashCode + title.hashCode()
        hashCode = 31 * hashCode + data.hashCode()
        hashCode = 31 * hashCode + sound.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("NotificationSound")
            append("(")
            append("id=")
            append(id)
            append(", ")
            append("duration=")
            append(duration)
            append(", ")
            append("date=")
            append(date)
            append(", ")
            append("title=")
            append(title)
            append(", ")
            append("data=")
            append(data)
            append(", ")
            append("sound=")
            append(sound)
            append(")")
        }
    }
}
