package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.github.barteksc.pdfviewer.PDFView

class PDFviewer : AppCompatActivity() {
    lateinit var pdFviewer: PDFView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pdfviewer)
         pdFviewer= findViewById(R.id.pdfView)
        val pdfName = intent.getStringExtra("EXTRA_PDF")
        pdFviewer.fromAsset(pdfName)
            .enableSwipe(true)
            .enableDoubletap(true)
            .defaultPage(0)
            .enableAnnotationRendering(false)
            .password(null)
            .scrollHandle(null)
            .enableAntialiasing(true)
            .spacing(0)
            .load()
    }
}