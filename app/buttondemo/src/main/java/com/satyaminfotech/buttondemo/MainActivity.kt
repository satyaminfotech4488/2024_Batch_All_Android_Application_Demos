package com.satyaminfotech.buttondemo

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

   // lateinit var click: Button
   // lateinit var text: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var click = findViewById<Button>(R.id.btnClick)
        var text = findViewById<TextView>(R.id.tv)

        click.setOnClickListener {
            text.setText("Welcome to Android")
        }
    }
}