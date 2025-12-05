package com.example.helloandroidui

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.textfield.TextInputEditText

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

        val toolbar: MaterialToolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        toolbar.setNavigationOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        val submitButton: Button = findViewById(R.id.submitButton)
        val nameInput: TextInputEditText = findViewById(R.id.nameInput)

        submitButton.setOnClickListener {
            val name = nameInput.text.toString()

            val greeting = if (name.isBlank()) {
                "Please enter your name!"
            } else {
                "Hello, $name!"
            }

            Toast.makeText(this, greeting, Toast.LENGTH_LONG).show()
        }
    }
}