package com.example.superior

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class KonshensActivity : AppCompatActivity() {
    lateinit var brukoff: Button
    lateinit var bubble: Button
    lateinit var gyal: Button
    lateinit var pullup: Button
    lateinit var turnme: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_konshens)

        brukoff=findViewById(R.id.rukoff)
        bubble=findViewById(R.id.uble)
        gyal=findViewById(R.id.yal)
        pullup=findViewById(R.id.ullup)
        turnme=findViewById(R.id.urnme)

        brukoff.setOnClickListener {
            val intent= Intent(this,KonshensbrukoffActivity::class.java)
            startActivity(intent)
        }

        bubble.setOnClickListener {
            val intent= Intent(this,KonshensbubbleActivity::class.java)
            startActivity(intent)
        }

        gyal.setOnClickListener {
            val intent= Intent(this,KonshensgyalActivity::class.java)
            startActivity(intent)
        }

        pullup.setOnClickListener {
            val intent= Intent(this,KonshenspullupActivity::class.java)
            startActivity(intent)
        }

        turnme.setOnClickListener {
            val intent= Intent(this,KonshensturnmeActivity::class.java)
            startActivity(intent)
        }

    }
}