package com.example.pokemongo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pokemongo.adapter.LibraryAdapter
import com.example.pokemongo.databinding.ActivityLibraryBinding
import com.example.pokemongo.model.ItemLib
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
        val bools: Boolean = true


        val items = listOf(
            ItemLib(imguRL, bools),
            ItemLib(imguRL, false),
            ItemLib(imguRL, bools),
            ItemLib(imguRL, false),
            ItemLib(imguRL, bools),ItemLib(imguRL, bools),
            ItemLib(imguRL, false),
            ItemLib(imguRL, bools),
            ItemLib(imguRL, false),
            ItemLib(imguRL, bools),ItemLib(imguRL, bools),
            ItemLib(imguRL, false),
            ItemLib(imguRL, bools),
            ItemLib(imguRL, false),
            ItemLib(imguRL, bools),ItemLib(imguRL, bools),
            ItemLib(imguRL, false),
            ItemLib(imguRL, bools),
            ItemLib(imguRL, false),
            ItemLib(imguRL, bools),
        )

        adapter = LibraryAdapter(items)

        binding.RecyclerLibrary.layoutManager = GridLayoutManager(this, 4)
        binding.RecyclerLibrary.adapter = adapter
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        finish()
        return true
    }


}