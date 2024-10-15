package com.example.services

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class MyService : Service() {

    override fun onCreate() {
        super.onCreate()
        Log.d("MyService", "onCreate called")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.d("MyService", "onStartCommand called")
        return START_STICKY
    }

    override fun onBind(intent: Intent?): IBinder? {
        Log.d("MyService", "onBind called")
        return null
    }

    override fun onUnbind(intent: Intent?): Boolean {
        Log.d("MyService", "onUnbind called")
        return super.onUnbind(intent)
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MyService", "onDestroy called")
    }
}
