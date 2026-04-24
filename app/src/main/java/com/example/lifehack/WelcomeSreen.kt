package com.example.lifehack

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class WelcomeSreen : AppCompatActivity() {
    lateinit var txtName : EditText
    lateinit var txtSurname : EditText
    lateinit var  txtSName : EditText
    lateinit var btnStart : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_welcome_sreen)
        txtName = findViewById(R.id.txtName)
        txtSurname = findViewById(R.id.txtSurname)
        txtSName = findViewById(R.id.txtSName)
        btnStart = findViewById(R.id.btnStart)

        btnStart.setOnClickListener {
            val name = txtName.text.toString()
            val surname = txtSurname.text.toString()
            val sName = txtSName.text.toString()
            // Insuring that all fields are filled before,user can begin the game
            if (name.isEmpty() || surname.isEmpty() || sName.isEmpty()){

                Toast.makeText(this, "Putting your phone in airplane mode helps it charge faster." ,
                    Toast.LENGTH_SHORT).show()
                "else{....}"
                val intent = Intent(this, MainActivity::class.java)
                intent.putExtra("name" , name)
                intent.putExtra("surname" , surname)
                intent.putExtra("sName" , sName)
                startActivity(intent)
                finish()



            }


        }


    }
}