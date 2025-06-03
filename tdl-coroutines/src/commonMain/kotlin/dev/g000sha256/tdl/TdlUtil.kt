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

internal inline fun <T1, reified T2> Array<T1>.mapArray(crossinline transform: (T1) -> T2): Array<T2> {
    return Array(size) { index ->
        val value = get(index)
        return@Array transform.invoke(value)
    }
}

internal inline fun <T1, reified T2> Array<Array<T1>>.mapArrayOfArrays(crossinline transform: (T1) -> T2): Array<Array<T2>> {
    return mapArray { array -> array.mapArray(transform) }
}

internal fun <T> Array<T>.getAndSet(index: Int, newValue: T): T {
    val value = get(index)
    set(index, newValue)
    return value
}

internal fun IntArray.getAndSet(index: Int, newValue: Int): Int {
    val value = get(index)
    set(index, newValue)
    return value
}

internal fun LongArray.getAndSet(index: Int, newValue: Long): Long {
    val value = get(index)
    set(index, newValue)
    return value
}
