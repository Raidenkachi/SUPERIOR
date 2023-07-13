package com.example.superior

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class KhaliActivity : AppCompatActivity() {
    lateinit var yezbana: Button
    lateinit var omolo: Button
    lateinit var opendoorz: Button
    lateinit var kwenda: Button
    lateinit var mbona: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_khali)

        yezbana=findViewById(R.id.bana)
        omolo=findViewById(R.id.molo)
        opendoorz=findViewById(R.id.doors)
        kwenda=findViewById(R.id.enda)
        mbona=findViewById(R.id.bona)

        yezbana.setOnClickListener {
            val intent= Intent(this,YesbanaActivity::class.java)
            startActivity(intent)
        }

        omolo.setOnClickListener {
            val intent= Intent(this,OmoloActivity::class.java)
            startActivity(intent)
        }

        opendoorz.setOnClickListener {
            val intent= Intent(this,OpenDoorzActivity::class.java)
            startActivity(intent)
        }

        kwenda.setOnClickListener {
            val intent= Intent(this,KwendaActivity::class.java)
            startActivity(intent)
        }

        mbona.setOnClickListener {
            val intent= Intent(this,MbonaActivity::class.java)
            startActivity(intent)
        }

    }
}