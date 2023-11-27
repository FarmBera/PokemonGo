package com.example.pokemongo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import com.example.pokemongo.databinding.ActivityDrawerBinding
import com.example.pokemongo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayShowTitleEnabled(false)


        binding.fab1.setOnClickListener {
            val intent = Intent(this@MainActivity, ProfileActivity::class.java)
            startActivity(intent)
        }
        binding.fab2.setOnClickListener {
            val intent = Intent(this@MainActivity, MainMenuActivity::class.java)
//            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)
            overridePendingTransition(R.anim.load_fade_in, R.anim.none)
        }
        binding.fab3.setOnClickListener {
            val intent = Intent(this@MainActivity, MainPopUp::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.load_fade_in, R.anim.popup_fade_out)
        }
    }
}