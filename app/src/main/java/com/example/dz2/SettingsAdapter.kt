package com.example.dz2

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class SettingsAdapter(fragmentActivity: FragmentActivity): FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 12
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                First()
            }
            1 -> {
                Second()
            }
            2 -> {
                Third()
            }
            3 -> {
                Fourth()
            }
            4 -> {
                fifth()
            }
            5 -> {
                sixth()
            }
            6 -> {
                seventh()
            }
            7 -> {
                eighth()
            }
            9 -> {
                ninth()
            }
            10 -> {
                tenth()
            }
            11 -> {
                eleventh()
            }
            12 -> {
                twelfth()
            }
            else -> {
                First()
            }
        }
    }
}