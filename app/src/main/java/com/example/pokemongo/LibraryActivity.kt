package com.example.pokemongo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pokemongo.adapter.LibraryAdapter
import com.example.pokemongo.databinding.ActivityLibraryBinding
import com.example.pokemongo.model.ItemModel

class LibraryActivity : AppCompatActivity() {
    //    private lateinit var binding: ActivityInventoryBinding
    private lateinit var adapter: LibraryAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityLibraryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        title = "My Library";



        val imguRL: String = "playtogeth"
        val items = listOf(
            ItemModel(imguRL, "Item Library 1111"),
            ItemModel(imguRL, "Item Library 2222"),
            ItemModel(imguRL, "Item Library 3333")
        )

        adapter = LibraryAdapter(items)

        binding.RecyclerLibrary.layoutManager = LinearLayoutManager(this)
        binding.RecyclerLibrary.adapter = adapter
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        finish()
        return true
    }


}