package com.example.superior


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class PopularActivity : AppCompatActivity() {
    lateinit var wakadinali: ImageView
    lateinit var khali: ImageView
    lateinit var nyashinski: ImageView
    lateinit var mejja: ImageView
    lateinit var kaiga: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_popular)

        wakadinali = findViewById(R.id.ema)
        khali = findViewById(R.id.urna)
        nyashinski = findViewById(R.id.abi)
        mejja = findViewById(R.id.eja)
        kaiga = findViewById(R.id.sake)

        wakadinali.setOnClickListener {
            val intent = Intent(this, WakadinaliActivity::class.java)
            startActivity(intent)
        }

        khali.setOnClickListener {
            val intent = Intent(this, KhaliActivity::class.java)
            startActivity(intent)
        }


        nyashinski.setOnClickListener {
            val intent = Intent(this, NyashinskiActivity::class.java)
            startActivity(intent)
        }

        mejja.setOnClickListener {
            val intent = Intent(this, MejjaActivity::class.java)
            startActivity(intent)
        }

        kaiga.setOnClickListener {
            val intent = Intent(this, KaigaActivity::class.java)
            startActivity(intent)
        }

    }
}