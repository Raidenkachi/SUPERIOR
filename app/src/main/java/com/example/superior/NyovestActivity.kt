package com.example.superior

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class NyovestActivity : AppCompatActivity() {
    lateinit var balalu: Button
    lateinit var mcmca: Button
    lateinit var nyara: Button
    lateinit var njege: Button
    lateinit var sikutambui: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nyovest)

        balalu=findViewById(R.id.walalu)
        mcmca=findViewById(R.id.poli)
        nyara=findViewById(R.id.nara)
        njege=findViewById(R.id.sanse)
        sikutambui=findViewById(R.id.tambui)

        balalu.setOnClickListener {
            val intent= Intent(this,VybzbadgyalActivity::class.java)
            startActivity(intent)
        }

        mcmca.setOnClickListener {
            val intent= Intent(this,VybzfeverActivity::class.java)
            startActivity(intent)
        }

        nyara.setOnClickListener {
            val intent= Intent(this,VybzhiActivity::class.java)
            startActivity(intent)
        }

        njege.setOnClickListener {
            val intent= Intent(this,VybzmathsActivity::class.java)
            startActivity(intent)
        }

        sikutambui.setOnClickListener {
            val intent= Intent(this,VybzmoneyActivity::class.java)
            startActivity(intent)
        }
    }
}