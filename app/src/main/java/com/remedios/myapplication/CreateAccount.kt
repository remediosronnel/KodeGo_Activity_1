package com.remedios.myapplication


import android.content.Intent
import android.os.Bundle
import android.text.InputType
import android.widget.Button
import android.widget.EditText

import androidx.appcompat.app.AppCompatActivity


class CreateAccount:AppCompatActivity() {
    private lateinit var button:Button
    private lateinit var password:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.create_account)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Create Account"

        password = findViewById(R.id.et_password1)




        button = findViewById(R.id.button2)
        button.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }

    }
}