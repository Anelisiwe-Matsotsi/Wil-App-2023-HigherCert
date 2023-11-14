package com.example.empowerthenationapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import com.example.empowerthenationapp.R

class CheckoutPage : AppCompatActivity() {
    private lateinit var totalFeeTextView: TextView
    private lateinit var spinnerLevel: Spinner

    companion object {
        const val BASE_FEE = 100.0
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkout_page)

        val calculateButton = findViewById<Button>(R.id.calculateButton)
        val submitButton = findViewById<Button>(R.id.submitButton)
        val backButton = findViewById<Button>(R.id.backButton)
        val nextButton = findViewById<Button>(R.id.nextButton)
       val totalFeeTextView = findViewById<TextView>(R.id.totalFeeTextView)
       val spinnerLevel = findViewById<Spinner>(R.id.spinnerLevel)

        val coursesCosts = resources.getStringArray(R.array.course_costs)

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, coursesCosts)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerLevel.adapter = adapter

        calculateButton.setOnClickListener {
            calculateTotalFee()
        }

        submitButton.setOnClickListener {
            // Implement form submission here
        }

        backButton.setOnClickListener {
            // Implement back button functionality here
        }

        nextButton.setOnClickListener {
            // Implement next button functionality here
        }
    }

    @SuppressLint("StringFormatInvalid") //IIE,2023//
    private fun calculateTotalFee() {
        val selectedCoursePosition = spinnerLevel.selectedItemPosition
        val courseCostArray = resources.getStringArray(R.array.courseCostArray)

        if (selectedCoursePosition in 0 until courseCostArray.size) {
            val courseCost = courseCostArray[selectedCoursePosition].toDouble()

            val selectedCourseCount = selectedCoursePosition + 1
            var discount = when (selectedCourseCount) {
                1 -> 0.0
                2 -> 0.05
                3 -> 0.10
                else -> 0.15
            }

            val totalFee = (BASE_FEE * selectedCourseCount + courseCost) * (1 - discount)
            totalFeeTextView.text = getString(R.string.total_fee_format, totalFee)
        }
    }
}


//IIE, 2023. Introduction to Mobile Application Development(Module Manual). The Independent Institute of Education: Unpublished.[Accessed 10 November 2023].//