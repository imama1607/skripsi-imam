package com.example.myapplication

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowInsets
import android.view.WindowManager
import androidx.fragment.app.Fragment
import com.example.myapplication.R
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }
        val bottomNavigationView : BottomNavigationView=findViewById(R.id.bottomNavigationView)
        val berandaFragment=BerandaFragment()
        val materiFragment=MateriFragment()
        val identifikasiFragment=IdentifikasiFragment()
        val videoFragment=VideoFragment()
        val testFragment=TestFragment()

        setCurrentFragment(berandaFragment)

        bottomNavigationView.setOnItemSelectedListener() {
            when(it.itemId){
                R.id.beranda->setCurrentFragment(berandaFragment)
                R.id.materi->setCurrentFragment(materiFragment)
                R.id.identifikasi->setCurrentFragment(identifikasiFragment)
                R.id.video->setCurrentFragment(videoFragment)
                R.id.test->setCurrentFragment(testFragment)

            }
            true
        }

    }

    private fun setCurrentFragment(fragment:Fragment)=
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment,fragment)
            commit()
        }

}
