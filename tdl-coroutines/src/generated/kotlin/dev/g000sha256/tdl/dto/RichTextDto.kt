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
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String

/**
 * This class is an abstract base class.
 * Describes a formatted text object.
 */
public sealed class RichTextDto private constructor() {
    /**
     * A plain text.
     *
     * @property text Text.
     */
    public class Plain public constructor(
        public val text: String,
    ) : RichTextDto() {
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
            other as Plain
            return other.text == text
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + text.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("RichTextDto.Plain")
                append("(")
                append("text=")
                append(text)
                append(")")
            }
        }
    }

    /**
     * A bold rich text.
     *
     * @property text Text.
     */
    public class Bold public constructor(
        public val text: RichTextDto,
    ) : RichTextDto() {
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
            other as Bold
            return other.text == text
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + text.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("RichTextDto.Bold")
                append("(")
                append("text=")
                append(text)
                append(")")
            }
        }
    }

    /**
     * An italicized rich text.
     *
     * @property text Text.
     */
    public class Italic public constructor(
        public val text: RichTextDto,
    ) : RichTextDto() {
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
            other as Italic
            return other.text == text
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + text.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("RichTextDto.Italic")
                append("(")
                append("text=")
                append(text)
                append(")")
            }
        }
    }

    /**
     * An underlined rich text.
     *
     * @property text Text.
     */
    public class Underline public constructor(
        public val text: RichTextDto,
    ) : RichTextDto() {
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
            other as Underline
            return other.text == text
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + text.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("RichTextDto.Underline")
                append("(")
                append("text=")
                append(text)
                append(")")
            }
        }
    }

    /**
     * A strikethrough rich text.
     *
     * @property text Text.
     */
    public class Strikethrough public constructor(
        public val text: RichTextDto,
    ) : RichTextDto() {
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
            other as Strikethrough
            return other.text == text
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + text.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("RichTextDto.Strikethrough")
                append("(")
                append("text=")
                append(text)
                append(")")
            }
        }
    }

    /**
     * A fixed-width rich text.
     *
     * @property text Text.
     */
    public class Fixed public constructor(
        public val text: RichTextDto,
    ) : RichTextDto() {
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
            other as Fixed
            return other.text == text
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + text.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("RichTextDto.Fixed")
                append("(")
                append("text=")
                append(text)
                append(")")
            }
        }
    }

    /**
     * A rich text URL link.
     *
     * @property text Text.
     * @property url URL.
     * @property isCached True, if the URL has cached instant view server-side.
     */
    public class Url public constructor(
        public val text: RichTextDto,
        public val url: String,
        public val isCached: Boolean,
    ) : RichTextDto() {
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
            other as Url
            if (other.text != text) {
                return false
            }
            if (other.url != url) {
                return false
            }
            return other.isCached == isCached
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + text.hashCode()
            hashCode = 31 * hashCode + url.hashCode()
            hashCode = 31 * hashCode + isCached.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("RichTextDto.Url")
                append("(")
                append("text=")
                append(text)
                append(", ")
                append("url=")
                append(url)
                append(", ")
                append("isCached=")
                append(isCached)
                append(")")
            }
        }
    }

    /**
     * A rich text email link.
     *
     * @property text Text.
     * @property emailAddress Email address.
     */
    public class EmailAddress public constructor(
        public val text: RichTextDto,
        public val emailAddress: String,
    ) : RichTextDto() {
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
            other as EmailAddress
            if (other.text != text) {
                return false
            }
            return other.emailAddress == emailAddress
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + text.hashCode()
            hashCode = 31 * hashCode + emailAddress.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("RichTextDto.EmailAddress")
                append("(")
                append("text=")
                append(text)
                append(", ")
                append("emailAddress=")
                append(emailAddress)
                append(")")
            }
        }
    }

    /**
     * A subscript rich text.
     *
     * @property text Text.
     */
    public class Subscript public constructor(
        public val text: RichTextDto,
    ) : RichTextDto() {
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
            other as Subscript
            return other.text == text
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + text.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("RichTextDto.Subscript")
                append("(")
                append("text=")
                append(text)
                append(")")
            }
        }
    }

    /**
     * A superscript rich text.
     *
     * @property text Text.
     */
    public class Superscript public constructor(
        public val text: RichTextDto,
    ) : RichTextDto() {
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
            other as Superscript
            return other.text == text
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + text.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("RichTextDto.Superscript")
                append("(")
                append("text=")
                append(text)
                append(")")
            }
        }
    }

    /**
     * A marked rich text.
     *
     * @property text Text.
     */
    public class Marked public constructor(
        public val text: RichTextDto,
    ) : RichTextDto() {
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
            other as Marked
            return other.text == text
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + text.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("RichTextDto.Marked")
                append("(")
                append("text=")
                append(text)
                append(")")
            }
        }
    }

    /**
     * A rich text phone number.
     *
     * @property text Text.
     * @property phoneNumber Phone number.
     */
    public class PhoneNumber public constructor(
        public val text: RichTextDto,
        public val phoneNumber: String,
    ) : RichTextDto() {
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
            other as PhoneNumber
            if (other.text != text) {
                return false
            }
            return other.phoneNumber == phoneNumber
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + text.hashCode()
            hashCode = 31 * hashCode + phoneNumber.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("RichTextDto.PhoneNumber")
                append("(")
                append("text=")
                append(text)
                append(", ")
                append("phoneNumber=")
                append(phoneNumber)
                append(")")
            }
        }
    }

    /**
     * A small image inside the text.
     *
     * @property document The image represented as a document. The image can be in GIF, JPEG or PNG format.
     * @property width Width of a bounding box in which the image must be shown; 0 if unknown.
     * @property height Height of a bounding box in which the image must be shown; 0 if unknown.
     */
    public class Icon public constructor(
        public val document: DocumentDto,
        public val width: Int,
        public val height: Int,
    ) : RichTextDto() {
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
            other as Icon
            if (other.document != document) {
                return false
            }
            if (other.width != width) {
                return false
            }
            return other.height == height
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + document.hashCode()
            hashCode = 31 * hashCode + width.hashCode()
            hashCode = 31 * hashCode + height.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("RichTextDto.Icon")
                append("(")
                append("document=")
                append(document)
                append(", ")
                append("width=")
                append(width)
                append(", ")
                append("height=")
                append(height)
                append(")")
            }
        }
    }

    /**
     * A reference to a richTexts object on the same page.
     *
     * @property text The text.
     * @property anchorName The name of a richTextAnchor object, which is the first element of the target richTexts object.
     * @property url An HTTP URL, opening the reference.
     */
    public class Reference public constructor(
        public val text: RichTextDto,
        public val anchorName: String,
        public val url: String,
    ) : RichTextDto() {
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
            other as Reference
            if (other.text != text) {
                return false
            }
            if (other.anchorName != anchorName) {
                return false
            }
            return other.url == url
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + text.hashCode()
            hashCode = 31 * hashCode + anchorName.hashCode()
            hashCode = 31 * hashCode + url.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("RichTextDto.Reference")
                append("(")
                append("text=")
                append(text)
                append(", ")
                append("anchorName=")
                append(anchorName)
                append(", ")
                append("url=")
                append(url)
                append(")")
            }
        }
    }

    /**
     * An anchor.
     *
     * @property name Anchor name.
     */
    public class Anchor public constructor(
        public val name: String,
    ) : RichTextDto() {
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
            other as Anchor
            return other.name == name
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + name.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("RichTextDto.Anchor")
                append("(")
                append("name=")
                append(name)
                append(")")
            }
        }
    }

    /**
     * A link to an anchor on the same page.
     *
     * @property text The link text.
     * @property anchorName The anchor name. If the name is empty, the link must bring back to top.
     * @property url An HTTP URL, opening the anchor.
     */
    public class AnchorLink public constructor(
        public val text: RichTextDto,
        public val anchorName: String,
        public val url: String,
    ) : RichTextDto() {
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
            other as AnchorLink
            if (other.text != text) {
                return false
            }
            if (other.anchorName != anchorName) {
                return false
            }
            return other.url == url
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + text.hashCode()
            hashCode = 31 * hashCode + anchorName.hashCode()
            hashCode = 31 * hashCode + url.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("RichTextDto.AnchorLink")
                append("(")
                append("text=")
                append(text)
                append(", ")
                append("anchorName=")
                append(anchorName)
                append(", ")
                append("url=")
                append(url)
                append(")")
            }
        }
    }

    /**
     * A concatenation of rich texts.
     *
     * @property texts Texts.
     */
    public class Texts public constructor(
        public val texts: Array<RichTextDto>,
    ) : RichTextDto() {
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
            other as Texts
            return other.texts.contentDeepEquals(texts)
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + texts.contentDeepHashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("RichTextDto.Texts")
                append("(")
                append("texts=")
                texts
                    .contentDeepToString()
                    .also { append(it) }
                append(")")
            }
        }
    }
}
