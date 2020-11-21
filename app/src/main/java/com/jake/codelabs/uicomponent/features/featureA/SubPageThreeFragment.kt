package com.jake.codelabs.uicomponent.features.featureA

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import com.jake.codelabs.uicomponent.R

class SubPageThreeFragment : Fragment(R.layout.fragment_subpage_three) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.i("#dev", "SubPageThreeFragment::onCreate")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("#dev", "SubPageThreeFragment::onViewCreated")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("#dev", "SubPageThreeFragment::onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("#dev", "SubPageThreeFragment::onDestroy")
    }
}