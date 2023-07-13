package com.example.superior

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PopcaanActivity : AppCompatActivity() {
    lateinit var celebrate: Button
    lateinit var family: Button
    lateinit var firm: Button
    lateinit var money: Button
    lateinit var type: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_popcaan)

        celebrate=findViewById(R.id.rukoff)
        family=findViewById(R.id.uble)
        firm=findViewById(R.id.yal)
        money=findViewById(R.id.ullup)
        type=findViewById(R.id.urnme)

        celebrate.setOnClickListener {
            val intent= Intent(this,PopcaancelebrateActivity::class.java)
            startActivity(intent)
        }

        family.setOnClickListener {
            val intent= Intent(this,PopcaanfamilyActivity::class.java)
            startActivity(intent)
        }

        firm.setOnClickListener {
            val intent= Intent(this,PopcaanfirmActivity ::class.java)
            startActivity(intent)
        }

        money.setOnClickListener {
            val intent= Intent(this,PopcaanmoneyActivity::class.java)
            startActivity(intent)
        }

        type.setOnClickListener {
            val intent= Intent(this,PopcaantypeActivity::class.java)
            startActivity(intent)
        }
    }
}