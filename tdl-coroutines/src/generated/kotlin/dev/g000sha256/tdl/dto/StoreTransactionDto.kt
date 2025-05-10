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
 * This class is an abstract base class.
 * Describes an in-store transaction.
 */
public sealed class StoreTransactionDto private constructor() {
    /**
     * A purchase through App Store.
     *
     * @property receipt App Store receipt.
     */
    public class AppStore public constructor(
        public val receipt: ByteArray,
    ) : StoreTransactionDto() {
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
            other as AppStore
            return other.receipt.contentEquals(receipt)
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + receipt.contentHashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("StoreTransactionDto.AppStore")
                append("(")
                append("receipt=")
                receipt
                    .contentToString()
                    .also { append(it) }
                append(")")
            }
        }
    }

    /**
     * A purchase through Google Play.
     *
     * @property packageName Application package name.
     * @property storeProductId Identifier of the purchased store product.
     * @property purchaseToken Google Play purchase token.
     */
    public class GooglePlay public constructor(
        public val packageName: String,
        public val storeProductId: String,
        public val purchaseToken: String,
    ) : StoreTransactionDto() {
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
            other as GooglePlay
            if (other.packageName != packageName) {
                return false
            }
            if (other.storeProductId != storeProductId) {
                return false
            }
            return other.purchaseToken == purchaseToken
        }

        override fun hashCode(): Int {
            var hashCode = this::class.hashCode()
            hashCode = 31 * hashCode + packageName.hashCode()
            hashCode = 31 * hashCode + storeProductId.hashCode()
            hashCode = 31 * hashCode + purchaseToken.hashCode()
            return hashCode
        }

        override fun toString(): String {
            return buildString {
                append("StoreTransactionDto.GooglePlay")
                append("(")
                append("packageName=")
                append(packageName)
                append(", ")
                append("storeProductId=")
                append(storeProductId)
                append(", ")
                append("purchaseToken=")
                append(purchaseToken)
                append(")")
            }
        }
    }
}
