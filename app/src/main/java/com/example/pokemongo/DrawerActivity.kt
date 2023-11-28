package com.example.pokemongo

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.Menu
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.PopupWindow
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.pokemongo.databinding.ActivityDrawerBinding
import com.google.android.material.navigation.NavigationView


class DrawerActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityDrawerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDrawerBinding.inflate(layoutInflater)
        // TODO Implement: 헤더(액션바) 제거하는 코드
//        requestWindowFeature(Window.FEATURE_NO_TITLE) ;
//        this.getWindow().setFlags (WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager. LayoutParams .FLAG_FULLSCREEN);
//        getSupportActionBar().hide(); //This Line hides the action bor

        setContentView(binding.root)

        setSupportActionBar(binding.appBarDrawer.toolbar)

        val drawerLayout: DrawerLayout = binding.drawerLayout
        val navView: NavigationView = binding.navView
        val navController = findNavController(R.id.nav_host_fragment_content_drawer)
        appBarConfiguration = AppBarConfiguration(setOf(), drawerLayout)
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

//        val navigationview: NavigationView = binding.
//        val header: View = navigationview.getHeaderView(0)
//        val tv: TextView = header.findViewById(android.R.id.profilename)
//        val image: ImageView = header.findViewById(android.R.id.profileimage)
//        tv.text = "your_text"
//        image.setImageResource(R.drawable.your_image)


        binding.appBarDrawer.fab1.setOnClickListener {
            val intent = Intent(this@DrawerActivity, ProfileActivity::class.java)
            startActivity(intent)
        }
        binding.appBarDrawer.fab2.setOnClickListener {
            val intent = Intent(this@DrawerActivity, MainMenuActivity::class.java)
            // intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)
        }
        binding.appBarDrawer.fab3.setOnClickListener {
           drawerLayout.openDrawer(GravityCompat.END)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.drawer, menu)
        return true
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_drawer)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }



}