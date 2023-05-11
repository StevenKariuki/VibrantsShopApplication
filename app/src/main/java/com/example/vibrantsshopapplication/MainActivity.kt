package com.example.vibrantsshopapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.json.JSONObject

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editUsername = findViewById<EditText>(R.id.username_edittext)
        val editpassword = findViewById<EditText>(R.id.password_edittext)



//        val signUpButton = findViewById<Button>(R.id.signup_button)
        val loginButton = findViewById<Button>(R.id.login_button)

        loginButton.setOnClickListener {

            val payload = JSONObject()
            payload.put("username",editUsername.text.toString())
            payload.put("password", editpassword.text.toString())

            val api = "http://stevenkariuki9.pythonanywhere.com/users"

            val helper = ApiHelper(applicationContext)
            helper.get(api,object :ApiHelper.CallBack{
                override fun onSuccess(result: String?) {

                    val loginIntent = Intent(applicationContext, VibrantsPageApplication::class.java)
                    startActivity(loginIntent)

                }
            })


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