package com.example.empowerthenationapp


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import com.example.empowerthenationapp.R


class CheckoutPage : AppCompatActivity() {

    private val checkBoxValues = arrayOf(750, 750, 750, 1500, 1500, 1500, 1500)
    private var result = 0
    private var redValue = 0
    private var blueValue = 0
    private var whiteValue = 0
    private var fAValue = 0
    private var sWValue = 0
    private var lSValue = 0
    private var landSValue = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkout_page)

        val red = findViewById<CheckBox>(R.id.red)
        val blue = findViewById<CheckBox>(R.id.blue)
        val white = findViewById<CheckBox>(R.id.white)
        val fA = findViewById<CheckBox>(R.id.fA)
        val sW = findViewById<CheckBox>(R.id.sW)
        val lS = findViewById<CheckBox>(R.id.lS)
        val landS = findViewById<CheckBox>(R.id.landS)
        val calculateResult = findViewById<Button>(R.id.calculateResult)
        val textViewDisplay = findViewById<TextView>(R.id.textViewDisplay)

        calculateResult.setOnClickListener {
            redValue = if (red.isChecked) checkBoxValues[0] else 0
            blueValue = if (blue.isChecked) checkBoxValues[1] else 0
            whiteValue = if (white.isChecked) checkBoxValues[2] else 0
            fAValue = if (fA.isChecked) checkBoxValues[3] else 0
            sWValue = if (sW.isChecked) checkBoxValues[4] else 0
            lSValue = if (lS.isChecked) checkBoxValues[5] else 0
            landSValue = if (landS.isChecked) checkBoxValues[6] else 0

            result = redValue + blueValue + whiteValue + fAValue + sWValue+ lSValue + landSValue
            textViewDisplay.text = "Total: $$result"
        }
    }
}
//https://stackoverflow.com/questions/63999783/how-to-convert-the-values-of-checkboxes-into-a-sum-of-integers?rq=3 //

//IIE, 2023. Introduction to Mobile Application Development(Module Manual). The Independent Institute of Education: Unpublished.[Accessed 10 November 2023].//