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
 * Contains approximate storage usage statistics, excluding files of unknown file type.
 *
 * @property filesSize Approximate total size of files, in bytes.
 * @property fileCount Approximate number of files.
 * @property databaseSize Size of the database.
 * @property languagePackDatabaseSize Size of the language pack database.
 * @property logSize Size of the TDLib internal log.
 */
public class StorageStatisticsFastDto public constructor(
    public val filesSize: Long,
    public val fileCount: Int,
    public val databaseSize: Long,
    public val languagePackDatabaseSize: Long,
    public val logSize: Long,
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
        other as StorageStatisticsFastDto
        if (other.filesSize != filesSize) {
            return false
        }
        if (other.fileCount != fileCount) {
            return false
        }
        if (other.databaseSize != databaseSize) {
            return false
        }
        if (other.languagePackDatabaseSize != languagePackDatabaseSize) {
            return false
        }
        return other.logSize == logSize
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + filesSize.hashCode()
        hashCode = 31 * hashCode + fileCount.hashCode()
        hashCode = 31 * hashCode + databaseSize.hashCode()
        hashCode = 31 * hashCode + languagePackDatabaseSize.hashCode()
        hashCode = 31 * hashCode + logSize.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("StorageStatisticsFastDto")
            append("(")
            append("filesSize=")
            append(filesSize)
            append(", ")
            append("fileCount=")
            append(fileCount)
            append(", ")
            append("databaseSize=")
            append(databaseSize)
            append(", ")
            append("languagePackDatabaseSize=")
            append(languagePackDatabaseSize)
            append(", ")
            append("logSize=")
            append(logSize)
            append(")")
        }
    }
}
