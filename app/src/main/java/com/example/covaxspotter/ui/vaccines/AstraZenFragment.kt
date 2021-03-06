package com.example.covaxspotter.ui.vaccines

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.covaxspotter.R
import com.example.covaxspotter.databinding.FragmentAstraZenBinding
import com.example.covaxspotter.utils.pfizer
import com.example.covaxspotter.utils.zeneca

/**
 * TODOS
 * Add binding object and inflate the layout using the binding object.
 */

class AstraZenFragment : Fragment() {
    private var _binding: FragmentAstraZenBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
       _binding = FragmentAstraZenBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.zenText.text = zeneca
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null //release memory at the end of lifecycle
    }

    }
