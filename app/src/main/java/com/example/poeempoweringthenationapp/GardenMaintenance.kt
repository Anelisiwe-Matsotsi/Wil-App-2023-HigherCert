package com.example.poeempoweringthenationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class ChildMinding : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.`activity_garden_maintenance.xml`)

        val textViewDisplay = findViewById<TextView>(R.id.textViewDisplay)
        val editTextNumber = findViewById<EditText>(R.id.editTextNumber)
        val textView = findViewById<TextView>(R.id.textView)
        val buttonAverage = findViewById<Button>(R.id.buttonAver)
    }
}