package com.satyaminfotech.demosharedpref

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
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

        var edtuser = findViewById<EditText>(R.id.edtUsername)
        var edtpass = findViewById<EditText>(R.id.edtPassword)
        var sp = getSharedPreferences("MyPref",MODE_PRIVATE)
        var getUser = sp.getString("username","")
        var getPass = sp.getString("password","")
        edtuser.setText(getUser.toString())
        edtpass.setText(getPass.toString())

        var send = findViewById<Button>(R.id.btnSend)
        var fetch = findViewById<Button>(R.id.btnFetch)

        var t = findViewById<TextView>(R.id.tv)


        var editor = sp.edit()


        send.setOnClickListener {
            var euser = edtuser.text.toString()
            var epass = edtpass.text.toString()

            editor.putString("username",euser)
            editor.putString("password",epass)

            editor.apply()
            Toast.makeText(this,"Data is inserted", Toast.LENGTH_LONG).show()

        }

        fetch.setOnClickListener {

            var user = sp.getString("username","")
            var pass = sp.getString("password","")

            //Username: value
            //"Username: $user"
            //password: value
            t.setText("Username: $user\n Password : $pass")

            

        }

    }
}