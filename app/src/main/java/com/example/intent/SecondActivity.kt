package com.example.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val btnBack = findViewById<Button>(R.id.button)

        btnBack.setOnClickListener{
            // Go to Main Activity
            intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
        }
    }
}