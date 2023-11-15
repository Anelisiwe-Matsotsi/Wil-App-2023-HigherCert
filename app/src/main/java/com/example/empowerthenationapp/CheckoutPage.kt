package com.example.empowerthenationapp

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView


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
        val buttonSubmit = findViewById<Button>(R.id.buttonSubmit)
        val textViewDisplay = findViewById<TextView>(R.id.textViewDisplay)
        val editTextText = findViewById<EditText>(R.id.editTextText)
        val editTextText2 = findViewById<EditText>(R.id.editTextText2)

        //geeksforgeeks.com,2023
        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNav)

        val educationSpinner = findViewById<Spinner>(R.id.educationSpinner)

//IIE(2023)
        educationSpinner.adapter =
            ArrayAdapter<Education>(this, android.R.layout.simple_list_item_1, Education.values())

        //stackoverflow.com,2023
        calculateResult.setOnClickListener {
            redValue = if (red.isChecked) checkBoxValues[0] else 0
            blueValue = if (blue.isChecked) checkBoxValues[1] else 0
            whiteValue = if (white.isChecked) checkBoxValues[2] else 0
            fAValue = if (fA.isChecked) checkBoxValues[3] else 0
            sWValue = if (sW.isChecked) checkBoxValues[4] else 0
            lSValue = if (lS.isChecked) checkBoxValues[5] else 0
            landSValue = if (landS.isChecked) checkBoxValues[6] else 0

            val selectedCourses =
                listOf(redValue, blueValue, whiteValue, fAValue, sWValue, lSValue, landSValue)
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

            textViewDisplay.text =
                "Total: R$result\nDiscount: $discountPercentage%\nDiscounted Total: R$discountedTotal"
        }
        //geeksforgeeks.com,2023



        bottomNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.home -> {
                    loadFragment(HomeFragment())
                    true
                }

                R.id.message -> {
                    loadFragment(SixWeekCoursesFragment())
                    true
                }

                R.id.settings -> {
                    loadFragment(SixMonthCoursesFragment())
                    true
                }

                R.id.contactus -> {
                    loadFragment(ContactUsFragment())
                    true
                }

                else -> {
                    Log.e("MainActivity", "Invalid menu item selected: ${it.itemId}")
                    false
                }
            }

        }

    }
    private  fun loadFragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,fragment)
        transaction.commit()
    }

}



//geeksforgeeks.com,2023[Online] Available at:https://www.geeksforgeeks.org/bottom-navigation-bar-in-android/  Accessed on[26/10/2023]
//geeksforgeeks.com,2023 [Online] Available at:https://www.geeksforgeeks.org/bottom-navigation-bar-in-android-using-kotlin/ Accessed on[26/10/2023]
//Geeks for Geeks. 2023. [Online] Available at:https://geeksforgeeks.org/courses/data-structures-and-algorithms-in-javascript. [Accessed 10 November 2023].
//stackoverflow.2023.[Online] Available at: https://stackoverflow.com/questions/63999783/how-to-convert-the-values-of-checkboxes-into-a-sum-of-integers?rq=3 //
//IIE, 2023. Introduction to Mobile Application Development(Module Manual). The Independent Institute of Education: Unpublished.[Accessed 10 November 2023].//
