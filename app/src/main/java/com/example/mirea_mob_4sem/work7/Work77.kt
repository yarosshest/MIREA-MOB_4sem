package com.example.mirea_mob_4sem.work7


import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.SeekBar
import android.widget.TextView
import androidx.activity.result.ActivityResultCallback
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.example.mirea_mob_4sem.R
import java.time.LocalDateTime


class Work77 : AppCompatActivity() {
    var mStartForResult: ActivityResultLauncher<Intent> =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == RESULT_OK) {
                val textView = findViewById<TextView>(R.id.textView)
                textView.text = result.data?.getStringExtra("result")
            } else {
                val textView = findViewById<TextView>(R.id.textView)
                textView.text = "Error"
            }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work77)
    }

    fun transition(v : View){
        val intent = Intent(this, Work78::class.java)

        mStartForResult.launch(intent)
    }

}