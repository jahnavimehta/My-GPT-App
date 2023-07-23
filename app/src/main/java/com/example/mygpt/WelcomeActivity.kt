package com.example.mygpt

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val btnStart = findViewById<Button>(R.id.btnStart)
        btnStart.setOnClickListener {
            // Set isFirstLaunch to false to indicate that the app has been launched before
            getSharedPreferences("MyAppPreferences", Context.MODE_PRIVATE)
                .edit()
                .putBoolean("isFirstLaunch", false)
                .apply()

            startActivity(Intent(this, MainActivity::class.java))
            finish() // Finish WelcomeActivity to prevent returning to it when pressing the back button from MainActivity
        }
    }
}
