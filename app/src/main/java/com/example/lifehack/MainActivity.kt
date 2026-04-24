package com.example.lifehack

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var txtQuestion: TextView
    lateinit var rgOptions : RadioGroup
    lateinit var rbOption1 : RadioButton
    lateinit var rbOption2 : RadioButton
    lateinit var btnNextbutton: Button


    var currentQuestion = 0
    var score = 0
    val question = arrayOf(
        "Does putting your phone in airplane mode help it charge faster?",
        "Should you charge your phone to 100% every time to keep the battery healthy? , false",
        "Can drinking water increase your cocentration? , true",
        "Does cracking your knuckles cause arthritis? , false",
        "Can turning off notifications improve productivity?, true"

    )

    val options = arrayOf(
        arrayOf("")
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        txtQuestion = findViewById(R.id.txtQuestion)
        rgOptions = findViewById(R.id.rgOptions)
        rbOption1 = findViewById(R.id.rbOption1)
        rbOption2 = findViewById(R.id.rbOption2)
        btnNextbutton = findViewById(R.id.btnNextbutton)

        txtQuestion.text = question[currentQuestion]
        rbOption1.text = options[currentQuestion][0]
        rbOption2.text = options[currentQuestion][1]
        btnNextbutton.setOnClickListener {

            val selectedId = rgOptions.checkedRadioButtonId
            val answerIndex = when(selectedId) {
                R.id.rbOption1-> 0
                R.id.rbOption2-> 1

                else -> -1
        }




            }
        }


    }
