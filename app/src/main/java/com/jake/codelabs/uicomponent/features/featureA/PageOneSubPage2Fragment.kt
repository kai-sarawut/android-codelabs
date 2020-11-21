package com.jake.codelabs.uicomponent.features.featureA

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import com.jake.codelabs.uicomponent.R

class PageOneSubPage2Fragment : Fragment(R.layout.fragment_pageone_subpage2) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.i("#dev", "PageOneSubPage2Fragment::onCreate")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("#dev", "PageOneSubPage2Fragment::onViewCreated")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("#dev", "PageOneSubPage2Fragment::onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("#dev", "PageOneSubPage2Fragment::onDestroy")
    }
}