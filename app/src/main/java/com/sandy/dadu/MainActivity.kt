package com.sandy.dadu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import java.util.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

//    private val random = Random()
//     private var gambarDadu: ImageView = findViewById(R.id.gbr_dadu)
    private lateinit var gambarDadu: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gambarDadu = findViewById(R.id.gbr_dadu)

        gambarDadu.setOnClickListener{
            lemparDadu()
        }
    }

    private fun lemparDadu() {
        val randomNumber = (1..6).random()

        when (randomNumber) {
            1 -> gambarDadu.setImageResource(R.drawable.dadu1)
            2 -> gambarDadu.setImageResource(R.drawable.dadu2)
            3 -> gambarDadu.setImageResource(R.drawable.dadu3)
            4 -> gambarDadu.setImageResource(R.drawable.dadu4)
            5 -> gambarDadu.setImageResource(R.drawable.dadu5)
            6 -> gambarDadu.setImageResource(R.drawable.dadu6)
        }
    }
}
