package com.example.hw7.ui.car_list

import android.widget.ImageView
import androidx.databinding.BindingAdapter

@BindingAdapter("imageResId")
fun setImageResource(view: ImageView, resId: Int) {
    view.setImageResource(resId)
}
