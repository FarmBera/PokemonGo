package com.example.pokemongo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pokemongo.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        title = "Your Profile";

        binding.userProfileImg.clipToOutline = true
    }
}