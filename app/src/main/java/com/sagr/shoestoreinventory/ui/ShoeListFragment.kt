package com.sagr.shoestoreinventory.ui

import android.os.Bundle
import android.view.*
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.onNavDestinationSelected
import com.sagr.shoestoreinventory.R
import com.sagr.shoestoreinventory.databinding.FragmentShoeListBinding
import com.sagr.shoestoreinventory.databinding.SingleShoeBinding
import com.sagr.shoestoreinventory.viewmodels.ShoeListViewModel


class ShoeListFragment : Fragment() {
    private val viewModel: ShoeListViewModel by activityViewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentShoeListBinding.inflate(inflater)

        viewModel.shoeList.observe(viewLifecycleOwner) {
            it?.let {
                it.forEach { singleShoe ->
                    val singleShoeBinding: SingleShoeBinding =
                        DataBindingUtil.inflate(
                            inflater,
                            R.layout.single_shoe,
                            container,
                            false
                        )
                    singleShoeBinding.shoe = singleShoe
                    binding.shoeListLayout.addView(singleShoeBinding.root)
                }
            }


        }
        binding.addButton.setOnClickListener {
            requireView().findNavController()
                .navigate(ShoeListFragmentDirections.actionShoeListToShoeDetailFragment())

        }

        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu, menu)
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.action_logout) {
            requireView().findNavController()
                .navigate(ShoeListFragmentDirections.actionLogout())
        }
        return super.onOptionsItemSelected(item)


    }


}