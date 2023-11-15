package com.example.empowerthenationapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class LifeSkills : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life_skills)
val buttonBookNow2 =findViewById<Button>(R.id.buttonBookNow2)
        buttonBookNow2.setOnClickListener {

            val intent = Intent(this, CheckoutPage::class.java)

            startActivity(intent)
        }
        //geeksforgeeks.com,2023
        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNav)

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
//Refrences
//geeksforgeeks.com,2023[Online] Available at:https://www.geeksforgeeks.org/bottom-navigation-bar-in-android/  Accessed on[26/10/2023]
//geeksforgeeks.com,2023 [Online] Available at:https://www.geeksforgeeks.org/bottom-navigation-bar-in-android-using-kotlin/ Accessed on[26/10/2023]