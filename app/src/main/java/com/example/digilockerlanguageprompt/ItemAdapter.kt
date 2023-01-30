package com.example.digilockerlanguageprompt

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.digilockerlanguageprompt.databinding.LayoutItemCardBinding

class ItemAdapter (
    private val layout: Int,
    private val Items :List<com.example.digilockerlanguageprompt.Item>,
    val onItemClick:(com.example.digilockerlanguageprompt.Item)->Unit
        ):RecyclerView.Adapter<ItemAdapter.ViewHolder>(){
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val binding: LayoutItemCardBinding = LayoutItemCardBinding.bind(itemView)
        fun bind (item: com.example.digilockerlanguageprompt.Item){
            binding.apply { 
                imgItem.setImageResource(item.image)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(layout,parent,false)
        )
    }

    override fun getItemCount() = Items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(Items[position])
        holder.binding.card.setOnClickListener { onItemClick(Items[position]) }
    }

}