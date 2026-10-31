/*
 * Copyright 2025-2026 Georgii Ippolitov (g000sha256)
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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.boolean
import kotlinx.serialization.json.double
import kotlinx.serialization.json.int
import kotlinx.serialization.json.jsonArray
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive
import kotlinx.serialization.json.long

internal fun JsonObject.getBoolean(key: String): Boolean {
    val value = get(key = key)
    if (value == null || value == JsonNull) {
        return false
    }

    return value.jsonPrimitive.boolean
}

internal fun JsonObject.getBytes(key: String): ByteArray {
    val value = get(key = key)
    if (value == null || value == JsonNull) {
        return byteArrayOf()
    }

    return Base64.decode(source = value.jsonPrimitive.content)
}

internal fun JsonObject.getBytesArray(key: String): Array<ByteArray> {
    val value = get(key = key)
    if (value == null || value == JsonNull) {
        return emptyArray()
    }

    val jsonArray = value.jsonArray
    return Array(size = jsonArray.size) { index ->
        val jsonElement = jsonArray.get(index = index)
        require(value = jsonElement != JsonNull) { "Required value '$key[$index]' is null" }

        return@Array Base64.decode(source = jsonElement.jsonPrimitive.content)
    }
}

internal fun JsonObject.getDouble(key: String): Double {
    val value = get(key = key)
    if (value == null || value == JsonNull) {
        return 0.0
    }

    return value.jsonPrimitive.double
}

internal fun JsonObject.getInt(key: String): Int {
    val value = get(key = key)
    if (value == null || value == JsonNull) {
        return 0
    }

    return value.jsonPrimitive.int
}

internal fun JsonObject.getInts(key: String): IntArray {
    val value = get(key = key)
    if (value == null || value == JsonNull) {
        return intArrayOf()
    }

    val jsonArray = value.jsonArray
    return IntArray(size = jsonArray.size) { index ->
        val jsonElement = jsonArray.get(index = index)
        require(value = jsonElement != JsonNull) { "Required value '$key[$index]' is null" }

        return@IntArray jsonElement.jsonPrimitive.int
    }
}

internal fun JsonObject.getLong(key: String): Long {
    val value = get(key = key)
    if (value == null || value == JsonNull) {
        return 0L
    }

    return value.jsonPrimitive.long
}

internal fun JsonObject.getLongs(key: String): LongArray {
    val value = get(key = key)
    if (value == null || value == JsonNull) {
        return longArrayOf()
    }

    val jsonArray = value.jsonArray
    return LongArray(size = jsonArray.size) { index ->
        val jsonElement = jsonArray.get(index = index)
        require(value = jsonElement != JsonNull) { "Required value '$key[$index]' is null" }

        return@LongArray jsonElement.jsonPrimitive.long
    }
}

internal fun <T> JsonObject.getObject(key: String, transformer: Transformer<JsonObject, T>): T {
    val value = get(key = key)
    requireNotNull(value = value) { "Required value '$key' is missing" }
    require(value = value != JsonNull) { "Required value '$key' is null" }

    return transformer.transform(data = value.jsonObject)
}

internal fun <T> JsonObject.getObjectNullable(key: String, transformer: Transformer<JsonObject, T>): T? {
    val value = get(key = key)
    if (value == null || value == JsonNull) {
        return null
    }

    return transformer.transform(data = value.jsonObject)
}

internal inline fun <reified T> JsonObject.getObjects(key: String, transformer: Transformer<JsonObject, T>): Array<T> {
    val value = get(key = key)
    if (value == null || value == JsonNull) {
        return emptyArray()
    }

    val jsonArray = value.jsonArray
    return Array(size = jsonArray.size) { index ->
        val jsonElement = jsonArray.get(index = index)
        require(value = jsonElement != JsonNull) { "Required value '$key[$index]' is null" }

        return@Array transformer.transform(data = jsonElement.jsonObject)
    }
}

internal inline fun <reified T> JsonObject.getObjectsNullable(key: String, transformer: Transformer<JsonObject, T>): Array<T?> {
    val value = get(key = key)
    if (value == null || value == JsonNull) {
        return emptyArray()
    }

    val jsonArray = value.jsonArray
    return Array(size = jsonArray.size) { index ->
        val jsonElement = jsonArray.getOrNull(index = index)
        if (jsonElement == null || jsonElement == JsonNull) {
            return@Array null
        }

        return@Array transformer.transform(data = jsonElement.jsonObject)
    }
}

internal inline fun <reified T> JsonObject.getObjectsArray(
    key: String,
    transformer: Transformer<JsonObject, T>,
): Array<Array<T>> {
    val value = get(key = key)
    if (value == null || value == JsonNull) {
        return emptyArray()
    }

    val outerJsonArray = value.jsonArray
    return Array(size = outerJsonArray.size) outerArray@{ outerIndex ->
        val jsonElement = outerJsonArray.get(index = outerIndex)
        require(value = jsonElement != JsonNull) { "Required value '$key[$outerIndex]' is null" }

        val innerJsonArray = jsonElement.jsonArray
        return@outerArray Array(size = innerJsonArray.size) innerArray@{ innerIndex ->
            val innerJsonElement = innerJsonArray.get(index = innerIndex)
            require(value = innerJsonElement != JsonNull) { "Required value '$key[$outerIndex][$innerIndex]' is null" }

            return@innerArray transformer.transform(data = innerJsonElement.jsonObject)
        }
    }
}

internal fun JsonObject.getString(key: String): String {
    val value = get(key = key)
    if (value == null || value == JsonNull) {
        return ""
    }

    return value.jsonPrimitive.content
}

internal fun JsonObject.getStrings(key: String): Array<String> {
    val value = get(key = key)
    if (value == null || value == JsonNull) {
        return emptyArray()
    }

    val jsonArray = value.jsonArray
    return Array(size = jsonArray.size) { index ->
        val jsonElement = jsonArray.get(index = index)
        require(value = jsonElement != JsonNull) { "Required value '$key[$index]' is null" }

        return@Array jsonElement.jsonPrimitive.content
    }
}
