package com.jake.codelabs.uicomponent.features.featureA

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.jake.codelabs.feature.home.extension.viewBinding
import com.jake.codelabs.uicomponent.R
import com.jake.codelabs.uicomponent.databinding.FragmentPageFourBinding

class PageFourFragment  : Fragment(R.layout.fragment_page_four){
    companion object {
        fun newInstance(): PageFourFragment {
            return PageFourFragment()
        }
    }

    private val binding by viewBinding(FragmentPageFourBinding::bind)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d("#dev", "PageFourFragment::onCreate")
        Toast.makeText(requireContext(), "PageFourFragment::onCreate", Toast.LENGTH_SHORT).show()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("#dev", "PageFourFragment::onViewCreated")

        binding.navigateFeatureB.setOnClickListener {
            val bundle = Bundle().apply {
                putParcelable("pageDataModel", PageDataModel(id = "1", title = "Hello"))
            }
            findNavController().navigate(R.id.action_to_FeatureBActivity, bundle)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("#dev", "PageFourFragment::onDestroyView")
    }
}