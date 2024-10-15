package com.example.services


import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startServiceButton: Button = findViewById(R.id.buttonStartService)
        val stopServiceButton: Button = findViewById(R.id.buttonStopService)

        startServiceButton.setOnClickListener {
            Log.d("MainActivity", "Starting Service...")
            val serviceIntent = Intent(this, MyService::class.java)
            startService(serviceIntent)
        }

        stopServiceButton.setOnClickListener {
            Log.d("MainActivity", "Stopping Service...")
            val serviceIntent = Intent(this, MyService::class.java)
            stopService(serviceIntent)
        }
    }
}

