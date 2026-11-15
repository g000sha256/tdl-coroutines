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
import kotlin.ByteArray
import kotlin.Int
import kotlin.Long
import kotlin.String

/**
 * A new incoming widget query from a copy of a shared widget; for bots only.
 *
 * @property id Unique query identifier.
 * @property senderUserId Identifier of the user who sent the query.
 * @property queryType Type of the query.
 * @property data Data of the query.
 * @property widgetId Identifier of the shared widget from which the query originated.
 * @property walletCard TON wallet card of the user who sent the query; may be null if none.
 */
public class UpdateNewWidgetCopyQuery public constructor(
    public val id: Long,
    public val senderUserId: Long,
    public val queryType: WidgetQueryType,
    public val data: ByteArray,
    public val widgetId: Long,
    public val walletCard: TonWalletCard?,
) : Update() {
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
        other as UpdateNewWidgetCopyQuery
        if (other.id != id) {
            return false
        }
        if (other.senderUserId != senderUserId) {
            return false
        }
        if (other.queryType != queryType) {
            return false
        }
        val dataEquals = other.data.contentEquals(data)
        if (!dataEquals) {
            return false
        }
        if (other.widgetId != widgetId) {
            return false
        }
        return other.walletCard == walletCard
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + id.hashCode()
        hashCode = 31 * hashCode + senderUserId.hashCode()
        hashCode = 31 * hashCode + queryType.hashCode()
        hashCode = 31 * hashCode + data.contentHashCode()
        hashCode = 31 * hashCode + widgetId.hashCode()
        hashCode = 31 * hashCode + walletCard.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("UpdateNewWidgetCopyQuery")
            append("(")
            append("id=")
            append(id)
            append(", ")
            append("senderUserId=")
            append(senderUserId)
            append(", ")
            append("queryType=")
            append(queryType)
            append(", ")
            append("data=")
            data
                .contentToString()
                .also { append(it) }
            append(", ")
            append("widgetId=")
            append(widgetId)
            append(", ")
            append("walletCard=")
            append(walletCard)
            append(")")
        }
    }
}
