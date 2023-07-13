package com.example.superior

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BurnaActivity : AppCompatActivity() {
    lateinit var lastlast: Button
    lateinit var onthelow: Button
    lateinit var plenty: Button
    lateinit var rollercoaster: Button
    lateinit var ye: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_burna)

        lastlast=findViewById(R.id.ast)
        onthelow=findViewById(R.id.onth)
        plenty=findViewById(R.id.lent)
        rollercoaster=findViewById(R.id.ler)
        ye=findViewById(R.id.yey)

        lastlast.setOnClickListener {
            val intent= Intent(this,BurnalastActivity::class.java)
            startActivity(intent)
        }

        onthelow.setOnClickListener {
            val intent= Intent(this,BurnaonthelowActivity::class.java)
            startActivity(intent)
        }

        plenty.setOnClickListener {
            val intent= Intent(this,BurnaplentyActivity::class.java)
            startActivity(intent)
        }

        rollercoaster.setOnClickListener {
            val intent= Intent(this,BurnarollercoasterActivity::class.java)
            startActivity(intent)
        }

        ye.setOnClickListener {
            val intent= Intent(this,BurnayeActivity::class.java)
            startActivity(intent)
        }
    }
}