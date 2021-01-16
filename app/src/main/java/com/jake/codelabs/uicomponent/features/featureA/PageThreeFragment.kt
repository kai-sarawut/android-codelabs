package com.jake.codelabs.uicomponent.features.featureA

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.jake.codelabs.feature.home.extension.viewBinding
import com.jake.codelabs.uicomponent.R
import com.jake.codelabs.uicomponent.databinding.FragmentPageThreeBinding

class PageThreeFragment  : Fragment(R.layout.fragment_page_three){
    companion object {
        fun newInstance(): PageThreeFragment {
            return PageThreeFragment()
        }
    }

    private val binding by viewBinding(FragmentPageThreeBinding::bind)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d("#dev", "PageThreeFragment::onCreate")
        Toast.makeText(requireContext(), "PageThreeFragment::onCreate", Toast.LENGTH_SHORT).show()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("#dev", "PageThreeFragment::onViewCreated")

        binding.navigateSubPageThree.setOnClickListener {
            findNavController().navigate(R.id.action_to_SubPageThreeFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("#dev", "PageThreeFragment::onDestroyView")
    }
}