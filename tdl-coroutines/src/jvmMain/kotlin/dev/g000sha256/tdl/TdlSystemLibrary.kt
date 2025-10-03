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

import java.io.File
import java.io.InputStream
import kotlin.io.path.createTempDirectory

internal fun loadSystemLibrary() {
    val osName = getOsName()
    when (osName) {
        is OsName.Linux -> {
            val osArch = getOsArch()
            when (osArch) {
                is OsArch.Arm64 -> load(platform = "linux-arm64", libraryName = "libtdjsonjava.so")
                is OsArch.X64 -> load(platform = "linux-x64", libraryName = "libtdjsonjava.so")
                is OsArch.Unknown -> error(message = "Unknown OS arch: ${osArch.arch}")
            }
        }
        is OsName.MacOs -> {
            val osArch = getOsArch()
            when (osArch) {
                is OsArch.Arm64 -> load(platform = "macos-arm64", libraryName = "libtdjsonjava.dylib")
                is OsArch.X64 -> load(platform = "macos-x64", libraryName = "libtdjsonjava.dylib")
                is OsArch.Unknown -> error(message = "Unknown OS arch: ${osArch.arch}")
            }
        }
        is OsName.Windows -> {
            val osArch = getOsArch()
            when (osArch) {
                is OsArch.Arm64 -> {
                    load(
                        platform = "windows-arm64",
                        libraryNames = buildList {
                            add(element = "libcrypto-3-arm64.dll")
                            add(element = "libssl-3-arm64.dll")
                            add(element = "zlib1.dll")
                            add(element = "tdjsonjava.dll")
                        },
                    )
                }
                is OsArch.X64 -> {
                    load(
                        platform = "windows-x64",
                        libraryNames = buildList {
                            add(element = "libcrypto-3-x64.dll")
                            add(element = "libssl-3-x64.dll")
                            add(element = "zlib1.dll")
                            add(element = "tdjsonjava.dll")
                        },
                    )
                }
                is OsArch.Unknown -> error(message = "Unknown OS arch: ${osArch.arch}")
            }
        }
        is OsName.Unknown -> error(message = "Unknown OS: ${osName.name}")
    }
}

private fun getOsName(): OsName {
    val osName = getSystemProperty(key = "os.name")
    when {
        osName.contains(other = "linux") -> return OsName.Linux()
        osName.contains(other = "mac") -> return OsName.MacOs()
        osName.contains(other = "windows") -> return OsName.Windows()
        else -> return OsName.Unknown(name = osName)
    }
}

private fun getOsArch(): OsArch {
    val osArch = getSystemProperty(key = "os.arch")
    when {
        osArch.contains(other = "aarch64") -> return OsArch.Arm64()
        osArch.contains(other = "amd64") -> return OsArch.X64()
        osArch.contains(other = "x86_64") -> return OsArch.X64()
        else -> return OsArch.Unknown(arch = osArch)
    }
}

private fun getSystemProperty(key: String): String {
    return System
        .getProperty(key)
        .lowercase()
}

private fun load(platform: String, libraryName: String) {
    load(
        platform = platform,
        libraryNames = listOf(element = libraryName),
    )
}

private fun load(platform: String, libraryNames: List<String>) {
    createTempDirectory(prefix = platform)
        .toFile()
        .also { directory -> directory.deleteOnExit() }
        .also { directory -> load(libraryNames = libraryNames, directory = directory, platform = platform) }
}

@Suppress("UnsafeDynamicallyLoadedCode")
private fun load(libraryNames: List<String>, directory: File, platform: String) {
    libraryNames.forEach { libraryName ->
        val file = File(directory, libraryName)
        file.deleteOnExit()

        copyTo(platform = platform, libraryName = libraryName, file = file)

        System.load(file.absolutePath)
    }
}

private fun copyTo(platform: String, libraryName: String, file: File) {
    val resourceName = "/libs/$platform/$libraryName"
    TdlClient::class
        .java
        .getResourceAsStream(resourceName)
        .let { inputStream -> inputStream ?: error(message = "Native library not found: $resourceName") }
        .use { inputStream -> inputStream.copyTo(file = file) }
}

private fun InputStream.copyTo(file: File) {
    file
        .outputStream()
        .use { outputStream -> copyTo(out = outputStream) }
}

private sealed interface OsArch {

    class Arm64 : OsArch

    class X64 : OsArch

    class Unknown(val arch: String) : OsArch

}

private sealed interface OsName {

    class Linux : OsName

    class MacOs : OsName

    class Windows : OsName

    class Unknown(val name: String) : OsName

}
