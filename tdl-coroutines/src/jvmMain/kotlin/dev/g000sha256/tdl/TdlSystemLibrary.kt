package dev.g000sha256.tdl

import java.io.File
import java.io.InputStream
import kotlin.io.path.createTempDirectory

internal actual fun loadSystemLibrary() {
    val osName = getOsName()
    when (osName) {
        is OsName.Linux -> {
            val osArch = getOsArch()
            when (osArch) {
                is OsArch.Arm64 -> load(platform = "linux-arm64", libraryName = "libtdjni.so")
                is OsArch.X64 -> load(platform = "linux-x64", libraryName = "libtdjni.so")
                is OsArch.Unknown -> error(message = "Unknown OS arch: ${osArch.arch}")
            }
        }
        is OsName.MacOs -> {
            val osArch = getOsArch()
            when (osArch) {
                is OsArch.Arm64 -> load(platform = "macos-arm64", libraryName = "libtdjni.dylib")
                is OsArch.X64 -> load(platform = "macos-x64", libraryName = "libtdjni.dylib")
                is OsArch.Unknown -> error(message = "Unknown OS arch: ${osArch.arch}")
            }
        }
        is OsName.Windows -> {
            val osArch = getOsArch()
            when (osArch) {
                is OsArch.Arm64 -> {
                    load(
                        platform = "windows-arm64",
                        libraryNames = arrayOf(
                            "libcrypto-3-arm64.dll",
                            "libssl-3-arm64.dll",
                            "zlib1.dll",
                            "tdjni.dll",
                        ),
                    )
                }
                is OsArch.X64 -> {
                    load(
                        platform = "windows-x64",
                        libraryNames = arrayOf(
                            "libcrypto-3-x64.dll",
                            "libssl-3-x64.dll",
                            "zlib1.dll",
                            "tdjni.dll",
                        ),
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
        libraryNames = arrayOf(libraryName),
    )
}

private fun load(platform: String, libraryNames: Array<String>) {
    createTempDirectory(prefix = platform)
        .toFile()
        .also { directory -> directory.deleteOnExit() }
        .also { directory -> load(libraryNames = libraryNames, directory = directory, platform = platform) }
}

@Suppress("UnsafeDynamicallyLoadedCode")
private fun load(libraryNames: Array<String>, directory: File, platform: String) {
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
