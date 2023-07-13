package com.example.superior

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class DiggawoiActivity : AppCompatActivity() {
    lateinit var play: ImageButton
    lateinit var next: ImageButton
    lateinit var back: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diggawoi)

        val mediaPlayer = MediaPlayer.create(this,R.raw.diggawoi)


        play=findViewById(R.id.btn_play)
        next=findViewById(R.id.mbele)
        back=findViewById(R.id.nyuma)

        play.setOnClickListener {
            if(!mediaPlayer.isPlaying){
                mediaPlayer.start()
                //changing play image to pause
                play.setImageResource(R.drawable.baseline_pause_24)
            }
            else{//media player is playing and can be paused
                mediaPlayer.pause()
                play.setImageResource(R.drawable.baseline_play_arrow_24)
            }
        }

        next.setOnClickListener {
            if (!mediaPlayer.isPlaying){
                mediaPlayer.stop()
                val intent = Intent(this, SeventeenActivity::class.java)
                startActivity(intent)
                finish()
            }
        }

        back.setOnClickListener {
            if (!mediaPlayer.isPlaying){
                mediaPlayer.stop()
                val intent = Intent(this, DiggaBluwuuActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}