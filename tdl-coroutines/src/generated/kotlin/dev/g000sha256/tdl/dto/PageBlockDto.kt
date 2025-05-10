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
 * Describes a block of an instant view for a web page.
 */
public sealed class PageBlockDto private constructor() {
    /**
     * The title of a page.
     *
     * @property title Title.
     */
    public class Title public constructor(
        public val title: RichTextDto,
    ) : PageBlockDto() {
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
            other as Title
            return other.title == title
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + title.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PageBlockDto.Title")
                append("(")
                append("title=")
                append(title)
                append(")")
            }
        }
    }

    /**
     * The subtitle of a page.
     *
     * @property subtitle Subtitle.
     */
    public class Subtitle public constructor(
        public val subtitle: RichTextDto,
    ) : PageBlockDto() {
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
            other as Subtitle
            return other.subtitle == subtitle
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + subtitle.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PageBlockDto.Subtitle")
                append("(")
                append("subtitle=")
                append(subtitle)
                append(")")
            }
        }
    }

    /**
     * The author and publishing date of a page.
     *
     * @property author Author.
     * @property publishDate Point in time (Unix timestamp) when the article was published; 0 if unknown.
     */
    public class AuthorDate public constructor(
        public val author: RichTextDto,
        public val publishDate: Int,
    ) : PageBlockDto() {
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
            other as AuthorDate
            if (other.author != author) {
                return false
            }
            return other.publishDate == publishDate
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + author.hashCode()
            hashCode = 31 * hashCode + publishDate.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PageBlockDto.AuthorDate")
                append("(")
                append("author=")
                append(author)
                append(", ")
                append("publishDate=")
                append(publishDate)
                append(")")
            }
        }
    }

    /**
     * A header.
     *
     * @property header Header.
     */
    public class Header public constructor(
        public val header: RichTextDto,
    ) : PageBlockDto() {
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
            other as Header
            return other.header == header
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + header.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PageBlockDto.Header")
                append("(")
                append("header=")
                append(header)
                append(")")
            }
        }
    }

    /**
     * A subheader.
     *
     * @property subheader Subheader.
     */
    public class Subheader public constructor(
        public val subheader: RichTextDto,
    ) : PageBlockDto() {
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
            other as Subheader
            return other.subheader == subheader
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + subheader.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PageBlockDto.Subheader")
                append("(")
                append("subheader=")
                append(subheader)
                append(")")
            }
        }
    }

    /**
     * A kicker.
     *
     * @property kicker Kicker.
     */
    public class Kicker public constructor(
        public val kicker: RichTextDto,
    ) : PageBlockDto() {
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
            other as Kicker
            return other.kicker == kicker
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + kicker.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PageBlockDto.Kicker")
                append("(")
                append("kicker=")
                append(kicker)
                append(")")
            }
        }
    }

    /**
     * A text paragraph.
     *
     * @property text Paragraph text.
     */
    public class Paragraph public constructor(
        public val text: RichTextDto,
    ) : PageBlockDto() {
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
            other as Paragraph
            return other.text == text
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + text.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PageBlockDto.Paragraph")
                append("(")
                append("text=")
                append(text)
                append(")")
            }
        }
    }

    /**
     * A preformatted text paragraph.
     *
     * @property text Paragraph text.
     * @property language Programming language for which the text needs to be formatted.
     */
    public class Preformatted public constructor(
        public val text: RichTextDto,
        public val language: String,
    ) : PageBlockDto() {
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
            other as Preformatted
            if (other.text != text) {
                return false
            }
            return other.language == language
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + text.hashCode()
            hashCode = 31 * hashCode + language.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PageBlockDto.Preformatted")
                append("(")
                append("text=")
                append(text)
                append(", ")
                append("language=")
                append(language)
                append(")")
            }
        }
    }

    /**
     * The footer of a page.
     *
     * @property footer Footer.
     */
    public class Footer public constructor(
        public val footer: RichTextDto,
    ) : PageBlockDto() {
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
            other as Footer
            return other.footer == footer
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + footer.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PageBlockDto.Footer")
                append("(")
                append("footer=")
                append(footer)
                append(")")
            }
        }
    }

    /**
     * An empty block separating a page.
     */
    public class Divider public constructor() : PageBlockDto() {
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
            return "PageBlockDto.Divider()"
        }
    }

    /**
     * An invisible anchor on a page, which can be used in a URL to open the page from the specified anchor.
     *
     * @property name Name of the anchor.
     */
    public class Anchor public constructor(
        public val name: String,
    ) : PageBlockDto() {
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
                append("PageBlockDto.Anchor")
                append("(")
                append("name=")
                append(name)
                append(")")
            }
        }
    }

    /**
     * A list of data blocks.
     *
     * @property items The items of the list.
     */
    public class List public constructor(
        public val items: Array<PageBlockListItemDto>,
    ) : PageBlockDto() {
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
            other as List
            return other.items.contentDeepEquals(items)
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + items.contentDeepHashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PageBlockDto.List")
                append("(")
                append("items=")
                items
                    .contentDeepToString()
                    .also { append(it) }
                append(")")
            }
        }
    }

    /**
     * A block quote.
     *
     * @property text Quote text.
     * @property credit Quote credit.
     */
    public class BlockQuote public constructor(
        public val text: RichTextDto,
        public val credit: RichTextDto,
    ) : PageBlockDto() {
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
            other as BlockQuote
            if (other.text != text) {
                return false
            }
            return other.credit == credit
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + text.hashCode()
            hashCode = 31 * hashCode + credit.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PageBlockDto.BlockQuote")
                append("(")
                append("text=")
                append(text)
                append(", ")
                append("credit=")
                append(credit)
                append(")")
            }
        }
    }

    /**
     * A pull quote.
     *
     * @property text Quote text.
     * @property credit Quote credit.
     */
    public class PullQuote public constructor(
        public val text: RichTextDto,
        public val credit: RichTextDto,
    ) : PageBlockDto() {
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
            other as PullQuote
            if (other.text != text) {
                return false
            }
            return other.credit == credit
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + text.hashCode()
            hashCode = 31 * hashCode + credit.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PageBlockDto.PullQuote")
                append("(")
                append("text=")
                append(text)
                append(", ")
                append("credit=")
                append(credit)
                append(")")
            }
        }
    }

    /**
     * An animation.
     *
     * @property animation Animation file; may be null.
     * @property caption Animation caption.
     * @property needAutoplay True, if the animation must be played automatically.
     */
    public class Animation public constructor(
        public val animation: AnimationDto?,
        public val caption: PageBlockCaptionDto,
        public val needAutoplay: Boolean,
    ) : PageBlockDto() {
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
            other as Animation
            if (other.animation != animation) {
                return false
            }
            if (other.caption != caption) {
                return false
            }
            return other.needAutoplay == needAutoplay
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + animation.hashCode()
            hashCode = 31 * hashCode + caption.hashCode()
            hashCode = 31 * hashCode + needAutoplay.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PageBlockDto.Animation")
                append("(")
                append("animation=")
                append(animation)
                append(", ")
                append("caption=")
                append(caption)
                append(", ")
                append("needAutoplay=")
                append(needAutoplay)
                append(")")
            }
        }
    }

    /**
     * An audio file.
     *
     * @property audio Audio file; may be null.
     * @property caption Audio file caption.
     */
    public class Audio public constructor(
        public val audio: AudioDto?,
        public val caption: PageBlockCaptionDto,
    ) : PageBlockDto() {
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
            other as Audio
            if (other.audio != audio) {
                return false
            }
            return other.caption == caption
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + audio.hashCode()
            hashCode = 31 * hashCode + caption.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PageBlockDto.Audio")
                append("(")
                append("audio=")
                append(audio)
                append(", ")
                append("caption=")
                append(caption)
                append(")")
            }
        }
    }

    /**
     * A photo.
     *
     * @property photo Photo file; may be null.
     * @property caption Photo caption.
     * @property url URL that needs to be opened when the photo is clicked.
     */
    public class Photo public constructor(
        public val photo: PhotoDto?,
        public val caption: PageBlockCaptionDto,
        public val url: String,
    ) : PageBlockDto() {
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
            other as Photo
            if (other.photo != photo) {
                return false
            }
            if (other.caption != caption) {
                return false
            }
            return other.url == url
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + photo.hashCode()
            hashCode = 31 * hashCode + caption.hashCode()
            hashCode = 31 * hashCode + url.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PageBlockDto.Photo")
                append("(")
                append("photo=")
                append(photo)
                append(", ")
                append("caption=")
                append(caption)
                append(", ")
                append("url=")
                append(url)
                append(")")
            }
        }
    }

    /**
     * A video.
     *
     * @property video Video file; may be null.
     * @property caption Video caption.
     * @property needAutoplay True, if the video must be played automatically.
     * @property isLooped True, if the video must be looped.
     */
    public class Video public constructor(
        public val video: VideoDto?,
        public val caption: PageBlockCaptionDto,
        public val needAutoplay: Boolean,
        public val isLooped: Boolean,
    ) : PageBlockDto() {
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
            other as Video
            if (other.video != video) {
                return false
            }
            if (other.caption != caption) {
                return false
            }
            if (other.needAutoplay != needAutoplay) {
                return false
            }
            return other.isLooped == isLooped
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + video.hashCode()
            hashCode = 31 * hashCode + caption.hashCode()
            hashCode = 31 * hashCode + needAutoplay.hashCode()
            hashCode = 31 * hashCode + isLooped.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PageBlockDto.Video")
                append("(")
                append("video=")
                append(video)
                append(", ")
                append("caption=")
                append(caption)
                append(", ")
                append("needAutoplay=")
                append(needAutoplay)
                append(", ")
                append("isLooped=")
                append(isLooped)
                append(")")
            }
        }
    }

    /**
     * A voice note.
     *
     * @property voiceNote Voice note; may be null.
     * @property caption Voice note caption.
     */
    public class VoiceNote public constructor(
        public val voiceNote: VoiceNoteDto?,
        public val caption: PageBlockCaptionDto,
    ) : PageBlockDto() {
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
            other as VoiceNote
            if (other.voiceNote != voiceNote) {
                return false
            }
            return other.caption == caption
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + voiceNote.hashCode()
            hashCode = 31 * hashCode + caption.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PageBlockDto.VoiceNote")
                append("(")
                append("voiceNote=")
                append(voiceNote)
                append(", ")
                append("caption=")
                append(caption)
                append(")")
            }
        }
    }

    /**
     * A page cover.
     *
     * @property cover Cover.
     */
    public class Cover public constructor(
        public val cover: PageBlockDto,
    ) : PageBlockDto() {
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
            other as Cover
            return other.cover == cover
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + cover.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PageBlockDto.Cover")
                append("(")
                append("cover=")
                append(cover)
                append(")")
            }
        }
    }

    /**
     * An embedded web page.
     *
     * @property url URL of the embedded page, if available.
     * @property html HTML-markup of the embedded page.
     * @property posterPhoto Poster photo, if available; may be null.
     * @property width Block width; 0 if unknown.
     * @property height Block height; 0 if unknown.
     * @property caption Block caption.
     * @property isFullWidth True, if the block must be full width.
     * @property allowScrolling True, if scrolling needs to be allowed.
     */
    public class Embedded public constructor(
        public val url: String,
        public val html: String,
        public val posterPhoto: PhotoDto?,
        public val width: Int,
        public val height: Int,
        public val caption: PageBlockCaptionDto,
        public val isFullWidth: Boolean,
        public val allowScrolling: Boolean,
    ) : PageBlockDto() {
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
            other as Embedded
            if (other.url != url) {
                return false
            }
            if (other.html != html) {
                return false
            }
            if (other.posterPhoto != posterPhoto) {
                return false
            }
            if (other.width != width) {
                return false
            }
            if (other.height != height) {
                return false
            }
            if (other.caption != caption) {
                return false
            }
            if (other.isFullWidth != isFullWidth) {
                return false
            }
            return other.allowScrolling == allowScrolling
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + url.hashCode()
            hashCode = 31 * hashCode + html.hashCode()
            hashCode = 31 * hashCode + posterPhoto.hashCode()
            hashCode = 31 * hashCode + width.hashCode()
            hashCode = 31 * hashCode + height.hashCode()
            hashCode = 31 * hashCode + caption.hashCode()
            hashCode = 31 * hashCode + isFullWidth.hashCode()
            hashCode = 31 * hashCode + allowScrolling.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PageBlockDto.Embedded")
                append("(")
                append("url=")
                append(url)
                append(", ")
                append("html=")
                append(html)
                append(", ")
                append("posterPhoto=")
                append(posterPhoto)
                append(", ")
                append("width=")
                append(width)
                append(", ")
                append("height=")
                append(height)
                append(", ")
                append("caption=")
                append(caption)
                append(", ")
                append("isFullWidth=")
                append(isFullWidth)
                append(", ")
                append("allowScrolling=")
                append(allowScrolling)
                append(")")
            }
        }
    }

    /**
     * An embedded post.
     *
     * @property url URL of the embedded post.
     * @property author Post author.
     * @property authorPhoto Post author photo; may be null.
     * @property date Point in time (Unix timestamp) when the post was created; 0 if unknown.
     * @property pageBlocks Post content.
     * @property caption Post caption.
     */
    public class EmbeddedPost public constructor(
        public val url: String,
        public val author: String,
        public val authorPhoto: PhotoDto?,
        public val date: Int,
        public val pageBlocks: Array<PageBlockDto>,
        public val caption: PageBlockCaptionDto,
    ) : PageBlockDto() {
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
            other as EmbeddedPost
            if (other.url != url) {
                return false
            }
            if (other.author != author) {
                return false
            }
            if (other.authorPhoto != authorPhoto) {
                return false
            }
            if (other.date != date) {
                return false
            }
            val pageBlocksEquals = other.pageBlocks.contentDeepEquals(pageBlocks)
            if (!pageBlocksEquals) {
                return false
            }
            return other.caption == caption
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + url.hashCode()
            hashCode = 31 * hashCode + author.hashCode()
            hashCode = 31 * hashCode + authorPhoto.hashCode()
            hashCode = 31 * hashCode + date.hashCode()
            hashCode = 31 * hashCode + pageBlocks.contentDeepHashCode()
            hashCode = 31 * hashCode + caption.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PageBlockDto.EmbeddedPost")
                append("(")
                append("url=")
                append(url)
                append(", ")
                append("author=")
                append(author)
                append(", ")
                append("authorPhoto=")
                append(authorPhoto)
                append(", ")
                append("date=")
                append(date)
                append(", ")
                append("pageBlocks=")
                pageBlocks
                    .contentDeepToString()
                    .also { append(it) }
                append(", ")
                append("caption=")
                append(caption)
                append(")")
            }
        }
    }

    /**
     * A collage.
     *
     * @property pageBlocks Collage item contents.
     * @property caption Block caption.
     */
    public class Collage public constructor(
        public val pageBlocks: Array<PageBlockDto>,
        public val caption: PageBlockCaptionDto,
    ) : PageBlockDto() {
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
            other as Collage
            val pageBlocksEquals = other.pageBlocks.contentDeepEquals(pageBlocks)
            if (!pageBlocksEquals) {
                return false
            }
            return other.caption == caption
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + pageBlocks.contentDeepHashCode()
            hashCode = 31 * hashCode + caption.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PageBlockDto.Collage")
                append("(")
                append("pageBlocks=")
                pageBlocks
                    .contentDeepToString()
                    .also { append(it) }
                append(", ")
                append("caption=")
                append(caption)
                append(")")
            }
        }
    }

    /**
     * A slideshow.
     *
     * @property pageBlocks Slideshow item contents.
     * @property caption Block caption.
     */
    public class Slideshow public constructor(
        public val pageBlocks: Array<PageBlockDto>,
        public val caption: PageBlockCaptionDto,
    ) : PageBlockDto() {
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
            other as Slideshow
            val pageBlocksEquals = other.pageBlocks.contentDeepEquals(pageBlocks)
            if (!pageBlocksEquals) {
                return false
            }
            return other.caption == caption
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + pageBlocks.contentDeepHashCode()
            hashCode = 31 * hashCode + caption.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PageBlockDto.Slideshow")
                append("(")
                append("pageBlocks=")
                pageBlocks
                    .contentDeepToString()
                    .also { append(it) }
                append(", ")
                append("caption=")
                append(caption)
                append(")")
            }
        }
    }

    /**
     * A link to a chat.
     *
     * @property title Chat title.
     * @property photo Chat photo; may be null.
     * @property accentColorId Identifier of the accent color for chat title and background of chat photo.
     * @property username Chat username by which all other information about the chat can be resolved.
     */
    public class ChatLink public constructor(
        public val title: String,
        public val photo: ChatPhotoInfoDto?,
        public val accentColorId: Int,
        public val username: String,
    ) : PageBlockDto() {
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
            other as ChatLink
            if (other.title != title) {
                return false
            }
            if (other.photo != photo) {
                return false
            }
            if (other.accentColorId != accentColorId) {
                return false
            }
            return other.username == username
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + title.hashCode()
            hashCode = 31 * hashCode + photo.hashCode()
            hashCode = 31 * hashCode + accentColorId.hashCode()
            hashCode = 31 * hashCode + username.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PageBlockDto.ChatLink")
                append("(")
                append("title=")
                append(title)
                append(", ")
                append("photo=")
                append(photo)
                append(", ")
                append("accentColorId=")
                append(accentColorId)
                append(", ")
                append("username=")
                append(username)
                append(")")
            }
        }
    }

    /**
     * A table.
     *
     * @property caption Table caption.
     * @property cells Table cells.
     * @property isBordered True, if the table is bordered.
     * @property isStriped True, if the table is striped.
     */
    public class Table public constructor(
        public val caption: RichTextDto,
        public val cells: Array<Array<PageBlockTableCellDto>>,
        public val isBordered: Boolean,
        public val isStriped: Boolean,
    ) : PageBlockDto() {
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
            other as Table
            if (other.caption != caption) {
                return false
            }
            val cellsEquals = other.cells.contentDeepEquals(cells)
            if (!cellsEquals) {
                return false
            }
            if (other.isBordered != isBordered) {
                return false
            }
            return other.isStriped == isStriped
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + caption.hashCode()
            hashCode = 31 * hashCode + cells.contentDeepHashCode()
            hashCode = 31 * hashCode + isBordered.hashCode()
            hashCode = 31 * hashCode + isStriped.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PageBlockDto.Table")
                append("(")
                append("caption=")
                append(caption)
                append(", ")
                append("cells=")
                cells
                    .contentDeepToString()
                    .also { append(it) }
                append(", ")
                append("isBordered=")
                append(isBordered)
                append(", ")
                append("isStriped=")
                append(isStriped)
                append(")")
            }
        }
    }

    /**
     * A collapsible block.
     *
     * @property header Always visible heading for the block.
     * @property pageBlocks Block contents.
     * @property isOpen True, if the block is open by default.
     */
    public class Details public constructor(
        public val header: RichTextDto,
        public val pageBlocks: Array<PageBlockDto>,
        public val isOpen: Boolean,
    ) : PageBlockDto() {
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
            other as Details
            if (other.header != header) {
                return false
            }
            val pageBlocksEquals = other.pageBlocks.contentDeepEquals(pageBlocks)
            if (!pageBlocksEquals) {
                return false
            }
            return other.isOpen == isOpen
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + header.hashCode()
            hashCode = 31 * hashCode + pageBlocks.contentDeepHashCode()
            hashCode = 31 * hashCode + isOpen.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PageBlockDto.Details")
                append("(")
                append("header=")
                append(header)
                append(", ")
                append("pageBlocks=")
                pageBlocks
                    .contentDeepToString()
                    .also { append(it) }
                append(", ")
                append("isOpen=")
                append(isOpen)
                append(")")
            }
        }
    }

    /**
     * Related articles.
     *
     * @property header Block header.
     * @property articles List of related articles.
     */
    public class RelatedArticles public constructor(
        public val header: RichTextDto,
        public val articles: Array<PageBlockRelatedArticleDto>,
    ) : PageBlockDto() {
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
            other as RelatedArticles
            if (other.header != header) {
                return false
            }
            return other.articles.contentDeepEquals(articles)
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + header.hashCode()
            hashCode = 31 * hashCode + articles.contentDeepHashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PageBlockDto.RelatedArticles")
                append("(")
                append("header=")
                append(header)
                append(", ")
                append("articles=")
                articles
                    .contentDeepToString()
                    .also { append(it) }
                append(")")
            }
        }
    }

    /**
     * A map.
     *
     * @property location Location of the map center.
     * @property zoom Map zoom level.
     * @property width Map width.
     * @property height Map height.
     * @property caption Block caption.
     */
    public class Map public constructor(
        public val location: LocationDto,
        public val zoom: Int,
        public val width: Int,
        public val height: Int,
        public val caption: PageBlockCaptionDto,
    ) : PageBlockDto() {
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
            other as Map
            if (other.location != location) {
                return false
            }
            if (other.zoom != zoom) {
                return false
            }
            if (other.width != width) {
                return false
            }
            if (other.height != height) {
                return false
            }
            return other.caption == caption
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + location.hashCode()
            hashCode = 31 * hashCode + zoom.hashCode()
            hashCode = 31 * hashCode + width.hashCode()
            hashCode = 31 * hashCode + height.hashCode()
            hashCode = 31 * hashCode + caption.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("PageBlockDto.Map")
                append("(")
                append("location=")
                append(location)
                append(", ")
                append("zoom=")
                append(zoom)
                append(", ")
                append("width=")
                append(width)
                append(", ")
                append("height=")
                append(height)
                append(", ")
                append("caption=")
                append(caption)
                append(")")
            }
        }
    }
}
