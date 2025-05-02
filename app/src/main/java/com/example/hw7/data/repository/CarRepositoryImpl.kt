package com.example.hw7.data.repository

import com.example.hw7.R
import com.example.hw7.data.model.Car

class CarRepositoryImpl : CarRepository {

    override suspend fun getCars(): List<Car> {
        return listOf(
            Car(
                id = 1,
                name = "Tesla Model S",
                imageResId = R.drawable.tesla_model_s
            ),
            Car(
                id = 2,
                name = "BMW M5 F90",
                imageResId = R.drawable.bmw_m5_f90
            )
        )
    }
}
