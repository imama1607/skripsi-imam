package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.fragment.app.Fragment


class MateriFragment : Fragment(R.layout.fragment_materi) {
    lateinit var lv_materi: ListView


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        return inflater.inflate(R.layout.fragment_materi, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        // data yang akan kita tampilkan ke dala ListView
        val languages = listOf("Amphibia", "Porifera", "coming soon", "coming soon", "coming soon")
        lv_materi = view?.findViewById(R.id.lv_materi) as ListView

        // memberikan adapter ke ListView
        lv_materi.adapter = ArrayAdapter(requireContext(), R.layout.list_materi, languages)
        val adapter = MyListAdapter(requireActivity(), languages)
        lv_materi.adapter = adapter
    }

}