
package com.example.mirea_mob_4sem.work12

import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.MediaController
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import com.example.mirea_mob_4sem.R


class Work121 : AppCompatActivity() {
    private lateinit var  videoPlayer: VideoView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work121)
        videoPlayer = findViewById(R.id.videoPlayer)
        videoPlayer.setVideoURI(Uri.parse("https://media.geeksforgeeks.org/wp-content/uploads/20201217192146/Screenrecorder-2020-12-17-19-17-36-828.mp4?_=1"))

        val mediaController = MediaController(this)
        videoPlayer.setMediaController(mediaController)
        mediaController.setMediaPlayer(videoPlayer)

        videoPlayer.start();
    }

    fun play(view: View?) {
        videoPlayer.start()
    }

    fun pause(view: View?) {
        videoPlayer.pause()
    }

    fun stop(view: View?) {
        videoPlayer.stopPlayback()
        videoPlayer.resume()
    }
}