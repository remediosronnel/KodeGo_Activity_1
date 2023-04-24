package com.remedios.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import org.w3c.dom.Text

class RegistrationSuccessful:AppCompatActivity() {
    lateinit var tv:TextView
    lateinit var st:String
    lateinit var textView:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registration_successful)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Final stage"


        tv = findViewById(R.id.textView14)
        st = intent.extras?.getString("Value").toString()
        tv.text = st

        textView = findViewById(R.id.textView17)
        textView.setOnClickListener{
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }

    }


}