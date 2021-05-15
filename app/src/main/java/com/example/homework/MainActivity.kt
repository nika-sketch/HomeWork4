package com.example.homework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendData(view: View) {
        val name = findViewById<EditText>(R.id.editTextTextPersonName2)
        val Gmail = findViewById<EditText>(R.id.editTextTextPersonName3)

        val intent = Intent(this, ShowGmail::class.java)
        intent.putExtra(ShowGmail.NAME, name)
        intent.putExtra(ShowGmail.Gmail, Gmail)

    }
}