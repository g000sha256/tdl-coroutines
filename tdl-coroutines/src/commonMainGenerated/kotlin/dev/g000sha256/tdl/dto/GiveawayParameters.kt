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
import kotlin.Long
import kotlin.LongArray
import kotlin.String
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Describes parameters of a giveaway.
 *
 * @property boostedChatId Identifier of the supergroup or channel chat, which will be automatically boosted by the winners of the giveaway for duration of the Telegram Premium subscription, or for the specified time. If the chat is a channel, then canPostMessages right is required in the channel, otherwise, the user must be an administrator in the supergroup.
 * @property additionalChatIds Identifiers of other supergroup or channel chats that must be subscribed by the users to be eligible for the giveaway. There can be up to getOption(&quot;giveaway_additional_chat_count_max&quot;) additional chats.
 * @property winnersSelectionDate Point in time (Unix timestamp) when the giveaway is expected to be performed; must be 60-getOption(&quot;giveaway_duration_max&quot;) seconds in the future in scheduled giveaways.
 * @property onlyNewMembers True, if only new members of the chats will be eligible for the giveaway.
 * @property hasPublicWinners True, if the list of winners of the giveaway will be available to everyone.
 * @property countryCodes The list of two-letter ISO 3166-1 alpha-2 codes of countries, users from which will be eligible for the giveaway. If empty, then all users can participate in the giveaway. There can be up to getOption(&quot;giveaway_country_count_max&quot;) chosen countries. Users with phone number that was bought at https://fragment.com can participate in any giveaway and the country code &quot;FT&quot; must not be specified in the list.
 * @property prizeDescription Additional description of the giveaway prize; 0-128 characters.
 */
@SerialName(value = "giveawayParameters")
@Serializable
public class GiveawayParameters public constructor(
    @SerialName(value = "boosted_chat_id")
    public val boostedChatId: Long,
    @SerialName(value = "additional_chat_ids")
    public val additionalChatIds: LongArray,
    @SerialName(value = "winners_selection_date")
    public val winnersSelectionDate: Int,
    @SerialName(value = "only_new_members")
    public val onlyNewMembers: Boolean,
    @SerialName(value = "has_public_winners")
    public val hasPublicWinners: Boolean,
    @SerialName(value = "country_codes")
    public val countryCodes: Array<String>,
    @SerialName(value = "prize_description")
    public val prizeDescription: String,
) : Model() {
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
        other as GiveawayParameters
        if (other.boostedChatId != boostedChatId) {
            return false
        }
        val additionalChatIdsEquals = other.additionalChatIds.contentEquals(additionalChatIds)
        if (!additionalChatIdsEquals) {
            return false
        }
        if (other.winnersSelectionDate != winnersSelectionDate) {
            return false
        }
        if (other.onlyNewMembers != onlyNewMembers) {
            return false
        }
        if (other.hasPublicWinners != hasPublicWinners) {
            return false
        }
        val countryCodesEquals = other.countryCodes.contentDeepEquals(countryCodes)
        if (!countryCodesEquals) {
            return false
        }
        return other.prizeDescription == prizeDescription
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + boostedChatId.hashCode()
        hashCode = 31 * hashCode + additionalChatIds.contentHashCode()
        hashCode = 31 * hashCode + winnersSelectionDate.hashCode()
        hashCode = 31 * hashCode + onlyNewMembers.hashCode()
        hashCode = 31 * hashCode + hasPublicWinners.hashCode()
        hashCode = 31 * hashCode + countryCodes.contentDeepHashCode()
        hashCode = 31 * hashCode + prizeDescription.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("GiveawayParameters")
            append("(")
            append("boostedChatId=")
            append(boostedChatId)
            append(", ")
            append("additionalChatIds=")
            additionalChatIds
                .contentToString()
                .also { append(it) }
            append(", ")
            append("winnersSelectionDate=")
            append(winnersSelectionDate)
            append(", ")
            append("onlyNewMembers=")
            append(onlyNewMembers)
            append(", ")
            append("hasPublicWinners=")
            append(hasPublicWinners)
            append(", ")
            append("countryCodes=")
            countryCodes
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("prizeDescription=")
            append(prizeDescription)
            append(")")
        }
    }
}
