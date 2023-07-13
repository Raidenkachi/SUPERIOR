package com.example.superior

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class GengeActivity : AppCompatActivity() {
    lateinit var konshens: ImageView
    lateinit var demarco: ImageView
    lateinit var vybz: ImageView
    lateinit var popcaan: ImageView
    lateinit var busy: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_genge)

        konshens = findViewById(R.id.ema)
        demarco = findViewById(R.id.urna)
        vybz = findViewById(R.id.abi)
        popcaan= findViewById(R.id.uger)
        busy = findViewById(R.id.sake)

        konshens.setOnClickListener {
            val intent = Intent(this, KhaliActivity::class.java)
            startActivity(intent)
        }

        demarco.setOnClickListener {
            val intent = Intent(this, WakadinaliActivity::class.java)
            startActivity(intent)
        }


        vybz.setOnClickListener {
            val intent = Intent(this, MejjaActivity::class.java)
            startActivity(intent)
        }

        popcaan.setOnClickListener {
            val intent = Intent(this, KaigaActivity::class.java)
            startActivity(intent)
        }

        busy.setOnClickListener {
            val intent = Intent(this, NyashinskiActivity::class.java)
            startActivity(intent)
        }

    }
}