package com.example.pokemongo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pokemongo.databinding.ActivityLibraryBinding

class LibraryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityLibraryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        title = "My Pokemons";
        // Event Process
    }


}