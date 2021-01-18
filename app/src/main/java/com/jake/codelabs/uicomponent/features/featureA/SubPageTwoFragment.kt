package com.jake.codelabs.uicomponent.features.featureA

import android.content.pm.ActivityInfo
import android.content.res.Configuration
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.View
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.jake.codelabs.common.share.extension.viewBinding
import com.jake.codelabs.uicomponent.R
import com.jake.codelabs.uicomponent.databinding.FragmentSubpageTwoBinding
import com.jake.codelabs.uicomponent.utils.hideSystemUI
import com.jake.codelabs.uicomponent.utils.showSystemUI

class SubPageTwoFragment : Fragment(R.layout.fragment_subpage_two) {
    private val binding by viewBinding(FragmentSubpageTwoBinding::bind)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.i("#dev", "SubPageTwoFragment::onCreate")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("#dev", "SubPageTwoFragment::onViewCreated")
        initView(view)
        initBackgroundProcess()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("#dev", "SubPageTwoFragment::onDestroyView")

        handler.removeCallbacks(runnableProcess)
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("#dev", "SubPageTwoFragment::onDestroy")
    }

    private fun initView(view: View) {
        if(resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            binding.titleBar.visibility = View.GONE
            hideSystemUI(view)
        } else {
            binding.titleBar.visibility = View.VISIBLE
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

    private fun initBackgroundProcess() {
        handler.postDelayed(runnableProcess, 2000)
    }

    private val handler = Handler()
    private val runnableProcess = Runnable {
        binding.progressView.visibility = View.GONE
        binding.logMessageTextView.text = "Hello world from a long process"
        binding.logMessageTextView.visibility = View.VISIBLE
    }
}