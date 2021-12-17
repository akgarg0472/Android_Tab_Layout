package com.akgarg.androidtablayout

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.akgarg.androidtablayout.fragments.FragmentOne
import com.akgarg.androidtablayout.fragments.FragmentThree
import com.akgarg.androidtablayout.fragments.FragmentTwo

@Suppress("unused")
class MyFragmentPageAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    // method used to determine the total number of tabs in the layout
    override fun getCount(): Int {
        return 3
    }

    // method used to determine which fragment will be used for which tab according to the tab position
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> FragmentOne()
            1 -> FragmentTwo()
            2 -> FragmentThree()
            else -> FragmentOne()
        }
    }

    // method used to determine the title of the tab according to the tab position
    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "Tab 1"
            1 -> "Tab 2"
            2 -> "Tab 3"
            else -> null
        }
    }

}