package com.example.pokemongo.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.pokemongo.InventoryActivity
import com.example.pokemongo.MainActivity
import com.example.pokemongo.MonsterInfoActivity
import com.example.pokemongo.R
import com.example.pokemongo.model.ItemModel
import com.example.pokemongo.databinding.RecyclerInventoryBinding

class InventoryAdapter(private val items: List<ItemModel>) :
    RecyclerView.Adapter<InventoryAdapter.ViewHolder>() {
    private lateinit var binding: RecyclerInventoryBinding

    class ViewHolder(val binding: RecyclerInventoryBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        binding = RecyclerInventoryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]

        // 이미지 리소스 ID 가져오기
        val imageResourceId = holder.itemView.resources.getIdentifier(
            item.imageUrl, "drawable", holder.itemView.context.packageName
        )

        Glide.with(holder.binding.root.context)
//            .load(item.imageUrl)
            .load(imageResourceId)
            .placeholder(R.drawable.playtogeth)
            .into(holder.binding.InvIcon)

        holder.binding.InvName.text = item.text

//        binding.InvContainer.setOnClickListener{
////            val intent = Intent(this@InventoryAdapter, MonsterInfoActivity::class.java)
////            startActivity(intent)
//
//            val intent = Intent(holder.itemView.context, MonsterInfoActivity::class.java)
////            intent.putExtra("itemId", item.id)
////            intent.putExtra("itemName", item.text)
//            holder.itemView.context.startActivity(intent)
//        }
        holder.binding.InvContainer.setOnClickListener {
            // 다른 액티비티로 이동하는 코드
            val intent = Intent(holder.itemView.context, MonsterInfoActivity::class.java)
            // 선택한 아이템에 대한 정보를 전달하려면 필요한 경우 아래 주석처리된 부분을 활용할 수 있습니다.
            // intent.putExtra("itemId", item.id)
            // intent.putExtra("itemName", item.text)
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }
}


//class InventoryAdapter(private val items: List<ItemModel>) : RecyclerView.Adapter<InventoryAdapter.ViewHolder>() {
//    private lateinit var binding: RecyclerInventoryBinding
//    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//        fun bind(item: ItemModel) {
//            // 항목에 데이터 표시
//            itemView.setOnClickListener {
//                // 클릭된 항목의 ID를 사용하여 화면 이동
//                val intent = Intent(itemView.context, MonsterInfoActivity::class.java)
////                intent.putExtra("itemId", item.id)
//                itemView.context.startActivity(intent)
//            }
//        }
//    }
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
//        binding = RecyclerInventoryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
//        return ViewHolder(binding.root)
//    }
//
//    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        val item = items[position]
//        holder.bind(item)
//    }
//
//    override fun getItemCount(): Int {
//        return items.size
//    }
//}


