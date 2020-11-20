package com.jake.codelabs.uicomponent.features.featureB

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import com.jake.codelabs.uicomponent.R

class FeatureBActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature_b)

        Log.i("#dev", "FeatureBActivity::onCreate")
        if(savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentBContainerView, FeatureBFragment.newInstance())
                .commit()
        }
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("#dev", "FeatureBActivity::onRestart")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.i("#dev", "FeatureBActivity::onSaveInstanceState")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.i("#dev", "FeatureBActivity::onRestoreInstanceState")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("#dev", "FeatureBActivity::onDestroy")
    }
}