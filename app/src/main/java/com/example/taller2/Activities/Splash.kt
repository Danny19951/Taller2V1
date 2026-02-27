package com.example.taller2.Activities

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

import com.example.taller2.R





class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_splash)
        // redireccionamiento splash a home
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, home::class.java))
        },3000)
    }
}