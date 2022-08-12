package com.sagr.shoestoreinventory.viewmodels

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sagr.shoestoreinventory.models.ShoeModel

class ShoeListViewModel : ViewModel() {

    private val shoesArrayList = ArrayList<ShoeModel>()

    private val _shoeList = MutableLiveData<MutableList<ShoeModel>>(mutableListOf())
    val shoeList: LiveData<MutableList<ShoeModel>>
        get() = _shoeList


    init {

        addNewShoe(ShoeModel("Adidas", "Adidas", 45, "new Adidas shoe"))
        addNewShoe(ShoeModel("BlueStar", "Adidas", 45, "new Bluestar shoe"))


    }

    fun addNewShoe(shoe: ShoeModel) {
        shoesArrayList.add(
            ShoeModel(
                shoe.shoeName,
                shoe.companyName,
                shoe.shoeSize,
                shoe.description
            )
        )
        _shoeList.value = shoesArrayList
        Log.v("Inside", _shoeList.value?.size.toString())

    }

    fun saveShoe(shoe: ShoeModel) {
        addNewShoe(shoe)

    }


}