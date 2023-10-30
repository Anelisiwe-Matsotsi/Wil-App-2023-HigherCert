package com.example.empowerthenationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class ChildMinding : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_child_minding)


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

                R.id.checkout -> {
                    loadFragment(CheckoutFragment())
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
//Refrences
//geeksforgeeks.com,2023[Online] Available at:https://www.geeksforgeeks.org/bottom-navigation-bar-in-android/  Accessed on[26/10/2023]
//geeksforgeeks.com,2023 [Online] Available at:https://www.geeksforgeeks.org/bottom-navigation-bar-in-android-using-kotlin/ Accessed on[26/10/2023]