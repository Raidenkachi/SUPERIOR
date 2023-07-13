package com.example.superior

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class KaigaActivity : AppCompatActivity() {
    lateinit var ceiling: Button
    lateinit var chain: Button
    lateinit var hapoyu: Button
    lateinit var iwant: Button
    lateinit var nikoon: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kaiga)

        ceiling=findViewById(R.id.cei)
        chain=findViewById(R.id.chai)
        hapoyu=findViewById(R.id.apo)
        iwant=findViewById(R.id.want)
        nikoon=findViewById(R.id.ikoon)

        ceiling.setOnClickListener {
            val intent= Intent(this,CeilingActivity::class.java)
            startActivity(intent)
        }

        chain.setOnClickListener {
            val intent= Intent(this,ChainActivity::class.java)
            startActivity(intent)
        }

        hapoyu.setOnClickListener {
            val intent= Intent(this,HapotuActivity::class.java)
            startActivity(intent)
        }

        iwant.setOnClickListener {
            val intent= Intent(this,IwantActivity::class.java)
            startActivity(intent)
        }

        nikoon.setOnClickListener {
            val intent= Intent(this,NikoonActivity::class.java)
            startActivity(intent)
        }

    }
}