/*
 * Copyright 2026 Georgii Ippolitov (g000sha256)
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
 * A rich message to send. Total length of all texts, including custom emoji alternative text and formula source, must not exceed getOption(&quot;rich_message_text_length_max&quot;). The total number of all blocks, list items and table rows must not exceed getOption(&quot;rich_message_block_count_max&quot;). The maximum allowed depth of nested blocks and rich texts is getOption(&quot;rich_message_depth_max&quot;). The total number of media in all blocks must not exceed getOption(&quot;rich_message_media_count_max&quot;). The maximum allowed number of table columns is getOption(&quot;rich_message_table_column_count_max&quot;).
 *
 * @property source Source of the rich message.
 * @property isRtl Pass true if the message must be shown from right to left.
 * @property detectAutomaticBlocks Pass true to enable detection of URLs, email addresses and other automatic blocks.
 */
public class InputRichMessage public constructor(
    public val source: RichMessageSource,
    public val isRtl: Boolean,
    public val detectAutomaticBlocks: Boolean,
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
        other as InputRichMessage
        if (other.source != source) {
            return false
        }
        if (other.isRtl != isRtl) {
            return false
        }
        return other.detectAutomaticBlocks == detectAutomaticBlocks
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + source.hashCode()
        hashCode = 31 * hashCode + isRtl.hashCode()
        hashCode = 31 * hashCode + detectAutomaticBlocks.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InputRichMessage")
            append("(")
            append("source=")
            append(source)
            append(", ")
            append("isRtl=")
            append(isRtl)
            append(", ")
            append("detectAutomaticBlocks=")
            append(detectAutomaticBlocks)
            append(")")
        }
    }
}
