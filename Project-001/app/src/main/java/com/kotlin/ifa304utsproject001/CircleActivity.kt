package com.kotlin.ifa304utsproject001

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class CircleActivity : AppCompatActivity() {
    /*  inisialisasi Object */
    lateinit var etxtJarijari : EditText
    lateinit var etxtHasil : EditText
    lateinit var btnHitungLuas : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_circle)

        /*  set object */
        etxtJarijari = findViewById(R.id.editTextJarijari)
        etxtHasil = findViewById(R.id.editTextHasil)
        btnHitungLuas = findViewById(R.id.btn_hitung_luas)

        btnHitungLuas.setOnClickListener {
            val jarijari = etxtJarijari.text.toString().toDouble()
            val phi = 3.14
            val luas = phi * Math.pow(jarijari, 2.0)
            Log.v("Perhitungan", "Jari : " + jarijari + ", luas : " + luas)

            etxtHasil.setText(luas.toString())
        }
    }
}