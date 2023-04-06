package com.example.mirea_mob_4sem.work2

import android.hardware.camera2.CameraDevice
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.TextView
import com.example.mirea_mob_4sem.R

class Work2Second : AppCompatActivity() {
    private lateinit var textView: TextView
    private lateinit var textPrev: TextView
    private lateinit var mCamera: CameraDevice
    private lateinit var msg: String
    private lateinit var previous: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work2_second)

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
        textView.text = getString(R.string.pause)
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
        msg = findViewById<TextView?>(R.id.textView2).text.toString()
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