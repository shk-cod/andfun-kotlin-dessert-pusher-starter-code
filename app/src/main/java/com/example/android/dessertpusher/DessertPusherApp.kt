package com.example.android.dessertpusher

import android.app.Application
import timber.log.Timber

/**
Application class created especially for planting Timber tree.
Do not forget to declare name of this class in <application> block
in AndroidManifest.xml!!!
 */
class DessertPusherApp : Application() {
    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }
}