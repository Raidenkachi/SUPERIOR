package com.example.superior

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DailyActivity : AppCompatActivity() {
    lateinit var central: Button
    lateinit var jhus: Button
    lateinit var jme: Button
    lateinit var kweng: Button
    lateinit var nsg: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daily)

        central=findViewById(R.id.entral)
        jhus=findViewById(R.id.hu)
        jme=findViewById(R.id.m)
        kweng=findViewById(R.id.eng)
        nsg=findViewById(R.id.s)

        central.setOnClickListener {
            val intent= Intent(this,DuppyceeActivity::class.java)
            startActivity(intent)
        }

        jhus.setOnClickListener {
            val intent= Intent(this,DuppyhusActivity::class.java)
            startActivity(intent)
        }

        jme.setOnClickListener {
            val intent= Intent(this,DuppyjmeActivity::class.java)
            startActivity(intent)
        }

        kweng.setOnClickListener {
            val intent= Intent(this,DuppykwengActivity::class.java)
            startActivity(intent)
        }

        nsg.setOnClickListener {
            val intent= Intent(this,DuppynsgActivity ::class.java)
            startActivity(intent)
        }
    }
}