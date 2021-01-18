package com.jake.codelabs.feature.home.presentation

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.jake.codelabs.feature.home.R
import com.jake.codelabs.feature.home.databinding.FragmentHomeBinding
import com.jake.codelabs.common.share.extension.viewBinding

class HomeFragment : Fragment(R.layout.fragment_home) {
    private val binding by viewBinding(FragmentHomeBinding::bind)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.navigateSetting.setOnClickListener {
            val bundle = Bundle().apply {
                putParcelable("pageDataModel",
                    com.jake.codelabs.common.share.domain.PageDataModel(id = "1", title = "Hello")
                )
            }
            findNavController().navigate(R.id.action_to_SettingActivity, bundle)
        }
    }
}