package com.example.myapplication

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class MyListAdapter(private val context: Activity, private val title: List<String>)
    : ArrayAdapter<String>(context, R.layout.list_materi, title) {

    override fun getView(position: Int, view: View?, parent: ViewGroup): View {
        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.list_materi, null, true)

        val judul = rowView.findViewById(R.id.tv_judul) as TextView
        judul.text = title[position]

        return rowView
    }
}