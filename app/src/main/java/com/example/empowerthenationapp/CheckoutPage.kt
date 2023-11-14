package com.example.empowerthenationapp


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView


class CheckoutPage : AppCompatActivity() {

    private val checkBoxValues = arrayOf(10, 20, 30)
    private var result = 0
    private var redValue = 0
    private var blueValue = 0
    private var whiteValue = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkout_page)

        val red = findViewById<CheckBox>(R.id.red)
        val blue = findViewById<CheckBox>(R.id.blue)
        val white = findViewById<CheckBox>(R.id.white)
        val calculateResult = findViewById<Button>(R.id.calculateResult)
        val textViewDisplay = findViewById<TextView>(R.id.textViewDisplay)

        calculateResult.setOnClickListener {
            redValue = if (red.isChecked) checkBoxValues[0] else 0
            blueValue = if (blue.isChecked) checkBoxValues[1] else 0
            whiteValue = if (white.isChecked) checkBoxValues[2] else 0

            result = redValue + blueValue + whiteValue
            textViewDisplay.text = "Total: $$result"
        }
    }
}
//https://stackoverflow.com/questions/63999783/how-to-convert-the-values-of-checkboxes-into-a-sum-of-integers?rq=3 //

//IIE, 2023. Introduction to Mobile Application Development(Module Manual). The Independent Institute of Education: Unpublished.[Accessed 10 November 2023].//