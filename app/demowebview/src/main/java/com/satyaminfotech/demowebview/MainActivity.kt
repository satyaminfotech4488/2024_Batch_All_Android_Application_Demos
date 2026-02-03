package com.satyaminfotech.demowebview

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var web = findViewById<WebView>(R.id.wv)

        web.settings.apply {

            javaScriptEnabled = true
        }
        web.webViewClient = WebViewClient()
        web.loadUrl("https://www.rku.ac.in")







    }
}