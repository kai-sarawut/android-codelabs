package com.jake.codelabs.uicomponent.features.featureB

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import com.jake.codelabs.common.share.extension.viewBinding
import com.jake.codelabs.uicomponent.R
import com.jake.codelabs.uicomponent.databinding.FragmentFeatureBBinding

class FeatureBFragment : Fragment(R.layout.fragment_feature_b) {
    companion object {
        fun newInstance() : FeatureBFragment{
            return FeatureBFragment()
        }
    }

    private val binding by viewBinding(FragmentFeatureBBinding::bind)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.w("#dev", "FeatureBFragment::onCreate")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.w("#dev", "FeatureBFragment::onViewCreated")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.w("#dev", "FeatureBFragment::onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.w("#dev", "FeatureBFragment::onDestroy")
    }
}