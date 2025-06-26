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

package dev.g000sha256.tdl.util

import kotlin.io.encoding.Base64
import kotlin.io.encoding.ExperimentalEncodingApi
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.JsonPrimitive

internal fun JsonObjectBuilder.put(key: String, boolean: Boolean) {
    val jsonPrimitive = JsonPrimitive(value = boolean)
    put(key = key, element = jsonPrimitive)
}

internal fun JsonObjectBuilder.put(key: String, bytes: ByteArray) {
    val jsonElement = bytes.toJsonElement()
    put(key = key, element = jsonElement)
}

internal fun JsonObjectBuilder.put(key: String, bytes: Array<ByteArray>) {
    val jsonElement = bytes.toJsonElement { array -> array.toJsonElement() }
    put(key = key, element = jsonElement)
}

internal fun JsonObjectBuilder.put(key: String, double: Double) {
    val jsonPrimitive = JsonPrimitive(value = double)
    put(key = key, element = jsonPrimitive)
}

internal fun JsonObjectBuilder.put(key: String, int: Int) {
    val jsonPrimitive = JsonPrimitive(value = int)
    put(key = key, element = jsonPrimitive)
}

internal fun JsonObjectBuilder.put(key: String, ints: IntArray) {
    val jsonElement = ints.toJsonElement()
    put(key = key, element = jsonElement)
}

internal fun JsonObjectBuilder.put(key: String, long: Long) {
    val jsonPrimitive = JsonPrimitive(value = long)
    put(key = key, element = jsonPrimitive)
}

internal fun JsonObjectBuilder.put(key: String, longs: LongArray) {
    val jsonElement = longs.toJsonElement()
    put(key = key, element = jsonElement)
}

internal fun <T> JsonObjectBuilder.put(
    key: String,
    value: T?,
    transformer: Transformer<T, JsonElement>,
) {
    if (value == null) {
        put(key = key, element = JsonNull)
    } else {
        val jsonElement = transformer.transform(data = value)
        put(key = key, element = jsonElement)
    }
}

internal fun <T> JsonObjectBuilder.put(
    key: String,
    objects: Array<T>?,
    transformer: Transformer<T, JsonElement>,
) {
    if (objects == null) {
        put(key = key, element = JsonNull)
    } else {
        val jsonElement = objects.toJsonElement(transformer = transformer)
        put(key = key, element = jsonElement)
    }
}

internal fun <T> JsonObjectBuilder.put(
    key: String,
    objectArrays: Array<Array<T>>,
    transformer: Transformer<T, JsonElement>,
) {
    val jsonElement = objectArrays.toJsonElement { array -> array.toJsonElement(transformer = transformer) }
    put(key = key, element = jsonElement)
}

internal fun JsonObjectBuilder.put(key: String, string: String) {
    val jsonPrimitive = JsonPrimitive(value = string)
    put(key = key, element = jsonPrimitive)
}

internal fun JsonObjectBuilder.put(key: String, strings: Array<String>) {
    val jsonElement = strings.toJsonElement { element -> JsonPrimitive(value = element) }
    put(key = key, element = jsonElement)
}

@OptIn(ExperimentalEncodingApi::class)
private fun ByteArray.toJsonElement(): JsonElement {
    val base64 = Base64.encode(source = this)
    return JsonPrimitive(value = base64)
}

private fun IntArray.toJsonElement(): JsonElement {
    val jsonElements = map { element -> JsonPrimitive(value = element) }
    return JsonArray(content = jsonElements)
}

private fun LongArray.toJsonElement(): JsonElement {
    val jsonElements = map { element -> JsonPrimitive(value = element) }
    return JsonArray(content = jsonElements)
}

private fun <T> Array<T>.toJsonElement(transformer: Transformer<T, JsonElement>): JsonElement {
    val jsonElements = map(transformer = transformer)
    return JsonArray(content = jsonElements)
}

private fun <C, N> Array<C>.map(transformer: Transformer<C, N>): List<N> {
    val iterator = iterator()
    return buildList {
        iterator.forEach { currentElement ->
            val newElement = transformer.transform(data = currentElement)
            add(element = newElement)
        }
    }
}
