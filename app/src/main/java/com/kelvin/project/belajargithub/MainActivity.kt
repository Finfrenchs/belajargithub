package com.kelvin.project.belajargithub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Initials Button
        val button = findViewById<Button>(R.id.btn1)
        //Onclick Button
        button.setOnClickListener {
            Toast.makeText(this@MainActivity, "I'm Coming in the world", Toast.LENGTH_SHORT).show()
        }

    }
}