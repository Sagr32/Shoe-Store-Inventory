package com.sagr.shoestoreinventory.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.sagr.shoestoreinventory.R
import com.sagr.shoestoreinventory.databinding.FragmentShoeDetailBinding
import com.sagr.shoestoreinventory.models.ShoeModel
import com.sagr.shoestoreinventory.viewmodels.ShoeListViewModel

class ShoeDetailFragment : Fragment() {
    private val viewModel: ShoeListViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentShoeDetailBinding.inflate(inflater)

        binding.saveButton.setOnClickListener {
            val shoeName: String = binding.shoeNameEdit.text.toString()
            val companyName: String = binding.companyNameEdit.text.toString()
            val shoeSize = binding.shoeSizeEdit.text.toString().toIntOrNull() ?: 45
            val description = binding.descriptionEdit.text.toString()
            viewModel.saveShoe(ShoeModel(shoeName, companyName, shoeSize, description))
            this.findNavController()
                .navigate(ShoeDetailFragmentDirections.actionShoeDetailFragmentToShoeList())
        }

        binding.cancelButton.setOnClickListener {
            this.findNavController()
                .navigate(ShoeDetailFragmentDirections.actionShoeDetailFragmentToShoeList())
        }

        return binding.root
    }
}