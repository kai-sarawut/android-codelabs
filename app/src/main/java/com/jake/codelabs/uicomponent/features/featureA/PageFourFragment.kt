package com.jake.codelabs.uicomponent.features.featureA

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.jake.codelabs.uicomponent.R
import kotlinx.android.synthetic.main.fragment_page_four.*

class PageFourFragment  : Fragment(R.layout.fragment_page_four){
    companion object {
        fun newInstance(): PageFourFragment {
            return PageFourFragment()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d("#dev", "PageFourFragment::onCreate")
        Toast.makeText(requireContext(), "PageFourFragment::onCreate", Toast.LENGTH_SHORT).show()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("#dev", "PageFourFragment::onViewCreated")

        navigateFeatureB.setOnClickListener {
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