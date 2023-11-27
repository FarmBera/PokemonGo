package com.example.pokemongo

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.pokemongo.adapter.InventoryAdapter
import com.example.pokemongo.databinding.ActivityInventoryBinding
import com.example.pokemongo.model.ItemModel

class InventoryActivity : AppCompatActivity() {
    private lateinit var binding: ActivityInventoryBinding
    private lateinit var adapter: InventoryAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityInventoryBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val toolbarBodyTemplate = binding.customToolbar.toolbar
//        setSupportActionBar(toolbarBodyTemplate)
        supportActionBar?.setDisplayHomeAsUpEnabled(true) // 뒤로가기 버튼 활성화 (화살표)
//        supportActionBar?.setDisplayShowTitleEnabled(true) //액션바에 표시되는 제목의 표시유무를 설정합니다. false로 해야 custom한 툴바의 이름이 화면에 보이게 됩니다.
//        toolbarBodyTemplate.title = "신체 템플릿"

        title = "My Inventory";

        val imgURL: String = "playtogeth"

        val items = listOf(
            ItemModel(imgURL, "Item Inventory 1"),
            ItemModel(imgURL, "Item Inventory 2"),
            ItemModel(imgURL, "Item Inventory 3"),
            ItemModel(imgURL, "Item Inventory 4"),
            ItemModel(imgURL, "Item Inventory 5"),
            ItemModel(imgURL, "Item Inventory 6"),
            ItemModel(imgURL, "Item Inventory 7"),
            ItemModel(imgURL, "Item Inventory 8"),
            ItemModel(imgURL, "Item Inventory 9"),
            ItemModel(imgURL, "Item Inventory 10"),
            ItemModel(imgURL, "Item Inventory 11"),
            ItemModel(imgURL, "Item Inventory 12"),
        )

        adapter = InventoryAdapter(items)

        binding.RecyclerInventory.layoutManager = LinearLayoutManager(this)
        binding.RecyclerInventory.adapter = adapter

//        binding.RecyclerInventory.
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        finish()
        return true
    }

//    override fun onItemClick(id: String) {
//        // 클릭된 항목의 ID를 사용하여 이동 또는 다른 작업 수행
//        // 예: 상세 화면으로 이동하는 Intent 생성
//        val intent = Intent(this, DetailActivity::class.java)
//        intent.putExtra("itemId", id)
//        startActivity(intent)
//    }
}