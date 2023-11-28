package com.example.pokemongo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import com.example.pokemongo.databinding.ActivityMainMenuBinding

class MainMenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        overridePendingTransition(R.anim.popup_fade_in, R.anim.none)
        val binding = ActivityMainMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayShowTitleEnabled(false)
//        title = "Main Menu";

        // Animations
        val anim_menu_to_left = AnimationUtils.loadAnimation(this, R.anim.menu_move_to_left)
        val anim_menu_to_right = AnimationUtils.loadAnimation(this, R.anim.menu_move_to_right)
        val anim_menu_to_up = AnimationUtils.loadAnimation(this, R.anim.menu_move_to_up)
        binding.menuInventory.startAnimation(anim_menu_to_left)
        binding.menuLibrary.startAnimation(anim_menu_to_right)
        binding.menuSettings.startAnimation(anim_menu_to_up)

//        binding.appBarDrawer.fab2.startAnimation(animation)

        fun MenuCloseEff() {
            val anim_menu_to_left = AnimationUtils.loadAnimation(this, R.anim.menu_move_to_left1)
            val anim_menu_to_right = AnimationUtils.loadAnimation(this, R.anim.menu_move_to_right1)
            val anim_menu_to_down = AnimationUtils.loadAnimation(this, R.anim.menu_move_to_down)
            binding.menuInventory.startAnimation(anim_menu_to_left)
            binding.menuLibrary.startAnimation(anim_menu_to_right)
            binding.menuSettings.startAnimation(anim_menu_to_down)
            finish()
            overridePendingTransition(R.anim.load_fade_in, R.anim.load_fade_out)
        }
        binding.backgroundsx.setOnClickListener{
            MenuCloseEff()
//            overridePendingTransition(R.anim.none, R.anim.load_fade_out)
        }
        binding.menuClose.setOnClickListener {
            MenuCloseEff()
//            val intent = Intent(this@MainMenuActivity, MainActivity::class.java)
//            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
//            startActivity(intent)
//            overridePendingTransition(R.anim.load_fade_in, R.anim.load_fade_out)
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