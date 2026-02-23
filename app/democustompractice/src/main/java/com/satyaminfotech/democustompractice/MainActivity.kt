package com.satyaminfotech.democustompractice

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
            SocialMedia(R.drawable.tiktok,"TikTok","This is TikTok"),
            SocialMedia(R.drawable.google,"Google","This is Google"),
            SocialMedia(R.drawable.youtube,"YouTube","This is YouTube"),
            SocialMedia(R.drawable.chatgpt,"ChatGpt","This is ChatGpt"),
            SocialMedia(R.drawable.twitter,"Twitter","This is Twitter")
        )

        var adapter = CustomAdapter(this,arraySocial)
        l.adapter = adapter
    }
}