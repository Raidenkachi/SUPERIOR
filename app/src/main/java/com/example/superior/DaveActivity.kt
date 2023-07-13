package com.example.superior

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DaveActivity : AppCompatActivity() {
    lateinit var funky: Button
    lateinit var location: Button
    lateinit var sprinter: Button
    lateinit var starlight: Button
    lateinit var streatham: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dave)

        funky=findViewById(R.id.unky)
        location=findViewById(R.id.ocation)
        sprinter=findViewById(R.id.inter)
        starlight=findViewById(R.id.ight)
        streatham=findViewById(R.id.ham)

        funky.setOnClickListener {
            val intent= Intent(this,FunkyActivity::class.java)
            startActivity(intent)
        }

        location.setOnClickListener {
            val intent= Intent(this,LocationActivity::class.java)
            startActivity(intent)
        }

        sprinter.setOnClickListener {
            val intent= Intent(this,SprinterActivity::class.java)
            startActivity(intent)
        }

        starlight.setOnClickListener {
            val intent= Intent(this,StarlightActivity::class.java)
            startActivity(intent)
        }

        streatham.setOnClickListener {
            val intent= Intent(this,StreathamActivity ::class.java)
            startActivity(intent)
        }
    }
}