package com.example.myapplication
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.R

class Tentang : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tentang)

        val actionBar = supportActionBar
        actionBar!!.setTitle("Tentang")
        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}