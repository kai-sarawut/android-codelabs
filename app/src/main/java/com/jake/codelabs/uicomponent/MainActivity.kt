package com.jake.codelabs.uicomponent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.jake.codelabs.uicomponent.presentation.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupBottomNavigationView()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    private fun setupBottomNavigationView() {
        //bottomNavigationView.menu.removeItem(R.id.menu_2)
        renderPage()

        bottomNavigationView.setOnNavigationItemSelectedListener { menuItem ->
            renderPage(menuItem)

            true
        }
    }

    private fun renderPage(menuItem: MenuItem? = null) {
        var tag = ""
        val fragment = when(menuItem?.itemId) {
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
            .replace(R.id.mainContainer, fragment, tag)
            .addToBackStack(null)
            .commit()
    }
}