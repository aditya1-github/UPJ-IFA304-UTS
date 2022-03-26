package com.kotlin.ifa304utsproject002

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    /* inisialisasi object button */
    lateinit var imgBtnMenuAnggota : ImageButton        // object untuk menu anggota
    lateinit var imgBtnMenuOrganisasi : ImageButton     // object untuk menu organisasi
    lateinit var imgBtnMenuBreed : ImageButton          // object untuk menu breed
    lateinit var imgBtnMenuAcara : ImageButton          // object untuk menu acara

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        /*  membangun object */
        imgBtnMenuAnggota = findViewById(R.id.imageButtonMenuAnggota)
        imgBtnMenuOrganisasi = findViewById(R.id.imageButtonMenuOrganisasi)
        imgBtnMenuBreed = findViewById(R.id.imageButtonMenuBreed)
        imgBtnMenuAcara = findViewById(R.id.imageButtonMenuAcara)

        /*  membuat onClik image button */
        imgBtnMenuAnggota.setOnClickListener {
            Log.v("Tombol", "tombol menu anggota")                          // Log berhasil kelik tombol menu anggota
            val intent = Intent(this, AnggotaActivity::class.java)      // membuat object intent untuk pindah ke activity anggota
            startActivity(intent)                                                     // pindah activity
        }

        imgBtnMenuOrganisasi.setOnClickListener {
            Log.v("Tombol", "tombol menu organisasi")                       // Log berhasil kelik tombol menu organisasi
            val intent = Intent(this, OrganisasiActivity::class.java)   // membuat object intent untuk pindah ke activity Organisasi
            startActivity(intent)                                                     // pindah activity
        }

        imgBtnMenuBreed.setOnClickListener {
            Log.v("Tombol", "tombol menu breed")                        // Log berhasil kelik tombol menu breed
            val intent = Intent(this, BreedActivity::class.java)    // membuat object intent untuk pindah ke activity Breed
            startActivity(intent)                                                 // pindah activity
        }

        imgBtnMenuAcara.setOnClickListener {
            Log.v("Tombol", "tombol menu acara")                        // Log berhasil kelik tombol menu acara
            val intent = Intent(this, AcaraActivity::class.java)    // membuat object intent untuk pindah ke activity Acara
            startActivity(intent)                                                 // pindah activity
        }

    }
}