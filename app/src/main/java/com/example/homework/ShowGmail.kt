package com.example.homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class ShowGmail : AppCompatActivity() {
    companion object {
        const val NAME = "NAME";
        const val Gmail = "leviathan@gmail.com";
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_gmail)

        val name = intent.getStringExtra(NAME);
        val gmail = intent.getStringExtra(Gmail)

        val showname = findViewById<TextView>(R.id.name)
        val showGmail = findViewById<TextView>(R.id.Gmail)

        showname.text(name)
        showGmail.text(Gmail)
    }
}