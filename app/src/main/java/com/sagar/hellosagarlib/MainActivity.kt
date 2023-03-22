package com.sagar.hellosagarlib

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sagar.sagarlib.Sagar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Sagar().helloSagar(applicationContext)
    }
}