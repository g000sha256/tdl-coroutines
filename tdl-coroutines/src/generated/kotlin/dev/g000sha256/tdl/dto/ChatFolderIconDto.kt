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
 * Represents an icon for a chat folder.
 *
 * @property name The chosen icon name for short folder representation; one of &quot;All&quot;, &quot;Unread&quot;, &quot;Unmuted&quot;, &quot;Bots&quot;, &quot;Channels&quot;, &quot;Groups&quot;, &quot;Private&quot;, &quot;Custom&quot;, &quot;Setup&quot;, &quot;Cat&quot;, &quot;Crown&quot;, &quot;Favorite&quot;, &quot;Flower&quot;, &quot;Game&quot;, &quot;Home&quot;, &quot;Love&quot;, &quot;Mask&quot;, &quot;Party&quot;, &quot;Sport&quot;, &quot;Study&quot;, &quot;Trade&quot;, &quot;Travel&quot;, &quot;Work&quot;, &quot;Airplane&quot;, &quot;Book&quot;, &quot;Light&quot;, &quot;Like&quot;, &quot;Money&quot;, &quot;Note&quot;, &quot;Palette&quot;.
 */
public class ChatFolderIconDto public constructor(
    public val name: String,
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
        other as ChatFolderIconDto
        return other.name == name
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + name.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("ChatFolderIconDto")
            append("(")
            append("name=")
            append(name)
            append(")")
        }
    }
}
