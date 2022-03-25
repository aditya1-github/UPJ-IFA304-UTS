package com.kotlin.ifa304utsproject001

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    lateinit var txtWelcome : TextView
    lateinit var btnCircle : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        var username = intent.getStringExtra("username")    // mengambil parameter yang dikirim dari activity Logic
        Log.v("UserName", "User Name activity home : " + username.toString())   // cetak ke log untuk melihat nilai user name yang diterima

        txtWelcome = findViewById(R.id.textViewWelcome)
        txtWelcome.setText("Hello, " + username)

        btnCircle = findViewById(R.id.btn_circle)
        btnCircle.setOnClickListener{
            startActivity(Intent(this, CircleActivity::class.java))
        }


    }
}