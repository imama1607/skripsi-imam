package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.*
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import com.example.myapplication.R

class IdentifikasiFragment : Fragment() {
    lateinit var myWebView: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this

        return inflater.inflate(R.layout.fragment_identifikasi, container, false)

    }



  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
      myWebView = view.findViewById(R.id.webview_idenfitikasi)
        myWebView.webViewClient = WebViewClient()
        myWebView.loadUrl("http://Amphibiaweb.org")
        myWebView.settings.javaScriptEnabled = true
        myWebView.settings.allowContentAccess = true
        myWebView.settings.domStorageEnabled = true
        myWebView.settings.useWideViewPort = true

        myWebView.canGoBack()
        myWebView.setOnKeyListener(View.OnKeyListener { v , keyCode, event ->
            if (keyCode == KeyEvent.KEYCODE_BACK

                && event.action == MotionEvent.ACTION_UP
                && myWebView.canGoBack()){
                myWebView.goBack()
                return@OnKeyListener true
            }
            false
        })
    }
}

