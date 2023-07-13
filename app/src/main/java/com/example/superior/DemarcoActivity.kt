package com.example.superior

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DemarcoActivity : AppCompatActivity() {
    lateinit var comfort: Button
    lateinit var elon: Button
    lateinit var fix: Button
    lateinit var love: Button
    lateinit var soldiers: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demarco)

        comfort=findViewById(R.id.rukoff)
        elon=findViewById(R.id.uble)
        fix=findViewById(R.id.yal)
        love=findViewById(R.id.ullup)
        soldiers=findViewById(R.id.urnme)

        comfort.setOnClickListener {
            val intent= Intent(this,DemarcocomfortActivity::class.java)
            startActivity(intent)
        }

        elon.setOnClickListener {
            val intent= Intent(this,DemarcoelonActivity::class.java)
            startActivity(intent)
        }

        fix.setOnClickListener {
            val intent= Intent(this,DemarcofixActivity::class.java)
            startActivity(intent)
        }

        love.setOnClickListener {
            val intent= Intent(this,DEMARCOLIFEActivity::class.java)
            startActivity(intent)
        }

        soldiers.setOnClickListener {
            val intent= Intent(this,DemarcosoldiersActivity::class.java)
            startActivity(intent)
        }


    }
}