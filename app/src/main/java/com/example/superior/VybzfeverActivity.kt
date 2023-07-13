package com.example.superior

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class VybzfeverActivity : AppCompatActivity() {
    lateinit var play: ImageButton
    lateinit var next: ImageButton
    lateinit var back: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vybzfever)

        val mediaPlayer = MediaPlayer.create(this,R.raw.kartelfever)


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
                val intent = Intent(this, VybzhiActivity::class.java)
                startActivity(intent)
                finish()
            }
        }

        back.setOnClickListener {
            if (!mediaPlayer.isPlaying){
                mediaPlayer.stop()
                val intent = Intent(this, VybzbadgyalActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}