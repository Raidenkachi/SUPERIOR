package com.example.superior

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RemaActivity : AppCompatActivity() {
    lateinit var bounce: Button
    lateinit var charm: Button
    lateinit var calmdown: Button
    lateinit var dumebi: Button
    lateinit var soundgasm: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rema)

        bounce=findViewById(R.id.unc)
        charm=findViewById(R.id.ar)
        calmdown=findViewById(R.id.lmd)
        dumebi=findViewById(R.id.meb)
        soundgasm=findViewById(R.id.und)

        bounce.setOnClickListener {
            val intent= Intent(this,RemabounceActivity::class.java)
            startActivity(intent)
        }

        charm.setOnClickListener {
            val intent= Intent(this,RemacharmActivity::class.java)
            startActivity(intent)
        }

        calmdown.setOnClickListener {
            val intent= Intent(this,RemacalmdownActivity::class.java)
            startActivity(intent)
        }

        dumebi.setOnClickListener {
            val intent= Intent(this,RemadumebiActivity::class.java)
            startActivity(intent)
        }

        soundgasm.setOnClickListener {
            val intent= Intent(this,RemasoundgasmActivity::class.java)
            startActivity(intent)
        }
    }
}