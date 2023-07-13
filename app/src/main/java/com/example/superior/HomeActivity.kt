package com.example.superior


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.cardview.widget.CardView

class HomeActivity : AppCompatActivity() {

    lateinit var popular: CardView
    lateinit var hiphop: CardView
    lateinit var afro: CardView
    lateinit var dancehall: CardView
    lateinit var amapiano: CardView
    lateinit var genge: CardView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        popular=findViewById(R.id.cardpopular)
        hiphop=findViewById(R.id.cardhiphop)
        afro=findViewById(R.id.cardafro)
        dancehall=findViewById(R.id.carddancehall)
        amapiano=findViewById(R.id.cardamapiano)
        genge=findViewById(R.id.cardgenge)


        popular.setOnClickListener {
            Toast.makeText(applicationContext,"Seeing popular playlists", Toast.LENGTH_LONG).show()
            val intent= Intent(this,PopularActivity::class.java)
            startActivity(intent)
        }

        hiphop.setOnClickListener {
            Toast.makeText(applicationContext,"Seeing hip-hop playlists", Toast.LENGTH_LONG).show()
            val intent= Intent(this,HiphopActivity::class.java)
            startActivity(intent)
        }

        afro.setOnClickListener {
            Toast.makeText(applicationContext,"Seeing afro playlists", Toast.LENGTH_LONG).show()
            val intent= Intent(this,AfroActivity::class.java)
            startActivity(intent)
        }

        dancehall.setOnClickListener {
            Toast.makeText(applicationContext,"Seeing dancehall playlists", Toast.LENGTH_LONG).show()
            val intent= Intent(this,DancehallActivity::class.java)
            startActivity(intent)
        }

        amapiano.setOnClickListener {
            Toast.makeText(applicationContext,"Seeing amapiano playlists", Toast.LENGTH_LONG).show()
            val intent= Intent(this,AmapianoActivity::class.java)
            startActivity(intent)
        }

        genge.setOnClickListener {
            Toast.makeText(applicationContext,"Seeing genge playlists", Toast.LENGTH_LONG).show()
            val intent= Intent(this,GengeActivity::class.java)
            startActivity(intent)
        }

    }
}