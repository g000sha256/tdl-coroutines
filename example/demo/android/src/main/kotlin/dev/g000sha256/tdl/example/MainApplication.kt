package dev.g000sha256.tdl.example

import android.app.Application
import java.io.File

internal class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        filesDirectory = filesDir
    }

    companion object {

        lateinit var filesDirectory: File

    }

}
