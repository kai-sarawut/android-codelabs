package com.jake.codelabs.features.setting

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.jake.codelabs.common.share.extension.viewBinding
import com.jake.codelabs.features.setting.databinding.FragmentSettingBinding

class SettingFragment :Fragment(R.layout.fragment_setting) {
    private val binding by viewBinding(FragmentSettingBinding::bind)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Log.i("#dev", "SettingFragment::onViewCreated")
        binding.navigateFaq.setOnClickListener {
            findNavController().navigate(R.id.action_to_FaqFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("#dev", "SettingFragment::onDestroyView")
    }
}