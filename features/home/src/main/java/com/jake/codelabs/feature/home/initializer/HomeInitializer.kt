package com.jake.codelabs.feature.home.initializer

import android.content.Context
import android.util.Log
import androidx.startup.Initializer

class HomeInitializer : Initializer<Unit> {
    override fun create(context: Context) {
        Log.i("#dev", "::: HomeInitializer.create")
    }

    override fun dependencies(): List<Class<out Initializer<*>>> {
        return emptyList()
    }
}