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
 * Describes an upgraded gift that can be transferred to another owner or transferred to the TON blockchain as an NFT.
 *
 * @property id Unique identifier of the gift.
 * @property title The title of the upgraded gift.
 * @property name Unique name of the upgraded gift that can be used with internalLinkTypeUpgradedGift.
 * @property number Unique number of the upgraded gift among gifts upgraded from the same gift.
 * @property totalUpgradedCount Total number of gifts that were upgraded from the same gift.
 * @property maxUpgradedCount The maximum number of gifts that can be upgraded from the same gift.
 * @property ownerId Identifier of the user or the chat that owns the upgraded gift; may be null if none or unknown.
 * @property ownerAddress Address of the gift NFT owner in TON blockchain; may be empty if none. Append the address to getOption(&quot;ton_blockchain_explorer_url&quot;) to get a link with information about the address.
 * @property ownerName Name of the owner for the case when owner identifier and address aren't known.
 * @property giftAddress Address of the gift NFT in TON blockchain; may be empty if none. Append the address to getOption(&quot;ton_blockchain_explorer_url&quot;) to get a link with information about the address.
 * @property model Model of the upgraded gift.
 * @property symbol Symbol of the upgraded gift.
 * @property backdrop Backdrop of the upgraded gift.
 * @property originalDetails Information about the originally sent gift; may be null if unknown.
 */
public class UpgradedGiftDto public constructor(
    public val id: Long,
    public val title: String,
    public val name: String,
    public val number: Int,
    public val totalUpgradedCount: Int,
    public val maxUpgradedCount: Int,
    public val ownerId: MessageSenderDto?,
    public val ownerAddress: String,
    public val ownerName: String,
    public val giftAddress: String,
    public val model: UpgradedGiftModelDto,
    public val symbol: UpgradedGiftSymbolDto,
    public val backdrop: UpgradedGiftBackdropDto,
    public val originalDetails: UpgradedGiftOriginalDetailsDto?,
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
        other as UpgradedGiftDto
        if (other.id != id) {
            return false
        }
        if (other.title != title) {
            return false
        }
        if (other.name != name) {
            return false
        }
        if (other.number != number) {
            return false
        }
        if (other.totalUpgradedCount != totalUpgradedCount) {
            return false
        }
        if (other.maxUpgradedCount != maxUpgradedCount) {
            return false
        }
        if (other.ownerId != ownerId) {
            return false
        }
        if (other.ownerAddress != ownerAddress) {
            return false
        }
        if (other.ownerName != ownerName) {
            return false
        }
        if (other.giftAddress != giftAddress) {
            return false
        }
        if (other.model != model) {
            return false
        }
        if (other.symbol != symbol) {
            return false
        }
        if (other.backdrop != backdrop) {
            return false
        }
        return other.originalDetails == originalDetails
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + id.hashCode()
        hashCode = 31 * hashCode + title.hashCode()
        hashCode = 31 * hashCode + name.hashCode()
        hashCode = 31 * hashCode + number.hashCode()
        hashCode = 31 * hashCode + totalUpgradedCount.hashCode()
        hashCode = 31 * hashCode + maxUpgradedCount.hashCode()
        hashCode = 31 * hashCode + ownerId.hashCode()
        hashCode = 31 * hashCode + ownerAddress.hashCode()
        hashCode = 31 * hashCode + ownerName.hashCode()
        hashCode = 31 * hashCode + giftAddress.hashCode()
        hashCode = 31 * hashCode + model.hashCode()
        hashCode = 31 * hashCode + symbol.hashCode()
        hashCode = 31 * hashCode + backdrop.hashCode()
        hashCode = 31 * hashCode + originalDetails.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("UpgradedGiftDto")
            append("(")
            append("id=")
            append(id)
            append(", ")
            append("title=")
            append(title)
            append(", ")
            append("name=")
            append(name)
            append(", ")
            append("number=")
            append(number)
            append(", ")
            append("totalUpgradedCount=")
            append(totalUpgradedCount)
            append(", ")
            append("maxUpgradedCount=")
            append(maxUpgradedCount)
            append(", ")
            append("ownerId=")
            append(ownerId)
            append(", ")
            append("ownerAddress=")
            append(ownerAddress)
            append(", ")
            append("ownerName=")
            append(ownerName)
            append(", ")
            append("giftAddress=")
            append(giftAddress)
            append(", ")
            append("model=")
            append(model)
            append(", ")
            append("symbol=")
            append(symbol)
            append(", ")
            append("backdrop=")
            append(backdrop)
            append(", ")
            append("originalDetails=")
            append(originalDetails)
            append(")")
        }
    }
}
