package com.example.hw7.ui.car_list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.hw7.databinding.FragmentCarBinding
import com.example.hw7.ui.viewmodel.CarViewModel

class CarFragment : Fragment() {

    private lateinit var binding: FragmentCarBinding
    private lateinit var carViewModel: CarViewModel
    private lateinit var carAdapter: CarAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCarBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        carViewModel = ViewModelProvider(this)[CarViewModel::class.java]

        carAdapter = CarAdapter(emptyList())
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext()) // 👈 ОБЯЗАТЕЛЬНО
        binding.recyclerView.adapter = carAdapter

        carViewModel.fetchCars()

        carViewModel.carList.observe(viewLifecycleOwner) { cars ->
            carAdapter = CarAdapter(cars)
            binding.recyclerView.adapter = carAdapter
        }
    }
}
