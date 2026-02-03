package com.satyaminfotech.autocompletedemo

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
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

        var autoCT = findViewById<AutoCompleteTextView>(R.id.auto)

        var countries = arrayOf("India","Australia","China","India1","India2","China1","China2","Russia","USA","Russia1")

        var adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            countries)



        autoCT.threshold = 1
        autoCT.setAdapter(adapter)

        autoCT.setOnItemClickListener{parent, view,
                                      position, id ->
            Toast.makeText(this,
                countries[position],
                Toast.LENGTH_LONG).show()

        }






    }
}