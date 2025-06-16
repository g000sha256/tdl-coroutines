package dev.g000sha256.tdl

import java.io.File
import java.io.InputStream
import kotlin.io.path.createTempDirectory

internal actual fun loadSystemLibrary() {
    val osName = System.getProperty("os.name")
    when {
        osName.contains(other = "linux", ignoreCase = true) -> {
            load(platform = "linux", libraryName = "libtdjni.so")
        }
        osName.contains(other = "mac", ignoreCase = true) -> {
            load(platform = "macos", libraryName = "libtdjni.dylib")
        }
        osName.contains(other = "windows", ignoreCase = true) -> {
            load(
                platform = "windows",
                libraryName = "tdjni.dll",
                additionalLibraryNames = arrayOf(
                    "libcrypto-3-x64.dll",
                    "libssl-3-x64.dll",
                    "zlib1.dll",
                ),
            )
        }
        else -> error(message = "Target is not supported: $osName")
    }
}

@Suppress("UnsafeDynamicallyLoadedCode")
private fun load(platform: String, libraryName: String, vararg additionalLibraryNames: String) {
    val directory = createTempDirectory(prefix = platform)
        .toFile()
        .also { it.deleteOnExit() }

    val path = "/libs/$platform"

    additionalLibraryNames.forEach { name ->
        File(directory, name)
            .also { it.deleteOnExit() }
            .copyToTemp(name = "$path/$name")
    }

    val libraryFile = File(directory, libraryName)
        .also { it.deleteOnExit() }
        .also { it.copyToTemp(name = "$path/$libraryName") }

    System.load(libraryFile.absolutePath)
}

private fun File.copyToTemp(name: String) {
    TdlClient::class
        .java
        .getResourceAsStream(name)!!
        .use { it.copyTo(file = this) }
}

private fun InputStream.copyTo(file: File) {
    file
        .outputStream()
        .use { copyTo(out = it) }
}
