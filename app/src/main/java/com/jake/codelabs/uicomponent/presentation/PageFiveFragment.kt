package com.jake.codelabs.uicomponent.presentation

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.jake.codelabs.uicomponent.R

class PageFiveFragment  : Fragment(R.layout.fragment_page_five){
    companion object {
        fun newInstance(): PageFiveFragment {
            return PageFiveFragment()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("#dev", "PageFiveFragment::onCreate")
        Toast.makeText(requireContext(), "PageFiveFragment::onCreate", Toast.LENGTH_SHORT).show()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("#dev", "PageFiveFragment::onViewCreated")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("#dev", "PageFiveFragment::onDestroyView")
    }
}