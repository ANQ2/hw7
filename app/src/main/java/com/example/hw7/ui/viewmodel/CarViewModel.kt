package com.example.hw7.ui.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.hw7.data.model.Car
import com.example.hw7.data.repository.CarRepositoryImpl
import kotlinx.coroutines.launch

class CarViewModel(application: Application) : AndroidViewModel(application) {
    private val _carList = MutableLiveData<List<Car>>()
    val carList: LiveData<List<Car>> get() = _carList

    private val carRepository = CarRepositoryImpl()

    fun fetchCars() {
        viewModelScope.launch {
            _carList.value = carRepository.getCars()
        }
    }
}