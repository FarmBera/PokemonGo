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
import android.widget.LinearLayout
import android.widget.PopupWindow
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

//        val actbar: ActionBar = supportActionBar()
//        actbar.hide()

//        setSupportActionBar(binding.appBarDrawer.toolbar)
//
//        val drawerLayout: DrawerLayout = binding.drawerLayout
//        val navView: NavigationView = binding.navView
//        val navController = findNavController(R.id.nav_host_fragment_content_drawer)
//        // Passing each menu ID as a set of Ids because each
//        // menu should be considered as top level destinations.
//        appBarConfiguration = AppBarConfiguration(
//            setOf(
//                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow
//            ), drawerLayout
//        )
//        setupActionBarWithNavController(navController, appBarConfiguration)
//        navView.setupWithNavController(navController)




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
            val intent = Intent(this@DrawerActivity, MainPopUp::class.java)
            startActivity(intent)
//            val inflater = getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
//            val popupView = inflater.inflate(R.layout.popup_layout, null)
//
//            val width = LinearLayout.LayoutParams.WRAP_CONTENT
//            val height = LinearLayout.LayoutParams.WRAP_CONTENT
//            val focusable = true // 팝업이 띄워질 때 배경이 흐려지지 않도록 하려면 false로 변경
//
//            val popupWindow = PopupWindow(popupView, width, height, focusable)
//
//            // 팝업 뷰에 있는 위젯들에 대한 작업 수행
//            val someButton = popupView.findViewById<Button>(R.id.some_button)
//            someButton.setOnClickListener {
//                // 버튼이 클릭되었을 때 수행할 동작
//            }
//
//            // 팝업 띄우기
//            popupWindow.showAtLocation(MainPopUp, Gravity.CENTER, 0, 0)
//            drawerLayout.openDrawer(GravityCompat.END)
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