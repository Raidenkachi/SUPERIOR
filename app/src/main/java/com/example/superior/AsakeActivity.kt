package com.example.superior

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AsakeActivity : AppCompatActivity() {
    lateinit var amapiano: Button
    lateinit var bandana: Button
    lateinit var basquit: Button
    lateinit var organise: Button
    lateinit var sungba: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_asake)

        amapiano=findViewById(R.id.map)
        bandana=findViewById(R.id.andan)
        basquit=findViewById(R.id.squi)
        organise=findViewById(R.id.gani)
        sungba=findViewById(R.id.ungba)

        amapiano.setOnClickListener {
            val intent= Intent(this,AsakeamapianoActivity::class.java)
            startActivity(intent)
        }

        bandana.setOnClickListener {
            val intent= Intent(this,AsakebandanaActivity::class.java)
            startActivity(intent)
        }

        basquit.setOnClickListener {
            val intent= Intent(this,AsakebasquitActivity::class.java)
            startActivity(intent)
        }

        organise.setOnClickListener {
            val intent= Intent(this,AsakeorganiseActivity::class.java)
            startActivity(intent)
        }

        sungba.setOnClickListener {
            val intent= Intent(this,AsakesungbaActivity::class.java)
            startActivity(intent)
        }
    }
}