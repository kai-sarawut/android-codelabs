package com.jake.codelabs.uicomponent.features.featureB

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.jake.codelabs.feature.home.extension.viewBinding
import com.jake.codelabs.uicomponent.R
import com.jake.codelabs.uicomponent.databinding.ActivityFeatureBBinding
import com.jake.codelabs.uicomponent.features.featureA.PageDataModel

class FeatureBActivity : AppCompatActivity() {
    private val binding by viewBinding(ActivityFeatureBBinding::inflate)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature_b)

        val pageDataModel = intent?.getParcelableExtra<PageDataModel>("pageDataModel")

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