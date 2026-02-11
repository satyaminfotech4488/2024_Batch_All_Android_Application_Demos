package com.satyaminfotech.demosplash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_splash)
        //Handler class
        // postDelayed() method
        //Object of any class var obj = Classname()
        //var obj = Handler();
       // obj.postDelayed()

        Handler().postDelayed(
            {
                var intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            },5000
        )

    }
}