package com.example.superior

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class WakadinaliActivity : AppCompatActivity() {
    lateinit var balalu: Button
    lateinit var mcmca: Button
    lateinit var nyara: Button
    lateinit var njege: Button
    lateinit var sikutambui: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wakadinali)

        balalu=findViewById(R.id.walalu)
        mcmca=findViewById(R.id.poli)
        nyara=findViewById(R.id.nara)
        njege=findViewById(R.id.sanse)
        sikutambui=findViewById(R.id.tambui)

        balalu.setOnClickListener {
            val intent= Intent(this,BalaluActivity::class.java)
            startActivity(intent)
        }

        mcmca.setOnClickListener {
            val intent= Intent(this,McmcaActivity::class.java)
            startActivity(intent)
        }

        nyara.setOnClickListener {
            val intent= Intent(this,NyaranyaraActivity::class.java)
            startActivity(intent)
        }

        njege.setOnClickListener {
            val intent= Intent(this,NjegeActivity::class.java)
            startActivity(intent)
        }

        sikutambui.setOnClickListener {
            val intent= Intent(this,SikutambuiActivity::class.java)
            startActivity(intent)
        }
    }
}