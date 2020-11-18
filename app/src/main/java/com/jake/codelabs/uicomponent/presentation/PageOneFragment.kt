package com.jake.codelabs.uicomponent.presentation

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.jake.codelabs.uicomponent.R

class PageOneFragment  : Fragment(R.layout.fragment_page_one){
    companion object {
        fun newInstance(): PageOneFragment {
            return PageOneFragment()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("#dev", "PageOneFragment::onCreate")
        Toast.makeText(requireContext(), "PageOneFragment::onCreate", Toast.LENGTH_SHORT).show()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("#dev", "PageOneFragment::onViewCreated")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("#dev", "PageOneFragment::onDestroyView")
    }
}