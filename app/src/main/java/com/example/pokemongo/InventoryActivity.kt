package com.example.pokemongo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pokemongo.databinding.ActivityInventoryBinding

class InventoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityInventoryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        title = "My Inventory";
    }
}


class BoardAdapter(val itemList: ArrayList<BoardItem>) :
    RecyclerView.Adapter<BoardAdapter.BoardViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BoardViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_inventory, parent, false)
        return BoardViewHolder(view)
    }

    override fun onBindViewHolder(holder: BoardViewHolder, position: Int) {
        holder.tv_time.text = itemList[position].time
        holder.tv_title.text = itemList[position].title
        holder.tv_name.text = itemList[position].name
    }

    override fun getItemCount(): Int {
        return itemList.count()
    }


    inner class BoardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tv_time = itemView.findViewById<TextView>(R.id.tv_time)
        val tv_title = itemView.findViewById<TextView>(R.id.tv_title)
        val tv_name = itemView.findViewById<TextView>(R.id.tv_name)
    }
}
출처: https://uknowblog.tistory.com/29 [Uknow's Lab.:티스토리]

data class BoardItem(val time: String, val title: String, val name: String) {

}