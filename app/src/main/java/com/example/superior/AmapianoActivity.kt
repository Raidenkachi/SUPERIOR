package com.example.superior

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class AmapianoActivity : AppCompatActivity() {
    lateinit var konshens: ImageView
    lateinit var demarco: ImageView
    lateinit var vybz: ImageView
    lateinit var popcaan: ImageView
    lateinit var busy: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_amapiano)

        konshens = findViewById(R.id.ema)
        demarco = findViewById(R.id.urna)
        vybz = findViewById(R.id.abi)
        popcaan= findViewById(R.id.uger)
        busy = findViewById(R.id.sake)

        konshens.setOnClickListener {
            val intent = Intent(this, NyovestActivity::class.java)
            startActivity(intent)
        }

        demarco.setOnClickListener {
            val intent = Intent(this, WakadinaliActivity::class.java)
            startActivity(intent)
        }


        vybz.setOnClickListener {
            val intent = Intent(this, VybzActivity::class.java)
            startActivity(intent)
        }

        popcaan.setOnClickListener {
            val intent = Intent(this, PopcaanActivity::class.java)
            startActivity(intent)
        }

        busy.setOnClickListener {
            val intent = Intent(this, AsakeActivity::class.java)
            startActivity(intent)
        }

    }
}