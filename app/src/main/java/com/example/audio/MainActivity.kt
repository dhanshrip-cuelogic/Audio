package com.example.audio

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var mediaPlayer : MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mediaPlayer = MediaPlayer.create(this,R.raw.track)
        mediaPlayer.setOnPreparedListener {
            println("READY TO PLAY")
        }

        val playButton = findViewById<Button>(R.id.play_button)
        val pause_button = findViewById<Button>(R.id.pause_button)

        playButton.setOnClickListener {
            println("playing")
            mediaPlayer.start()
        }

        pause_button.setOnClickListener {
            println("stopped")
            mediaPlayer.stop()
        }
    }
}