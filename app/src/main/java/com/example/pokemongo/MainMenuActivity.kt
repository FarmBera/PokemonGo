package com.example.pokemongo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.pokemongo.databinding.ActivityMainMenuBinding

class MainMenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        title = "Main Menu";
        // setContentView(R.layout.activity_main_menu)

        // binding.menuClose.setOnClickListener {
            // this.finish()
        // }

        binding.menuClose.setOnClickListener {
            // Insert Icon Animation
            finish()
        }

        binding.menuInventory.setOnClickListener {
            val intent = Intent(this@MainMenuActivity, InventoryActivity::class.java)
            startActivity(intent)
        }

        binding.menuSettings.setOnClickListener {
            val intent = Intent(this@MainMenuActivity, SettingsActivity::class.java)
            startActivity(intent)
        }

        binding.menuLibrary.setOnClickListener {
            val intent = Intent(this@MainMenuActivity, LibraryActivity::class.java)
            startActivity(intent)
        }


    }
}