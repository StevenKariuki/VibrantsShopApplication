package com.example.vibrantsshopapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlin.math.sign

class SignupApplication : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup_application)

        val signUpButton = findViewById<Button>(R.id.signup_button)

        signUpButton.setOnClickListener {
            Toast.makeText(this, "WELCOME TO VI_BRANT'S ", Toast.LENGTH_SHORT).show()
            val signUpIntent = Intent(this, MainActivity::class.java)
            startActivity(signUpIntent)
        }
    }
}