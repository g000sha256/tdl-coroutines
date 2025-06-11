package dev.g000sha256.tdl

import java.io.File
import java.io.InputStream
import kotlin.io.path.createTempFile

internal actual fun loadSystemLibrary() {
    val osName = System.getProperty("os.name")
    when {
        osName.contains(other = "linux", ignoreCase = true) -> load(libraryName = "libtdjni.so")
        osName.contains(other = "mac", ignoreCase = true) -> load(libraryName = "libtdjni.dylib")
        else -> error(message = "Target is not supported")
    }
}

@Suppress("UnsafeDynamicallyLoadedCode")
private fun load(libraryName: String) {
    createTempFile()
        .toFile()
        .also { it.deleteOnExit() }
        .also { it.copyToTemp(name = libraryName) }
        .also { System.load(it.absolutePath) }
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
