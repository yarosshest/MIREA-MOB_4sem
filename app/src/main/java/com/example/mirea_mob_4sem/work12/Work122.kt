package com.example.mirea_mob_4sem.work12

import android.media.AudioManager
import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.SeekBar
import android.widget.SeekBar.OnSeekBarChangeListener
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.mirea_mob_4sem.R


class Work122 : AppCompatActivity() {
    private lateinit var  mPlayer: MediaPlayer
    private lateinit var playButton: Button
    private lateinit var pauseButton: Button
    private lateinit var stopButton: Button
    private lateinit var volumeControl: SeekBar
    private lateinit var audioManager: AudioManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work122)
        mPlayer = MediaPlayer.create(this, R.raw.angel)
        mPlayer.setOnCompletionListener { stopPlay() }
        playButton = findViewById(R.id.playButton)
        pauseButton = findViewById(R.id.pauseButton)
        stopButton = findViewById(R.id.stopButton)
        audioManager = getSystemService(AUDIO_SERVICE) as AudioManager
        val maxVolume = audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC)
        val curValue = audioManager.getStreamVolume(AudioManager.STREAM_MUSIC)
        volumeControl = findViewById(R.id.volumeControl)
        volumeControl.max = maxVolume
        volumeControl.progress = curValue
        volumeControl.setOnSeekBarChangeListener(object : OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                audioManager.setStreamVolume(AudioManager.STREAM_MUSIC, progress, 0)
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {}
            override fun onStopTrackingTouch(seekBar: SeekBar) {}
        })
        pauseButton.isEnabled = false
        stopButton.isEnabled = false
    }

    private fun stopPlay() {
        mPlayer.stop()
        pauseButton.isEnabled = false
        stopButton.isEnabled = false
        try {
            mPlayer.prepare()
            mPlayer.seekTo(0)
            playButton.isEnabled = true
        } catch (t: Throwable) {
            Toast.makeText(this, t.message, Toast.LENGTH_SHORT).show()
        }
    }

    fun play(view: View) {
        mPlayer.start()
        playButton.isEnabled = false
        pauseButton.isEnabled = true
        stopButton.isEnabled = true
    }

    fun pause(view: View) {
        mPlayer.pause()
        playButton.isEnabled = true
        pauseButton.isEnabled = false
        stopButton.isEnabled = true
    }

    fun stop(view: View) {
        stopPlay()
    }

    override fun onDestroy() {
        super.onDestroy()
        if (mPlayer.isPlaying) {
            stopPlay()
        }
    }
}