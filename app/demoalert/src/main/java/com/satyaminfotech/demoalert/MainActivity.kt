package com.satyaminfotech.demoalert

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var builder: AlertDialog.Builder
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        var click = findViewById<Button>(R.id.btn)
        builder = AlertDialog.Builder(this)
        builder.setTitle("Alert...!!!")
        builder.setMessage("Do you want to exit?")
        builder.setPositiveButton("OK"){
                dialog, which ->
            Toast.makeText(this,"Ok is clicked", Toast.LENGTH_LONG).show()
            finish()
        }
        builder.setNegativeButton("Cancel"){
                dialog, which ->
            Toast.makeText(this,"Cancel is clicked", Toast.LENGTH_LONG).show()
            //dialog.dismiss()


        }
        builder.show()


        click.setOnClickListener {
            //Create an Alert Dialog
            //Create an object of AlertDialog.Builder
            //Use few methods to set the title, write the description,
            //to place the buttons and to show the dialog.

           builder = AlertDialog.Builder(this)

            builder.setTitle("Alert...!!!")
            builder.setMessage("Do you want to exit?")
            builder.setPositiveButton("OK"){
                dialog, which ->
                Toast.makeText(this,"Ok is clicked", Toast.LENGTH_LONG).show()
                finish()
            }
            builder.setNegativeButton("Cancel"){
                dialog, which ->
                Toast.makeText(this,"Cancel is clicked", Toast.LENGTH_LONG).show()
                //dialog.dismiss()


            }
            builder.show()

        }

    }

    override fun onBackPressed() {
        builder = AlertDialog.Builder(this)

        builder.setTitle("Alert...!!!")
        builder.setMessage("Do you want to exit?")
        builder.setPositiveButton("OK"){
                dialog, which ->
            Toast.makeText(this,"Ok is clicked", Toast.LENGTH_LONG).show()
            finish()
        }
        builder.setNegativeButton("Cancel"){
                dialog, which ->
            Toast.makeText(this,"Cancel is clicked", Toast.LENGTH_LONG).show()
            //dialog.dismiss()


        }
        builder.show()


    }
}