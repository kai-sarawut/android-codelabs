package com.jake.codelabs.uicomponent.features.featureA

import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import com.jake.codelabs.uicomponent.R
import kotlinx.android.synthetic.main.fragment_subpage_two.*

class PageOneSubPage2Fragment : Fragment(R.layout.fragment_pageone_subpage2) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.i("#dev", "PageOneSubPage2Fragment::onCreate")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("#dev", "PageOneSubPage2Fragment::onViewCreated")

        initBackgroundProcess()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("#dev", "PageOneSubPage2Fragment::onDestroyView")

        handler.removeCallbacks(runnableProcess)
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("#dev", "PageOneSubPage2Fragment::onDestroy")
    }

    private fun initBackgroundProcess() {
        handler.postDelayed(runnableProcess, 2000)
    }

    private val handler = Handler()
    private val runnableProcess = Runnable {
        progressView.visibility = View.GONE
        logMessageTextView.text = "Hello world from a long process"
        logMessageTextView.visibility = View.VISIBLE
    }
}