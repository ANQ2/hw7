package com.example.hw7.data.repository

import com.example.hw7.data.model.Car

interface CarRepository {
    suspend fun getCars(): List<Car>
}