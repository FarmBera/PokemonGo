package com.example.pokemongo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pokemongo.databinding.ActivityInventoryBinding

class InventoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityInventoryBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}