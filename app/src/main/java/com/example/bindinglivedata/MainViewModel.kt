package com.example.bindinglivedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    val quoteLiveData = MutableLiveData("What you give is what you get")

    fun updateQuote() {
        quoteLiveData.value = "You will see it when you belive it"
    }


}