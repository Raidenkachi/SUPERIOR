package com.example.superior

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SabiActivity : AppCompatActivity() {
    lateinit var away: Button
    lateinit var beggie: Button
    lateinit var overdo: Button
    lateinit var rush: Button
    lateinit var sability: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sabi)

        away=findViewById(R.id.way)
        beggie=findViewById(R.id.egg)
        overdo=findViewById(R.id.dos)
        rush=findViewById(R.id.ush)
        sability=findViewById(R.id.bili)

        away.setOnClickListener {
            val intent= Intent(this,SabiawayActivity::class.java)
            startActivity(intent)
        }

        beggie.setOnClickListener {
            val intent= Intent(this,SabibeggieActivity::class.java)
            startActivity(intent)
        }

        overdo.setOnClickListener {
            val intent= Intent(this,SabioverdoseActivity::class.java)
            startActivity(intent)
        }

        rush.setOnClickListener {
            val intent= Intent(this,SabirushActivity::class.java)
            startActivity(intent)
        }

        sability.setOnClickListener {
            val intent= Intent(this,SabisabilityActivity::class.java)
            startActivity(intent)
        }
    }
}