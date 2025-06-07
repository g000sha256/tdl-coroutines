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

import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

@Serializable
public sealed class Model protected constructor(
    @SerialName("@client_id")
    @Serializable(with = DeserializeOnlyIntSerializer::class)
    internal val clientId: Int = 0,
    @SerialName("@extra")
    @Serializable(with = DeserializeOnlyLongSerializer::class)
    internal val requestId: Long = 0,
) {

    private object DeserializeOnlyIntSerializer : KSerializer<Int> {

        override val descriptor = PrimitiveSerialDescriptor(serialName = "kotlin.Int", kind = PrimitiveKind.INT)

        override fun deserialize(decoder: Decoder): Int {
            return decoder.decodeInt()
        }

        override fun serialize(encoder: Encoder, value: Int) {}

    }

    private object DeserializeOnlyLongSerializer : KSerializer<Long> {

        override val descriptor = PrimitiveSerialDescriptor(serialName = "kotlin.Long", kind = PrimitiveKind.LONG)

        override fun deserialize(decoder: Decoder): Long {
            return decoder.decodeLong()
        }

        override fun serialize(encoder: Encoder, value: Long) {}

    }

}
