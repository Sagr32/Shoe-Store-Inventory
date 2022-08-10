package com.sagr.shoestoreinventory.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.sagr.shoestoreinventory.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = FragmentLoginBinding.inflate(inflater)

        binding.loginButton.setOnClickListener {
            this.findNavController()
                .navigate(LoginFragmentDirections.actionLoginFragmentToWelcomeFragment())
        }

        binding.registerButton.setOnClickListener {
            this.findNavController()
                .navigate(LoginFragmentDirections.actionLoginFragmentToWelcomeFragment())
        }
        return binding.root
    }


}