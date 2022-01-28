package com.example.movetasktoback

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class MainActivity : AppCompatActivity() {
    val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG,"MainActivity   onCreate")
    }

    fun backTrue(view: View) {moveTaskToBack(true)}
    fun backFalse(view: View) {moveTaskToBack(false)}
    fun startActivity2(view: View) {
        startActivity(Intent(this,Activity2::class.java))
    }
}