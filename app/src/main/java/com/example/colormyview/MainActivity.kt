package com.example.colormyview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    lateinit var box_one_text: TextView
    lateinit var box_two_text: TextView
    lateinit var box_three_text: TextView
    lateinit var box_four_text: TextView
    lateinit var box_five_text: TextView
    lateinit var constraint_layout: ConstraintLayout
    lateinit var button_red: Button
    lateinit var button_yellow: Button
    lateinit var button_green: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        box_one_text = findViewById(R.id.box_one_text)
        box_two_text = findViewById(R.id.box_two_text)
        box_three_text = findViewById(R.id.box_three_text)
        box_four_text = findViewById(R.id.box_four_text)
        box_five_text = findViewById(R.id.box_five_text)
        constraint_layout = findViewById(R.id.constraint_layout)
        button_red = findViewById(R.id.button_red)
        button_yellow = findViewById(R.id.button_yellow)
        button_green = findViewById(R.id.button_green)
        setListeners(box_one_text,box_two_text,box_three_text,box_four_text,box_five_text,constraint_layout,button_red,button_yellow,button_green)
    }



    private fun setListeners(one:TextView,two:TextView,three:TextView,four:TextView,five:TextView,six:ConstraintLayout,seven:Button,eight:Button,nine:Button){
        val clickableViews: List<View> = listOf(one, two,three,four,five,six,seven,eight,nine)

        for (item in clickableViews){
            item.setOnClickListener{makeColored(it)}
        }
    }

    private fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for background
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)

            // Boxes using custom colors for background
            R.id.button_red -> box_three_text.setBackgroundResource(R.color.my_red)
            R.id.button_yellow -> box_four_text.setBackgroundResource(R.color.my_yellow)
            R.id.button_green -> box_five_text.setBackgroundResource(R.color.my_green)


            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}