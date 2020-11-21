package com.jake.codelabs.uicomponent.features.featureA

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.jake.codelabs.uicomponent.R
import kotlinx.android.synthetic.main.fragment_page_one.*

class PageOneFragment  : Fragment(R.layout.fragment_page_one){
    companion object {
        fun newInstance(): PageOneFragment {
            return PageOneFragment()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Let fragment survive configuration change
        retainInstance = true

        Log.d("#dev", "PageOneFragment::onCreate")
        Toast.makeText(requireContext(), "PageOneFragment::onCreate", Toast.LENGTH_SHORT).show()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("#dev", "PageOneFragment::onViewCreated")

        navigatePageOneSub1.setOnClickListener {
            findNavController().navigate(R.id.action_to_SubPageOneFragment)
        }

        navigatePageOneSub2.setOnClickListener {
            findNavController().navigate(R.id.action_to_PageOneSubPage2Fragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("#dev", "PageOneFragment::onDestroyView")
    }
}