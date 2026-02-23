package com.satyaminfotech.demodatasend

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
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

        var fname = findViewById<EditText>(R.id.edtFname)
        var lname = findViewById<EditText>(R.id.edtLname)
        var send = findViewById<Button>(R.id.btnSend)

        send.setOnClickListener {
            //logic
            var intent = Intent(this, second::class.java)
            var firstname = fname.text.toString()
            var lastname = lname.text.toString()
            intent.putExtra("FNAME",firstname)
            intent.putExtra("LNAME",lastname)
            startActivity(intent)


        }

    }
}