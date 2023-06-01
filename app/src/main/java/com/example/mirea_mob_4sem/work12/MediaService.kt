package com.example.mirea_mob_4sem.work12

import com.example.mirea_mob_4sem.R
import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder


class MediaService : Service() {
    private lateinit var ambientMediaPlayer: MediaPlayer

    override fun onBind(intent: Intent): IBinder {
        TODO("Return the communication channel to the service.")
    }
    override fun onCreate() {
        ambientMediaPlayer = MediaPlayer.create(this, R.raw.angel)
        ambientMediaPlayer.isLooping = true
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        ambientMediaPlayer.start()
        return START_STICKY
    }

    override fun onDestroy() {
        ambientMediaPlayer.stop()
    }
}