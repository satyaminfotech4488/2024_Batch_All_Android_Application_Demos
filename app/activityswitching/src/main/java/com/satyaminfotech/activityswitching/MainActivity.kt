package com.satyaminfotech.activityswitching

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
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

        var text = findViewById<TextView>(R.id.tvFirst)
        var next = findViewById<Button>(R.id.btnNext)

        next.setOnClickListener {
            Toast.makeText(this,"Test", Toast.LENGTH_LONG).show()
            val intent = Intent(this, Second::class.java)
            startActivity(intent);


        }
    }
}