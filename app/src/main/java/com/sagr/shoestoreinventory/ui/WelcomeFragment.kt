package com.sagr.shoestoreinventory.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.sagr.shoestoreinventory.databinding.FragmentWelcomeBinding

class WelcomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentWelcomeBinding.inflate(inflater)
        // Inflate the layout for this fragment


        binding.nextButton.setOnClickListener {
            this.findNavController()
                .navigate(WelcomeFragmentDirections.actionWelcomeFragmentToInstructionFragment())
        }
        return binding.root
    }


}