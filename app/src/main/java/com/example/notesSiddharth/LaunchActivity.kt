package com.example.notesSiddharth

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class LaunchActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.launch_activity)
    }

    fun startTheApp(view: View) {

        val intent= Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
}