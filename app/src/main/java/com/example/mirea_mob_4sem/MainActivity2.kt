package com.example.mirea_mob_4sem

import android.annotation.SuppressLint
import android.content.Intent
import android.hardware.camera2.CameraDevice
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    private lateinit var textView: TextView
    private lateinit var textPrev: TextView
    private lateinit var mCamera: CameraDevice
    private lateinit var msg: String
    private lateinit var previous: String

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        if(savedInstanceState != null){
            textPrev = findViewById(R.id.previous)
            textPrev.text = savedInstanceState.getString(previous)
        } else {
            msg = intent.extras?.getString("text") ?: ""
        }

        textView = findViewById(R.id.textView2)
    }


    override fun onPause() {
        super.onPause()
        textView = findViewById(R.id.textView2)
        textView.text = R.string.pause.toString()
//        mCamera.close()
    }
    fun initCamera(){

    }

    override fun onResume() {
        super.onResume()
        textView.text = msg
        initCamera()
    }

    override fun onStop() {
        super.onStop()
        msg = findViewById<View?>(R.id.textView2).toString()
    }

    override fun onRestoreInstanceState(
        savedInstanceState: Bundle?,
        persistentState: PersistableBundle?
    ) {
        super.onRestoreInstanceState(savedInstanceState, persistentState)
        if (savedInstanceState != null) {
            msg = savedInstanceState.getString(previous).toString()
        }
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
        outState.putString(previous, msg)
    }

    override fun onStart() {
        super.onStart()

        if (msg.isEmpty())
            msg = "Empty"
        else {
            textPrev = findViewById(R.id.previous)
            textPrev.text = msg
        }
    }
}