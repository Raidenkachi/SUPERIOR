package com.example.superior

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DiggaActivity : AppCompatActivity() {
    lateinit var woi: Button
    lateinit var k17: Button
    lateinit var bluwuu: Button
    lateinit var chingy: Button
    lateinit var spiderman: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_digga)

        woi=findViewById(R.id.oi)
        k17=findViewById(R.id.enteen)
        bluwuu=findViewById(R.id.blue)
        chingy=findViewById(R.id.ingy)
        spiderman=findViewById(R.id.der)

        woi.setOnClickListener {
            val intent= Intent(this,DiggawoiActivity::class.java)
            startActivity(intent)
        }

        k17.setOnClickListener {
            val intent= Intent(this,SeventeenActivity::class.java)
            startActivity(intent)
        }

        bluwuu.setOnClickListener {
            val intent= Intent(this,DiggaBluwuuActivity::class.java)
            startActivity(intent)
        }

        chingy.setOnClickListener {
            val intent= Intent(this,DiggachingyActivity::class.java)
            startActivity(intent)
        }

        woi.setOnClickListener {
            val intent= Intent(this,DiggawoiActivity::class.java)
            startActivity(intent)
        }

    }
}