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
 * Download or upload file speed for the user was limited, but it can be restored by subscription to Telegram Premium. The notification can be postponed until a being downloaded or uploaded file is visible to the user. Use getOption(&quot;premium_download_speedup&quot;) or getOption(&quot;premium_upload_speedup&quot;) to get expected speedup after subscription to Telegram Premium.
 *
 * @property isUpload True, if upload speed was limited; false, if download speed was limited.
 */
public class UpdateSpeedLimitNotification public constructor(
    public val isUpload: Boolean,
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
        other as UpdateSpeedLimitNotification
        return other.isUpload == isUpload
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + isUpload.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("UpdateSpeedLimitNotification")
            append("(")
            append("isUpload=")
            append(isUpload)
            append(")")
        }
    }
}
