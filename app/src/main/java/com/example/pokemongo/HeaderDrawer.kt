package com.example.pokemongo

import android.R
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import com.example.pokemongo.databinding.NavHeaderDrawerBinding
import com.google.android.material.navigation.NavigationView


class HeaderDrawer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        overridePendingTransition(R.anim.popup_fade_in, R.anim.none)
        val binding = NavHeaderDrawerBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.testBtn.setOnClickListener {
            Toast.makeText(applicationContext, "Clicked!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this@HeaderDrawer, MainMenuActivity::class.java)
            startActivity(intent)
        }
    }
}