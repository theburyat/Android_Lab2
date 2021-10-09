package com.example.android_lab2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    private val TAG = "MyActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG,"CREATE")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"START")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"RESUME")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"PAUSE")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"STOP")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG,"RESTART")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"DESTROY")
    }
}