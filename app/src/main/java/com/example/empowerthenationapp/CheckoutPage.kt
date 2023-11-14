package com.example.empowerthenationapp

import android.annotation.SuppressLint
import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.empowerthenationapp.R

class CheckoutPage : AppCompatActivity() {
    enum class Education {
        NONE,
        HIGHSCHOOL,
        DIPLOMA,
        BACHELOR,
        MASTERS,
        PHD,
    }

    private val checkBoxValues = arrayOf(750, 750, 750, 1500, 1500, 1500, 1500)
    private var result = 0
    private var redValue = 0
    private var blueValue = 0
    private var whiteValue = 0
    private var fAValue = 0
    private var sWValue = 0
    private var lSValue = 0
    private var landSValue = 0

    @SuppressLint("MissingInflatedId")
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
        val submitButton = findViewById<Button>(R.id.buttonSubmit)
        val textViewDisplay = findViewById<TextView>(R.id.textViewDisplay)
        val editTextText = findViewById<EditText>(R.id.editTextText)
        val editTextText2 = findViewById<EditText>(R.id.editTextText2)

        val educationSpinner = findViewById<Spinner>(R.id.educationSpinner)
        educationSpinner.adapter = ArrayAdapter<Education>(this,
            android.R.layout.simple_list_item_1, Education.values())

        calculateResult.setOnClickListener {
            redValue = if (red.isChecked) checkBoxValues[0] else 0
            blueValue = if (blue.isChecked) checkBoxValues[1] else 0
            whiteValue = if (white.isChecked) checkBoxValues[2] else 0
            fAValue = if (fA.isChecked) checkBoxValues[3] else 0
            sWValue = if (sW.isChecked) checkBoxValues[4] else 0
            lSValue = if (lS.isChecked) checkBoxValues[5] else 0
            landSValue = if (landS.isChecked) checkBoxValues[6] else 0

            val selectedCourses = listOf(redValue, blueValue, whiteValue, fAValue, sWValue, lSValue, landSValue)
            val totalCourses = selectedCourses.count { it > 0 }

            result = selectedCourses.sum()

            // Apply discount based on the number of selected courses
            val discountPercentage = when (totalCourses) {
                2 -> 5
                3 -> 10
                else -> if (totalCourses > 3) 15 else 0
            }

            val discountAmount = (result * discountPercentage) / 100
            val discountedTotal = result - discountAmount

            textViewDisplay.text = "Total: $$result\nDiscount: $discountPercentage%\nDiscounted Total: $$discountedTotal"
        }

        submitButton.setOnClickListener {
            val emailIntent = Intent(Intent.ACTION_SENDTO)
            emailIntent.data = Uri.parse("mailto:")  // only email apps should handle this
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Checkout Details")

            try {
                startActivity(Intent.createChooser(emailIntent, "Send email..."))
            } catch (e: ActivityNotFoundException) {
                // Handle case where no email app is available
                Toast.makeText(this, "No email app found", Toast.LENGTH_SHORT).show()
            }
        }
    }
}

