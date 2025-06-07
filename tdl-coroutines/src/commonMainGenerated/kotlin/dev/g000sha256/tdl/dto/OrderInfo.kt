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
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Order information.
 *
 * @property name Name of the user.
 * @property phoneNumber Phone number of the user.
 * @property emailAddress Email address of the user.
 * @property shippingAddress Shipping address for this order; may be null.
 */
@SerialName(value = "orderInfo")
@Serializable
public class OrderInfo public constructor(
    @SerialName(value = "name")
    public val name: String,
    @SerialName(value = "phone_number")
    public val phoneNumber: String,
    @SerialName(value = "email_address")
    public val emailAddress: String,
    @SerialName(value = "shipping_address")
    public val shippingAddress: Address?,
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
        other as OrderInfo
        if (other.name != name) {
            return false
        }
        if (other.phoneNumber != phoneNumber) {
            return false
        }
        if (other.emailAddress != emailAddress) {
            return false
        }
        return other.shippingAddress == shippingAddress
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + name.hashCode()
        hashCode = 31 * hashCode + phoneNumber.hashCode()
        hashCode = 31 * hashCode + emailAddress.hashCode()
        hashCode = 31 * hashCode + shippingAddress.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("OrderInfo")
            append("(")
            append("name=")
            append(name)
            append(", ")
            append("phoneNumber=")
            append(phoneNumber)
            append(", ")
            append("emailAddress=")
            append(emailAddress)
            append(", ")
            append("shippingAddress=")
            append(shippingAddress)
            append(")")
        }
    }
}
