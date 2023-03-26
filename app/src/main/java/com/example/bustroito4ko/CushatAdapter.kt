package com.example.bustroito4ko

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.bustroito4ko.databinding.CushatItemBinding
import layout.Cushat

class PlantAdapter: RecyclerView.Adapter<PlantAdapter.PlantHolder>() {
    val plantList = ArrayList<Cushat>()
    class PlantHolder(item: View): RecyclerView.ViewHolder(item) {
        val binding = CushatItemBinding.bind(item)
        fun bind(plant: Cushat) = with(binding){
            im.setImageResource(plant.imageId)
            tvTitle.text = plant.title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlantHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cushat_item, parent, false)
        return PlantHolder(view)
    }

    override fun onBindViewHolder(holder: PlantHolder, position: Int) {
        holder.bind(plantList[position])
    }

    override fun getItemCount(): Int {
        return plantList.size
    }

    fun addPlant(plant: Cushat){
        plantList.add(plant)
        notifyDataSetChanged()
    }
}