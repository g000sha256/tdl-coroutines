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
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String

/**
 * Represents an NFT in the TON blockchain.
 *
 * @property collectionAddress Address of the collection to which the NFT belongs; may be empty if unknown.
 * @property address Address of the NFT.
 * @property ownerAddress Address of the owner of the NFT.
 * @property index Index of the NFT among all NFTs from the collection as a decimal number.
 * @property name Name of the NFT.
 * @property description Description of the NFT.
 * @property image Image of the NFT; may be null if none.
 * @property thumbnail Thumbnail of the NFT; may be null if none.
 * @property content Content of the NFT; may be null if none.
 * @property sticker Sticker of the NFT; may be null if none.
 * @property attributes Attributes of the NFT.
 * @property extra Additional data about the NFT; may be null if none.
 * @property gift The upgraded gift corresponding to the NFT; may be null if none. Information about the owner of the gift isn't available. Original details of the gift are available only to the sender and the receiver of the original gift.
 */
public class TonNft public constructor(
    public val collectionAddress: String,
    public val address: String,
    public val ownerAddress: String,
    public val index: String,
    public val name: String,
    public val description: String,
    public val image: PhotoSize?,
    public val thumbnail: PhotoSize?,
    public val content: Document?,
    public val sticker: Sticker?,
    public val attributes: Array<TonNftAttribute>,
    public val extra: JsonValue?,
    public val gift: UpgradedGift?,
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
        other as TonNft
        if (other.collectionAddress != collectionAddress) {
            return false
        }
        if (other.address != address) {
            return false
        }
        if (other.ownerAddress != ownerAddress) {
            return false
        }
        if (other.index != index) {
            return false
        }
        if (other.name != name) {
            return false
        }
        if (other.description != description) {
            return false
        }
        if (other.image != image) {
            return false
        }
        if (other.thumbnail != thumbnail) {
            return false
        }
        if (other.content != content) {
            return false
        }
        if (other.sticker != sticker) {
            return false
        }
        val attributesEquals = other.attributes.contentDeepEquals(attributes)
        if (!attributesEquals) {
            return false
        }
        if (other.extra != extra) {
            return false
        }
        return other.gift == gift
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + collectionAddress.hashCode()
        hashCode = 31 * hashCode + address.hashCode()
        hashCode = 31 * hashCode + ownerAddress.hashCode()
        hashCode = 31 * hashCode + index.hashCode()
        hashCode = 31 * hashCode + name.hashCode()
        hashCode = 31 * hashCode + description.hashCode()
        hashCode = 31 * hashCode + image.hashCode()
        hashCode = 31 * hashCode + thumbnail.hashCode()
        hashCode = 31 * hashCode + content.hashCode()
        hashCode = 31 * hashCode + sticker.hashCode()
        hashCode = 31 * hashCode + attributes.contentDeepHashCode()
        hashCode = 31 * hashCode + extra.hashCode()
        hashCode = 31 * hashCode + gift.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("TonNft")
            append("(")
            append("collectionAddress=")
            append(collectionAddress)
            append(", ")
            append("address=")
            append(address)
            append(", ")
            append("ownerAddress=")
            append(ownerAddress)
            append(", ")
            append("index=")
            append(index)
            append(", ")
            append("name=")
            append(name)
            append(", ")
            append("description=")
            append(description)
            append(", ")
            append("image=")
            append(image)
            append(", ")
            append("thumbnail=")
            append(thumbnail)
            append(", ")
            append("content=")
            append(content)
            append(", ")
            append("sticker=")
            append(sticker)
            append(", ")
            append("attributes=")
            attributes
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("extra=")
            append(extra)
            append(", ")
            append("gift=")
            append(gift)
            append(")")
        }
    }
}
