package com.example.hw7

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.hw7.ui.car_list.CarFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, CarFragment())
                .commit()
        }
    }
}
