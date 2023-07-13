package com.example.superior

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MejjaActivity : AppCompatActivity() {
    lateinit var furahia: Button
    lateinit var landlord: Button
    lateinit var usiniharibie: Button
    lateinit var niko: Button
    lateinit var sishki: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mejja)

        furahia=findViewById(R.id.hia)
        landlord=findViewById(R.id.lord)
        usiniharibie=findViewById(R.id.mood)
        niko=findViewById(R.id.iko)
        sishki=findViewById(R.id.skii)

        furahia.setOnClickListener {
            val intent= Intent(this,FurahiaActivity::class.java)
            startActivity(intent)
        }

        landlord.setOnClickListener {
            val intent= Intent(this,LandlordActivity::class.java)
            startActivity(intent)
        }

        usiniharibie.setOnClickListener {
            val intent= Intent(this,UsiniharibieActivity::class.java)
            startActivity(intent)
        }

        niko.setOnClickListener {
            val intent= Intent(this,NikopoaActivity::class.java)
            startActivity(intent)
        }

        sishki.setOnClickListener {
            val intent= Intent(this,SweetActivity::class.java)
            startActivity(intent)
        }
    }
}