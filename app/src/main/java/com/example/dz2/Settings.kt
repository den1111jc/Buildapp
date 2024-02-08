package com.example.dz2

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import com.example.dz2.databinding.SettingsBinding
import com.google.android.material.tabs.TabLayoutMediator

class Settings : Fragment() {

    private var binding: SettingsBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = SettingsBinding.inflate(inflater, container, false)


        binding?.slider?.adapter = SettingsAdapter(context as FragmentActivity)

        val tabLayoutMediator = binding?.tabSlider?.let {
            binding?.slider?.let { it1 ->
                TabLayoutMediator(it, it1) { tab, position ->
                }
            }
        }
        tabLayoutMediator?.attach()

        return binding?.root
    }
}




