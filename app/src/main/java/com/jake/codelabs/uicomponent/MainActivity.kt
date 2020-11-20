package com.jake.codelabs.uicomponent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.jake.codelabs.uicomponent.presentation.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var currentMenuItemId: Int? = null
    private val CURRENT_MENU_ITEM_ID = "CURRENT_MENU_ITEM_ID"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(savedInstanceState == null) {
            //TODO: setup initial data
            setupBottomNavigationView()
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        currentMenuItemId?.let {
            outState.putInt(CURRENT_MENU_ITEM_ID, it)
        }
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        currentMenuItemId = savedInstanceState.getInt(CURRENT_MENU_ITEM_ID)
        setupBottomNavigationView()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    private fun setupBottomNavigationView() {
        renderPage(currentMenuItemId)

        bottomNavigationView.setOnNavigationItemSelectedListener { menuItem ->
            renderPage(menuItem.itemId)
            currentMenuItemId = menuItem.itemId
            true
        }
    }

    private fun renderPage(itemId: Int? = null) {
        var tag = ""
        val fragment = when(itemId) {
            R.id.menu_1 -> {
                tag = "PageOneFragment"
                supportFragmentManager.findFragmentByTag(tag)
                    ?: PageOneFragment.newInstance()
            }
            R.id.menu_2 -> {
                tag = "PageTwoFragment"
                supportFragmentManager.findFragmentByTag(tag)
                    ?: PageTwoFragment.newInstance()
            }
            R.id.menu_3 -> {
                tag = "PageThreeFragment"
                supportFragmentManager.findFragmentByTag(tag)
                    ?: PageThreeFragment.newInstance()
            }
            R.id.menu_4 -> {
                tag = "PageFourFragment"
                supportFragmentManager.findFragmentByTag(tag)
                    ?: PageFourFragment.newInstance()
            }
            R.id.menu_5 -> {
                tag = "PageFiveFragment"
                supportFragmentManager.findFragmentByTag(tag)
                    ?: PageFiveFragment.newInstance()
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