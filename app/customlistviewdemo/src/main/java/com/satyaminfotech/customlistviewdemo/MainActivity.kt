package com.satyaminfotech.customlistviewdemo

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var lv = findViewById<ListView>(R.id.lv)

        var ArraySocial = arrayOf(
            SocialMedia(R.drawable.twitter,"Twitter","This is Twitter"),
            SocialMedia(R.drawable.chatgpt,"Chatgpt","This is Chatgpt"),
            SocialMedia(R.drawable.google,"Google","This is Google"),
            SocialMedia(R.drawable.facebook,"Facebook","This is Facebook"),
            SocialMedia(R.drawable.whatsapp,"WhatsApp","This is WhatsApp"),
            SocialMedia(R.drawable.linkedin,"LinkedIn","This is LinkedIn"),
            SocialMedia(R.drawable.instagram,"Instagram","This is Instagram"),
            SocialMedia(R.drawable.youtube,"Youtube","This is Youtube"),
            SocialMedia(R.drawable.tiktok,"Tiktok","This is Tiktok")
        )

        var adapter = CustomAdapter(this,ArraySocial)
        lv.adapter = adapter

        lv.setOnItemClickListener{
            parent, view, position, id ->
            Toast.makeText(this, "Clicked", Toast.LENGTH_LONG).show()
        }
    }
}