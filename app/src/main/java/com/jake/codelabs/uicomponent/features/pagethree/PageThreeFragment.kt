package com.jake.codelabs.uicomponent.features.pagethree

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.jake.codelabs.uicomponent.R

class PageThreeFragment  : Fragment(R.layout.fragment_page_three){
    companion object {
        fun newInstance(): PageThreeFragment {
            return PageThreeFragment()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Let fragment survive configuration change
        retainInstance = true

        Log.d("#dev", "PageThreeFragment::onCreate")
        Toast.makeText(requireContext(), "PageThreeFragment::onCreate", Toast.LENGTH_SHORT).show()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("#dev", "PageThreeFragment::onViewCreated")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("#dev", "PageThreeFragment::onDestroyView")
    }
}