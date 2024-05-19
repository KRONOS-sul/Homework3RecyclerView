package com.example.homework3recyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.example.homework3recyclerview.R

class MotivationAdapter(private val data: List<String>) :
    RecyclerView.Adapter<MotivationAdapter.MotivationViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MotivationViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_motivation, parent, false)
        return MotivationViewHolder(view)
    }

    override fun onBindViewHolder(holder: MotivationViewHolder, position: Int) {
        holder.onBind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }

    inner class MotivationViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val motivationBtn: Button = itemView.findViewById(R.id.motivation_btn)

        fun onBind(motivationText: String) {
            motivationBtn.text = motivationText
        }
    }
}