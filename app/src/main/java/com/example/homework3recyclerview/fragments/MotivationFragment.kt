package com.example.homework3recyclerview.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.homework3recyclerview.adapter.MotivationAdapter
import com.example.homework3recyclerview.databinding.FragmentMotivationBinding

class MotivationFragment : Fragment() {

    private lateinit var binding: FragmentMotivationBinding
    private val rvList = listOf(
        "stay hard",
        "never give up",
        "no pain no gain",
        "discipline is not like a straight line, it's more like a curve, consistent curve that never stops"
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding =
            FragmentMotivationBinding.inflate(layoutInflater) //Интересно, даже инициализация как в активити работает
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = MotivationAdapter(rvList)
        binding.motivationRv.adapter = adapter
    }
}