package com.example.vibrantsshopapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val signUpButton = findViewById<Button>(R.id.signup_button)
        val loginButton = findViewById<Button>(R.id.login_button)

        loginButton.setOnClickListener {
            Toast.makeText(this, "WELCOME BACK", Toast.LENGTH_SHORT).show()

        }

        signUpButton.setOnClickListener {
            Toast.makeText(this, "Sign Up", Toast.LENGTH_SHORT).show()
            val signUpIntent = Intent(this, SignupApplication::class.java)
            startActivity(signUpIntent)

        }

    }
}