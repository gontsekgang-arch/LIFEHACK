package com.example.lifehack

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class RESULTS : AppCompatActivity() {
    lateinit var txtDescription : TextView
    lateinit var btnStart : Button
    lateinit var btnReview: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_results)



        txtDescription = findViewById(R.id.scoreText)
        btnStart = findViewById(R.id.btnStart)
        btnReview = findViewById(R.id.btnReview)

        val Description =intent.getIntExtra("Description" , 0)
        val Review = intent.getIntExtra("Review" , 0)

        txtDescription.text = "Description: ${Description} / $Review"

        btnReview



    }
}