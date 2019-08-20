package me.shkschneider.lifecycle

import android.app.Application
import android.util.Log

class MainApplication : Application() {

    init {
        Log.v(TAG, "init")
    }

    override fun onCreate() {
        Log.v(TAG, "onCreate")
        super.onCreate()
    }

    companion object {

        private const val TAG = "LifeCycle:MainApplication"

    }

}