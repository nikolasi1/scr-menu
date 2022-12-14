package com.example.myapplication.adapters

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.myapplication.fragments.firstFragment
import com.example.myapplication.fragments.secondFragment
import com.example.myapplication.fragments.thirdFragment

class ViewPageFragmentAdapter(activity: AppCompatActivity):FragmentStateAdapter(activity) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> { firstFragment() }
            1 -> { secondFragment() }
            2 -> { thirdFragment() }
            else -> { firstFragment() }
        }
    }
}