package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat

class Cover : AppCompatActivity() {
    @SuppressLint("ResourceType")
    lateinit var view: View
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cover)
        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }
        val btn: Button = findViewById(R.id.btn_cover)
        btn.setOnClickListener(){
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}