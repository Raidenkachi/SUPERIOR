package com.example.superior

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class EminemActivity : AppCompatActivity() {
    lateinit var bird: Button
    lateinit var afraid: Button
    lateinit var rap: Button
    lateinit var shady: Button
    lateinit var withoutme: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eminem)

        bird=findViewById(R.id.bir)
        afraid=findViewById(R.id.afrai)
        rap=findViewById(R.id.apg)
        shady=findViewById(R.id.slim)
        withoutme=findViewById(R.id.thout)

        bird.setOnClickListener {
            val intent= Intent(this,EminemMockingbirdActivity::class.java)
            startActivity(intent)
        }

        afraid.setOnClickListener {
            val intent= Intent(this,EminemNotafraidActivity::class.java)
            startActivity(intent)
        }

        rap.setOnClickListener {
            val intent= Intent(this,EminemrapgodActivity::class.java)
            startActivity(intent)
        }

        shady.setOnClickListener {
            val intent= Intent(this,EminemSlimshadyActivity::class.java)
            startActivity(intent)
        }

        withoutme.setOnClickListener {
            val intent= Intent(this,EminemwithoutmeActivity ::class.java)
            startActivity(intent)
        }
    }
}