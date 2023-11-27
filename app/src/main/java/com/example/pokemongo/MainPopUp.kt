package com.example.pokemongo


import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.animation.ArgbEvaluator
import android.animation.ValueAnimator
import android.app.Activity
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.view.WindowManager
import android.view.animation.DecelerateInterpolator
import android.widget.PopupWindow
import android.window.OnBackInvokedDispatcher
import androidx.core.graphics.ColorUtils
import com.example.pokemongo.databinding.ActivityDrawerBinding
import com.example.pokemongo.databinding.ActivityMainPopUpBinding

class MainPopUp : AppCompatActivity() {
    private var popupTitle: String = ""
    private var popupText: String = ""
    private var popupButton: String = ""
    private var darkStatusBar: Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        overridePendingTransition(R.anim.popup_fade_in, R.anim.none)
//        setContentView(R.layout.activity_main_pop_up)
//        overridePendingTransition(/* enterAnim = */ 0, /* exitAnim = */ 0)
        val binding = ActivityMainPopUpBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }

    override fun onBackPressed() {
        super.onBackPressed()
        overridePendingTransition(R.anim.none, R.anim.popup_fade_out)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        finish()
        overridePendingTransition(R.anim.popup_fade_out, R.anim.popup_fade_in)
        return true
    }
}