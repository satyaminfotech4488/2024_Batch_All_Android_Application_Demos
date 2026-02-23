package com.satyaminfotech.demodatasend

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class second : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)

        var tfname = findViewById<TextView>(R.id.tvfname)
        var tlname = findViewById<TextView>(R.id.tvlname)

        var fname = intent.getStringExtra("FNAME")
        var lname = intent.getStringExtra("LNAME")

        tfname.setText(fname.toString())
        tlname.setText(lname.toString())




    }
}