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
import kotlin.Int
import kotlin.String

/**
 * The link is a universal TON Connect link.
 *
 * @property version TON Connect version.
 * @property dappClientId Hex-encoded public X25519 key of the dApp.
 * @property connectRequest TON Connect connect request.
 * @property returnStrategy Request return strategy; one of &quot;back&quot;, &quot;none&quot;, or a URL to open.
 * @property rpcRequest Embedded RPC request represented as base64url-encoded JSON.
 * @property traceId Identifier to trace the connection request.
 */
public class InternalLinkTypeTonConnect public constructor(
    public val version: Int,
    public val dappClientId: String,
    public val connectRequest: TonConnectConnectRequest,
    public val returnStrategy: String,
    public val rpcRequest: String,
    public val traceId: String,
) : InternalLinkType() {
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
        other as InternalLinkTypeTonConnect
        if (other.version != version) {
            return false
        }
        if (other.dappClientId != dappClientId) {
            return false
        }
        if (other.connectRequest != connectRequest) {
            return false
        }
        if (other.returnStrategy != returnStrategy) {
            return false
        }
        if (other.rpcRequest != rpcRequest) {
            return false
        }
        return other.traceId == traceId
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + version.hashCode()
        hashCode = 31 * hashCode + dappClientId.hashCode()
        hashCode = 31 * hashCode + connectRequest.hashCode()
        hashCode = 31 * hashCode + returnStrategy.hashCode()
        hashCode = 31 * hashCode + rpcRequest.hashCode()
        hashCode = 31 * hashCode + traceId.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InternalLinkTypeTonConnect")
            append("(")
            append("version=")
            append(version)
            append(", ")
            append("dappClientId=")
            append(dappClientId)
            append(", ")
            append("connectRequest=")
            append(connectRequest)
            append(", ")
            append("returnStrategy=")
            append(returnStrategy)
            append(", ")
            append("rpcRequest=")
            append(rpcRequest)
            append(", ")
            append("traceId=")
            append(traceId)
            append(")")
        }
    }
}
