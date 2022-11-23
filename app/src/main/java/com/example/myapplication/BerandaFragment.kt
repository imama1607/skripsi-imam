package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import com.example.myapplication.R

class BerandaFragment : Fragment() {
    lateinit var pengantar: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this
        return inflater.inflate(R.layout.fragment_beranda, container, false)

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        pengantar = requireView().findViewById(R.id.btn_pengantar)
        val tujuan: ImageButton = view.findViewById(R.id.btn_tujuan) as ImageButton
        val tatip: ImageButton = view.findViewById(R.id.btn_tatip) as ImageButton
        val tentang: ImageButton = view.findViewById(R.id.btn_tentang) as ImageButton

        pengantar.setOnClickListener() {
            val intent = Intent(activity, Pengantar::class.java)
            startActivity(intent)
        }

        tujuan.setOnClickListener() {
            val intent = Intent(activity, Tujuan::class.java)
            startActivity(intent)
        }

        tatip.setOnClickListener() {
            val intent = Intent(activity, Tata_tertip::class.java)
            startActivity(intent)
        }

        tentang.setOnClickListener() {
            val intent = Intent(activity, Tentang::class.java)
            startActivity(intent)
        }

    }
}