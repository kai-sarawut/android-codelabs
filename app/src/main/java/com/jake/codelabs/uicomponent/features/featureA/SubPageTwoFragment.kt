package com.jake.codelabs.uicomponent.features.featureA

import android.content.Context
import android.content.pm.ActivityInfo
import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.OnBackPressedCallback
import androidx.activity.OnBackPressedDispatcher
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.jake.codelabs.uicomponent.R
import com.jake.codelabs.uicomponent.utils.hideSystemUI
import com.jake.codelabs.uicomponent.utils.showSystemUI
import kotlinx.android.synthetic.main.fragment_subpage_two.*

class SubPageTwoFragment : Fragment(R.layout.fragment_subpage_two) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.i("#dev", "SubPageTwoFragment::onCreate")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("#dev", "SubPageTwoFragment::onViewCreated")

        if(resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            titleBar.visibility = View.GONE
            hideSystemUI(view)
        } else {
            titleBar.visibility = View.VISIBLE
            showSystemUI(view)
        }

        activity?.onBackPressedDispatcher?.addCallback(viewLifecycleOwner, object: OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                if(resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
                    activity?.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
                } else {
                    findNavController().popBackStack()
                }
            }
        })

    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("#dev", "SubPageTwoFragment::onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("#dev", "SubPageTwoFragment::onDestroy")
    }
}