package com.kotlin.ifa304utsproject001

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    /* inisialisasi object button */
    lateinit var btnLogin : Button
    lateinit var txtUsername : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        txtUsername = findViewById(R.id.editTextTextUserName)

        btnLogin = findViewById(R.id.btn_login) // setting object btnLogin dari tombol Login di activity
        btnLogin.setOnClickListener{
            Log.v("UserName", "Nama User activity login : " + txtUsername.text)

            val intent = Intent(this, HomeActivity::class.java)
            intent.putExtra("username", txtUsername.text.toString())
            startActivity(intent)
        }
    }
}