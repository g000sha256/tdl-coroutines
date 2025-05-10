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
 * Describes format of a thumbnail.
 */
public sealed class ThumbnailFormatDto private constructor() {
    /**
     * The thumbnail is in JPEG format.
     */
    public class Jpeg public constructor() : ThumbnailFormatDto() {
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
            return "ThumbnailFormatDto.Jpeg()"
        }
    }

    /**
     * The thumbnail is in static GIF format. It will be used only for some bot inline query results.
     */
    public class Gif public constructor() : ThumbnailFormatDto() {
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
            return "ThumbnailFormatDto.Gif()"
        }
    }

    /**
     * The thumbnail is in MPEG4 format. It will be used only for some animations and videos.
     */
    public class Mpeg4 public constructor() : ThumbnailFormatDto() {
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
            return "ThumbnailFormatDto.Mpeg4()"
        }
    }

    /**
     * The thumbnail is in PNG format. It will be used only for background patterns.
     */
    public class Png public constructor() : ThumbnailFormatDto() {
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
            return "ThumbnailFormatDto.Png()"
        }
    }

    /**
     * The thumbnail is in TGS format. It will be used only for sticker sets.
     */
    public class Tgs public constructor() : ThumbnailFormatDto() {
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
            return "ThumbnailFormatDto.Tgs()"
        }
    }

    /**
     * The thumbnail is in WEBM format. It will be used only for sticker sets.
     */
    public class Webm public constructor() : ThumbnailFormatDto() {
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
            return "ThumbnailFormatDto.Webm()"
        }
    }

    /**
     * The thumbnail is in WEBP format. It will be used only for some stickers and sticker sets.
     */
    public class Webp public constructor() : ThumbnailFormatDto() {
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
            return "ThumbnailFormatDto.Webp()"
        }
    }
}
