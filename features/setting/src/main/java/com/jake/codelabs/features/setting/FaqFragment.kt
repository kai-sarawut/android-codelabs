package com.jake.codelabs.features.setting

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.jake.codelabs.common.share.extension.viewBinding
import com.jake.codelabs.features.setting.databinding.FragmentFaqBinding
import com.jake.codelabs.features.setting.databinding.FragmentSettingBinding

class FaqFragment :Fragment(R.layout.fragment_faq) {
    private val binding by viewBinding(FragmentFaqBinding::bind)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Log.i("#dev", "FaqFragment::onViewCreated")

    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("#dev", "FaqFragment::onDestroyView")
    }
}