package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
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
        val judul = listOf("Amphibia", "Porifera") //judul
        val pdf = listOf("amphibia.pdf", "amphibia.pdf") //nama file pdf yang ada di folder assets
        lv_materi = view.findViewById(R.id.lv_materi) as ListView

        // memberikan adapter ke ListView
        lv_materi.adapter = ArrayAdapter(requireContext(), R.layout.list_materi, judul)
        val adapter = MyListAdapter(requireActivity(), judul)
        lv_materi.adapter = adapter

        val tv: TextView = view.findViewById(R.id.tv)
        tv.setOnClickListener(){
            val intent = Intent(activity, PDFviewer::class.java)
            startActivity(intent)
        }
        lv_materi.setOnItemClickListener { adapterView: AdapterView<*>, view2: View, i: Int, l: Long ->
            val intent = Intent(activity, PDFviewer::class.java)
            intent.putExtra("EXTRA_PDF", pdf[i])
            startActivity(intent)

        }
    }
}