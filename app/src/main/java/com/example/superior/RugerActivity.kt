package com.example.superior

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RugerActivity : AppCompatActivity() {
    lateinit var asiwaju: Button
    lateinit var bounce: Button
    lateinit var dior: Button
    lateinit var girlfriend: Button
    lateinit var redflags: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ruger)


        asiwaju=findViewById(R.id.waj)
        bounce=findViewById(R.id.ounc)
        dior=findViewById(R.id.ior)
        girlfriend=findViewById(R.id.frie)
        redflags=findViewById(R.id.edfla)

        asiwaju.setOnClickListener {
            val intent= Intent(this,RugerasiwajuActivity::class.java)
            startActivity(intent)
        }

        bounce.setOnClickListener {
            val intent= Intent(this,RugerbounceActivity::class.java)
            startActivity(intent)
        }

        dior.setOnClickListener {
            val intent= Intent(this,RugerdiorActivity::class.java)
            startActivity(intent)
        }

        girlfriend.setOnClickListener {
            val intent= Intent(this,RugergirlfriendActivity::class.java)
            startActivity(intent)
        }

        redflags.setOnClickListener {
            val intent= Intent(this,RugeredflagsActivity::class.java)
            startActivity(intent)
        }
    }
}