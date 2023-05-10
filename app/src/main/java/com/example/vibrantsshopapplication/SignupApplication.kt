package com.example.vibrantsshopapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.json.JSONObject
import android.text.TextUtils
import kotlin.math.sign

class SignupApplication : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup_application)


        val username = findViewById<TextView>(R.id.username_edittext)
        val email = findViewById<TextView>(R.id.email_edittext)
        val password = findViewById<TextView>(R.id.password_edittext)
        val confirm = findViewById<TextView>(R.id.confirm_password_edittext)
        val phone = findViewById<TextView>(R.id.phone_number)


        val signUpButton = findViewById<Button>(R.id.signup_button)

        signUpButton.setOnClickListener {
            Toast.makeText(this, "WELCOME TO VI_BRANT'S ", Toast.LENGTH_SHORT).show()
            val signUpIntent = Intent(this, MainActivity::class.java)
            startActivity(signUpIntent)

            val payload = JSONObject()

            payload.put("username",username.text.toString())
            payload.put("email",email.text.toString())
            payload.put("password",password.text.toString())
            payload.put("confirm",confirm.text.toString())
            payload.put("phone",phone.text.toString())

            val api = "http://bernardkamotho.pythonanywhere.com/user"

            val helpler = ApiHelper(applicationContext)

            helpler.post(api, payload)

//          if(username.TextUtils.isEmpty{
//
//              Toast.makeText(this, "Please FIll in the credentials", Toast.LENGTH_SHORT).show()
//
//          }
//
//            else{
//
//              val intent = Intent(applicationContext,MainActivity::class.java)
//              startActivity(intent)



        }
    }
}