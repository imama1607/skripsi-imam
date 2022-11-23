package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button

@SuppressLint("CustomSplashScreen")
class splashscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)

        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, Cover::class.java)
            startActivity(intent)
            finish()
        }, 2000)//lama waktu splash screen
    }
}