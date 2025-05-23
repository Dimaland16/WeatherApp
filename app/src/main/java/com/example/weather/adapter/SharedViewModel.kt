package com.example.weather.adapter

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel() {
    private val _mainCity = MutableLiveData("Минск")
    val mainCity: LiveData<String> get() = _mainCity

    fun updateMainCity(newCity: String) {
        _mainCity.value = newCity
    }
}