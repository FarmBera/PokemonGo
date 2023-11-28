package com.example.pokemongo.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.pokemongo.R
import com.example.pokemongo.databinding.RecyclerLibraryBinding
import com.example.pokemongo.model.ItemLib
import com.example.pokemongo.model.ItemModel

class LibraryAdapter(private val items: List<ItemLib>) :
    RecyclerView.Adapter<LibraryAdapter.ViewHolder>() {

    class ViewHolder(val binding: RecyclerLibraryBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = RecyclerLibraryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]

        // 이미지 리소스 ID 가져오기
        val imageResourceId = holder.itemView.resources.getIdentifier(
            item.imageUrl, "drawable", holder.itemView.context.packageName
        )

        if (item.bool) {
            Glide.with(holder.binding.root.context)
                .load(R.drawable.playtogeth)
//                .placeholder(R.drawable.playtogeth)
                .into(holder.binding.libIcon)
        }
        else {
            Glide.with(holder.binding.root.context)
                .load(R.drawable.blackbunny)
//                .placeholder(R.drawable.blackbunny)
                .into(holder.binding.libIcon)
        }


//        holder.binding.libName.text = item.text
    }

    override fun getItemCount(): Int {
        return items.size
    }
}