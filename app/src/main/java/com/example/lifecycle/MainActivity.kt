package com.example.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MainActivity", "onCreate Called")


    }
    override fun onStart() {
        super.onStart()
        Log.d("MainActivity", "onStart Called")
    }
    override fun onRestart() {
        super.onRestart()
        Log.d("MainActivity", "onRestart Called")
    }
    override fun onResume() {
        super.onResume()
        Log.d("MainActivity", "onResume Called")
    }
    override fun onPause() {
        super.onPause()
        Log.d("MainActivity", "onPause Called")
    }
    override fun onStop() {
        super.onStop()
        Log.d("MainActivity", "onStop Called")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity", "onDestroy Called")
    }
}