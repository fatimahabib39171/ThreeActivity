package com.example.threeactivity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Screen3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen3) // Signup XML

        val usernameInput = findViewById<EditText>(R.id.usernameInput)
        val emailInput = findViewById<EditText>(R.id.emailInput)
        val passwordInput = findViewById<EditText>(R.id.passwordInput)
        val verpassInput = findViewById<EditText>(R.id.verpassInput)
        val loginBtn = findViewById<Button>(R.id.loginBtn)
        val signupBtn = findViewById<Button>(R.id.signupBtn)
        val backBtn = findViewById<Button>(R.id.backButton)

        signupBtn.setOnClickListener {
            val username = usernameInput.text.toString()
            val email = emailInput.text.toString()
            val password = passwordInput.text.toString()
            val verifyPass = verpassInput.text.toString()

            when {
                username.isEmpty() || email.isEmpty() || password.isEmpty() || verifyPass.isEmpty() ->
                    Toast.makeText(this, "All fields are required", Toast.LENGTH_SHORT).show()
                password != verifyPass ->
                    Toast.makeText(this, "Passwords do not match", Toast.LENGTH_SHORT).show()
                else -> Toast.makeText(this, "Account created successfully", Toast.LENGTH_SHORT).show()
            }
        }

        loginBtn.setOnClickListener {
            val intent = Intent(this, Screen2::class.java)
            startActivity(intent)
        }

        backBtn.setOnClickListener {
            finish() // Go back to previous screen
        }
    }
}
