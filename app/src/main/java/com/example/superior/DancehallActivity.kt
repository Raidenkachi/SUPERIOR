package com.example.superior

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class DancehallActivity : AppCompatActivity() {
    lateinit var konshens: ImageView
    lateinit var demarco: ImageView
    lateinit var vybz: ImageView
    lateinit var popcaan: ImageView
    lateinit var busy: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dancehall)

        konshens = findViewById(R.id.nsh)
        demarco = findViewById(R.id.mar)
        vybz = findViewById(R.id.bz)
        popcaan= findViewById(R.id.caan)
        busy = findViewById(R.id.sign)

        konshens.setOnClickListener {
            val intent = Intent(this, KonshensActivity::class.java)
            startActivity(intent)
        }

        demarco.setOnClickListener {
            val intent = Intent(this, DemarcoActivity::class.java)
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