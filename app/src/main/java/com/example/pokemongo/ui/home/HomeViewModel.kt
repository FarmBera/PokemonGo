package com.example.pokemongo.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Main Screen\n(This will replace to Map)"
    }
    val text: LiveData<String> = _text
}