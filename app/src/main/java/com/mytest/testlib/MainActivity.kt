package com.mytest.testlib

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.mytest.mylibrary.LibMainActivity


class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tvHello = findViewById<TextView>(R.id.tvHello)
        tvHello.text = "Library test "
        LibMainActivity().printLog(TAG, "onCreate: 1")
    }
}