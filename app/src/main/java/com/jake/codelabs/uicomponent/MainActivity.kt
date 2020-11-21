package com.jake.codelabs.uicomponent

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.findNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.jake.codelabs.uicomponent.features.featureA.PageFourFragment
import com.jake.codelabs.uicomponent.features.featureA.PageOneFragment
import com.jake.codelabs.uicomponent.features.featureA.PageThreeFragment
import com.jake.codelabs.uicomponent.features.featureA.PageTwoFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var currentNavController: LiveData<NavController>? = null
    private var currentMenuItemId: Int? = null
    private val CURRENT_MENU_ITEM_ID = "CURRENT_MENU_ITEM_ID"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("#dev", "MainActivity::onCreate")
        if (savedInstanceState == null) {
            //TODO: setup initial data
            setupBottomNavigationView()
        }
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("#dev", "MainActivity::onRestart")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.i("#dev", "MainActivity::onSaveInstanceState")
        currentMenuItemId?.let {
            outState.putInt(CURRENT_MENU_ITEM_ID, it)
        }
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.i("#dev", "MainActivity::onRestoreInstanceState")
        currentMenuItemId = savedInstanceState.getInt(CURRENT_MENU_ITEM_ID)
        setupBottomNavigationView()
    }

    override fun onStart() {
        super.onStart()
        Log.i("#dev", "MainActivity::onStart")
    }

    override fun onStop() {
        super.onStop()
        Log.i("#dev", "MainActivity::onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("#dev", "MainActivity::onDestroy")
    }

    private fun setupBottomNavigationView() {
        // Way#1 - Multiple navigation graph
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        val navGraphIds = listOf(
            R.navigation.navigation_page_one,
            R.navigation.navigation_page_two,
            R.navigation.navigation_page_three,
            R.navigation.navigation_page_four
        )

        // Setup the bottom navigation view with a list of navigation graphs
        val controller = bottomNavigationView.setupWithNavController(
            navGraphIds = navGraphIds,
            fragmentManager = supportFragmentManager,
            containerId = R.id.fragmentContainerView,
            intent = intent
        )

        val onDestinationChangedListener =
            NavController.OnDestinationChangedListener { controller, destination, arguments ->
                Log.d("#dev", "navController graph : ${destination.label}")
                if(destination.id == R.id.subPageTwoFragment
                    || destination.id == R.id.subPageThreeFragment
                    || destination.id == R.id.pageOneSubPage2Fragment) {
                    bottomNavigationView.visibility = View.GONE
                } else {
                    Handler().postDelayed({
                        bottomNavigationView.visibility = View.VISIBLE
                    }, 200)

                }
            }

        controller.observe(this, Observer { navController ->
            Log.d("#dev", "navController graph : ${navController.graph.id}")

            navController.removeOnDestinationChangedListener(onDestinationChangedListener)
            navController.addOnDestinationChangedListener(onDestinationChangedListener)
        })

        currentNavController = controller

        /*
        //Way#2 - Single navigation graph
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        val navController = navHostFragment.navController
        NavigationUI.setupWithNavController(bottomNavigationView, navController)

        //Way#3 - Without navigation graph
        renderPage(currentMenuItemId)
        bottomNavigationView.setOnNavigationItemSelectedListener { menuItem ->
            renderPage(menuItem.itemId)
            currentMenuItemId = menuItem.itemId
            true
        }
         */
    }

    private fun renderPage(itemId: Int? = null) {
        var tag = ""
        val fragment = when (itemId) {
            R.id.navigation_pageOneFragment -> {
                tag = "PageOneFragment"
                supportFragmentManager.findFragmentByTag(tag)
                    ?: PageOneFragment.newInstance()
            }
            R.id.navigation_pageTwoFragment -> {
                tag = "PageTwoFragment"
                supportFragmentManager.findFragmentByTag(tag)
                    ?: PageTwoFragment.newInstance()
            }
            R.id.navigation_pageThreeFragment -> {
                tag = "PageThreeFragment"
                supportFragmentManager.findFragmentByTag(tag)
                    ?: PageThreeFragment.newInstance()
            }
            R.id.navigation_pageFourFragment -> {
                tag = "PageFourFragment"
                supportFragmentManager.findFragmentByTag(tag)
                    ?: PageFourFragment.newInstance()
            }
            else -> {
                tag = "PageOneFragment"
                supportFragmentManager.findFragmentByTag(tag)
                    ?: PageOneFragment.newInstance()
            }
        }

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainerView, fragment, tag)
            .addToBackStack(null)
            .commit()

    }
}