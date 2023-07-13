package com.example.superior

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class HiphopActivity : AppCompatActivity() {
    lateinit var biggie: ImageView
    lateinit var digga: ImageView
    lateinit var daily: ImageView
    lateinit var dave: ImageView
    lateinit var eminem: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hiphop)

        biggie = findViewById(R.id.skar)
        digga = findViewById(R.id.iga)
        daily = findViewById(R.id.nski)
        dave = findViewById(R.id.siogopi)
        eminem = findViewById(R.id.nayo)

        biggie.setOnClickListener {
            val intent = Intent(this, BiggieActivity::class.java)
            startActivity(intent)
        }

        digga.setOnClickListener {
            val intent = Intent(this, DiggaActivity::class.java)
            startActivity(intent)
        }


        daily.setOnClickListener {
            val intent = Intent(this, DailyActivity::class.java)
            startActivity(intent)
        }

        dave.setOnClickListener {
            val intent = Intent(this, DaveActivity::class.java)
            startActivity(intent)
        }

        eminem.setOnClickListener {
            val intent = Intent(this, EminemActivity::class.java)
            startActivity(intent)
        }



    }
}