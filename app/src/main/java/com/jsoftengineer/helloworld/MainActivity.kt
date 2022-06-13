package com.jsoftengineer.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.helloworld.R


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get reference to button
        val btn_click_me = findViewById(R.id.button) as Button
        val myTextView = findViewById(R.id.textView) as TextView
        var timesClicked = 0
        // set on-click listener
        btn_click_me.setOnClickListener {
            myTextView.text = timesClicked.toString()
            timesClicked = timesClicked + 1
            Toast.makeText(this@MainActivity, "Hi Jared", Toast.LENGTH_SHORT).show()
        }
    }
}