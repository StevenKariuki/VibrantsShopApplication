package com.example.vibrantsshopapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)





//        val signUpButton = findViewById<Button>(R.id.signup_button)
        val loginButton = findViewById<Button>(R.id.login_button)

        loginButton.setOnClickListener {
            Toast.makeText(this, "WELCOME BACK", Toast.LENGTH_SHORT).show()
            val loginIntent = Intent(applicationContext, VibrantsPageApplication::class.java)
            startActivity(loginIntent)
        }

//        signUpButton.setOnClickListener {
//            Toast.makeText(this, "Sign Up", Toast.LENGTH_SHORT).show()
//            val signupIntent = Intent(applicationContext, SignupApplication::class.java)
//            startActivity(signupIntent)
//        }

        val signuptext = findViewById<TextView>(R.id.signup_text)
        signuptext.setOnClickListener {
            val intent = Intent(applicationContext, SignupApplication::class.java)
            startActivity(intent)
        }

    }
}