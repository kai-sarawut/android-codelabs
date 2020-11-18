package com.jake.codelabs.uicomponent.presentation

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.jake.codelabs.uicomponent.R

class PageTwoFragment  : Fragment(R.layout.fragment_page_two){
    companion object {
        fun newInstance(): PageTwoFragment {
            return PageTwoFragment()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Let fragment survive configuration change
        retainInstance = true

        Log.d("#dev", "PageTwoFragment::onCreate")
        Toast.makeText(requireContext(), "PageTwoFragment::onCreate", Toast.LENGTH_SHORT).show()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("#dev", "PageTwoFragment::onViewCreated")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("#dev", "PageTwoFragment::onDestroyView")
    }
}