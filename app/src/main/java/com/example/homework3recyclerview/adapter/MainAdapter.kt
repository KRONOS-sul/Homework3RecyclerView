package com.example.homework3recyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.example.homework3recyclerview.R

class MainAdapter(private val data: List<String>) :
    RecyclerView.Adapter<MainAdapter.MainViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_screen, parent, false)
        return MainViewHolder(view)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.onBind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }


    inner class MainViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val screenBtn: Button = itemView.findViewById(R.id.screen_btn)

        fun onBind(screenName: String) {
            screenBtn.text = screenName
        }
    }

}