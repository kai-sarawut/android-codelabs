package com.jake.codelabs.uicomponent

import android.util.Log
import androidx.multidex.MultiDexApplication

class MainApplication : MultiDexApplication() {
    override fun onCreate() {
        super.onCreate()
        Log.d("#dev", "MainApplication.onCreate")
    }
}