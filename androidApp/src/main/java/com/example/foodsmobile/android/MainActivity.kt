package com.example.foodsmobile.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.foodsmobile.Greeting
import androidx.activity.compose.setContent
import com.example.foodsmobile.android.prasentation.navigation.Navigations

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv: TextView = findViewById(R.id.text_view)
        tv.text = greet()
//        setContent {
//            Navigations()
//        }
    }
}
