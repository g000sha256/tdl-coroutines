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
import kotlin.ByteArray
import kotlin.Int
import kotlin.String

/**
 * A message with an invoice; can be used only by bots.
 *
 * @property invoice Invoice.
 * @property title Product title; 1-32 characters.
 * @property description Product description; 0-255 characters.
 * @property photoUrl Product photo URL; optional.
 * @property photoSize Product photo size.
 * @property photoWidth Product photo width.
 * @property photoHeight Product photo height.
 * @property payload The invoice payload.
 * @property providerToken Payment provider token; may be empty for payments in Telegram Stars.
 * @property providerData JSON-encoded data about the invoice, which will be shared with the payment provider.
 * @property startParameter Unique invoice bot deep link parameter for the generation of this invoice. If empty, it would be possible to pay directly from forwards of the invoice message.
 * @property paidMedia The content of paid media attached to the invoice; pass null if none.
 * @property paidMediaCaption Paid media caption; pass null to use an empty caption; 0-getOption(&quot;message_caption_length_max&quot;) characters.
 */
public class InputMessageInvoice public constructor(
    public val invoice: Invoice,
    public val title: String,
    public val description: String,
    public val photoUrl: String,
    public val photoSize: Int,
    public val photoWidth: Int,
    public val photoHeight: Int,
    public val payload: ByteArray,
    public val providerToken: String,
    public val providerData: String,
    public val startParameter: String,
    public val paidMedia: InputPaidMedia?,
    public val paidMediaCaption: FormattedText?,
) : InputMessageContent() {
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
        other as InputMessageInvoice
        if (other.invoice != invoice) {
            return false
        }
        if (other.title != title) {
            return false
        }
        if (other.description != description) {
            return false
        }
        if (other.photoUrl != photoUrl) {
            return false
        }
        if (other.photoSize != photoSize) {
            return false
        }
        if (other.photoWidth != photoWidth) {
            return false
        }
        if (other.photoHeight != photoHeight) {
            return false
        }
        val payloadEquals = other.payload.contentEquals(payload)
        if (!payloadEquals) {
            return false
        }
        if (other.providerToken != providerToken) {
            return false
        }
        if (other.providerData != providerData) {
            return false
        }
        if (other.startParameter != startParameter) {
            return false
        }
        if (other.paidMedia != paidMedia) {
            return false
        }
        return other.paidMediaCaption == paidMediaCaption
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + invoice.hashCode()
        hashCode = 31 * hashCode + title.hashCode()
        hashCode = 31 * hashCode + description.hashCode()
        hashCode = 31 * hashCode + photoUrl.hashCode()
        hashCode = 31 * hashCode + photoSize.hashCode()
        hashCode = 31 * hashCode + photoWidth.hashCode()
        hashCode = 31 * hashCode + photoHeight.hashCode()
        hashCode = 31 * hashCode + payload.contentHashCode()
        hashCode = 31 * hashCode + providerToken.hashCode()
        hashCode = 31 * hashCode + providerData.hashCode()
        hashCode = 31 * hashCode + startParameter.hashCode()
        hashCode = 31 * hashCode + paidMedia.hashCode()
        hashCode = 31 * hashCode + paidMediaCaption.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InputMessageInvoice")
            append("(")
            append("invoice=")
            append(invoice)
            append(", ")
            append("title=")
            append(title)
            append(", ")
            append("description=")
            append(description)
            append(", ")
            append("photoUrl=")
            append(photoUrl)
            append(", ")
            append("photoSize=")
            append(photoSize)
            append(", ")
            append("photoWidth=")
            append(photoWidth)
            append(", ")
            append("photoHeight=")
            append(photoHeight)
            append(", ")
            append("payload=")
            payload
                .contentToString()
                .also { append(it) }
            append(", ")
            append("providerToken=")
            append(providerToken)
            append(", ")
            append("providerData=")
            append(providerData)
            append(", ")
            append("startParameter=")
            append(startParameter)
            append(", ")
            append("paidMedia=")
            append(paidMedia)
            append(", ")
            append("paidMediaCaption=")
            append(paidMediaCaption)
            append(")")
        }
    }
}
