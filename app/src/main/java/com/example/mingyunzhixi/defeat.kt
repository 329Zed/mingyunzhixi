package com.example.mingyunzhixi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class defeat : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_defeat)

        val button_again = findViewById<Button>(R.id.button4)
        val button_exit = findViewById<Button>(R.id.button5)
        val intent = Intent (this,BlankFragment::class.java)
        button_again.setOnClickListener {
            startActivity(intent)
        }
        button_exit.setOnClickListener {
            System.exit(0)
        }
    }
}