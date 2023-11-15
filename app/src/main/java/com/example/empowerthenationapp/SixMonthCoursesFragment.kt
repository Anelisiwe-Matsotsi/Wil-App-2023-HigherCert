package com.example.empowerthenationapp

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [SixMonthCoursesFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SixMonthCoursesFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       // tutorialspoint.com,2023
        // Inflate the layout for this fragment
        //studytonight.com,2023
        //appsnipp.com,2023
        val view = inflater.inflate(R.layout.fragment_six_month_courses, container, false)

        val button8 = view.findViewById<Button>(R.id.button8)
        val button9 = view.findViewById<Button>(R.id.button9)
        val button7 = view.findViewById<Button>(R.id.button7)
        val button = view.findViewById<Button>(R.id.button)
        val buttonBookNowCourses = view.findViewById<Button>(R.id.buttonBookNowCourses)

        button8.setOnClickListener {

            val intent = Intent(context, FirstAid::class.java)

            startActivity(intent)
        }

        button9.setOnClickListener {

            val intent = Intent(context, Sewing::class.java)

            startActivity(intent)
        }

        button7.setOnClickListener {

            val intent = Intent(context, Landscaping::class.java)

            startActivity(intent)
        }

        button.setOnClickListener {

            val intent = Intent(context, LifeSkills::class.java)

            startActivity(intent)
        }






        buttonBookNowCourses.setOnClickListener {

            val intent = Intent(context, CheckoutPage::class.java)

            startActivity(intent)
        }


        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment SixMonthCoursesFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            SixMonthCoursesFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
//References
//tutorialspoint.com,2023 [Online] Available at: https://www.tutorialspoint.com/how-to-implement-bottom-navigation-with-activities-in-android  Accessed on[26/10/2023]
//studytonight.com,2023 [Online] Available at: https://www.studytonight.com/post/gradient-drawable-in-android-create-gradient-backgrounds#:~:text=To%20create%20a%20gradient%20color,Resource%20File%20and%20create%20gradient_drawable. Accessed on[12/11/2023]
//appsnipp.com,2023 [Online] Available at:  https://appsnipp.com/free-multipurpose-home-design-with-dark-mode-for-android/     Accessed on[12/11/2023]