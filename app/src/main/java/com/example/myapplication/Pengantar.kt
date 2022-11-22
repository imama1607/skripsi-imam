package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Pengantar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pengantar)

        //set toolbar
        val actionBar = supportActionBar
        actionBar!!.title = "Pengantar"
        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}