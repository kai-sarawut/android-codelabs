package com.jake.codelabs.uicomponent.features.featureA

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.jake.codelabs.feature.home.extension.viewBinding
import com.jake.codelabs.uicomponent.R
import com.jake.codelabs.uicomponent.databinding.FragmentPageTwoBinding

class PageTwoFragment  : Fragment(R.layout.fragment_page_two){
    companion object {
        fun newInstance(): PageTwoFragment {
            return PageTwoFragment()
        }
    }

    private val binding by viewBinding(FragmentPageTwoBinding::bind)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d("#dev", "PageTwoFragment::onCreate")
        Toast.makeText(requireContext(), "PageTwoFragment::onCreate", Toast.LENGTH_SHORT).show()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("#dev", "PageTwoFragment::onViewCreated")

        binding.navigateSubPageTwo.setOnClickListener {
            findNavController().navigate(R.id.action_to_SubPageTwoFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("#dev", "PageTwoFragment::onDestroyView")
    }
}