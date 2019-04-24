package com.example.helloworld

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

//Class in Kotlin , name is MainActivity
class MainActivity : AppCompatActivity() {
// on create function
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
