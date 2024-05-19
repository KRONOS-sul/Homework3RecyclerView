package com.example.homework3recyclerview.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.homework3recyclerview.adapter.MainAdapter
import com.example.homework3recyclerview.databinding.FragmentFoodBinding

class FoodFragment : Fragment() {
    private lateinit var binding: FragmentFoodBinding
    private val rvList = listOf(
        "Napoleon", "Burger", "Cheeseburger", "Nurbolburger"
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFoodBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = MainAdapter(rvList)
        binding.foodRv.adapter = adapter
    }
}