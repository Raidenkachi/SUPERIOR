package com.example.superior

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NyashinskiActivity : AppCompatActivity() {
    lateinit var goals: Button
    lateinit var finyo: Button
    lateinit var kebs: Button
    lateinit var proper: Button
    lateinit var sweet: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nyashinski)

        goals=findViewById(R.id.oals)
        finyo=findViewById(R.id.inyo)
        kebs=findViewById(R.id.ebs)
        proper=findViewById(R.id.oper)
        sweet=findViewById(R.id.weet)

        goals.setOnClickListener {
            val intent= Intent(this,GoalsActivity::class.java)
            startActivity(intent)
        }

        finyo.setOnClickListener {
            val intent= Intent(this,FinyoActivity::class.java)
            startActivity(intent)
        }

        proper.setOnClickListener {
            val intent= Intent(this,ProperActivity::class.java)
            startActivity(intent)
        }

        kebs.setOnClickListener {
            val intent= Intent(this,KebzActivity::class.java)
            startActivity(intent)
        }

        sweet.setOnClickListener {
            val intent= Intent(this,SweetActivity::class.java)
            startActivity(intent)
        }

    }
}