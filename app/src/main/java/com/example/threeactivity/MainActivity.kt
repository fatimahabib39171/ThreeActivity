package com.example.threeactivity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Home / Welcome XML

        val continueBtn = findViewById<Button>(R.id.buttonContinue)
        continueBtn.setOnClickListener {
            // Go to Login Screen (Screen2)
            val intent = Intent(this, Screen2::class.java)
            startActivity(intent)
        }
    }
}
