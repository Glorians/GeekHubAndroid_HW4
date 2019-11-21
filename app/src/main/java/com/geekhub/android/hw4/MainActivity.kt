package com.geekhub.android.hw4

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    override fun onStart() {
        val list = mutableListOf<Long>()
        for (x in 0..1000000) {
            list.add(x.toLong())
            Log.d("for add", x.toString())
        }

        println(list.toString())
        super.onStart()
    }
}
