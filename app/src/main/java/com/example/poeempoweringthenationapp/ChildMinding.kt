package com.example.poeempoweringthenationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.ScrollView
import android.widget.TextView

class ChildMinding : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_child_minding)
        var scrollView = findViewById<ScrollView>(R.id.scrollView2)
        var textViewHeading2 = findViewById<TextView>(R.id.textViewHeading2)
        var textViewInfo2 = findViewById<TextView>(R.id.textViewInfo2)
        var textViewKumar = findViewById<TextView>(R.id.textViewKumar)
        var textViewKumarInfo =findViewById<TextView>(R.id.textViewKumarInfo)
        var textViewSarah = findViewById<TextView>(R.id.textViewSarah)
        var textViewSarahInfo = findViewById<TextView>(R.id.textViewSarahInfo)
        var textViewMark= findViewById<TextView>(R.id.textViewMark)
        var textViewMarkInfo = findViewById<TextView>(R.id.textViewMarkInfo)
        var textViewMaria = findViewById<TextView>(R.id.textViewMaria)
        var textViewMariaTestimony = findViewById<TextView>(R.id.textViewMariaTestimony)
        var textViewSusan= findViewById<TextView>(R.id.textViewSusan)
        var textViewSusanTestimony = findViewById<TextView>(R.id.textViewSusanTestimony)
        var textViewThami = findViewById<TextView>(R.id.textViewThami)
        var textViewThamiTestimony = findViewById<TextView>(R.id.textViewThamiTestimony)
        var frameLayout2 = findViewById<FrameLayout>(R.id.frameLayoutLogo)
        var frameLayout4 = findViewById<FrameLayout>(R.id.frameLayoutInfo)
        var frameLayoutInstructorsBackground = findViewById<FrameLayout>(R.id.frameLayoutInstructorsBackground)
        var frameLayoutInstructors2 = findViewById<FrameLayout>(R.id.frameLayoutInstructors2)
        var frameLayoutKumar = findViewById<FrameLayout>(R.id.frameLayoutKumar)
        var frameLayoutMark = findViewById<FrameLayout>(R.id.frameLayoutMark)
        var frameLayoutSarah = findViewById<FrameLayout>(R.id.frameLayoutSarah)
        var frameLayoutMaria = findViewById<FrameLayout>(R.id.frameLayoutMaria)
        var frameLayoutSusan = findViewById<FrameLayout>(R.id.frameLayoutSusan)
        var frameLayoutThami = findViewById<FrameLayout>(R.id.frameLayoutThami)
        var imageView = findViewById<ImageView>(R.id.imageView)
        var imageViewBaby = findViewById<ImageView>(R.id.imageViewBaby)
        var imageViewChildMinding = findViewById<ImageView>(R.id.imageViewChildMinding)
        var imageViewChildren = findViewById<ImageView>(R.id.imageViewChildren)
        var imageViewMark = findViewById<ImageView>(R.id.imageViewMark)
        var imageViewSarah = findViewById<ImageView>(R.id.imageViewSarah)
        var imageViewKumar = findViewById<ImageView>(R.id.imageViewKumar)

    }
}