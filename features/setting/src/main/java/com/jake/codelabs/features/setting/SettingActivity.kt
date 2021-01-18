package com.jake.codelabs.features.setting

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.jake.codelabs.common.share.domain.PageDataModel

class SettingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)

        val pageDataModel = intent?.getParcelableExtra<PageDataModel>("pageDataModel")

        Log.i("#dev", "SettingActivity::onCreate")
        if(pageDataModel != null) {
            Log.d("#dev", "pageDataModel = ${pageDataModel.id} ${pageDataModel.title}")
        }
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("#dev", "SettingActivity::onRestart")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.i("#dev", "SettingActivity::onSaveInstanceState")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.i("#dev", "SettingActivity::onRestoreInstanceState")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("#dev", "SettingActivity::onDestroy")
    }
}