package com.satyaminfotech.demopracticecustomlistview

import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var l = findViewById<ListView>(R.id.lv)

        var arraySocial = arrayOf(
            SocialMedia(R.drawable.google,"Google","This is Google"),
            SocialMedia(R.drawable.tiktok,"Tiktok","This is Tiktok"),
            SocialMedia(R.drawable.chatgpt,"Chatgpt","This is ChatGpt"),
            SocialMedia(R.drawable.youtube,"Youtube","This is Youtube")
        )

        var adapter = CustomAdapter(this, arraySocial)

        l.adapter = adapter



    }
}