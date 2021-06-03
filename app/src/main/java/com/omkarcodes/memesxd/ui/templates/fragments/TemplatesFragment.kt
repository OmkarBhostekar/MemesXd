package com.omkarcodes.memesxd.ui.templates.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.omkarcodes.memesxd.R
import com.omkarcodes.memesxd.databinding.FragmentTemplatesBinding

class TemplatesFragment : Fragment(R.layout.fragment_templates){

    private var _binding: FragmentTemplatesBinding? = null
    private val binding: FragmentTemplatesBinding
        get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentTemplatesBinding.bind(view)
    }

     override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}