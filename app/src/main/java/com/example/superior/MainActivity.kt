package com.example.superior

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var create: Button
    lateinit var log: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        create = findViewById(R.id.button)
        log = findViewById(R.id.button2)

        create.setOnClickListener {
            val intent = Intent(this, CREATEACCOUNTActivity::class.java)
            startActivity(intent)
            finish()
        }

        log.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}