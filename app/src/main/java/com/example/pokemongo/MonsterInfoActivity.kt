package com.example.pokemongo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pokemongo.databinding.ActivityMainMenuBinding

class MonsterInfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}