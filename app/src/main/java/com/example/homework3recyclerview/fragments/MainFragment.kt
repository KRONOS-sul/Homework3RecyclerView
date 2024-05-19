package com.example.homework3recyclerview.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.homework3recyclerview.R
import com.example.homework3recyclerview.adapter.MainAdapter
import com.example.homework3recyclerview.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding
    private val rvList = listOf(
        "FoodScreen", "MotivationScreen"
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = MainAdapter(rvList)
        binding.screenRv.adapter = adapter
        initListener()
    }

    private fun initListener() {
        with(binding) {
            foodFragmentBtn.setOnClickListener {
                val foodFragment = FoodFragment()
                val transaction = requireActivity().supportFragmentManager.beginTransaction()
                transaction.replace(R.id.fragment_container, foodFragment)
                transaction.addToBackStack(null)
                transaction.commit()
            }
            motivationFragmentBtn.setOnClickListener {
                val motivationFragment = MotivationFragment()
                val transaction = requireActivity().supportFragmentManager.beginTransaction()
                transaction.replace(R.id.fragment_container, motivationFragment)
                transaction.addToBackStack(null)
                transaction.commit()
            }
        }

    }


}