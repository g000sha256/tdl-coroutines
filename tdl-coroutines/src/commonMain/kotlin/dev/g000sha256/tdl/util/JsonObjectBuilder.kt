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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.add
import kotlinx.serialization.json.addJsonArray
import kotlinx.serialization.json.put
import kotlinx.serialization.json.putJsonArray

internal fun JsonObjectBuilder.put(key: String, boolean: Boolean) {
    put(key = key, value = boolean)
}

internal fun JsonObjectBuilder.put(key: String, bytes: ByteArray) {
    val base64 = bytes.toBase64()
    put(key = key, value = base64)
}

internal fun JsonObjectBuilder.put(key: String, bytes: Array<ByteArray>) {
    putJsonArray(key = key) {
        bytes.forEach { array ->
            val base64 = array.toBase64()
            add(value = base64)
        }
    }
}

internal fun JsonObjectBuilder.put(key: String, double: Double) {
    put(key = key, value = double)
}

internal fun JsonObjectBuilder.put(key: String, int: Int) {
    put(key = key, value = int)
}

internal fun JsonObjectBuilder.put(key: String, ints: IntArray) {
    putJsonArray(key = key) {
        ints.forEach { element -> add(value = element) }
    }
}

internal fun JsonObjectBuilder.put(key: String, long: Long) {
    put(key = key, value = long)
}

internal fun JsonObjectBuilder.put(key: String, longs: LongArray) {
    putJsonArray(key = key) {
        longs.forEach { element -> add(value = element) }
    }
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
    objects: Array<T>,
    transformer: Transformer<T, JsonElement>,
) {
    putJsonArray(key = key) {
        objects.forEach { element ->
            val jsonElement = transformer.transform(data = element)
            add(element = jsonElement)
        }
    }
}

internal fun <T> JsonObjectBuilder.putNullable(
    key: String,
    objects: Array<T?>,
    transformer: Transformer<T, JsonElement>,
) {
    putJsonArray(key = key) {
        objects.forEach { element ->
            if (element == null) {
                add(element = JsonNull)
            } else {
                val jsonElement = transformer.transform(data = element)
                add(element = jsonElement)
            }
        }
    }
}

internal fun <T> JsonObjectBuilder.put(
    key: String,
    objectArrays: Array<Array<T>>,
    transformer: Transformer<T, JsonElement>,
) {
    putJsonArray(key = key) {
        objectArrays.forEach { array ->
            addJsonArray {
                array.forEach { element ->
                    val jsonElement = transformer.transform(data = element)
                    add(element = jsonElement)
                }
            }
        }
    }
}

internal fun JsonObjectBuilder.put(key: String, string: String) {
    put(key = key, value = string)
}

internal fun JsonObjectBuilder.put(key: String, strings: Array<String>) {
    putJsonArray(key = key) {
        strings.forEach { element -> add(value = element) }
    }
}

private fun ByteArray.toBase64(): String {
    return Base64.encode(source = this)
}
