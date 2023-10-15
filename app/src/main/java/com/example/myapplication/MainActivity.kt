package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonLogin = findViewById<Button>(R.id.buttonLogin)
        buttonLogin.setOnClickListener {
            val email = findViewById<EditText>(R.id.editTextEmail).text.toString()
            val password = findViewById<EditText>(R.id.editTextPassword).text.toString()

            if (email.isNotEmpty() && password.isNotEmpty()) {
                Toast.makeText(this, "Login successful!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Please enter your email and password!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}