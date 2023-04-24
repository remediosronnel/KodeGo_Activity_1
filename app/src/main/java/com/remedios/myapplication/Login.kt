package com.remedios.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class Login : AppCompatActivity() {

    lateinit var et:EditText
    lateinit var st:String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Log in"

        et=findViewById(R.id.et_username)

        val button:Button = findViewById(R.id.login)

        button.setOnClickListener {
            val intent = Intent(this, RegistrationSuccessful::class.java)
            st=et.text.toString()
            intent.putExtra("Value", st)
            startActivity(intent)
        }
    }

}