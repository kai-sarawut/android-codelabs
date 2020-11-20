package com.jake.codelabs.uicomponent.presentation

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.jake.codelabs.uicomponent.R

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
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("#dev", "PageFourFragment::onDestroyView")
    }
}