package com.jake.codelabs.uicomponent.features.featureA

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import com.jake.codelabs.uicomponent.R

class SubPageOneFragment : Fragment(R.layout.fragment_subpage_one) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.i("#dev", "SubPageOneFragment::onCreate")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("#dev", "SubPageOneFragment::onViewCreated")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("#dev", "SubPageOneFragment::onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("#dev", "SubPageOneFragment::onDestroy")
    }
}