package com.omkarcodes.memesxd.ui.home.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.omkarcodes.memesxd.R
import com.omkarcodes.memesxd.databinding.FragmentHomeBinding

class HomeFragment : Fragment(R.layout.fragment_home){

    private var _binding: FragmentHomeBinding? = null
    private val binding: FragmentHomeBinding
        get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentHomeBinding.bind(view)
    }
    
     override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}