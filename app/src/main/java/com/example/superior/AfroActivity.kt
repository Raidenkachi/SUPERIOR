package com.example.superior

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class AfroActivity : AppCompatActivity() {
    lateinit var rema: ImageView
    lateinit var burna: ImageView
    lateinit var sabi: ImageView
    lateinit var ruger: ImageView
    lateinit var asake: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_afro)

        rema = findViewById(R.id.ema)
        burna = findViewById(R.id.urna)
        sabi = findViewById(R.id.abi)
        ruger = findViewById(R.id.uger)
        asake = findViewById(R.id.sake)

        rema.setOnClickListener {
            val intent = Intent(this, RemaActivity::class.java)
            startActivity(intent)
        }

        burna.setOnClickListener {
            val intent = Intent(this, BurnaActivity::class.java)
            startActivity(intent)
        }


        sabi.setOnClickListener {
            val intent = Intent(this, SabiActivity::class.java)
            startActivity(intent)
        }

        ruger.setOnClickListener {
            val intent = Intent(this, RugerActivity::class.java)
            startActivity(intent)
        }

        asake.setOnClickListener {
            val intent = Intent(this, AsakeActivity::class.java)
            startActivity(intent)
        }


    }
}