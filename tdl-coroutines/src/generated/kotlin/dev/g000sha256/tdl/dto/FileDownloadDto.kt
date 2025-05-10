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
 * Describes a file added to file download list.
 *
 * @property fileId File identifier.
 * @property message The message with the file.
 * @property addDate Point in time (Unix timestamp) when the file was added to the download list.
 * @property completeDate Point in time (Unix timestamp) when the file downloading was completed; 0 if the file downloading isn't completed.
 * @property isPaused True, if downloading of the file is paused.
 */
public class FileDownloadDto public constructor(
    public val fileId: Int,
    public val message: MessageDto,
    public val addDate: Int,
    public val completeDate: Int,
    public val isPaused: Boolean,
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
        other as FileDownloadDto
        if (other.fileId != fileId) {
            return false
        }
        if (other.message != message) {
            return false
        }
        if (other.addDate != addDate) {
            return false
        }
        if (other.completeDate != completeDate) {
            return false
        }
        return other.isPaused == isPaused
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + fileId.hashCode()
        hashCode = 31 * hashCode + message.hashCode()
        hashCode = 31 * hashCode + addDate.hashCode()
        hashCode = 31 * hashCode + completeDate.hashCode()
        hashCode = 31 * hashCode + isPaused.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("FileDownloadDto")
            append("(")
            append("fileId=")
            append(fileId)
            append(", ")
            append("message=")
            append(message)
            append(", ")
            append("addDate=")
            append(addDate)
            append(", ")
            append("completeDate=")
            append(completeDate)
            append(", ")
            append("isPaused=")
            append(isPaused)
            append(")")
        }
    }
}
