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

package dev.g000sha256.tdl

import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.JsonPrimitive

internal fun <T> JsonObjectBuilder.put(
    key: String,
    array: Array<T>?,
    transformer: Transformer<T, JsonElement>,
) {
    if (array == null) {
        put(key = key, element = JsonNull)
    } else {
        array
            .toJsonElement(transformer = transformer)
            .also { jsonElement -> put(key = key, element = jsonElement) }
    }
}

internal fun <T> JsonObjectBuilder.put(
    key: String,
    arrayOfArrays: Array<Array<T>>,
    transformer: Transformer<T, JsonElement>,
) {
    arrayOfArrays
        .toJsonElement { array -> array.toJsonElement(transformer = transformer) }
        .also { jsonElement -> put(key = key, element = jsonElement) }
}

internal fun JsonObjectBuilder.put(key: String, boolean: Boolean) {
    put(
        key = key,
        element = JsonPrimitive(value = boolean),
    )
}

internal fun JsonObjectBuilder.put(key: String, bytes: ByteArray) {
    bytes
        .toJsonElement()
        .also { jsonElement -> put(key = key, element = jsonElement) }
}

internal fun JsonObjectBuilder.put(key: String, bytes: Array<ByteArray>) {
    bytes
        .toJsonElement { array -> array.toJsonElement() }
        .also { jsonElement -> put(key = key, element = jsonElement) }
}

internal fun JsonObjectBuilder.put(key: String, double: Double) {
    put(
        key = key,
        element = JsonPrimitive(value = double),
    )
}

internal fun JsonObjectBuilder.put(key: String, int: Int) {
    put(
        key = key,
        element = JsonPrimitive(value = int),
    )
}

internal fun JsonObjectBuilder.put(key: String, ints: IntArray) {
    ints
        .toJsonElement()
        .also { jsonElement -> put(key = key, element = jsonElement) }
}

internal fun JsonObjectBuilder.put(key: String, long: Long) {
    put(
        key = key,
        element = JsonPrimitive(value = long),
    )
}

internal fun JsonObjectBuilder.put(key: String, longs: LongArray) {
    longs
        .toJsonElement()
        .also { jsonElement -> put(key = key, element = jsonElement) }
}

internal fun JsonObjectBuilder.put(key: String, string: String) {
    put(
        key = key,
        element = JsonPrimitive(value = string),
    )
}

internal fun JsonObjectBuilder.put(key: String, strings: Array<String>) {
    strings
        .toJsonElement { element -> JsonPrimitive(value = element) }
        .also { jsonElement -> put(key = key, element = jsonElement) }
}

internal fun <T> JsonObjectBuilder.put(
    key: String,
    value: T?,
    transformer: Transformer<T, JsonElement>,
) {
    if (value == null) {
        put(key = key, element = JsonNull)
    } else {
        transformer
            .transform(data = value)
            .also { jsonElement -> put(key = key, element = jsonElement) }
    }
}

private fun <T> Array<T>.toJsonElement(transformer: Transformer<T, JsonElement>): JsonElement {
    return iterator()
        .map(transformer = transformer)
        .let { elements -> JsonArray(content = elements) }
}

private fun ByteArray.toJsonElement(): JsonElement {
    return iterator()
        .map { element -> JsonPrimitive(value = element) }
        .let { elements -> JsonArray(content = elements) }
}

private fun IntArray.toJsonElement(): JsonElement {
    return iterator()
        .map { element -> JsonPrimitive(value = element) }
        .let { elements -> JsonArray(content = elements) }
}

private fun LongArray.toJsonElement(): JsonElement {
    return iterator()
        .map { element -> JsonPrimitive(value = element) }
        .let { elements -> JsonArray(content = elements) }
}

private fun <C, N> Iterator<C>.map(transformer: Transformer<C, N>): List<N> {
    val iterator = this
    return buildList {
        for (currentElement in iterator) {
            transformer
                .transform(data = currentElement)
                .also { newElement -> add(element = newElement) }
        }
    }
}

internal fun interface Transformer<C, N> {

    fun transform(data: C): N

}
