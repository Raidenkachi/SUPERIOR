package com.example.superior

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BiggieActivity : AppCompatActivity() {
    lateinit var hynotize: Button
    lateinit var poppa: Button
    lateinit var juicy: Button
    lateinit var warning: Button
    lateinit var sky: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biggie)

        hynotize=findViewById(R.id.hypno)
        poppa=findViewById(R.id.popa)
        juicy=findViewById(R.id.uicy)
        warning=findViewById(R.id.arning)
        sky=findViewById(R.id.imit)

        hynotize.setOnClickListener {
            val intent= Intent(this,HypnotizeActivity::class.java)
            startActivity(intent)
        }

        poppa.setOnClickListener {
            val intent= Intent(this,PoppaActivity::class.java)
            startActivity(intent)
        }

        juicy.setOnClickListener {
            val intent= Intent(this,JuicyActivity::class.java)
            startActivity(intent)
        }

        warning.setOnClickListener {
            val intent= Intent(this,WarningActivity::class.java)
            startActivity(intent)
        }

        sky.setOnClickListener {
            val intent= Intent(this,SkyActivity::class.java)
            startActivity(intent)
        }
    }
}